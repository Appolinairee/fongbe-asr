package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeyj implements zzfeq {
    private final zzezf zza;

    public zzeyj(zzezf zzezf) {
        this.zza = zzezf;
    }

    public final ListenableFuture zza(zzfer zzfer) {
        zzeyk zzeyk = (zzeyk) zzfer;
        zzcuz zzcuz = null;
        return ((zzeyg) this.zza).zzb(zzeyk.zzb, zzeyk.zza, (zzcuz) null);
    }

    public final void zzb(zzfef zzfef) {
        zzcuz zza2 = ((zzeyg) this.zza).zza();
        zzcuz zzcuz = zza2;
        zzfef.zza = zza2;
    }
}
