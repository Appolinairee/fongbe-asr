package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.webkit.internal.AssetHelper;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdur;
import com.google.android.gms.internal.ads.zzduv;
import com.google.android.gms.internal.ads.zzgcs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzau {
    private final Context zza;
    private final zzduv zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzau(Context context) {
        this.zzg = 0;
        this.zzl = new zzaf(this);
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        zzv.zzu().zzb();
        this.zzk = zzv.zzu().zza();
        this.zzb = zzv.zzt().zza();
    }

    private final void zzs(Context context) {
        ArrayList arrayList = new ArrayList();
        int zzu = zzu(arrayList, "None", true);
        int zzu2 = zzu(arrayList, "Shake", true);
        int zzu3 = zzu(arrayList, "Flick", true);
        int ordinal = this.zzb.zza().ordinal();
        int i = ordinal != 1 ? ordinal != 2 ? zzu : zzu3 : zzu2;
        zzv.zzq();
        AlertDialog.Builder zzL = zzs.zzL(context);
        AtomicInteger atomicInteger = new AtomicInteger(i);
        zzL.setTitle("Setup gesture");
        zzL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new zzan(atomicInteger));
        zzL.setNegativeButton("Dismiss", new zzao(this));
        zzL.setPositiveButton("Save", new zzap(this, atomicInteger, i, zzu2, zzu3));
        zzL.setOnCancelListener(new zzaq(this));
        zzL.create().show();
    }

    private final boolean zzt(float f, float f2, float f3, float f4) {
        return Math.abs(this.zzi.x - f) < ((float) this.zzh) && Math.abs(this.zzi.y - f2) < ((float) this.zzh) && Math.abs(this.zzj.x - f3) < ((float) this.zzh) && Math.abs(this.zzj.y - f4) < ((float) this.zzh);
    }

    private static final int zzu(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzd);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza() {
        zzs(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzgcs zzgcs) {
        if (!zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
            zzv.zzt().zzd(this.zza, this.zzd, this.zze);
            return;
        }
        zzgcs.execute(new zzak(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        zzs(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzv.zzt().zzc(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzgcs zzgcs) {
        if (!zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
            zzv.zzt().zzd(this.zza, this.zzd, this.zze);
            return;
        }
        zzgcs.execute(new zzaj(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        zzv.zzt().zzc(this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzr();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.zzb.zzm(zzdur.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.zzb.zzm(zzdur.FLICK);
            } else {
                this.zzb.zzm(zzdur.NONE);
            }
        }
        zzr();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(String str, DialogInterface dialogInterface, int i) {
        zzv.zzq();
        zzs.zzT(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 == i) {
            if (!(this.zza instanceof Activity)) {
                zzo.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = this.zzc;
            String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                zzv.zzq();
                Map zzP = zzs.zzP(build);
                for (String str3 : zzP.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append((String) zzP.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            zzv.zzq();
            AlertDialog.Builder zzL = zzs.zzL(this.zza);
            zzL.setMessage(str2);
            zzL.setTitle("Ad Information");
            zzL.setPositiveButton("Share", new zzah(this, str2));
            zzL.setNegativeButton("Close", new zzai());
            zzL.create().show();
        } else if (i6 == i2) {
            zzo.zze("Debug mode [Creative Preview] selected.");
            zzbzw.zza.execute(new zzag(this));
        } else if (i6 == i3) {
            zzo.zze("Debug mode [Troubleshooting] selected.");
            zzbzw.zza.execute(new zzat(this));
        } else if (i6 == i4) {
            zzduv zzduv = this.zzb;
            zzgcs zzgcs = zzbzw.zzf;
            zzgcs zzgcs2 = zzbzw.zza;
            if (zzduv.zzq()) {
                zzgcs.execute(new zzar(this));
            } else {
                zzgcs2.execute(new zzas(this, zzgcs));
            }
        } else if (i6 == i5) {
            zzduv zzduv2 = this.zzb;
            zzgcs zzgcs3 = zzbzw.zzf;
            zzgcs zzgcs4 = zzbzw.zza;
            if (zzduv2.zzq()) {
                zzgcs3.execute(new zzae(this));
            } else {
                zzgcs4.execute(new zzal(this, zzgcs3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        zzay zzt = zzv.zzt();
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zzm = zzt.zzm();
        Context context = this.zza;
        zzt.zzh(zzt.zzj(context, str, str2));
        if (zzt.zzm()) {
            if (!zzm && !TextUtils.isEmpty(str3)) {
                zzt.zze(context, str2, str3, str);
            }
            zzo.zze("Device is linked for debug signals.");
            zzt.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzt.zzd(context, str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl() {
        zzay zzt = zzv.zzt();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzt.zzk(context, str, str2)) {
            zzt.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(zzt.zza)) {
            zzo.zze("Creative is not pushed for this device.");
            zzt.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzt.zza)) {
            zzo.zze("The app is not linked for creative preview.");
            zzt.zzd(context, str, str2);
        } else if ("0".equals(zzt.zza)) {
            zzo.zze("Device is linked for in app preview.");
            zzt.zzi(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.zzg;
        if (i != -1) {
            if (i == 0) {
                if (actionMasked == 5) {
                    this.zzg = 5;
                    this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.zzk.postDelayed(this.zzl, ((Long) zzbe.zzc().zza(zzbcl.zzeJ)).longValue());
                }
            } else if (i == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z = false;
                        for (int i2 = 0; i2 < historySize; i2++) {
                            z |= !zzt(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                        }
                        if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.zzg = -1;
                this.zzk.removeCallbacks(this.zzl);
            }
        }
    }

    public final void zzn(String str) {
        this.zzd = str;
    }

    public final void zzo(String str) {
        this.zze = str;
    }

    public final void zzp(String str) {
        this.zzc = str;
    }

    public final void zzq(String str) {
        this.zzf = str;
    }

    public final void zzr() {
        try {
            if (!(this.zza instanceof Activity)) {
                zzo.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(zzv.zzt().zzb())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != zzv.zzt().zzm()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            int zzu = zzu(arrayList, "Ad information", true);
            int zzu2 = zzu(arrayList, str, true);
            int zzu3 = zzu(arrayList, str2, true);
            boolean booleanValue = ((Boolean) zzbe.zzc().zza(zzbcl.zzjc)).booleanValue();
            int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
            int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
            zzv.zzq();
            AlertDialog.Builder zzL = zzs.zzL(this.zza);
            zzL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new zzam(this, zzu, zzu2, zzu3, zzu4, zzu5));
            zzL.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
