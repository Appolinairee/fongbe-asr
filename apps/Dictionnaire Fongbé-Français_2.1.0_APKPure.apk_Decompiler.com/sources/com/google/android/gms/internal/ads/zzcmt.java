package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcmt implements Runnable {
    public final /* synthetic */ zzcmw zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcmt(zzcmw zzcmw, int i, int i2) {
        this.zza = zzcmw;
        this.zzb = i;
        this.zzc = i2;
    }

    public final void run() {
        this.zza.zzp(this.zzb, this.zzc);
    }
}
