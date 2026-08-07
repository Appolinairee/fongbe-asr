package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzema implements zzgbo {
    public final ListenableFuture zza(Object obj) {
        if (((Throwable) obj) instanceof TimeoutException) {
            return zzgch.zzh(new zzemc(Integer.toString(17)));
        }
        return zzgch.zzh(new zzemc((String) null));
    }
}
