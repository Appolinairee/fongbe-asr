package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcol implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcol(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public static zzcyl zzc(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        zzcyl zzcyl = new zzcyl(scheduledExecutorService, clock);
        zzcyl zzcyl2 = zzcyl;
        return zzcyl;
    }

    /* renamed from: zza */
    public final zzcyl zzb() {
        return zzc((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
