package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdxk implements zzgbo {
    public final ListenableFuture zza(Object obj) {
        zzegu zzegu;
        Exception exc = (Exception) obj;
        zzv.zzp().zzv(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzegu = new zzegu(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzegu) {
            zzegu = (zzegu) exc;
        } else {
            zzegu = new zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        return zzgch.zzg(zzegu);
    }
}
