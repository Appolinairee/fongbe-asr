package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgun implements zzgdn {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgun(byte[] bArr, zzgvo zzgvo) throws GeneralSecurityException {
        if (zzgks.zza(2)) {
            this.zza = zzgjd.zzc(bArr);
            this.zzb = zzgvo.zzc();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzgdn zzb(zzgfx zzgfx) throws GeneralSecurityException {
        return new zzgun(zzgfx.zzd().zzd(zzgdw.zza()), zzgfx.zzc());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            byte[] bArr3 = this.zzb;
            int length = bArr.length;
            if (length < bArr3.length + 28) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (zzgnu.zzc(bArr3, bArr)) {
                AlgorithmParameterSpec zza2 = zzgjd.zza(bArr, this.zzb.length, 12);
                SecretKey secretKey = this.zza;
                Cipher zzb2 = zzgjd.zzb();
                zzb2.init(2, secretKey, zza2);
                if (!(bArr2 == null || bArr2.length == 0)) {
                    zzb2.updateAAD(bArr2);
                }
                int length2 = this.zzb.length;
                return zzb2.doFinal(bArr, length2 + 12, (length - length2) - 12);
            } else {
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
        } else {
            throw new NullPointerException("ciphertext is null");
        }
    }
}
