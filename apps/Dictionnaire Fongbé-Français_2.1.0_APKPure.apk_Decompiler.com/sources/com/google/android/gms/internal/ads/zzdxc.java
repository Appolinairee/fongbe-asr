package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdxc implements zzgbo {
    public final ListenableFuture zza(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzgch.zzg(new zzdvy(5));
    }
}
