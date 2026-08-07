package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgfu extends zzgeu {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzgfs zzd;

    /* synthetic */ zzgfu(int i, int i2, int i3, zzgfs zzgfs, zzgft zzgft) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzgfs;
    }

    public static zzgfr zzd() {
        return new zzgfr((zzgft) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfu)) {
            return false;
        }
        zzgfu zzgfu = (zzgfu) obj;
        if (zzgfu.zza == this.zza && zzgfu.zzb == this.zzb) {
            int i = zzgfu.zzc;
            if (zzgfu.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgfu.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AesEax Parameters (variant: " + valueOf + ", " + this.zzb + "-byte IV, 16-byte tag, and " + this.zza + "-byte key)";
    }

    public final boolean zza() {
        return this.zzd != zzgfs.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgfs zze() {
        return this.zzd;
    }
}
