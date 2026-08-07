package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzdrw;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zze implements Runnable {
    public final /* synthetic */ zzdrw zza;
    public final /* synthetic */ Long zzb;

    public /* synthetic */ zze(zzf zzf, zzdrw zzdrw, Long l) {
        this.zza = zzdrw;
        this.zzb = l;
    }

    public final void run() {
        zzf.zzf(this.zza, "cld_r", zzv.zzC().elapsedRealtime() - this.zzb.longValue());
    }
}
