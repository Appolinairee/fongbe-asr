package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcmc implements Runnable {
    public final /* synthetic */ zzcmk zza;
    public final /* synthetic */ Throwable zzb;

    public /* synthetic */ zzcmc(zzcmk zzcmk, Throwable th) {
        this.zza = zzcmk;
        this.zzb = th;
    }

    public final void run() {
        this.zza.zzh(this.zzb);
    }
}
