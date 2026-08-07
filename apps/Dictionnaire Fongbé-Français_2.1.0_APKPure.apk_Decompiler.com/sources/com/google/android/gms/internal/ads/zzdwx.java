package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdwx implements Callable {
    public final /* synthetic */ zzdwz zza;
    public final /* synthetic */ zzbvk zzb;

    public /* synthetic */ zzdwx(zzdwz zzdwz, zzbvk zzbvk) {
        this.zza = zzdwz;
        this.zzb = zzbvk;
    }

    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}
