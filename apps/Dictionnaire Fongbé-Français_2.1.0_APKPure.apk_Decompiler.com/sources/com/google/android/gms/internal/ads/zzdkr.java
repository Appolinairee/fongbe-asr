package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdkr implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzdkr(zzdkk zzdkk, zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdnv zza2 = ((zzdnw) this.zza).zzb();
        zzdnv zzdnv = zza2;
        zzddk zzddk = new zzddk(zza2, (Executor) this.zzb.zzb());
        zzddk zzddk2 = zzddk;
        return zzddk;
    }
}
