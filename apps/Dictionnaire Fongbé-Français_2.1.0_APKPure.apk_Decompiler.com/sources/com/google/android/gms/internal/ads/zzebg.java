package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzebg implements Callable {
    public final /* synthetic */ zzebk zza;

    public /* synthetic */ zzebg(zzebk zzebk) {
        this.zza = zzebk;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
