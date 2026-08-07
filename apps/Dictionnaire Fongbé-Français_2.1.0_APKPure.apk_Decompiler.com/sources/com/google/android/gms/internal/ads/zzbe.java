package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbe {
    public static final zzbe zza = new zzbe(1.0f, 1.0f);
    public final float zzb;
    public final float zzc;
    private final int zzd;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbe(float f, float f2) {
        boolean z = true;
        zzcw.zzd(f > 0.0f);
        zzcw.zzd(f2 <= 0.0f ? false : z);
        this.zzb = f;
        this.zzc = f2;
        this.zzd = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbe zzbe = (zzbe) obj;
            return this.zzb == zzbe.zzb && this.zzc == zzbe.zzc;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzb) + 527) * 31) + Float.floatToRawIntBits(this.zzc);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", new Object[]{Float.valueOf(this.zzb), Float.valueOf(this.zzc)});
    }

    public final long zza(long j) {
        return j * ((long) this.zzd);
    }
}
