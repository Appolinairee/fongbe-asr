package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzajz {
    public static void zza(zzaka zzaka, zzake zzake, zzdb zzdb) {
        for (int i = 0; i < zzaka.zza(); i++) {
            long zzb = zzaka.zzb(i);
            List zzc = zzaka.zzc(zzb);
            if (!zzc.isEmpty()) {
                if (i != zzaka.zza() - 1) {
                    long zzb2 = zzaka.zzb(i + 1) - zzaka.zzb(i);
                    if (zzb2 > 0) {
                        zzdb.zza(new zzajx(zzc, zzb, zzb2));
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
