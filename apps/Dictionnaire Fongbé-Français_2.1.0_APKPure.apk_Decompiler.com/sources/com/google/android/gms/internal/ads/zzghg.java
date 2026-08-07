package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzghg extends zzgeu {
    private final String zza;
    private final zzghf zzb;

    private zzghg(String str, zzghf zzghf) {
        this.zza = str;
        this.zzb = zzghf;
    }

    public static zzghg zzc(String str, zzghf zzghf) {
        return new zzghg(str, zzghf);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghg)) {
            return false;
        }
        zzghg zzghg = (zzghg) obj;
        if (!zzghg.zza.equals(this.zza) || !zzghg.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzghg.class, this.zza, this.zzb});
    }

    public final String toString() {
        String obj = this.zzb.toString();
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + obj + ")";
    }

    public final boolean zza() {
        return this.zzb != zzghf.zzb;
    }

    public final zzghf zzb() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zza;
    }
}
