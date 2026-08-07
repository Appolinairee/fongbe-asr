package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgfk extends zzgeu {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgfi zze;
    private final zzgfh zzf;

    /* synthetic */ zzgfk(int i, int i2, int i3, int i4, zzgfi zzgfi, zzgfh zzgfh, zzgfj zzgfj) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzgfi;
        this.zzf = zzgfh;
    }

    public static zzgfg zzf() {
        return new zzgfg((zzgfj) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfk)) {
            return false;
        }
        zzgfk zzgfk = (zzgfk) obj;
        return zzgfk.zza == this.zza && zzgfk.zzb == this.zzb && zzgfk.zzc == this.zzc && zzgfk.zzd == this.zzd && zzgfk.zze == this.zze && zzgfk.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzgfk.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        zzgfh zzgfh = this.zzf;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(zzgfh);
        return "AesCtrHmacAead Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    public final boolean zza() {
        return this.zze != zzgfi.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzgfh zzg() {
        return this.zzf;
    }

    public final zzgfi zzh() {
        return this.zze;
    }
}
