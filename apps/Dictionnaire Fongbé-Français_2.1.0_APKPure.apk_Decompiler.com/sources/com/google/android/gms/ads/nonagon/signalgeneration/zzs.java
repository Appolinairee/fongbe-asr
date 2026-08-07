package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdrq;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzs implements Runnable {
    public final /* synthetic */ zzv zza;
    public final /* synthetic */ zzdrq zzb;
    public final /* synthetic */ ArrayDeque zzc;
    public final /* synthetic */ ArrayDeque zzd;

    public /* synthetic */ zzs(zzv zzv, zzdrq zzdrq, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.zza = zzv;
        this.zzb = zzdrq;
        this.zzc = arrayDeque;
        this.zzd = arrayDeque2;
    }

    public final void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd);
    }
}
