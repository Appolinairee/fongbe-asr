package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgdg extends zzgcp {
    final /* synthetic */ zzgdi zza;
    private final zzgbn zzb;

    zzgdg(zzgdi zzgdi, zzgbn zzgbn) {
        this.zza = zzgdi;
        zzgbn zzgbn2 = zzgbn;
        this.zzb = zzgbn;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgbn zzgbn = this.zzb;
        ListenableFuture zza2 = zzgbn.zza();
        zzfun.zzd(zza2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgbn);
        ListenableFuture listenableFuture = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((ListenableFuture) obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
