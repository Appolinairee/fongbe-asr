package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfso implements Runnable {
    public final /* synthetic */ zzfsw zza;
    public final /* synthetic */ zzftd zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ zzftb zzd;

    public /* synthetic */ zzfso(zzfsw zzfsw, zzftd zzftd, int i, zzftb zzftb) {
        this.zza = zzfsw;
        this.zzb = zzftd;
        this.zzc = i;
        this.zzd = zzftb;
    }

    public final void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd);
    }
}
