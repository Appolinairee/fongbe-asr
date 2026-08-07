package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzccb implements Runnable {
    public final /* synthetic */ zzcck zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzccb(zzcck zzcck, int i, int i2) {
        this.zza = zzcck;
        this.zzb = i;
        this.zzc = i2;
    }

    public final void run() {
        this.zza.zzO(this.zzb, this.zzc);
    }
}
