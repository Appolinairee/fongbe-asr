package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzfgf {
    /* access modifiers changed from: private */
    public static final ListenableFuture zza = zzgch.zzh((Object) null);
    /* access modifiers changed from: private */
    public final zzgcs zzb;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final zzfgg zzd;

    public zzfgf(zzgcs zzgcs, ScheduledExecutorService scheduledExecutorService, zzfgg zzfgg) {
        this.zzb = zzgcs;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfgg;
    }

    public final zzffv zza(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzffv(this, obj, Arrays.asList(listenableFutureArr), (zzfge) null);
    }

    public final zzfgd zzb(Object obj, ListenableFuture listenableFuture) {
        return new zzfgd(this, obj, (String) null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture, (zzfge) null);
    }

    /* access modifiers changed from: protected */
    public abstract String zzf(Object obj);
}
