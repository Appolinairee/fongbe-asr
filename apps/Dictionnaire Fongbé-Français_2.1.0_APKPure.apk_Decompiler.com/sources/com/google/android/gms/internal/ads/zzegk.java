package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzegk extends zzegf {
    private final zzcgx zza;
    private final zzcva zzb;
    private final zzeiw zzc;
    private final zzdbm zzd;
    private final zzegq zze;
    private final zzedb zzf;

    public zzegk(zzcgx zzcgx, zzcva zzcva, zzeiw zzeiw, zzdbm zzdbm, zzegq zzegq, zzedb zzedb) {
        this.zza = zzcgx;
        this.zzb = zzcva;
        this.zzc = zzeiw;
        this.zzd = zzdbm;
        this.zze = zzegq;
        this.zzf = zzedb;
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzc(zzfcj zzfcj, Bundle bundle, zzfbo zzfbo, zzfca zzfca) {
        zzcva zzcva = this.zzb;
        zzcva.zzk(zzfcj);
        zzcva.zzg(bundle);
        zzcva.zzh(new zzcut(zzfca, zzfbo, this.zze));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        zzcgx zzcgx = this.zza;
        zzcva zzcva2 = this.zzb;
        zzdft zzg = zzcgx.zzg();
        zzg.zze(zzcva2.zzl());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcsd zza2 = zzg.zzf().zza();
        return zza2.zzh(zza2.zzi());
    }
}
