package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgof extends zzgoz {
    private final int zza;
    private final int zzb;
    private final zzgod zzc;

    /* synthetic */ zzgof(int i, int i2, zzgod zzgod, zzgoe zzgoe) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgod;
    }

    public static zzgoc zze() {
        return new zzgoc((zzgoe) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgof)) {
            return false;
        }
        zzgof zzgof = (zzgof) obj;
        if (zzgof.zza == this.zza && zzgof.zzd() == zzd() && zzgof.zzc == this.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgof.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    public final boolean zza() {
        return this.zzc != zzgod.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgod zzgod = this.zzc;
        if (zzgod == zzgod.zzd) {
            return this.zzb;
        }
        if (zzgod == zzgod.zza || zzgod == zzgod.zzb || zzgod == zzgod.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgod zzf() {
        return this.zzc;
    }
}
