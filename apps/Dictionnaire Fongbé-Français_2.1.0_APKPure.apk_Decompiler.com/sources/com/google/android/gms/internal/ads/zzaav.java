package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzaav implements Runnable {
    public final /* synthetic */ zzabb zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzaav(zzabb zzabb, long j, int i) {
        this.zza = zzabb;
        this.zzb = j;
        this.zzc = i;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
