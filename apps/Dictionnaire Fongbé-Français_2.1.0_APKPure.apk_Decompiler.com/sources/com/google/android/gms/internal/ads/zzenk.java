package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzenk implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzenk(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        return new zzeni(zza2, (zzbzm) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzc2);
    }
}
