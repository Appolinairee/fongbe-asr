package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcat implements Runnable {
    final /* synthetic */ zzcaw zza;

    zzcat(zzcaw zzcaw) {
        this.zza = zzcaw;
    }

    public final void run() {
        zzcaw zzcaw = this.zza;
        if (zzcaw.zzq != null) {
            zzcaw.zzq.zzd();
            this.zza.zzq.zzi();
        }
    }
}
