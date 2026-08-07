package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzgyb extends AbstractList {
    private final zzgxz zza;
    private final zzgya zzb;

    public zzgyb(zzgxz zzgxz, zzgya zzgya) {
        this.zza = zzgxz;
        this.zzb = zzgya;
    }

    public final Object get(int i) {
        return this.zzb.zzb(this.zza.zzd(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
