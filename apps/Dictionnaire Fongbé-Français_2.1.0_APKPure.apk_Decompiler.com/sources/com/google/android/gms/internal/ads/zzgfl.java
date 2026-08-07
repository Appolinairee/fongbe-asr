package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgfl {
    @Nullable
    private zzgfu zza = null;
    @Nullable
    private zzgvp zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzgfl() {
    }

    /* synthetic */ zzgfl(zzgfm zzgfm) {
    }

    public final zzgfl zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgfl zzb(zzgvp zzgvp) {
        this.zzb = zzgvp;
        return this;
    }

    public final zzgfl zzc(zzgfu zzgfu) {
        this.zza = zzgfu;
        return this;
    }

    public final zzgfn zzd() throws GeneralSecurityException {
        zzgvp zzgvp;
        zzgvo zzb2;
        zzgfu zzgfu = this.zza;
        if (zzgfu == null || (zzgvp = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgfu.zzc() != zzgvp.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgfu.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zze() == zzgfs.zzc) {
                zzb2 = zzgml.zza;
            } else if (this.zza.zze() == zzgfs.zzb) {
                zzb2 = zzgml.zza(this.zzc.intValue());
            } else if (this.zza.zze() == zzgfs.zza) {
                zzb2 = zzgml.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zze()))));
            }
            return new zzgfn(this.zza, this.zzb, zzb2, this.zzc, (zzgfm) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
