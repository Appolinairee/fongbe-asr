package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzn extends zzx {
    private final int zza;
    private final int zzb;
    private final double zzc;
    private final boolean zzd;

    zzn(int i, int i2, double d, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = d;
        this.zzd = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzx = (zzx) obj;
            return this.zza == zzx.zzc() && this.zzb == zzx.zzb() && Double.doubleToLongBits(this.zzc) == Double.doubleToLongBits(zzx.zza()) && this.zzd == zzx.zzd();
        }
    }

    public final int hashCode() {
        return ((((int) ((Double.doubleToLongBits(this.zzc) >>> 32) ^ Double.doubleToLongBits(this.zzc))) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003)) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.zza + ", initialBackoffMs=" + this.zzb + ", backoffMultiplier=" + this.zzc + ", bufferAfterMaxAttempts=" + this.zzd + "}";
    }

    public final double zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzd;
    }
}
