package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhfe {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzhfe(int i, int i2, zzhfd zzhfd) {
        this.zza = zzheo.zzc(i);
        this.zzb = zzheo.zzc(i2);
    }

    public final zzhfe zza(zzhfa zzhfa) {
        this.zzb.add(zzhfa);
        return this;
    }

    public final zzhfe zzb(zzhfa zzhfa) {
        this.zza.add(zzhfa);
        return this;
    }

    public final zzhff zzc() {
        return new zzhff(this.zza, this.zzb, (zzhfd) null);
    }
}
