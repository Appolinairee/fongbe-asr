package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbli implements zzgbo {
    final /* synthetic */ zzbla zza;

    zzbli(zzblm zzblm, zzbla zzbla) {
        this.zza = zzbla;
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcab zzcab = new zzcab();
        ((zzblg) obj).zze(this.zza, new zzblh(this, zzcab));
        return zzcab;
    }
}
