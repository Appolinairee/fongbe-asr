package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeeo implements Runnable {
    public final /* synthetic */ zzeeq zza;
    public final /* synthetic */ zzfca zzb;
    public final /* synthetic */ zzfbo zzc;

    public /* synthetic */ zzeeo(zzeeq zzeeq, zzfca zzfca, zzfbo zzfbo) {
        this.zza = zzeeq;
        this.zzb = zzfca;
        this.zzc = zzfbo;
    }

    public final void run() {
        this.zza.zzf(this.zzb, this.zzc);
    }
}
