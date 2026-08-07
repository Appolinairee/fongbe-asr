package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzevf implements zzetr {
    final zzgcs zza;

    public zzevf(zzbay zzbay, zzgcs zzgcs, Context context) {
        this.zza = zzgcs;
    }

    public final int zza() {
        return 45;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzeve(this));
    }
}
