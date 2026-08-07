package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzesb implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzesb(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
    }

    /* renamed from: zza */
    public final zzerz zzb() {
        zzgcs zzc = zzffh.zzc();
        zzgcs zzgcs = zzc;
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        return new zzerz(zzc, zza2, (Set) this.zzb.zzb());
    }
}
