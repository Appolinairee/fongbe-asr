package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeer implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzeer(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj6;
    }

    /* renamed from: zza */
    public final zzeeq zzb() {
        zzedx zza2 = ((zzedy) this.zzb).zzb();
        zzedx zzedx = zza2;
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        return new zzeeq((zzcpq) this.zza.zzb(), zza2, (zzcvv) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzc2, (zzdrq) this.zze.zzb());
    }
}
