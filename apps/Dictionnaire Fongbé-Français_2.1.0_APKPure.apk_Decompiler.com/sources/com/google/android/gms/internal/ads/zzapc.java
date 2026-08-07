package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzapc implements Runnable {
    private final zzapm zza;
    private final zzaps zzb;
    private final Runnable zzc;

    public zzapc(zzapm zzapm, zzaps zzaps, Runnable runnable) {
        this.zza = zzapm;
        this.zzb = zzaps;
        this.zzc = runnable;
    }

    public final void run() {
        this.zza.zzw();
        zzaps zzaps = this.zzb;
        if (zzaps.zzc()) {
            this.zza.zzo(zzaps.zza);
        } else {
            this.zza.zzn(zzaps.zzc);
        }
        if (this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        } else {
            this.zza.zzp("done");
        }
        Runnable runnable = this.zzc;
        if (runnable != null) {
            runnable.run();
        }
    }
}
