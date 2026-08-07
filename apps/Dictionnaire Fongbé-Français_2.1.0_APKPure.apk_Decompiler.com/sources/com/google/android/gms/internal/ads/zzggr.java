package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzggr extends zzget {
    private final zzggw zza;
    private final zzgvp zzb;
    private final zzgvo zzc;
    @Nullable
    private final Integer zzd;

    private zzggr(zzggw zzggw, zzgvp zzgvp, zzgvo zzgvo, @Nullable Integer num) {
        this.zza = zzggw;
        this.zzb = zzgvp;
        this.zzc = zzgvo;
        this.zzd = num;
    }

    public static zzggr zza(zzggv zzggv, zzgvp zzgvp, @Nullable Integer num) throws GeneralSecurityException {
        zzgvo zzgvo;
        zzggv zzggv2 = zzggv.zzc;
        if (zzggv != zzggv2 && num == null) {
            String obj = zzggv.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzggv == zzggv2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzgvp.zza() == 32) {
            zzggw zzc2 = zzggw.zzc(zzggv);
            if (zzc2.zzb() == zzggv2) {
                zzgvo = zzgml.zza;
            } else if (zzc2.zzb() == zzggv.zzb) {
                zzgvo = zzgml.zza(num.intValue());
            } else if (zzc2.zzb() == zzggv.zza) {
                zzgvo = zzgml.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc2.zzb().toString()));
            }
            return new zzggr(zzc2, zzgvp, zzgvo, num);
        } else {
            int zza2 = zzgvp.zza();
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza2);
        }
    }

    public final zzggw zzb() {
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
