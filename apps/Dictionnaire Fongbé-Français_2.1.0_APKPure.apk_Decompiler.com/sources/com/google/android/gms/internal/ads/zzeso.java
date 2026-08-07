package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeso implements zzetr {
    private final String zza;
    private final int zzb;

    zzeso(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final int zza() {
        return 31;
    }

    public final ListenableFuture zzb() {
        return zzgch.zzh(new zzesp(this.zza, this.zzb));
    }
}
