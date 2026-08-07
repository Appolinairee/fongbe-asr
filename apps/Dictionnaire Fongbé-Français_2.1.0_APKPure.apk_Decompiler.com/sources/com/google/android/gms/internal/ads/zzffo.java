package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzffo implements zzher {
    private final zzhfj zza;

    public zzffo(zzhfj zzhfj) {
        this.zza = zzhfj;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfqv.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.zza.zzb()));
        zzhez.zzb(unconfigurableScheduledExecutorService);
        ScheduledExecutorService scheduledExecutorService = unconfigurableScheduledExecutorService;
        return unconfigurableScheduledExecutorService;
    }
}
