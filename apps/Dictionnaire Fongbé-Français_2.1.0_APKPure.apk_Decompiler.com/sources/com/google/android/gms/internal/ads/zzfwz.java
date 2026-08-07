package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfwz extends zzfxc {
    zzfwz() {
        super((zzfxb) null);
    }

    static final zzfxc zzf(int i) {
        return i < 0 ? zzfxc.zzb : i > 0 ? zzfxc.zzc : zzfxc.zza;
    }

    public final int zza() {
        return 0;
    }

    public final zzfxc zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    public final zzfxc zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    public final zzfxc zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    public final zzfxc zze(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }
}
