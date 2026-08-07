package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcas implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcaw zzc;

    zzcas(zzcaw zzcaw, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzcaw;
    }

    public final void run() {
        zzcaw zzcaw = this.zzc;
        if (zzcaw.zzq != null) {
            zzcaw.zzq.zzj(this.zza, this.zzb);
        }
    }
}
