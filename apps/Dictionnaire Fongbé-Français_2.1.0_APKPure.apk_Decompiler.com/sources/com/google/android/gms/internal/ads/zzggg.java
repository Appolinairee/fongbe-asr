package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzggg {
    @Nullable
    private zzggq zza = null;
    @Nullable
    private zzgvp zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzggg() {
    }

    /* synthetic */ zzggg(zzggh zzggh) {
    }

    public final zzggg zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzggg zzb(zzgvp zzgvp) {
        this.zzb = zzgvp;
        return this;
    }

    public final zzggg zzc(zzggq zzggq) {
        this.zza = zzggq;
        return this;
    }

    public final zzggi zzd() throws GeneralSecurityException {
        zzgvp zzgvp;
        zzgvo zzb2;
        zzggq zzggq = this.zza;
        if (zzggq == null || (zzgvp = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzggq.zzb() != zzgvp.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzggq.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zzd() == zzggo.zzc) {
                zzb2 = zzgml.zza;
            } else if (this.zza.zzd() == zzggo.zzb) {
                zzb2 = zzgml.zza(this.zzc.intValue());
            } else if (this.zza.zzd() == zzggo.zza) {
                zzb2 = zzgml.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
            }
            return new zzggi(this.zza, this.zzb, zzb2, this.zzc, (zzggh) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
