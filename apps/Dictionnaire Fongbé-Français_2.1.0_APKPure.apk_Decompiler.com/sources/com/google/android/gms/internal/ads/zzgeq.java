package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgeq {
    public static zzgek zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgsp zzf = zzgsp.zzf(bArr, zzgxb.zza());
            zzgmk zzc = zzgmk.zzc();
            zzgni zza = zzgni.zza(zzf);
            if (!zzc.zzk(zza)) {
                return new zzgll(zza);
            }
            return zzc.zzb(zza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzgek zzgek) throws GeneralSecurityException {
        return ((zzgni) zzgmk.zzc().zze(zzgek, zzgni.class)).zzc().zzaV();
    }
}
