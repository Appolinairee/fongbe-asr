package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzccd implements Runnable {
    public final /* synthetic */ zzcck zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzccd(zzcck zzcck, boolean z, long j) {
        this.zza = zzcck;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzJ(this.zzb, this.zzc);
    }
}
