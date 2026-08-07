package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzgxb {
    static final zzgxb zza = new zzgxb(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzgxb zzd;
    private final Map zze;

    zzgxb() {
        this.zze = new HashMap();
    }

    public static zzgxb zza() {
        int i = zzgzm.zza;
        return zza;
    }

    public static zzgxb zzb() {
        zzgxb zzgxb = zzd;
        if (zzgxb != null) {
            return zzgxb;
        }
        synchronized (zzgxb.class) {
            zzgxb zzgxb2 = zzd;
            if (zzgxb2 != null) {
                return zzgxb2;
            }
            int i = zzgzm.zza;
            zzgxb zzb2 = zzgxj.zzb(zzgxb.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzgxp zzc(zzgzc zzgzc, int i) {
        return (zzgxp) this.zze.get(new zzgxa(zzgzc, i));
    }

    zzgxb(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
