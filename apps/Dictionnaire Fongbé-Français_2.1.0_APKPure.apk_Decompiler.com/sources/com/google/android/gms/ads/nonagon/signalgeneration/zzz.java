package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdsb;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzz implements Runnable {
    public final /* synthetic */ zzdsb zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Pair[] zzc;

    public /* synthetic */ zzz(zzdsb zzdsb, zzdrq zzdrq, String str, Pair[] pairArr) {
        this.zza = zzdsb;
        this.zzb = str;
        this.zzc = pairArr;
    }

    public final void run() {
        zzaa.zze(this.zza, (zzdrq) null, this.zzb, this.zzc);
    }
}
