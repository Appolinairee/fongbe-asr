package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzepk implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzepk(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzelw zza2 = ((zzely) this.zza).zzb();
        zzelw zzelw = zza2;
        return new zzesd(zza2, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzmk)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
