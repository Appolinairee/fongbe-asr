package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzghr extends zzgeu {
    private final zzghp zza;
    private final String zzb;
    private final zzgho zzc;
    private final zzgeu zzd;

    /* synthetic */ zzghr(zzghp zzghp, String str, zzgho zzgho, zzgeu zzgeu, zzghq zzghq) {
        this.zza = zzghp;
        this.zzb = str;
        this.zzc = zzgho;
        this.zzd = zzgeu;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzghr)) {
            return false;
        }
        zzghr zzghr = (zzghr) obj;
        if (!zzghr.zzc.equals(this.zzc) || !zzghr.zzd.equals(this.zzd) || !zzghr.zzb.equals(this.zzb) || !zzghr.zza.equals(this.zza)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzghr.class, this.zzb, this.zzc, this.zzd, this.zza});
    }

    public final String toString() {
        zzghp zzghp = this.zza;
        zzgeu zzgeu = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzgeu);
        String valueOf3 = String.valueOf(zzghp);
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + valueOf + ", dekParametersForNewKeys: " + valueOf2 + ", variant: " + valueOf3 + ")";
    }

    public final boolean zza() {
        return this.zza != zzghp.zzb;
    }

    public final zzgeu zzb() {
        return this.zzd;
    }

    public final zzghp zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
