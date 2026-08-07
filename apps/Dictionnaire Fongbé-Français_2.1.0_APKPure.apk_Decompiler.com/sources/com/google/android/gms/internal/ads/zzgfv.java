package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgfv {
    @Nullable
    private zzggf zza = null;
    @Nullable
    private zzgvp zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzgfv() {
    }

    /* synthetic */ zzgfv(zzgfw zzgfw) {
    }

    public final zzgfv zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfv zzb(zzgvp zzgvp) {
        this.zzb = zzgvp;
        return this;
    }

    public final zzgfv zzc(zzggf zzggf) {
        this.zza = zzggf;
        return this;
    }

    public final zzgfx zzd() throws GeneralSecurityException {
        zzgvp zzgvp;
        zzgvo zzb2;
        zzggf zzggf = this.zza;
        if (zzggf == null || (zzgvp = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzggf.zzb() != zzgvp.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzggf.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zzd() == zzggd.zzc) {
                zzb2 = zzgml.zza;
            } else if (this.zza.zzd() == zzggd.zzb) {
                zzb2 = zzgml.zza(this.zzc.intValue());
            } else if (this.zza.zzd() == zzggd.zza) {
                zzb2 = zzgml.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
            }
            return new zzgfx(this.zza, this.zzb, zzb2, this.zzc, (zzgfw) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
