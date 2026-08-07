package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzedh implements zzecw {
    private final zzcoa zza;
    private final Context zzb;
    private final zzdow zzc;
    private final zzfcj zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjs zzg;
    private final boolean zzh = ((Boolean) zzbe.zzc().zza(zzbcl.zziM)).booleanValue();
    private final zzebv zzi;
    private final zzdrq zzj;
    private final zzdrw zzk;

    public zzedh(zzcoa zzcoa, Context context, Executor executor, zzdow zzdow, zzfcj zzfcj, VersionInfoParcel versionInfoParcel, zzbjs zzbjs, zzebv zzebv, zzdrq zzdrq, zzdrw zzdrw) {
        this.zzb = context;
        this.zza = zzcoa;
        this.zze = executor;
        this.zzc = zzdow;
        this.zzd = zzfcj;
        this.zzf = versionInfoParcel;
        this.zzg = zzbjs;
        this.zzi = zzebv;
        this.zzj = zzdrq;
        this.zzk = zzdrw;
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        zzdpa zzdpa = new zzdpa();
        ListenableFuture zzn = zzgch.zzn(zzgch.zzh((Object) null), new zzedd(this, zzfbo, zzfca, zzdpa), this.zze);
        zzn.addListener(new zzede(zzdpa), this.zze);
        return zzn;
    }

    public final boolean zzb(zzfca zzfca, zzfbo zzfbo) {
        zzfbt zzfbt = zzfbo.zzs;
        return (zzfbt == null || zzfbt.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(zzfbo zzfbo, zzfca zzfca, zzdpa zzdpa, Object obj) throws Exception {
        zzedh zzedh;
        zzfbo zzfbo2 = zzfbo;
        zzfca zzfca2 = zzfca;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            this.zzj.zza().putLong(zzdre.RENDERING_WEBVIEW_CREATION_START.zza(), zzv.zzC().currentTimeMillis());
        }
        zzcex zza2 = this.zzc.zza(this.zzd.zze, zzfbo2, zzfca2.zzb.zzb);
        zza2.zzac(zzfbo2.zzW);
        zzdpa.zza(this.zzb, zza2.zzF());
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            this.zzj.zza().putLong(zzdre.RENDERING_WEBVIEW_CREATION_END.zza(), zzv.zzC().currentTimeMillis());
        }
        zzcab zzcab = new zzcab();
        zzcoa zzcoa = this.zza;
        zzcrp zzcrp = new zzcrp(zzfca2, zzfbo2, (String) null);
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzfcj zzfcj = this.zzd;
        boolean z = this.zzh;
        zzbjs zzbjs = this.zzg;
        zzebv zzebv = this.zzi;
        zzdrw zzdrw = this.zzk;
        zzedj zzedj = r1;
        zzcab zzcab2 = zzcab;
        zzedj zzedj2 = new zzedj(versionInfoParcel, zzcab, zzfbo, zza2, zzfcj, z, zzbjs, zzebv, zzdrw);
        zzcnx zza3 = zzcoa.zza(zzcrp, new zzdeu(zzedj, zza2), new zzcny(zzfbo2.zzaa));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            zzedh = this;
            zzedh.zzj.zza().putLong(zzdre.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzv.zzC().currentTimeMillis());
        } else {
            zzedh = this;
        }
        zza3.zzh().zzi(zza2, false, zzedh.zzh ? zzedh.zzg : null, zzedh.zzj.zza());
        zzcab2.zzc(zza3);
        zza3.zzc().zzo(new zzedf(zza2), zzbzw.zzg);
        String str = zzfbo2.zzs.zza;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && zza3.zzi().zze(true)) {
            str = zzcgi.zzb(str, zzcgi.zza(zzfbo));
        }
        zza3.zzh();
        return zzgch.zzm(zzdov.zzj(zza2, zzfbo2.zzs.zzb, str, zzedh.zzj.zza()), new zzedg(zzedh, zza2, zzfbo2, zza3), zzedh.zze);
    }
}
