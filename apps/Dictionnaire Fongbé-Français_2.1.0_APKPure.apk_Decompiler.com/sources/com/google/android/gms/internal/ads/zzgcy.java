package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgcy extends zzgcv implements zzgct {
    final ScheduledExecutorService zza;

    zzgcy(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        this.zza = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgdi zze = zzgdi.zze(runnable, (Object) null);
        return new zzgcw(zze, scheduledExecutorService.schedule(zze, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgcx zzgcx = new zzgcx(runnable);
        return new zzgcw(zzgcx, this.zza.scheduleAtFixedRate(zzgcx, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgcx zzgcx = new zzgcx(runnable);
        return new zzgcw(zzgcx, this.zza.scheduleWithFixedDelay(zzgcx, j, j2, timeUnit));
    }

    /* renamed from: zzc */
    public final zzgcr schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgdi zzgdi = new zzgdi(callable);
        return new zzgcw(zzgdi, this.zza.schedule(zzgdi, j, timeUnit));
    }
}
