package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzapk implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzapm zzc;

    zzapk(zzapm zzapm, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzapm;
    }

    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzapm zzapm = this.zzc;
        zzapm.zza.zzb(zzapm.toString());
    }
}
