package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzepw implements zzher {
    private final zzhfj zza;

    public zzepw(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeqr zza2 = zzeqt.zza();
        zzeqr zzeqr = zza2;
        return new zzesd(zza2, (long) ((Integer) zzbe.zzc().zza(zzbcl.zzmd)).intValue(), (ScheduledExecutorService) this.zza.zzb());
    }
}
