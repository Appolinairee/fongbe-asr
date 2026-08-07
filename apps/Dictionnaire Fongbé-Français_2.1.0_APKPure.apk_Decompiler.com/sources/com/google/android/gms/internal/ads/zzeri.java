package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeri implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzeri(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    /* renamed from: zza */
    public final zzerg zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        return new zzerg(zza2, (Intent) this.zzb.zzb());
    }
}
