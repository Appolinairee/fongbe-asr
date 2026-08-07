package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcyi implements Runnable {
    private final WeakReference zza;

    /* synthetic */ zzcyi(zzcyl zzcyl, zzcyk zzcyk) {
        this.zza = new WeakReference(zzcyl);
    }

    public final void run() {
        zzcyl zzcyl = (zzcyl) this.zza.get();
        if (zzcyl != null) {
            zzcyl.zzq(new zzcyg());
        }
    }
}
