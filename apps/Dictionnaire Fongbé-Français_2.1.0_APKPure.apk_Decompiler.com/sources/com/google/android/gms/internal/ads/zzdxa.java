package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdxa implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzdxa(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5) {
        this.zza = zzhfj;
        this.zzb = zzhfj4;
        this.zzc = zzhfj5;
    }

    /* renamed from: zza */
    public final zzdwz zzb() {
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        zzgcs zzc3 = zzffn.zzc();
        zzgcs zzgcs2 = zzc3;
        zzdxu zza2 = ((zzdxv) this.zzb).zzb();
        zzdxu zzdxu = zza2;
        return new zzdwz((ScheduledExecutorService) this.zza.zzb(), zzc2, zzc3, zza2, zzheq.zza(zzhfc.zza(this.zzc)));
    }
}
