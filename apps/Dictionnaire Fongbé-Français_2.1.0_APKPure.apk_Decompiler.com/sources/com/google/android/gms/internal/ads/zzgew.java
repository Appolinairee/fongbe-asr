package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzgew implements zzgdn {
    private final zzgnf zza;

    /* synthetic */ zzgew(zzgnf zzgnf, zzgex zzgex) {
        this.zza = zzgnf;
        if (zzgnf.zzg()) {
            zzglq zza2 = zzgmf.zzb().zza();
            zzglu zza3 = zzglx.zza(zzgnf);
            zza2.zza(zza3, "aead", "encrypt");
            zza2.zza(zza3, "aead", "decrypt");
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzgnd zzgnd : this.zza.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] zza2 = ((zzgdn) zzgnd.zzd()).zza(bArr, bArr2);
                    zzgnd.zza();
                    int length = bArr.length;
                    return zza2;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgnd zzgnd2 : this.zza.zzf(zzgds.zza)) {
            try {
                byte[] zza3 = ((zzgdn) zzgnd2.zzd()).zza(bArr, bArr2);
                zzgnd2.zza();
                int length2 = bArr.length;
                return zza3;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
