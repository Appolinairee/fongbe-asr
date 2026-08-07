package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdjg implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;

    public zzdjg(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj6;
        this.zzg = zzhfj7;
        this.zzh = zzhfj9;
    }

    /* renamed from: zza */
    public final zzdjf zzb() {
        zzg zza2 = ((zzchb) this.zza).zzb();
        zzg zzg2 = zza2;
        zzfcj zza3 = ((zzcvk) this.zzb).zza();
        zzfcj zzfcj = zza3;
        zzdif zza4 = ((zzdiy) this.zzd).zza();
        zzdif zzdif = zza4;
        return new zzdjf(zza2, zza3, (zzdik) this.zzc.zzb(), zza4, (zzdjt) this.zze.zzb(), (zzdkb) this.zzf.zzb(), (Executor) this.zzg.zzb(), zzffh.zzc(), (zzdic) this.zzh.zzb());
    }
}
