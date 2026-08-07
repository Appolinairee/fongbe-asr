package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgif extends zzget {
    private final zzgik zza;
    private final zzgvp zzb;
    private final zzgvo zzc;
    @Nullable
    private final Integer zzd;

    private zzgif(zzgik zzgik, zzgvp zzgvp, zzgvo zzgvo, @Nullable Integer num) {
        this.zza = zzgik;
        this.zzb = zzgvp;
        this.zzc = zzgvo;
        this.zzd = num;
    }

    public static zzgif zza(zzgik zzgik, zzgvp zzgvp, @Nullable Integer num) throws GeneralSecurityException {
        zzgvo zzgvo;
        zzgij zzc2 = zzgik.zzc();
        zzgij zzgij = zzgij.zzb;
        if (zzc2 != zzgij && num == null) {
            String obj = zzgik.zzc().toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgik.zzc() == zzgij && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzgvp.zza() == 32) {
            if (zzgik.zzc() == zzgij) {
                zzgvo = zzgml.zza;
            } else if (zzgik.zzc() == zzgij.zza) {
                zzgvo = zzgml.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgik.zzc().toString()));
            }
            return new zzgif(zzgik, zzgvp, zzgvo, num);
        } else {
            int zza2 = zzgvp.zza();
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zza2);
        }
    }

    public final zzgik zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzc;
    }

    public final zzgvp zzd() {
        return this.zzb;
    }

    @Nullable
    public final Integer zze() {
        return this.zzd;
    }
}
