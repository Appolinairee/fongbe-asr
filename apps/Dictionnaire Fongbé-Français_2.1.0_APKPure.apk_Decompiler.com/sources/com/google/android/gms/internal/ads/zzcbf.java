package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcbf implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbg zzb;

    zzcbf(zzcbg zzcbg, boolean z) {
        this.zza = z;
        this.zzb = zzcbg;
    }

    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
