package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzepv implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzepv(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeqo zza2 = ((zzeqp) this.zza).zzb();
        zzeqo zzeqo = zza2;
        return new zzesd(zza2, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzme)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
