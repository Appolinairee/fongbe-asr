package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgke implements zzgdn {
    private final byte[] zza;
    private final int zzb;
    private final zzgpy zzc;

    private zzgke(byte[] bArr, zzgvo zzgvo, int i) throws GeneralSecurityException {
        this.zzc = new zzgvi(bArr);
        this.zza = zzgvo.zzc();
        this.zzb = i;
    }

    public static zzgdn zzb(zzgif zzgif) throws GeneralSecurityException {
        return new zzgke(zzgif.zzd().zzd(zzgdw.zza()), zzgif.zzc(), zzgif.zzb().zzb());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            byte[] bArr3 = this.zza;
            int i = this.zzb;
            int length = bArr.length;
            if (length < bArr3.length + i + 28) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (zzgnu.zzc(bArr3, bArr)) {
                byte[] bArr4 = this.zza;
                int i2 = this.zzb;
                int length2 = bArr4.length;
                int i3 = i2 + length2;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i3);
                byte[] bArr5 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                byte[] bArr6 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                int length3 = copyOfRange.length;
                if (length3 > 12 || length3 < 8) {
                    throw new GeneralSecurityException("invalid salt size");
                }
                System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
                System.arraycopy(copyOfRange, 0, bArr6, 4, length3);
                byte[] bArr7 = new byte[32];
                System.arraycopy(this.zzc.zza(bArr5, 16), 0, bArr7, 0, 16);
                System.arraycopy(this.zzc.zza(bArr6, 16), 0, bArr7, 16, 16);
                if (zzgks.zza(2)) {
                    SecretKey zzc2 = zzgjd.zzc(bArr7);
                    int i4 = i3 + 12;
                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i3, i4);
                    if (copyOfRange2.length != 12) {
                        throw new GeneralSecurityException("iv is wrong size");
                    } else if (length >= i3 + 28) {
                        AlgorithmParameterSpec zza2 = zzgjd.zza(copyOfRange2, 0, 12);
                        Cipher zzb2 = zzgjd.zzb();
                        zzb2.init(2, zzc2, zza2);
                        if (!(bArr2 == null || bArr2.length == 0)) {
                            zzb2.updateAAD(bArr2);
                        }
                        return zzb2.doFinal(bArr, i4, length - i4);
                    } else {
                        throw new GeneralSecurityException("ciphertext too short");
                    }
                } else {
                    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
            } else {
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
        } else {
            throw new NullPointerException("ciphertext is null");
        }
    }
}
