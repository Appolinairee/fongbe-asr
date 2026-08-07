package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdsp implements zzher {
    private final zzdsl zza;
    private final zzhfj zzb;

    public zzdsp(zzdsl zzdsl, zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzdsl;
        this.zzb = zzhfj;
    }

    public static Set zza(zzdsl zzdsl, zzdsv zzdsv, Executor executor) {
        Set zzd = zzdsl.zzd(zzdsv, executor);
        zzhez.zzb(zzd);
        Set set = zzd;
        return zzd;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzdsv) this.zzb.zzb(), zzffh.zzc());
    }
}
