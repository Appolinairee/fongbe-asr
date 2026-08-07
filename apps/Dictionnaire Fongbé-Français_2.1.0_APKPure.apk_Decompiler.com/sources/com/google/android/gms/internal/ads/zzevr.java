package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzevr implements zzetr {
    final zzgcs zza;
    final List zzb;

    public zzevr(zzbbu zzbbu, zzgcs zzgcs, List list) {
        this.zza = zzgcs;
        this.zzb = list;
    }

    public final int zza() {
        return 48;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzevq(this));
    }
}
