package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzggw extends zzgeu {
    private final zzggv zza;

    private zzggw(zzggv zzggv) {
        this.zza = zzggv;
    }

    public static zzggw zzc(zzggv zzggv) {
        return new zzggw(zzggv);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzggw) && ((zzggw) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzggw.class, this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "ChaCha20Poly1305 Parameters (variant: " + obj + ")";
    }

    public final boolean zza() {
        return this.zza != zzggv.zzc;
    }

    public final zzggv zzb() {
        return this.zza;
    }
}
