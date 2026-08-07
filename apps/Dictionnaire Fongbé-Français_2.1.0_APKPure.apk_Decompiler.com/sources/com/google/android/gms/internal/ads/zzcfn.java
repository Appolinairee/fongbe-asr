package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcfn implements Runnable {
    public final /* synthetic */ zzcfp zza;
    public final /* synthetic */ zzecp zzb;

    public /* synthetic */ zzcfn(zzcfp zzcfp, zzecp zzecp) {
        this.zza = zzcfp;
        this.zzb = zzecp;
    }

    public final void run() {
        this.zzb.zzf(new zzcfo(this.zza));
    }
}
