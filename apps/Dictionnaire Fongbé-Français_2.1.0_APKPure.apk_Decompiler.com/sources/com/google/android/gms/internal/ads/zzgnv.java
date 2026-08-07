package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgnv {
    @Nullable
    private zzgof zza = null;
    @Nullable
    private zzgvp zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzgnv() {
    }

    /* synthetic */ zzgnv(zzgnw zzgnw) {
    }

    public final zzgnv zza(zzgvp zzgvp) throws GeneralSecurityException {
        this.zzb = zzgvp;
        return this;
    }

    public final zzgnv zzb(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgnv zzc(zzgof zzgof) {
        this.zza = zzgof;
        return this;
    }

    public final zzgnx zzd() throws GeneralSecurityException {
        zzgvp zzgvp;
        zzgvo zza2;
        zzgof zzgof = this.zza;
        if (zzgof == null || (zzgvp = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgof.zzc() != zzgvp.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgof.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zzf() == zzgod.zzd) {
                zza2 = zzgml.zza;
            } else if (this.zza.zzf() == zzgod.zzc || this.zza.zzf() == zzgod.zzb) {
                zza2 = zzgml.zza(this.zzc.intValue());
            } else if (this.zza.zzf() == zzgod.zza) {
                zza2 = zzgml.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzf()))));
            }
            return new zzgnx(this.zza, this.zzb, zza2, this.zzc, (zzgnw) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
