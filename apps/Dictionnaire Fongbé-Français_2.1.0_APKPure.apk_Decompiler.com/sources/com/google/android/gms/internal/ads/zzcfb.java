package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcfb implements Runnable {
    public final /* synthetic */ zzcff zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzcfb(zzcff zzcff, boolean z, long j) {
        this.zza = zzcff;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzp(this.zzb, this.zzc);
    }
}
