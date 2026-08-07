package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzglo {
    public static final zzglo zza = new zzglm().zza();
    private final Map zzb;

    /* synthetic */ zzglo(Map map, zzgln zzgln) {
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzglo)) {
            return false;
        }
        return this.zzb.equals(((zzglo) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
