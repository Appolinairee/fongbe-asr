package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgow extends zzgoz {
    private final int zza;
    private final int zzb;
    private final zzgou zzc;
    private final zzgot zzd;

    /* synthetic */ zzgow(int i, int i2, zzgou zzgou, zzgot zzgot, zzgov zzgov) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgou;
        this.zzd = zzgot;
    }

    public static zzgos zze() {
        return new zzgos((zzgov) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgow)) {
            return false;
        }
        zzgow zzgow = (zzgow) obj;
        if (zzgow.zza == this.zza && zzgow.zzd() == zzd() && zzgow.zzc == this.zzc && zzgow.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgow.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        zzgot zzgot = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzgot);
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    public final boolean zza() {
        return this.zzc != zzgou.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgou zzgou = this.zzc;
        if (zzgou == zzgou.zzd) {
            return this.zzb;
        }
        if (zzgou == zzgou.zza || zzgou == zzgou.zzb || zzgou == zzgou.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgot zzf() {
        return this.zzd;
    }

    public final zzgou zzg() {
        return this.zzc;
    }
}
