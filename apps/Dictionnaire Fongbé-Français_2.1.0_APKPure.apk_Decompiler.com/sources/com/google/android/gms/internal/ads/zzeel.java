package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeel implements zzecw {
    private final Context zza;
    private final zzdfu zzb;
    private final Executor zzc;
    private final zzfbn zzd;
    private final zzdrw zze;

    public zzeel(Context context, Executor executor, zzdfu zzdfu, zzfbn zzfbn, zzdrw zzdrw) {
        this.zza = context;
        this.zzb = zzdfu;
        this.zzc = executor;
        this.zzd = zzfbn;
        this.zze = zzdrw;
    }

    private static String zze(zzfbo zzfbo) {
        try {
            return zzfbo.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmT)).booleanValue()) {
            zzdrv zza2 = this.zze.zza();
            zza2.zzb("action", "cstm_tbs_rndr");
            zza2.zzg();
        }
        String zze2 = zze(zzfbo);
        return zzgch.zzn(zzgch.zzh((Object) null), new zzeej(this, zze2 != null ? Uri.parse(zze2) : null, zzfca, zzfbo, zzfca.zzb.zzb), this.zzc);
    }

    public final boolean zzb(zzfca zzfca, zzfbo zzfbo) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbdm.zzg(context) && !TextUtils.isEmpty(zze(zzfbo));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(Uri uri, zzfca zzfca, zzfbo zzfbo, zzfbr zzfbr, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            zzc zzc2 = new zzc(build.intent, (zzaa) null);
            zzcab zzcab = new zzcab();
            zzder zze2 = this.zzb.zze(new zzcrp(zzfca, zzfbo, (String) null), new zzdeu(new zzeek(this, zzcab), (zzcex) null));
            zzcab.zzc(new AdOverlayInfoParcel(zzc2, (zza) null, zze2.zza(), (zzac) null, new VersionInfoParcel(0, 0, false), (zzcex) null, (zzdds) null, zzfbr.zzb));
            this.zzd.zza();
            return zzgch.zzh(zze2.zzg());
        } catch (Throwable th) {
            zzo.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcab zzcab, boolean z, Context context, zzcwg zzcwg) throws zzdgb {
        try {
            zzv.zzj();
            zzn.zza(context, (AdOverlayInfoParcel) zzcab.get(), true, this.zze);
        } catch (Exception unused) {
        }
    }
}
