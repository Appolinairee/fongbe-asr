package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdll implements zzgbo {
    public final /* synthetic */ ListenableFuture zza;

    public /* synthetic */ zzdll(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    public final ListenableFuture zza(Object obj) {
        return obj != null ? this.zza : zzgch.zzg(new zzegu(1, "Retrieve required value in native ad response failed."));
    }
}
