package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdxf implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzdxf(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj5;
        this.zze = zzhfj6;
        this.zzf = zzhfj7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        zzfcj zza3 = ((zzcvk) this.zzb).zza();
        zzfcj zzfcj = zza3;
        zzdwg zza4 = ((zzdwh) this.zzc).zzb();
        zzdwg zzdwg = zza4;
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        return new zzdxe(zza2, zza3, zza4, zzc2, (ScheduledExecutorService) this.zzd.zzb(), (zzeag) this.zze.zzb(), (zzfhh) this.zzf.zzb());
    }
}
