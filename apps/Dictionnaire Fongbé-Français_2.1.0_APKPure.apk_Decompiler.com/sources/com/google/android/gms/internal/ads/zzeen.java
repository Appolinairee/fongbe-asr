package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeen implements Callable {
    public final /* synthetic */ zzeeq zza;
    public final /* synthetic */ zzfca zzb;
    public final /* synthetic */ zzfbo zzc;

    public /* synthetic */ zzeen(zzeeq zzeeq, zzfca zzfca, zzfbo zzfbo) {
        this.zza = zzeeq;
        this.zzb = zzfca;
        this.zzc = zzfbo;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc);
    }
}
