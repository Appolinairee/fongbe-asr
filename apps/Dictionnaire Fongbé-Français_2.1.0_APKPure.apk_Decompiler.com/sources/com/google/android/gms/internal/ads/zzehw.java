package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzehw implements Runnable {
    public final /* synthetic */ zzehx zza;
    public final /* synthetic */ zzfca zzb;
    public final /* synthetic */ zzfbo zzc;
    public final /* synthetic */ zzecz zzd;

    public /* synthetic */ zzehw(zzehx zzehx, zzfca zzfca, zzfbo zzfbo, zzecz zzecz) {
        this.zza = zzehx;
        this.zzb = zzfca;
        this.zzc = zzfbo;
        this.zzd = zzecz;
    }

    public final void run() {
        zzehz.zze(this.zzb, this.zzc, this.zzd);
    }
}
