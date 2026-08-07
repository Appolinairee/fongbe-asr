package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbsh extends zzbsi implements zzbjp {
    DisplayMetrics zza;
    int zzb = -1;
    int zzc = -1;
    int zzd = -1;
    int zze = -1;
    int zzf = -1;
    int zzg = -1;
    private final zzcex zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbt zzk;
    private float zzl;
    private int zzm;

    public zzbsh(zzcex zzcex, Context context, zzbbt zzbbt) {
        super(zzcex, "");
        this.zzh = zzcex;
        this.zzi = context;
        this.zzk = zzbbt;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        zzcex zzcex = (zzcex) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        zzbc.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzf.zzv(displayMetrics, displayMetrics.widthPixels);
        zzbc.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzf.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi2 = this.zzh.zzi();
        if (zzi2 == null || zzi2.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            zzv.zzq();
            int[] zzQ = zzs.zzQ(zzi2);
            zzbc.zzb();
            this.zzd = zzf.zzv(this.zza, zzQ[0]);
            zzbc.zzb();
            this.zze = zzf.zzv(this.zza, zzQ[1]);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbsg zzbsg = new zzbsg();
        zzbbt zzbbt = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbsg.zze(zzbbt.zza(intent));
        zzbbt zzbbt2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbsg.zzc(zzbbt2.zza(intent2));
        zzbsg.zza(this.zzk.zzb());
        zzbsg.zzd(this.zzk.zzc());
        zzbsg.zzb(true);
        boolean zzh2 = zzbsg.zza;
        boolean zzj2 = zzbsg.zzb;
        boolean zzf2 = zzbsg.zzc;
        boolean zzi3 = zzbsg.zzd;
        boolean zzg2 = zzbsg.zze;
        zzcex zzcex2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", zzh2).put("tel", zzj2).put("calendar", zzf2).put("storePicture", zzi3).put("inlineVideo", zzg2);
        } catch (JSONException e) {
            zzo.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcex2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(zzbc.zzb().zzb(this.zzi, iArr[0]), zzbc.zzb().zzb(this.zzi, iArr[1]));
        if (zze.zzm(2)) {
            zzo.zzi("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzn().afmaVersion);
    }

    public final void zzb(int i, int i2) {
        int i3;
        Context context = this.zzi;
        int i4 = 0;
        if (context instanceof Activity) {
            zzv.zzq();
            i3 = zzs.zzR((Activity) context)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzcex zzcex = this.zzh;
            int width = zzcex.getWidth();
            int height = zzcex.getHeight();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzad)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i4 = this.zzh.zzO().zza;
                    }
                    this.zzf = zzbc.zzb().zzb(this.zzi, width);
                    this.zzg = zzbc.zzb().zzb(this.zzi, i4);
                }
            }
            i4 = height;
            this.zzf = zzbc.zzb().zzb(this.zzi, width);
            this.zzg = zzbc.zzb().zzb(this.zzi, i4);
        }
        zzg(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzN().zzD(i, i2);
    }
}
