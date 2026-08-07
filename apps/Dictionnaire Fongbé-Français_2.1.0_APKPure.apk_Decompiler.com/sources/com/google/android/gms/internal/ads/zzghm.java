package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzghm extends zzget {
    private final zzghr zza;
    private final zzgvo zzb;
    @Nullable
    private final Integer zzc;

    private zzghm(zzghr zzghr, zzgvo zzgvo, @Nullable Integer num) {
        this.zza = zzghr;
        this.zzb = zzgvo;
        this.zzc = num;
    }

    public static zzghm zza(zzghr zzghr, @Nullable Integer num) throws GeneralSecurityException {
        zzgvo zzgvo;
        if (zzghr.zzc() == zzghp.zzb) {
            if (num == null) {
                zzgvo = zzgml.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzghr.zzc() != zzghp.zza) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(String.valueOf(zzghr.zzc()))));
        } else if (num != null) {
            zzgvo = zzgml.zzb(num.intValue());
        } else {
            throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
        }
        return new zzghm(zzghr, zzgvo, num);
    }

    public final zzghr zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
