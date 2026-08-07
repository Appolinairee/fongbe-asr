package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzdwz;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.android.gms.internal.ads.zzgch;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbi implements zzgbo {
    private final Executor zza;
    private final zzdwz zzb;

    public zzbi(Executor executor, zzdwz zzdwz) {
        this.zza = executor;
        this.zzb = zzdwz;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzbvk zzbvk = (zzbvk) obj;
        return zzgch.zzn(this.zzb.zzc(zzbvk), new zzbh(zzbvk), this.zza);
    }
}
