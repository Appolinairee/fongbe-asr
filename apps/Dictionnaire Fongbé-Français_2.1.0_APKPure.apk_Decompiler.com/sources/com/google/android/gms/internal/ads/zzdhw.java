package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdhw implements Runnable {
    public final /* synthetic */ zzdia zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzdhw(zzdia zzdia, boolean z) {
        this.zza = zzdia;
        this.zzb = z;
    }

    public final void run() {
        this.zza.zzy(this.zzb);
    }
}
