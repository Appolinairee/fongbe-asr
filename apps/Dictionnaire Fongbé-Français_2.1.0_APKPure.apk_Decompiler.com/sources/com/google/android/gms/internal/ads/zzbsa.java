package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbsa implements Runnable {
    public final /* synthetic */ zzbsc zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzbsa(zzbsc zzbsc, boolean z) {
        this.zza = zzbsc;
        this.zzb = z;
    }

    public final void run() {
        this.zza.zzc(this.zzb);
    }
}
