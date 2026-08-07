package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfsm implements Runnable {
    public final /* synthetic */ zzfsw zza;
    public final /* synthetic */ zzfsd zzb;
    public final /* synthetic */ zzftb zzc;

    public /* synthetic */ zzfsm(zzfsw zzfsw, zzfsd zzfsd, zzftb zzftb) {
        this.zza = zzfsw;
        this.zzb = zzfsd;
        this.zzc = zzftb;
    }

    public final void run() {
        this.zza.zzc(this.zzb, this.zzc);
    }
}
