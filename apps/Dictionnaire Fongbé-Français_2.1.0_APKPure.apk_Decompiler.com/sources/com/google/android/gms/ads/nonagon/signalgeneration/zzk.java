package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzk implements Runnable {
    public final /* synthetic */ zzo zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ Pair zzc;

    public /* synthetic */ zzk(zzo zzo, Object obj, Pair pair) {
        this.zza = zzo;
        this.zzb = obj;
        this.zzc = pair;
    }

    public final void run() {
        this.zza.zze(this.zzb, this.zzc);
    }
}
