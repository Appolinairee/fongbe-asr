package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzevd implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzevd(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5) {
        this.zza = zzhfj;
        this.zzb = zzhfj3;
        this.zzc = zzhfj4;
    }

    public static zzevb zza(String str, zzbam zzbam, zzbzm zzbzm, ScheduledExecutorService scheduledExecutorService, zzgcs zzgcs) {
        return new zzevb(str, zzbam, zzbzm, scheduledExecutorService, zzgcs);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        String zza2 = ((zzevy) this.zza).zza();
        String str = zza2;
        zzbam zza3 = zzckl.zza();
        zzbam zzbam = zza3;
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        return new zzevb(zza2, zza3, (zzbzm) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzc2);
    }
}
