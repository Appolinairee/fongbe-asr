package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcbe implements Runnable {
    final /* synthetic */ zzcbg zza;

    zzcbe(zzcbg zzcbg) {
        this.zza = zzcbg;
    }

    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
