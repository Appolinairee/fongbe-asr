package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzgcf {
    private final boolean zza;
    private final zzfxn zzb;

    /* synthetic */ zzgcf(boolean z, zzfxn zzfxn, zzgcg zzgcg) {
        this.zza = z;
        this.zzb = zzfxn;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzgbu(this.zzb, this.zza, executor, callable);
    }
}
