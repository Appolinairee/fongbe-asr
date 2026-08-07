package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzggn {
    @Nullable
    private Integer zza = null;
    private zzggo zzb = zzggo.zzc;

    private zzggn() {
    }

    /* synthetic */ zzggn(zzggp zzggp) {
    }

    public final zzggn zzb(zzggo zzggo) {
        this.zzb = zzggo;
        return this;
    }

    public final zzggq zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        } else if (this.zzb != null) {
            return new zzggq(num.intValue(), this.zzb, (zzggp) null);
        } else {
            throw new GeneralSecurityException("Variant is not set");
        }
    }

    public final zzggn zza(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i)}));
    }
}
