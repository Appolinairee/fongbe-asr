package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzvd implements Runnable {
    public final /* synthetic */ zzvk zza;
    public final /* synthetic */ zzadm zzb;

    public /* synthetic */ zzvd(zzvk zzvk, zzadm zzadm) {
        this.zza = zzvk;
        this.zzb = zzadm;
    }

    public final void run() {
        this.zza.zzG(this.zzb);
    }
}
