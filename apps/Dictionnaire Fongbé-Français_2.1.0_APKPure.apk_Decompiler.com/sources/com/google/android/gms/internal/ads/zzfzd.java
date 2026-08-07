package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfzd extends zzfxn {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzfzd(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    public final Object get(int i) {
        zzfun.zza(i, this.zzc, "index");
        return Objects.requireNonNull(this.zza[i + i + this.zzb]);
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }
}
