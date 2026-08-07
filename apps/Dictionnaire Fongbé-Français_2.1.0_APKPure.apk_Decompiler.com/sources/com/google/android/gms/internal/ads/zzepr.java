package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzepr implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzepr(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesd((zzeoj) this.zza.zzb(), (long) ((Integer) zzbe.zzc().zza(zzbcl.zzmg)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
