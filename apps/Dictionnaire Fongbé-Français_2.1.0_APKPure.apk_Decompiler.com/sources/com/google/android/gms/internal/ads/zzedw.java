package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzedw implements zzgbo {
    public final /* synthetic */ zzedx zza;
    public final /* synthetic */ zzfca zzb;
    public final /* synthetic */ zzfbo zzc;

    public /* synthetic */ zzedw(zzedx zzedx, zzfca zzfca, zzfbo zzfbo) {
        this.zza = zzedx;
        this.zzb = zzfca;
        this.zzc = zzfbo;
    }

    public final ListenableFuture zza(Object obj) {
        return this.zza.zzc(this.zzb, this.zzc, obj);
    }
}
