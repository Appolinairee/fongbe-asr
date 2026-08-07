package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzemb implements zzetr {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    zzemb(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return 6;
    }

    public final ListenableFuture zzb() {
        ListenableFuture zzn = zzgch.zzn(this.zza, new zzelz(), this.zzb);
        if (((Integer) zzbe.zzc().zza(zzbcl.zzmp)).intValue() > 0) {
            zzbcc zzbcc = zzbcl.zzmp;
            zzn = zzgch.zzo(zzn, (long) ((Integer) zzbe.zzc().zza(zzbcc)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgch.zzf(zzn, Throwable.class, new zzema(), this.zzb);
    }
}
