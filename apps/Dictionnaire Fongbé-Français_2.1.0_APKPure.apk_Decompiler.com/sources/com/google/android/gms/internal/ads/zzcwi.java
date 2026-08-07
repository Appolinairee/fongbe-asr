package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcwi implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzcwi(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcwf zza2 = ((zzcwh) this.zza).zzb();
        zzcwf zzcwf = zza2;
        Set zzc2 = ((zzhff) this.zzb).zzb();
        Set set = zzc2;
        return new zzcwg(zza2, zzc2, zzffh.zzc(), (ScheduledExecutorService) this.zzc.zzb());
    }
}
