package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdvf implements Runnable {
    public final /* synthetic */ zzdvg zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdvf(zzdvg zzdvg, String str) {
        this.zza = zzdvg;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzi(this.zzb);
    }
}
