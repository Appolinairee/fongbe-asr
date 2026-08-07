package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgez {
    @Nullable
    private zzgfk zza = null;
    @Nullable
    private zzgvp zzb = null;
    @Nullable
    private zzgvp zzc = null;
    @Nullable
    private Integer zzd = null;

    private zzgez() {
    }

    /* synthetic */ zzgez(zzgfa zzgfa) {
    }

    public final zzgez zza(zzgvp zzgvp) {
        this.zzb = zzgvp;
        return this;
    }

    public final zzgez zzb(zzgvp zzgvp) {
        this.zzc = zzgvp;
        return this;
    }

    public final zzgez zzc(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgez zzd(zzgfk zzgfk) {
        this.zza = zzgfk;
        return this;
    }

    public final zzgfb zze() throws GeneralSecurityException {
        zzgvo zzb2;
        zzgfk zzgfk = this.zza;
        if (zzgfk != null) {
            zzgvp zzgvp = this.zzb;
            if (zzgvp == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            } else if (zzgfk.zzb() != zzgvp.zza()) {
                throw new GeneralSecurityException("AES key size mismatch");
            } else if (zzgfk.zzc() != this.zzc.zza()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            } else if (this.zza.zza() && this.zzd == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzd == null) {
                if (this.zza.zzh() == zzgfi.zzc) {
                    zzb2 = zzgml.zza;
                } else if (this.zza.zzh() == zzgfi.zzb) {
                    zzb2 = zzgml.zza(this.zzd.intValue());
                } else if (this.zza.zzh() == zzgfi.zza) {
                    zzb2 = zzgml.zzb(this.zzd.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzh()))));
                }
                return new zzgfb(this.zza, this.zzb, this.zzc, zzb2, this.zzd, (zzgfa) null);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        } else {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
    }
}
