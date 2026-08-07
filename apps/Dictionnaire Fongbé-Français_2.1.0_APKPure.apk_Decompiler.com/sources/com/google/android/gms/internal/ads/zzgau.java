package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgau extends zzgaw {
    zzgau(ListenableFuture listenableFuture, Class cls, zzgbo zzgbo) {
        super(listenableFuture, cls, zzgbo);
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgbo zzgbo = (zzgbo) obj;
        ListenableFuture zza = zzgbo.zza(th);
        zzfun.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgbo);
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
