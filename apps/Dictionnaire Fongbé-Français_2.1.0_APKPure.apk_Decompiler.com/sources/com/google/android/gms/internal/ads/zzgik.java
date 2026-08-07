package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgik extends zzgeu {
    private final zzgij zza;
    private final int zzb;

    private zzgik(zzgij zzgij, int i) {
        this.zza = zzgij;
        this.zzb = i;
    }

    public static zzgik zzd(zzgij zzgij, int i) throws GeneralSecurityException {
        if (i >= 8 && i <= 12) {
            return new zzgik(zzgij, i);
        }
        throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgik)) {
            return false;
        }
        zzgik zzgik = (zzgik) obj;
        return zzgik.zza == this.zza && zzgik.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgik.class, this.zza, Integer.valueOf(this.zzb)});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "X-AES-GCM Parameters (variant: " + obj + "salt_size_bytes: " + this.zzb + ")";
    }

    public final boolean zza() {
        return this.zza != zzgij.zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzgij zzc() {
        return this.zza;
    }
}
