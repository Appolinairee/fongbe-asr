package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgdi extends zzgbx implements RunnableFuture {
    @CheckForNull
    private volatile zzgcp zza;

    zzgdi(zzgbn zzgbn) {
        this.zza = new zzgdg(this, zzgbn);
    }

    static zzgdi zze(Runnable runnable, Object obj) {
        return new zzgdi(Executors.callable(runnable, obj));
    }

    public final void run() {
        zzgcp zzgcp = this.zza;
        if (zzgcp != null) {
            zzgcp.run();
        }
        this.zza = null;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final String zza() {
        zzgcp zzgcp = this.zza;
        if (zzgcp == null) {
            return super.zza();
        }
        String obj = zzgcp.toString();
        return "task=[" + obj + "]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzgcp zzgcp;
        if (zzt() && (zzgcp = this.zza) != null) {
            zzgcp.zzh();
        }
        this.zza = null;
    }

    zzgdi(Callable callable) {
        this.zza = new zzgdh(this, callable);
    }
}
