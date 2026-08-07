package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcap implements Runnable {
    final /* synthetic */ zzcaw zza;

    zzcap(zzcaw zzcaw) {
        this.zza = zzcaw;
    }

    public final void run() {
        zzcaw zzcaw = this.zza;
        if (zzcaw.zzq != null) {
            zzcaw.zzq.zza();
        }
    }
}
