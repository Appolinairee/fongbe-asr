package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgil extends zzget {
    private final zzgir zza;
    private final zzgvp zzb;
    private final zzgvo zzc;
    @Nullable
    private final Integer zzd;

    private zzgil(zzgir zzgir, zzgvp zzgvp, zzgvo zzgvo, @Nullable Integer num) {
        this.zza = zzgir;
        this.zzb = zzgvp;
        this.zzc = zzgvo;
        this.zzd = num;
    }

    public static zzgil zza(zzgiq zzgiq, zzgvp zzgvp, @Nullable Integer num) throws GeneralSecurityException {
        zzgvo zzgvo;
        zzgiq zzgiq2 = zzgiq.zzc;
        if (zzgiq != zzgiq2 && num == null) {
            String obj = zzgiq.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgiq == zzgiq2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzgvp.zza() == 32) {
            zzgir zzc2 = zzgir.zzc(zzgiq);
            if (zzc2.zzb() == zzgiq2) {
                zzgvo = zzgml.zza;
            } else if (zzc2.zzb() == zzgiq.zzb) {
                zzgvo = zzgml.zza(num.intValue());
            } else if (zzc2.zzb() == zzgiq.zza) {
                zzgvo = zzgml.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzc2.zzb().toString()));
            }
            return new zzgil(zzc2, zzgvp, zzgvo, num);
        } else {
            int zza2 = zzgvp.zza();
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza2);
        }
    }

    public final zzgir zzb() {
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
