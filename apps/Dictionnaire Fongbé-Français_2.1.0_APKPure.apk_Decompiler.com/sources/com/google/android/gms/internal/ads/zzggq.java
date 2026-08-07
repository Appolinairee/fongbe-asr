package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzggq extends zzgeu {
    private final int zza;
    private final zzggo zzb;

    /* synthetic */ zzggq(int i, zzggo zzggo, zzggp zzggp) {
        this.zza = i;
        this.zzb = zzggo;
    }

    public static zzggn zzc() {
        return new zzggn((zzggp) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggq)) {
            return false;
        }
        zzggq zzggq = (zzggq) obj;
        return zzggq.zza == this.zza && zzggq.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzggq.class, Integer.valueOf(this.zza), this.zzb});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        return "AesGcmSiv Parameters (variant: " + valueOf + ", " + this.zza + "-byte key)";
    }

    public final boolean zza() {
        return this.zzb != zzggo.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzggo zzd() {
        return this.zzb;
    }
}
