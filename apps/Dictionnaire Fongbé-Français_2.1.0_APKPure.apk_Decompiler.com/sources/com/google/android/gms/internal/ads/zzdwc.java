package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdwc implements zzgbo {
    public final /* synthetic */ zzbvk zza;

    public /* synthetic */ zzdwc(zzbvk zzbvk) {
        this.zza = zzbvk;
    }

    public final ListenableFuture zza(Object obj) {
        return zzgch.zzh(new zzdyi((InputStream) obj, this.zza));
    }
}
