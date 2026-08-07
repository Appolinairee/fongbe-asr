package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzegm extends zzegf {
    private final zzcgx zza;
    private final zzcva zzb;
    private final zzdbm zzc;
    private final zzegq zzd;
    @Nullable
    private final zzfcb zze;
    private final zzedb zzf;

    public zzegm(zzcgx zzcgx, zzcva zzcva, zzdbm zzdbm, @Nullable zzfcb zzfcb, zzegq zzegq, zzedb zzedb) {
        this.zza = zzcgx;
        this.zzb = zzcva;
        this.zzc = zzdbm;
        this.zze = zzfcb;
        this.zzd = zzegq;
        this.zzf = zzedb;
    }

    /* access modifiers changed from: protected */
    public final ListenableFuture zzc(zzfcj zzfcj, Bundle bundle, zzfbo zzfbo, zzfca zzfca) {
        zzfcb zzfcb;
        zzcva zzcva = this.zzb;
        zzcva.zzk(zzfcj);
        zzcva.zzg(bundle);
        zzcva.zzh(new zzcut(zzfca, zzfbo, this.zzd));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdG)).booleanValue() && (zzfcb = this.zze) != null) {
            this.zzb.zzj(zzfcb);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            this.zzb.zze(this.zzf);
        }
        zzcgx zzcgx = this.zza;
        zzcva zzcva2 = this.zzb;
        zzdoe zzi = zzcgx.zzi();
        zzi.zzd(zzcva2.zzl());
        zzi.zzc(this.zzc);
        zzcsd zzb2 = zzi.zze().zzb();
        return zzb2.zzh(zzb2.zzi());
    }
}
