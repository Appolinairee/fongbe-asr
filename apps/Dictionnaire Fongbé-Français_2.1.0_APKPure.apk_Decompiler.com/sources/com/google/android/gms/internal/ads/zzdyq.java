package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdyq implements zzgbo {
    public final /* synthetic */ zzdyt zza;
    public final /* synthetic */ zzdys zzb;
    public final /* synthetic */ zzbvk zzc;
    public final /* synthetic */ zzgbo zzd;

    public /* synthetic */ zzdyq(zzdyt zzdyt, zzdys zzdys, zzbvk zzbvk, zzgbo zzgbo) {
        this.zza = zzdyt;
        this.zzb = zzdys;
        this.zzc = zzbvk;
        this.zzd = zzgbo;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzb(this.zzb, this.zzc, this.zzd, (zzdyh) obj);
    }
}
