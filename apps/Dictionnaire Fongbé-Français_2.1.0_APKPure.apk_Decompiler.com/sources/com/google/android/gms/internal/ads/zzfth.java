package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfth implements Runnable {
    public final /* synthetic */ zzftn zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzfth(zzftn zzftn, Runnable runnable) {
        this.zza = zzftn;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzj(this.zzb);
    }
}
