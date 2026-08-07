package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcd {
    public static final zzcd zza = new zzcd(0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzcd(int i, int i2, float f) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcd) {
            zzcd zzcd = (zzcd) obj;
            return this.zzb == zzcd.zzb && this.zzc == zzcd.zzc && this.zzd == zzcd.zzd;
        }
    }

    public final int hashCode() {
        return ((((this.zzb + 217) * 31) + this.zzc) * 31) + Float.floatToRawIntBits(this.zzd);
    }
}
