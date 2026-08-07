package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzpd implements Runnable {
    public final /* synthetic */ zzpe zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzpd(zzpe zzpe, String str) {
        this.zza = zzpe;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
