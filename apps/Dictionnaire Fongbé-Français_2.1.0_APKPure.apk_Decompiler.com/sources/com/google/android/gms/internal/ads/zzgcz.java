package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzgcz {
    public static zzgcs zza(ExecutorService executorService) {
        zzgcs zzgcs;
        if (executorService instanceof zzgcs) {
            return (zzgcs) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzgcs = new zzgcy((ScheduledExecutorService) executorService);
        } else {
            zzgcs = new zzgcv(executorService);
        }
        return zzgcs;
    }

    public static zzgct zzb(ScheduledExecutorService scheduledExecutorService) {
        return new zzgcy(scheduledExecutorService);
    }

    public static Executor zzc() {
        return zzgbv.INSTANCE;
    }

    static Executor zzd(Executor executor, zzgax zzgax) {
        executor.getClass();
        return executor == zzgbv.INSTANCE ? executor : new zzgcu(executor, zzgax);
    }
}
