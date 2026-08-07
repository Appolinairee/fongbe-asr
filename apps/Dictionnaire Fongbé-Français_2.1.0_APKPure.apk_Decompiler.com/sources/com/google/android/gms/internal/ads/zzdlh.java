package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdlh implements zzgbo {
    public final /* synthetic */ ListenableFuture zza;

    public /* synthetic */ zzdlh(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    public final ListenableFuture zza(Object obj) {
        if (((zzcex) obj) != null) {
            return this.zza;
        }
        throw new zzegu(1, "Retrieve Web View from image ad response failed.");
    }
}
