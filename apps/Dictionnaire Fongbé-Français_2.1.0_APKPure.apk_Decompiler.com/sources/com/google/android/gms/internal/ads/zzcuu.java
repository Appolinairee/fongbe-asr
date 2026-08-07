package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcuu implements Callable {
    public final /* synthetic */ zzcuw zza;
    public final /* synthetic */ ListenableFuture zzb;
    public final /* synthetic */ Bundle zzc;

    public /* synthetic */ zzcuu(zzcuw zzcuw, ListenableFuture listenableFuture, Bundle bundle) {
        this.zza = zzcuw;
        this.zzb = listenableFuture;
        this.zzc = bundle;
    }

    public final Object call() {
        return this.zza.zza(this.zzb, this.zzc);
    }
}
