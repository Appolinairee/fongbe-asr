package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcar implements Runnable {
    final /* synthetic */ zzcaw zza;

    zzcar(zzcaw zzcaw) {
        this.zza = zzcaw;
    }

    public final void run() {
        zzcaw zzcaw = this.zza;
        if (zzcaw.zzq != null) {
            zzcaw.zzq.zzh();
        }
    }
}
