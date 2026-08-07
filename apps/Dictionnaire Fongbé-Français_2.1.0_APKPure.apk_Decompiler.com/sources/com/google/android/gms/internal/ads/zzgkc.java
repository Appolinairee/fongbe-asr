package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgkc implements zzgdn {
    private final zzgdn zza;
    private final byte[] zzb;

    private zzgkc(zzgdn zzgdn, byte[] bArr) {
        this.zza = zzgdn;
        int length = bArr.length;
        if (length == 0 || length == 5) {
            this.zzb = bArr;
            return;
        }
        throw new IllegalArgumentException("identifier has an invalid length");
    }

    public static zzgdn zzb(zzglk zzglk) throws GeneralSecurityException {
        byte[] bArr;
        zzgnh zza2 = zzglk.zza(zzgdw.zza());
        zzgsi zza3 = zzgsl.zza();
        zza3.zzb(zza2.zzg());
        zza3.zzc(zza2.zze());
        zza3.zza(zza2.zzb());
        zzgdn zzgdn = (zzgdn) zzgen.zzb((zzgsl) zza3.zzbr(), zzgdn.class);
        zzgtp zzc = zza2.zzc();
        int ordinal = zzc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    bArr = zzgml.zza.zzc();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(zzc))));
                }
            }
            bArr = zzgml.zza(zzglk.zzb().intValue()).zzc();
        } else {
            bArr = zzgml.zzb(zzglk.zzb().intValue()).zzc();
        }
        return new zzgkc(zzgdn, bArr);
    }

    public static zzgdn zzc(zzgdn zzgdn, zzgvo zzgvo) {
        return new zzgkc(zzgdn, zzgvo.zzc());
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgnu.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
