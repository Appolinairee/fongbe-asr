package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzgch extends zzgcj {
    public static zzgcf zza(Iterable iterable) {
        return new zzgcf(false, zzfxn.zzk(iterable), (zzgcg) null);
    }

    public static zzgcf zzb(Iterable iterable) {
        return new zzgcf(true, zzfxn.zzk(iterable), (zzgcg) null);
    }

    @SafeVarargs
    public static zzgcf zzc(ListenableFuture... listenableFutureArr) {
        return new zzgcf(true, zzfxn.zzm(listenableFutureArr), (zzgcg) null);
    }

    public static ListenableFuture zzd(Iterable iterable) {
        return new zzgbp(zzfxn.zzk(iterable), true);
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, Class cls, zzfuc zzfuc, Executor executor) {
        zzgav zzgav = new zzgav(listenableFuture, cls, zzfuc);
        listenableFuture.addListener(zzgav, zzgcz.zzd(executor, zzgav));
        return zzgav;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, Class cls, zzgbo zzgbo, Executor executor) {
        zzgau zzgau = new zzgau(listenableFuture, cls, zzgbo);
        listenableFuture.addListener(zzgau, zzgcz.zzd(executor, zzgau));
        return zzgau;
    }

    public static ListenableFuture zzh(Object obj) {
        if (obj == null) {
            return zzgcl.zza;
        }
        return new zzgcl(obj);
    }

    public static ListenableFuture zzi() {
        return zzgcl.zza;
    }

    public static ListenableFuture zzj(Callable callable, Executor executor) {
        zzgdi zzgdi = new zzgdi(callable);
        executor.execute(zzgdi);
        return zzgdi;
    }

    public static ListenableFuture zzk(zzgbn zzgbn, Executor executor) {
        zzgdi zzgdi = new zzgdi(zzgbn);
        executor.execute(zzgdi);
        return zzgdi;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzgbp(zzfxn.zzm(listenableFutureArr), false);
    }

    public static ListenableFuture zzm(ListenableFuture listenableFuture, zzfuc zzfuc, Executor executor) {
        zzgbd zzgbd = new zzgbd(listenableFuture, zzfuc);
        listenableFuture.addListener(zzgbd, zzgcz.zzd(executor, zzgbd));
        return zzgbd;
    }

    public static ListenableFuture zzn(ListenableFuture listenableFuture, zzgbo zzgbo, Executor executor) {
        int i = zzgbe.zzc;
        executor.getClass();
        zzgbc zzgbc = new zzgbc(listenableFuture, zzgbo);
        listenableFuture.addListener(zzgbc, zzgcz.zzd(executor, zzgbc));
        return zzgbc;
    }

    public static ListenableFuture zzo(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        return zzgdf.zzf(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgdk.zza(future);
        }
        throw new IllegalStateException(zzfve.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgdk.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgbw((Error) e.getCause());
            }
            throw new zzgdj(e.getCause());
        }
    }

    public static ListenableFuture zzg(Throwable th) {
        th.getClass();
        return new zzgck(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzgcd zzgcd, Executor executor) {
        zzgcd.getClass();
        listenableFuture.addListener(new zzgce(listenableFuture, zzgcd), executor);
    }
}
