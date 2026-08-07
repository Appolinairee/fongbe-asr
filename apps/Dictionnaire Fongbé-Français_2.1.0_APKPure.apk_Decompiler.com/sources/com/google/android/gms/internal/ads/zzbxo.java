package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbxo implements zzgcd {
    final /* synthetic */ ListenableFuture zza;

    zzbxo(zzbxp zzbxp, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    public final void zza(Throwable th) {
        zzbxp.zzc.remove(this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        zzbxp.zzc.remove(this.zza);
    }
}
