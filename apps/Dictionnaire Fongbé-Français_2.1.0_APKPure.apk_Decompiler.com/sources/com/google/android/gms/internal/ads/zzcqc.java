package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcqc implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcqc(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    /* renamed from: zza */
    public final zzcqb zzb() {
        zzcex zza2 = ((zzcpj) this.zza).zza();
        zzcex zzcex = zza2;
        return new zzcqb(zza2, (Executor) this.zzb.zzb());
    }
}
