package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzevw implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzevw(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbti zza2 = zzckr.zza();
        zzbti zzbti = zza2;
        Context zza3 = ((zzche) this.zzb).zza();
        Context context = zza3;
        return new zzevu(zza2, (ScheduledExecutorService) this.zza.zzb(), zza3);
    }
}
