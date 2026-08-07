package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdyv implements Callable {
    public final /* synthetic */ ListenableFuture zza;
    public final /* synthetic */ ListenableFuture zzb;

    public /* synthetic */ zzdyv(ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        this.zza = listenableFuture;
        this.zzb = listenableFuture2;
    }

    public final Object call() {
        ListenableFuture listenableFuture = this.zzb;
        return new zzdzk((zzdzo) this.zza.get(), ((zzdzi) listenableFuture.get()).zzb, ((zzdzi) listenableFuture.get()).zza);
    }
}
