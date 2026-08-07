package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcqk implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzcqk(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcqy zza2 = ((zzctf) this.zza).zzb();
        zzcqy zzcqy = zza2;
        zzbhn zza3 = ((zzcqj) this.zzb).zza();
        zzbhn zzbhn = zza3;
        Runnable zza4 = ((zzcqi) this.zzc).zza();
        Runnable runnable = zza4;
        return new zzcqf(zza2, zza3, zza4, (Executor) this.zzd.zzb());
    }
}
