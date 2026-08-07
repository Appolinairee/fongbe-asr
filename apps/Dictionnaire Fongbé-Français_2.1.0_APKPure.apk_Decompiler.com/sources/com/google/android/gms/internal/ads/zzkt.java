package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzkt implements Runnable {
    public final /* synthetic */ zzkw zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zztx zzc;
    public final /* synthetic */ zzuc zzd;

    public /* synthetic */ zzkt(zzkw zzkw, Pair pair, zztx zztx, zzuc zzuc) {
        this.zza = zzkw;
        this.zzb = pair;
        this.zzc = zztx;
        this.zzd = zzuc;
    }

    public final void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzh.zzaj(((Integer) pair.first).intValue(), (zzug) pair.second, this.zzc, this.zzd);
    }
}
