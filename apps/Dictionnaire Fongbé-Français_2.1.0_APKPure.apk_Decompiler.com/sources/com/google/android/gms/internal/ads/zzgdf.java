package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgdf extends zzgbx {
    /* access modifiers changed from: private */
    @CheckForNull
    public ListenableFuture zza;
    /* access modifiers changed from: private */
    @CheckForNull
    public ScheduledFuture zzb;

    static ListenableFuture zzf(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgdf zzgdf = new zzgdf(listenableFuture);
        zzgdc zzgdc = new zzgdc(zzgdf);
        zzgdf.zzb = scheduledExecutorService.schedule(zzgdc, j, timeUnit);
        listenableFuture.addListener(zzgdc, zzgbv.INSTANCE);
        return zzgdf;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final String zza() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        String str = "inputFuture=[" + listenableFuture.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    private zzgdf(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        ListenableFuture listenableFuture2 = listenableFuture;
        this.zza = listenableFuture;
    }
}
