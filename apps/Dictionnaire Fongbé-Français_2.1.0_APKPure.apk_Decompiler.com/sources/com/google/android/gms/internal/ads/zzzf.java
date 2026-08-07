package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzzf implements zzzg {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdb zzb;

    zzzf(Executor executor, zzdb zzdb) {
        this.zza = executor;
        this.zzb = zzdb;
    }

    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
