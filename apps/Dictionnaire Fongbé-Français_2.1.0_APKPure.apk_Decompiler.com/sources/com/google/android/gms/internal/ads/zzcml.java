package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcml implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzcml(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj6;
        this.zzf = zzhfj7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        zzg zza3 = ((zzchb) this.zzb).zzb();
        zzg zzg = zza3;
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        return new zzcmk(zza2, zza3, (zzecs) this.zzc.zzb(), (zzdpb) this.zzd.zzb(), zzc2, (zzgcs) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb());
    }
}
