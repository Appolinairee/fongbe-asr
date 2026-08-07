package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzept implements zzher {
    private final zzhfj zza;

    public zzept(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfxs zzfxs;
        zzeol zza2 = zzeon.zza();
        zzeol zzeol = zza2;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeg)).booleanValue()) {
            zzfxs = zzfxs.zzo(new zzesd(zza2, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzeh)).intValue(), scheduledExecutorService));
        } else {
            zzfxs = zzfxs.zzn();
        }
        zzhez.zzb(zzfxs);
        return zzfxs;
    }
}
