package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzkn implements Runnable {
    public final /* synthetic */ zzko zza;
    public final /* synthetic */ zzfxk zzb;
    public final /* synthetic */ zzug zzc;

    public /* synthetic */ zzkn(zzko zzko, zzfxk zzfxk, zzug zzug) {
        this.zza = zzko;
        this.zzb = zzfxk;
        this.zzc = zzug;
    }

    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}
