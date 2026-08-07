package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzemp {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzemo zzb;

    /* access modifiers changed from: package-private */
    public final zzemo zza() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzemo zzemo) {
        this.zzb = zzemo;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
