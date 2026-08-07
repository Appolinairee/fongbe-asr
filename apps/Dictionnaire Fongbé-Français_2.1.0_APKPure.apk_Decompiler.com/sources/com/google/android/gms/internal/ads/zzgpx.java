package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgpx implements zzgej {
    private zzgpx(zzgej zzgej, zzgtp zzgtp, byte[] bArr) {
    }

    public static zzgej zza(zzglk zzglk) throws GeneralSecurityException {
        byte[] bArr;
        zzgnh zza = zzglk.zza(zzgdw.zza());
        zzgsi zza2 = zzgsl.zza();
        zza2.zzb(zza.zzg());
        zza2.zzc(zza.zze());
        zza2.zza(zza.zzb());
        zzgej zzgej = (zzgej) zzgen.zzb((zzgsl) zza2.zzbr(), zzgej.class);
        zzgtp zzc = zza.zzc();
        int ordinal = zzc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    bArr = zzgml.zza.zzc();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            bArr = zzgml.zza(zzglk.zzb().intValue()).zzc();
        } else {
            bArr = zzgml.zzb(zzglk.zzb().intValue()).zzc();
        }
        return new zzgpx(zzgej, zzc, bArr);
    }
}
