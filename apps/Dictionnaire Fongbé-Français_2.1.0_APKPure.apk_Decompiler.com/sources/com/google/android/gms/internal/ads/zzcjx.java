package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcjx implements Runnable {
    public final /* synthetic */ zzcjy zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcjx(zzcjy zzcjy, Runnable runnable) {
        this.zza = zzcjy;
        this.zzb = runnable;
    }

    public final void run() {
        zzbzw.zzf.execute(new zzcjs(this.zza, this.zzb));
    }
}
