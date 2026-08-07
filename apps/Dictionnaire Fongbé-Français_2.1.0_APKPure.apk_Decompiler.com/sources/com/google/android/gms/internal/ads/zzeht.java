package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeht implements zzecw {
    private final Context zza;
    private final zzdow zzb;
    private final zzdof zzc;
    private final zzfcj zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjs zzg;
    private final boolean zzh = ((Boolean) zzbe.zzc().zza(zzbcl.zziM)).booleanValue();
    private final zzebv zzi;
    private final zzdrq zzj;
    private final zzdrw zzk;

    public zzeht(Context context, VersionInfoParcel versionInfoParcel, zzfcj zzfcj, Executor executor, zzdof zzdof, zzdow zzdow, zzbjs zzbjs, zzebv zzebv, zzdrq zzdrq, zzdrw zzdrw) {
        this.zza = context;
        this.zzd = zzfcj;
        this.zzc = zzdof;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdow;
        this.zzg = zzbjs;
        this.zzi = zzebv;
        this.zzj = zzdrq;
        this.zzk = zzdrw;
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        zzdpa zzdpa = new zzdpa();
        ListenableFuture zzn = zzgch.zzn(zzgch.zzh((Object) null), new zzeho(this, zzfbo, zzfca, zzdpa), this.zze);
        zzn.addListener(new zzehp(zzdpa), this.zze);
        return zzn;
    }

    public final boolean zzb(zzfca zzfca, zzfbo zzfbo) {
        zzfbt zzfbt = zzfbo.zzs;
        return (zzfbt == null || zzfbt.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(zzfbo zzfbo, zzfca zzfca, zzdpa zzdpa, Object obj) throws Exception {
        zzeht zzeht;
        zzfbo zzfbo2 = zzfbo;
        zzfca zzfca2 = zzfca;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            this.zzj.zza().putLong(zzdre.RENDERING_WEBVIEW_CREATION_START.zza(), zzv.zzC().currentTimeMillis());
        }
        zzcex zza2 = this.zzb.zza(this.zzd.zze, zzfbo2, zzfca2.zzb.zzb);
        zza2.zzac(zzfbo2.zzW);
        zzdpa.zza(this.zza, zza2.zzF());
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            this.zzj.zza().putLong(zzdre.RENDERING_WEBVIEW_CREATION_END.zza(), zzv.zzC().currentTimeMillis());
        }
        zzcab zzcab = new zzcab();
        zzdof zzdof = this.zzc;
        zzcrp zzcrp = new zzcrp(zzfca2, zzfbo2, (String) null);
        Context context = this.zza;
        zzdow zzdow = this.zzb;
        zzfcj zzfcj = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbjs zzbjs = this.zzg;
        boolean z = this.zzh;
        boolean z2 = z;
        zzdoc zzdoc = new zzdoc(new zzehs(context, zzdow, zzfcj, versionInfoParcel, zzfbo, zzcab, zza2, zzbjs, z2, this.zzi, this.zzj, this.zzk), zza2);
        zzdob zze2 = zzdof.zze(zzcrp, zzdoc);
        zzcab.zzc(zze2);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            zzeht = this;
            zzeht.zzj.zza().putLong(zzdre.RENDERING_AD_COMPONENT_CREATION_END.zza(), zzv.zzC().currentTimeMillis());
        } else {
            zzeht = this;
        }
        zzbkh.zzb(zza2, zze2.zzg());
        zze2.zzc().zzo(new zzehm(zza2), zzbzw.zzg);
        zze2.zzl().zzi(zza2, true, zzeht.zzh ? zzeht.zzg : null, zzeht.zzj.zza());
        zzfbo zzfbo3 = zzfbo;
        String str = zzfbo3.zzs.zza;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && zze2.zzm().zze(true)) {
            str = zzcgi.zzb(str, zzcgi.zza(zzfbo));
        }
        zze2.zzl();
        return zzgch.zzm(zzdov.zzj(zza2, zzfbo3.zzs.zzb, str, zzeht.zzj.zza()), new zzehn(zzeht, zza2, zzfbo3, zze2), zzeht.zze);
    }
}
