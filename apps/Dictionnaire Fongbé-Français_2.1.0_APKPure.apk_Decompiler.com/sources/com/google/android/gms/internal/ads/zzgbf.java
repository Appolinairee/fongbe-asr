package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final /* synthetic */ class zzgbf implements Runnable {
    public final /* synthetic */ zzgbh zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ ListenableFuture zzc;

    public /* synthetic */ zzgbf(zzgbh zzgbh, int i, ListenableFuture listenableFuture) {
        this.zza = zzgbh;
        this.zzb = i;
        this.zzc = listenableFuture;
    }

    public final void run() {
        this.zza.zzw(this.zzb, this.zzc);
    }
}
