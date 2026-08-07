package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzegd extends zzegf {
    private final zzcgx zza;
    private final zzdgl zzb;
    private final zzcva zzc;
    private final zzdbm zzd;
    private final zzegq zze;
    private final zzedb zzf;

    public zzegd(zzcgx zzcgx, zzdgl zzdgl, zzcva zzcva, zzdbm zzdbm, zzegq zzegq, zzedb zzedb) {
        this.zza = zzcgx;
        this.zzb = zzdgl;
        this.zzc = zzcva;
        this.zzd = zzdbm;
        this.zze = zzegq;
        this.zzf = zzedb;
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzc(zzfcj zzfcj, Bundle bundle, zzfbo zzfbo, zzfca zzfca) {
        zzcva zzcva = this.zzc;
        zzcva.zzk(zzfcj);
        zzcva.zzg(bundle);
        zzcva.zzh(new zzcut(zzfca, zzfbo, this.zze));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzc.zze(this.zzf);
        }
        zzcgx zzcgx = this.zza;
        zzcva zzcva2 = this.zzc;
        zzdgp zzh = zzcgx.zzh();
        zzh.zzf(zzcva2.zzl());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcoj((ViewGroup) null));
        zzcsd zza2 = zzh.zzg().zza();
        return zza2.zzh(zza2.zzi());
    }
}
