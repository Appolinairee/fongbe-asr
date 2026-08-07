package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzegc implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzegc(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
        this.zzc = zzhfj4;
        this.zzd = zzhfj5;
    }

    /* renamed from: zza */
    public final zzega zzb() {
        return new zzega(zzffh.zzc(), (ScheduledExecutorService) this.zza.zzb(), (zzcrc) this.zzb.zzb(), (zzegq) this.zzc.zzb(), (zzfiv) this.zzd.zzb());
    }
}
