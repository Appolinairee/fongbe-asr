package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzjr implements Runnable {
    public final /* synthetic */ zzkc zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ boolean zzc;

    public /* synthetic */ zzjr(zzkc zzkc, int i, boolean z) {
        this.zza = zzkc;
        this.zzb = i;
        this.zzc = z;
    }

    public final void run() {
        this.zza.zzf(this.zzb, this.zzc);
    }
}
