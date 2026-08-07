package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcta implements zzdbg, zzcxh {
    private final Clock zza;
    private final zzctc zzb;
    private final zzfcj zzc;
    private final String zzd;

    zzcta(Clock clock, zzctc zzctc, zzfcj zzfcj, String str) {
        this.zza = clock;
        this.zzb = zzctc;
        this.zzc = zzfcj;
        this.zzd = str;
    }

    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.elapsedRealtime());
    }

    public final void zzs() {
        Clock clock = this.zza;
        this.zzb.zzd(this.zzc.zzf, this.zzd, clock.elapsedRealtime());
    }
}
