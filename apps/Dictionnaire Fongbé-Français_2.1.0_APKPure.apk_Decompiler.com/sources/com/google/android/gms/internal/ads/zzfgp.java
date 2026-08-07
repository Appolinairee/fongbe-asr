package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfgp implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzfgp(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgcs zzc = zzffh.zzc();
        zzgcs zzgcs = zzc;
        zzfgm zza2 = ((zzfgq) this.zzb).zzb();
        zzfgm zzfgm = zza2;
        return new zzfgn(zzc, (ScheduledExecutorService) this.zza.zzb(), zza2);
    }
}
