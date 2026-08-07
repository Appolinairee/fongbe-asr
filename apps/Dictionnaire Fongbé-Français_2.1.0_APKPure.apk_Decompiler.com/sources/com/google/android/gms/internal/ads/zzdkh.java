package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdkh implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzdkh(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdif zza2 = ((zzdiy) this.zza).zza();
        zzdif zzdif = zza2;
        zzdik zza3 = ((zzdhg) this.zzb).zzb();
        zzdik zzdik = zza3;
        return new zzdkg(zza2, zza3, (Executor) this.zzc.zzb(), zzffh.zzc());
    }
}
