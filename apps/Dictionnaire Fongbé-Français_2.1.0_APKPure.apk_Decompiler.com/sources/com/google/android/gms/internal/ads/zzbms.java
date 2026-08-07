package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbms implements Runnable {
    public final /* synthetic */ zzbmv zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbms(zzbmv zzbmv, String str) {
        this.zza = zzbmv;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzn(this.zzb);
    }
}
