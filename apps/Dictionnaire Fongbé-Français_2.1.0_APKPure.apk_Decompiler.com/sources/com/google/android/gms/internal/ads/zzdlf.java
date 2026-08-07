package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdlf implements zzgbo {
    public final /* synthetic */ ListenableFuture zza;

    public /* synthetic */ zzdlf(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    public final ListenableFuture zza(Object obj) {
        zzcex zzcex = (zzcex) obj;
        if (zzcex != null && zzcex.zzq() != null) {
            return this.zza;
        }
        throw new zzegu(1, "Retrieve video view in html5 ad response failed.");
    }
}
