package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzgcs;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzal implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzgcs zzb;

    public /* synthetic */ zzal(zzau zzau, zzgcs zzgcs) {
        this.zza = zzau;
        this.zzb = zzgcs;
    }

    public final void run() {
        this.zza.zzb(this.zzb);
    }
}
