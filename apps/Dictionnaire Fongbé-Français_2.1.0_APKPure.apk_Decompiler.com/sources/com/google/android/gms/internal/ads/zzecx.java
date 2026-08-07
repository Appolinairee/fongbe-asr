package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzecx implements zzecw {
    public final zzecw zza;
    private final zzfuc zzb;

    public zzecx(zzecw zzecw, zzfuc zzfuc) {
        this.zza = zzecw;
        this.zzb = zzfuc;
    }

    public final ListenableFuture zza(zzfca zzfca, zzfbo zzfbo) {
        return zzgch.zzm(this.zza.zza(zzfca, zzfbo), this.zzb, zzbzw.zza);
    }

    public final boolean zzb(zzfca zzfca, zzfbo zzfbo) {
        return this.zza.zzb(zzfca, zzfbo);
    }
}
