package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdyb implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzdyb(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    /* renamed from: zza */
    public final zzdya zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        return new zzdya(zza2, (zzbyi) this.zzb.zzb());
    }
}
