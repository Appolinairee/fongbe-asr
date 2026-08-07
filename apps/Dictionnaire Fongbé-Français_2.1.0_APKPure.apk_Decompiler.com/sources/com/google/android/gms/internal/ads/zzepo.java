package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzepo implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzepo(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzesd zzesd;
        zzenc zza2 = ((zzene) this.zza).zzb();
        zzenc zzenc = zza2;
        zzeoj zzeoj = (zzeoj) this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (((List) this.zzc.zzb()).contains("10")) {
            zzesd = new zzesd(zzeoj, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzlZ)).intValue(), scheduledExecutorService);
        } else {
            zzesd = new zzesd(zza2, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzlZ)).intValue(), scheduledExecutorService);
        }
        return zzesd;
    }
}
