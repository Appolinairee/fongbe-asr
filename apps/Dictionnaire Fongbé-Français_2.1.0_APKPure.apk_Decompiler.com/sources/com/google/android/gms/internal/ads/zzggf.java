package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzggf extends zzgeu {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzggd zzd;

    /* synthetic */ zzggf(int i, int i2, int i3, zzggd zzggd, zzgge zzgge) {
        this.zza = i;
        this.zzd = zzggd;
    }

    public static zzggc zzc() {
        return new zzggc((zzgge) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggf)) {
            return false;
        }
        zzggf zzggf = (zzggf) obj;
        if (zzggf.zza == this.zza) {
            int i = zzggf.zzb;
            int i2 = zzggf.zzc;
            if (zzggf.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzggf.class, Integer.valueOf(this.zza), 12, 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AesGcm Parameters (variant: " + valueOf + ", 12-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final boolean zza() {
        return this.zzd != zzggd.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzggd zzd() {
        return this.zzd;
    }
}
