package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzaaw implements Runnable {
    public final /* synthetic */ zzabb zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzaaw(zzabb zzabb, Exception exc) {
        this.zza = zzabb;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
