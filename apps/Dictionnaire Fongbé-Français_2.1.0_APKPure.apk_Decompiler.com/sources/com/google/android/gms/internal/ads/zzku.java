package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzku implements Runnable {
    public final /* synthetic */ zzkw zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zzuc zzc;

    public /* synthetic */ zzku(zzkw zzkw, Pair pair, zzuc zzuc) {
        this.zza = zzkw;
        this.zzb = pair;
        this.zzc = zzuc;
    }

    public final void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzh.zzaf(((Integer) pair.first).intValue(), (zzug) pair.second, this.zzc);
    }
}
