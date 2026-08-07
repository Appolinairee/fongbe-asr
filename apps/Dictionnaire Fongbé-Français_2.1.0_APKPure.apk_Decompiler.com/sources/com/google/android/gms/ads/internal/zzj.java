package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfol;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzj implements zzfol {
    final /* synthetic */ zzk zza;

    zzj(zzk zzk) {
        this.zza = zzk;
    }

    public final void zza(int i, long j) {
        this.zza.zzi.zzd(i, System.currentTimeMillis() - j);
    }

    public final void zzb(int i, long j, String str) {
        this.zza.zzi.zze(i, System.currentTimeMillis() - j, str);
    }
}
