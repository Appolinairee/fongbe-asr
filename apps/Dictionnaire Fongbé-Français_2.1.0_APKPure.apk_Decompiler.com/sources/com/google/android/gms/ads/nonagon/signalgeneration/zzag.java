package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdnl;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzag implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzdnl[] zzb;

    public /* synthetic */ zzag(zzau zzau, zzdnl[] zzdnlArr) {
        this.zza = zzau;
        this.zzb = zzdnlArr;
    }

    public final void run() {
        this.zza.zzJ(this.zzb);
    }
}
