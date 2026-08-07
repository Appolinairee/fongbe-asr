package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcau implements Runnable {
    final /* synthetic */ zzcaw zza;

    zzcau(zzcaw zzcaw) {
        this.zza = zzcaw;
    }

    public final void run() {
        zzcaw zzcaw = this.zza;
        if (zzcaw.zzq != null) {
            if (!zzcaw.zzr) {
                zzcaw.zzq.zzg();
                this.zza.zzr = true;
            }
            this.zza.zzq.zze();
        }
    }
}
