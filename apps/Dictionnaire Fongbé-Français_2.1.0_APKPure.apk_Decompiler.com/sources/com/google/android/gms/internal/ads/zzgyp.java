package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgyp {
    zzgyp() {
    }

    public static final List zza(Object obj, long j) {
        zzgyd zzgyd = (zzgyd) zzhao.zzh(obj, j);
        if (zzgyd.zzc()) {
            return zzgyd;
        }
        int size = zzgyd.size();
        zzgyd zzf = zzgyd.zzf(size == 0 ? 10 : size + size);
        zzhao.zzv(obj, j, zzf);
        return zzf;
    }
}
