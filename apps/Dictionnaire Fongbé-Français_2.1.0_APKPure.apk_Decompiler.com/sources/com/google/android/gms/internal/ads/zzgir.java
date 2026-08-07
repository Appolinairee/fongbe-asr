package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgir extends zzgeu {
    private final zzgiq zza;

    private zzgir(zzgiq zzgiq) {
        this.zza = zzgiq;
    }

    public static zzgir zzc(zzgiq zzgiq) {
        return new zzgir(zzgiq);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgir) && ((zzgir) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgir.class, this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "XChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }

    public final boolean zza() {
        return this.zza != zzgiq.zzc;
    }

    public final zzgiq zzb() {
        return this.zza;
    }
}
