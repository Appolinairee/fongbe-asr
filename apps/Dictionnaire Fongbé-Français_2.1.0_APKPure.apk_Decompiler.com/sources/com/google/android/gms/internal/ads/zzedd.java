package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzedd implements zzgbo {
    public final /* synthetic */ zzedh zza;
    public final /* synthetic */ zzfbo zzb;
    public final /* synthetic */ zzfca zzc;
    public final /* synthetic */ zzdpa zzd;

    public /* synthetic */ zzedd(zzedh zzedh, zzfbo zzfbo, zzfca zzfca, zzdpa zzdpa) {
        this.zza = zzedh;
        this.zzb = zzfbo;
        this.zzc = zzfca;
        this.zzd = zzdpa;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, obj);
    }
}
