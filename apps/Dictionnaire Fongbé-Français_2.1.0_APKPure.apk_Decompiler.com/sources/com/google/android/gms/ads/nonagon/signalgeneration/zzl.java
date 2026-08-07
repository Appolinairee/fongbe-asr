package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzl implements Runnable {
    public final /* synthetic */ zzo zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ boolean zzc;

    public /* synthetic */ zzl(zzo zzo, boolean z, boolean z2) {
        this.zza = zzo;
        this.zzb = z;
        this.zzc = z2;
    }

    public final void run() {
        this.zza.zzd(this.zzb, this.zzc);
    }
}
