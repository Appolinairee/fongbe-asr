package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzegg extends zzegf {
    private final zzcgx zza;
    private final zzcva zzb;
    private final zzdbm zzc;
    private final zzegq zzd;
    private final zzedb zze;

    zzegg(zzcgx zzcgx, zzcva zzcva, zzdbm zzdbm, zzegq zzegq, zzedb zzedb) {
        this.zza = zzcgx;
        this.zzb = zzcva;
        this.zzc = zzdbm;
        this.zzd = zzegq;
        this.zze = zzedb;
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzc(zzfcj zzfcj, Bundle bundle, zzfbo zzfbo, zzfca zzfca) {
        zzcva zzcva = this.zzb;
        zzcva.zzk(zzfcj);
        zzcva.zzg(bundle);
        zzcva.zzh(new zzcut(zzfca, zzfbo, this.zzd));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zze);
        }
        zzcgx zzcgx = this.zza;
        zzcva zzcva2 = this.zzb;
        zzcnz zzd2 = zzcgx.zzd();
        zzd2.zzd(zzcva2.zzl());
        zzd2.zzc(this.zzc);
        zzcsd zzb2 = zzd2.zze().zzb();
        return zzb2.zzh(zzb2.zzi());
    }
}
