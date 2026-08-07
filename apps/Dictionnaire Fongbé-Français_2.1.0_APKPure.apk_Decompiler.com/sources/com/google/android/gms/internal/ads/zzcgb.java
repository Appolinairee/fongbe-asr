package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcgb implements Runnable {
    public final /* synthetic */ zzcgd zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzcgb(zzcgd zzcgd, String str) {
        this.zza = zzcgd;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
