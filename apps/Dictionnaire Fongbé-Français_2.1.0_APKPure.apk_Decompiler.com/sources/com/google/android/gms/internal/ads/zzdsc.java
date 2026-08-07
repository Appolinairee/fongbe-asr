package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdsc implements Runnable {
    public final /* synthetic */ zzdsf zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdsc(zzdsf zzdsf, String str) {
        this.zza = zzdsf;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzd.zza(this.zzb);
    }
}
