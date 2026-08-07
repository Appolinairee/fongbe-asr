package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdwd implements Callable {
    public final /* synthetic */ zzdwg zza;
    public final /* synthetic */ zzbvk zzb;

    public /* synthetic */ zzdwd(zzdwg zzdwg, zzbvk zzbvk) {
        this.zza = zzdwg;
        this.zzb = zzbvk;
    }

    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}
