package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzegi extends zzegf {
    private final zzcgx zza;
    private final zzcva zzb;
    private final zzeiw zzc;
    private final zzdbm zzd;
    private final zzdgl zze;
    private final zzcyl zzf;
    private final ViewGroup zzg;
    private final zzdar zzh;
    private final zzegq zzi;
    private final zzedb zzj;

    public zzegi(zzcgx zzcgx, zzcva zzcva, zzeiw zzeiw, zzdbm zzdbm, zzdgl zzdgl, zzcyl zzcyl, ViewGroup viewGroup, zzdar zzdar, zzegq zzegq, zzedb zzedb) {
        this.zza = zzcgx;
        this.zzb = zzcva;
        this.zzc = zzeiw;
        this.zzd = zzdbm;
        this.zze = zzdgl;
        this.zzf = zzcyl;
        this.zzg = viewGroup;
        this.zzh = zzdar;
        this.zzi = zzegq;
        this.zzj = zzedb;
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzc(zzfcj zzfcj, Bundle bundle, zzfbo zzfbo, zzfca zzfca) {
        zzcva zzcva = this.zzb;
        zzcva.zzk(zzfcj);
        zzcva.zzg(bundle);
        zzcva.zzh(new zzcut(zzfca, zzfbo, this.zzi));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zzj);
        }
        zzcgx zzcgx = this.zza;
        zzcva zzcva2 = this.zzb;
        zzcpp zze2 = zzcgx.zze();
        zze2.zzi(zzcva2.zzl());
        zze2.zzf(this.zzd);
        zze2.zze(this.zzc);
        zze2.zzd(this.zze);
        zze2.zzg(new zzcqr(this.zzf, this.zzh));
        zze2.zzc(new zzcoj(this.zzg));
        zzcsd zzd2 = zze2.zzk().zzd();
        return zzd2.zzh(zzd2.zzi());
    }
}
