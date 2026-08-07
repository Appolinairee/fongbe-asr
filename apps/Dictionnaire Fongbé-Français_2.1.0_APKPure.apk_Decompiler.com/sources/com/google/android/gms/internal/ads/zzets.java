package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzets implements Runnable {
    public final /* synthetic */ zzetu zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzetr zzc;
    public final /* synthetic */ Bundle zzd;

    public /* synthetic */ zzets(zzetu zzetu, long j, zzetr zzetr, Bundle bundle) {
        this.zza = zzetu;
        this.zzb = j;
        this.zzc = zzetr;
        this.zzd = bundle;
    }

    public final void run() {
        this.zza.zzb(this.zzb, this.zzc, this.zzd);
    }
}
