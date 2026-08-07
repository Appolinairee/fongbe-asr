package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfio implements Callable {
    public final /* synthetic */ zzfiq zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzfio(zzfiq zzfiq, String str) {
        this.zza = zzfiq;
        this.zzb = str;
    }

    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}
