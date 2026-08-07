package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzkr implements Runnable {
    public final /* synthetic */ zzkw zza;
    public final /* synthetic */ Pair zzb;
    public final /* synthetic */ zztx zzc;
    public final /* synthetic */ zzuc zzd;
    public final /* synthetic */ IOException zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzkr(zzkw zzkw, Pair pair, zztx zztx, zzuc zzuc, IOException iOException, boolean z) {
        this.zza = zzkw;
        this.zzb = pair;
        this.zzc = zztx;
        this.zzd = zzuc;
        this.zze = iOException;
        this.zzf = z;
    }

    public final void run() {
        Pair pair = this.zzb;
        this.zza.zza.zzh.zzai(((Integer) pair.first).intValue(), (zzug) pair.second, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
