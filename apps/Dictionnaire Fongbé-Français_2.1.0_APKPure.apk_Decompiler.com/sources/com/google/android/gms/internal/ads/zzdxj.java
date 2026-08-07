package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdxj implements Callable {
    public final /* synthetic */ zzdxl zza;
    public final /* synthetic */ zzdzn zzb;

    public /* synthetic */ zzdxj(zzdxl zzdxl, zzdzn zzdzn) {
        this.zza = zzdxl;
        this.zzb = zzdzn;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb);
    }
}
