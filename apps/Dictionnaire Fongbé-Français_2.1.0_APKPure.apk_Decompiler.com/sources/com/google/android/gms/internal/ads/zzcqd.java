package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcqd implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcqd(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    public final void run() {
        zzcqf.zzj(this.zza);
    }
}
