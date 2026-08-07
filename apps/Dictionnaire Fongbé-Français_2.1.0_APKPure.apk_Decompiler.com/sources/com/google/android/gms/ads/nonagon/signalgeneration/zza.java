package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbyy;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zza implements Runnable {
    public final /* synthetic */ zzb zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzau zzc;
    public final /* synthetic */ zzbyy zzd;

    public /* synthetic */ zza(zzb zzb2, String str, zzau zzau, zzbyy zzbyy) {
        this.zza = zzb2;
        this.zzb = str;
        this.zzc = zzau;
        this.zzd = zzbyy;
    }

    public final void run() {
        this.zza.zzc(this.zzb, this.zzc, this.zzd);
    }
}
