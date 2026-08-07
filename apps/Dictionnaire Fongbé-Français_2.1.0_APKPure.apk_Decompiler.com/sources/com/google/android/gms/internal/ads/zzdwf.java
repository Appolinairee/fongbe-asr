package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdwf implements zzgbo {
    public final /* synthetic */ zzdwg zza;
    public final /* synthetic */ zzbvk zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzdwf(zzdwg zzdwg, zzbvk zzbvk, int i) {
        this.zza = zzdwg;
        this.zzb = zzbvk;
        this.zzc = i;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzb(this.zzb, this.zzc, (zzdyh) obj);
    }
}
