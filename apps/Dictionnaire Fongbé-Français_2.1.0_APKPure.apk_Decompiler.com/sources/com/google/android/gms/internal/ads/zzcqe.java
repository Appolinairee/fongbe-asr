package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcqe implements Runnable {
    public final /* synthetic */ zzcqf zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcqe(zzcqf zzcqf, Runnable runnable) {
        this.zza = zzcqf;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzl(this.zzb);
    }
}
