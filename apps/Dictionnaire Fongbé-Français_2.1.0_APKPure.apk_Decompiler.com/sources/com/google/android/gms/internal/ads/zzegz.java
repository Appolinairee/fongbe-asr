package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzegz {
    private zzegq zza;

    zzegz() {
    }

    private zzegz(zzegq zzegq) {
        this.zza = zzegq;
    }

    public static zzegz zzb(zzegq zzegq) {
        return new zzegz(zzegq);
    }

    public final zzegq zza(Clock clock, zzegs zzegs, zzedb zzedb, zzfja zzfja) {
        zzegq zzegq = this.zza;
        return zzegq != null ? zzegq : new zzegq(clock, zzegs, zzedb, zzfja);
    }
}
