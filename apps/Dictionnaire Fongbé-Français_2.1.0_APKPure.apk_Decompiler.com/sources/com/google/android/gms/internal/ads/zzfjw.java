package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfjw implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzfjw(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfjp zza2 = ((zzfjq) this.zzb).zzb();
        zzfjp zzfjp = zza2;
        Context zza3 = ((zzche) this.zzc).zza();
        Context context = zza3;
        return new zzfjv((zzfki) this.zza.zzb(), zza2, zza3, (Clock) this.zzd.zzb());
    }
}
