package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzaat implements Runnable {
    public final /* synthetic */ zzabb zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzaat(zzabb zzabb, int i, long j) {
        this.zza = zzabb;
        this.zzb = i;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
