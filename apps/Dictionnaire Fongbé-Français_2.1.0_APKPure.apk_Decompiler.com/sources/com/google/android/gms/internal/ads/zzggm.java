package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzggm {
    private static final zzgmx zza = zzgmx.zzb(new zzggj(), zzggi.class, zzgdn.class);
    private static final zzglz zzb = new zzggk();
    private static final zzgmb zzc = new zzggl();
    private static final zzgdy zzd = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgdn.class, zzgsj.SYMMETRIC, zzgro.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgks.zza(1)) {
            int i = zzgjn.zza;
            zzgjn.zze(zzgmk.zzc());
            if (zzb()) {
                zzgmh.zza().zze(zza);
                zzgmg zzb2 = zzgmg.zzb();
                HashMap hashMap = new HashMap();
                zzggn zzggn = new zzggn((zzggp) null);
                zzggn.zza(16);
                zzggn.zzb(zzggo.zza);
                hashMap.put("AES128_GCM_SIV", zzggn.zzc());
                zzggn zzggn2 = new zzggn((zzggp) null);
                zzggn2.zza(16);
                zzggn2.zzb(zzggo.zzc);
                hashMap.put("AES128_GCM_SIV_RAW", zzggn2.zzc());
                zzggn zzggn3 = new zzggn((zzggp) null);
                zzggn3.zza(32);
                zzggn3.zzb(zzggo.zza);
                hashMap.put("AES256_GCM_SIV", zzggn3.zzc());
                zzggn zzggn4 = new zzggn((zzggp) null);
                zzggn4.zza(32);
                zzggn4.zzb(zzggo.zzc);
                hashMap.put("AES256_GCM_SIV_RAW", zzggn4.zzc());
                zzb2.zzd(Collections.unmodifiableMap(hashMap));
                zzgmc.zza().zzb(zzc, zzggq.class);
                zzgma.zzb().zzc(zzb, zzggq.class);
                zzgkz.zzc().zzd(zzd, true);
                return;
            }
            return;
        }
        throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
    }

    private static boolean zzb() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
