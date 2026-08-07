package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcdl implements Runnable {
    public final /* synthetic */ zzcbs zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzcdl(zzcbs zzcbs, boolean z, long j) {
        this.zza = zzcbs;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        int i = zzcdn.zzd;
        this.zza.zzv(this.zzb, this.zzc);
    }
}
