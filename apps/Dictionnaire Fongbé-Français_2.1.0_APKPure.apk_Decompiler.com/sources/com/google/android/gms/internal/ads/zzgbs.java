package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgbs extends zzgbt {
    final /* synthetic */ zzgbu zza;
    private final Callable zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgbs(zzgbu zzgbu, Callable callable, Executor executor) {
        super(zzgbu, executor);
        this.zza = zzgbu;
        Callable callable2 = callable;
        this.zzc = callable;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzc.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
