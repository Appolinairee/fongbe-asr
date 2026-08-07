package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzoy implements Runnable {
    public final /* synthetic */ zzpe zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzoy(zzpe zzpe, Exception exc) {
        this.zza = zzpe;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzj(this.zzb);
    }
}
