package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzaau implements Runnable {
    public final /* synthetic */ zzabb zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzaau(zzabb zzabb, Object obj, long j) {
        this.zza = zzabb;
        this.zzb = obj;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}
