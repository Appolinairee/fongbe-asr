package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzels implements zzetr {
    private final Clock zza;
    private final zzfcj zzb;

    zzels(Clock clock, zzfcj zzfcj) {
        this.zza = clock;
        this.zzb = zzfcj;
    }

    public final int zza() {
        return 4;
    }

    public final ListenableFuture zzb() {
        return zzgch.zzh(new zzelt(this.zzb, this.zza.currentTimeMillis()));
    }
}
