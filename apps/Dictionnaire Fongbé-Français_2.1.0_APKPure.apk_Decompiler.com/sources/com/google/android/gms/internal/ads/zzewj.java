package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzewj implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzewj(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj6;
        this.zze = zzhfj7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Boolean zza2 = ((zzewb) this.zzb).zzb();
        Boolean bool = zza2;
        boolean booleanValue = zza2.booleanValue();
        Boolean zza3 = ((zzewc) this.zzc).zzb();
        Boolean bool2 = zza3;
        boolean booleanValue2 = zza3.booleanValue();
        zzbzb zza4 = zzckv.zza();
        zzbzb zzbzb = zza4;
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        String zza5 = ((zzevy) this.zzd).zza();
        String str = zza5;
        return new zzewh((zzbzm) this.zza.zzb(), booleanValue, booleanValue2, zza4, zzc2, zza5, (ScheduledExecutorService) this.zze.zzb());
    }
}
