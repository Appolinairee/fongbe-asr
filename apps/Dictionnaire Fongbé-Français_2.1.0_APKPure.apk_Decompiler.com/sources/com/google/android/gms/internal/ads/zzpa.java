package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzpa implements Runnable {
    public final /* synthetic */ zzpe zza;
    public final /* synthetic */ zzab zzb;
    public final /* synthetic */ zzht zzc;

    public /* synthetic */ zzpa(zzpe zzpe, zzab zzab, zzht zzht) {
        this.zza = zzpe;
        this.zzb = zzab;
        this.zzc = zzht;
    }

    public final void run() {
        this.zza.zzr(this.zzb, this.zzc);
    }
}
