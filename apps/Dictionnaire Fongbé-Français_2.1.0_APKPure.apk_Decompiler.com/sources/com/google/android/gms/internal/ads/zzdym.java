package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdym implements zzgbo {
    public final /* synthetic */ zzbvk zza;

    public /* synthetic */ zzdym(zzbvk zzbvk) {
        this.zza = zzbvk;
    }

    public final ListenableFuture zza(Object obj) {
        String str = new String(zzgad.zzb((InputStream) obj), StandardCharsets.UTF_8);
        zzbvk zzbvk = this.zza;
        zzbvk.zzj = str;
        return zzgch.zzh(zzbvk);
    }
}
