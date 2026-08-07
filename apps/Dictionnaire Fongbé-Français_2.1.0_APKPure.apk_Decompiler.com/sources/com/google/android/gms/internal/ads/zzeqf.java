package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeqf implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzeqf(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzesl zza2 = ((zzesn) this.zza).zzb();
        zzesl zzesl = zza2;
        return new zzesd(zza2, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzlY)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
