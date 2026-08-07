package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeqa implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzeqa(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzerk zza2 = ((zzerm) this.zza).zzb();
        zzerk zzerk = zza2;
        return new zzesd(zza2, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzmc)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
