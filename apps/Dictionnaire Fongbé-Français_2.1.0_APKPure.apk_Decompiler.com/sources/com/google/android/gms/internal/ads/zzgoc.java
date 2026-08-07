package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgoc {
    @Nullable
    private Integer zza = null;
    @Nullable
    private Integer zzb = null;
    private zzgod zzc = zzgod.zzd;

    private zzgoc() {
    }

    /* synthetic */ zzgoc(zzgoe zzgoe) {
    }

    public final zzgoc zzc(zzgod zzgod) {
        this.zzc = zzgod;
        return this;
    }

    public final zzgof zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        } else if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        } else if (this.zzc != null) {
            return new zzgof(num.intValue(), this.zzb.intValue(), this.zzc, (zzgoe) null);
        } else {
            throw new GeneralSecurityException("variant not set");
        }
    }

    public final zzgoc zza(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i * 8)}));
    }

    public final zzgoc zzb(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }
}
