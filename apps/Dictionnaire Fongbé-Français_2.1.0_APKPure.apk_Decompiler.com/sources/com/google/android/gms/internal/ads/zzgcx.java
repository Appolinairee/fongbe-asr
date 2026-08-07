package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgcx extends zzgax.zzi implements Runnable {
    private final Runnable zza;

    /* access modifiers changed from: protected */
    public final String zza() {
        String obj = this.zza.toString();
        return "task=[" + obj + "]";
    }

    public zzgcx(Runnable runnable) {
        runnable.getClass();
        Runnable runnable2 = runnable;
        this.zza = runnable;
    }

    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }
}
