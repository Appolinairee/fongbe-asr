package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzou implements Runnable {
    public final /* synthetic */ zzpe zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzou(zzpe zzpe, long j) {
        this.zza = zzpe;
        this.zzb = j;
    }

    public final void run() {
        this.zza.zzs(this.zzb);
    }
}
