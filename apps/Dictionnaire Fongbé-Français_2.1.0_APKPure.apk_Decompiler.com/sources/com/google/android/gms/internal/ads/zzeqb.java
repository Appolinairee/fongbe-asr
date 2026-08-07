package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeqb implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzeqb(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
        this.zzc = zzhfj4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzesd zzesd;
        zzero zza2 = zzerq.zza();
        zzero zzero = zza2;
        zzeoj zzeoj = (zzeoj) this.zza.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (((List) this.zzb.zzb()).contains("24")) {
            zzesd = new zzesd(zzeoj, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzmb)).intValue(), scheduledExecutorService);
        } else {
            zzesd = new zzesd(zza2, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzmb)).intValue(), scheduledExecutorService);
        }
        return zzesd;
    }
}
