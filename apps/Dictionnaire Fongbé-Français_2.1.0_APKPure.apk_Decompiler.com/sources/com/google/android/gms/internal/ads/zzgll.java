package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgll extends zzgek {
    private final zzgni zza;

    public zzgll(zzgni zzgni) {
        this.zza = zzgni;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgll)) {
            return false;
        }
        zzgni zzgni = ((zzgll) obj).zza;
        if (!this.zza.zzc().zzg().equals(zzgni.zzc().zzg()) || !this.zza.zzc().zzi().equals(zzgni.zzc().zzi()) || !this.zza.zzc().zzh().equals(zzgni.zzc().zzh())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzgni zzgni = this.zza;
        return Objects.hash(new Object[]{zzgni.zzc(), zzgni.zzd()});
    }

    public final String toString() {
        String str;
        String zzi = this.zza.zzc().zzi();
        int ordinal = this.zza.zzc().zzg().ordinal();
        if (ordinal != 1) {
            str = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY";
        } else {
            str = "TINK";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", new Object[]{zzi, str});
    }

    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgtp.RAW;
    }

    public final zzgni zzb() {
        return this.zza;
    }
}
