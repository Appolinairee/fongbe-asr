package com.google.android.gms.internal.ads;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgjd {
    private static final ThreadLocal zza = new zzgjc();

    public static AlgorithmParameterSpec zza(byte[] bArr, int i, int i2) {
        Integer num;
        if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            num = null;
        } else {
            num = Integer.valueOf(Build.VERSION.SDK_INT);
        }
        if (num != null) {
            num.intValue();
        }
        return new GCMParameterSpec(128, bArr, i, 12);
    }

    public static Cipher zzb() {
        return (Cipher) zza.get();
    }

    public static SecretKey zzc(byte[] bArr) throws GeneralSecurityException {
        zzgvm.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
