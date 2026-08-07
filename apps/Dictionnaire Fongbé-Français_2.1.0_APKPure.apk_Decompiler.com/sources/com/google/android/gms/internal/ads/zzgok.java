package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgok {
    @Nullable
    private zzgow zza = null;
    @Nullable
    private zzgvp zzb = null;
    @Nullable
    private Integer zzc = null;

    private zzgok() {
    }

    /* synthetic */ zzgok(zzgol zzgol) {
    }

    public final zzgok zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgok zzb(zzgvp zzgvp) {
        this.zzb = zzgvp;
        return this;
    }

    public final zzgok zzc(zzgow zzgow) {
        this.zza = zzgow;
        return this;
    }

    public final zzgom zzd() throws GeneralSecurityException {
        zzgvp zzgvp;
        zzgvo zza2;
        zzgow zzgow = this.zza;
        if (zzgow == null || (zzgvp = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        } else if (zzgow.zzc() != zzgvp.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        } else if (zzgow.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        } else if (this.zza.zza() || this.zzc == null) {
            if (this.zza.zzg() == zzgou.zzd) {
                zza2 = zzgml.zza;
            } else if (this.zza.zzg() == zzgou.zzc || this.zza.zzg() == zzgou.zzb) {
                zza2 = zzgml.zza(this.zzc.intValue());
            } else if (this.zza.zzg() == zzgou.zza) {
                zza2 = zzgml.zzb(this.zzc.intValue());
            } else {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzg()))));
            }
            return new zzgom(this.zza, this.zzb, zza2, this.zzc, (zzgol) null);
        } else {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
    }
}
