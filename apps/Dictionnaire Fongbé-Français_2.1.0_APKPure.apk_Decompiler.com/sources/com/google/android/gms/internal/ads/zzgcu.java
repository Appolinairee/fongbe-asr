package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgcu implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzgax zzb;

    zzgcu(Executor executor, zzgax zzgax) {
        this.zza = executor;
        this.zzb = zzgax;
    }

    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }
}
