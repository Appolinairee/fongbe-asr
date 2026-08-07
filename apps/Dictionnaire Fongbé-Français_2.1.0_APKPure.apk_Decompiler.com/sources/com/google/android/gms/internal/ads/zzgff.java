package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgff {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgfc(), zzgfb.class, zzgdn.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgdn.class, zzgsj.SYMMETRIC, zzgqk.zzh());
    private static final zzgmb zzd = new zzgfd();
    private static final zzglz zze = new zzgfe();
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (zzgks.zza(i)) {
            int i2 = zzgiw.zza;
            zzgiw.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", zzgie.zze);
            zzgfg zzgfg = new zzgfg((zzgfj) null);
            zzgfg.zza(16);
            zzgfg.zzc(32);
            zzgfg.zze(16);
            zzgfg.zzd(16);
            zzgfg.zzb(zzgfh.zzc);
            zzgfg.zzf(zzgfi.zzc);
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzgfg.zzg());
            hashMap.put("AES256_CTR_HMAC_SHA256", zzgie.zzf);
            zzgfg zzgfg2 = new zzgfg((zzgfj) null);
            zzgfg2.zza(32);
            zzgfg2.zzc(32);
            zzgfg2.zze(32);
            zzgfg2.zzd(16);
            zzgfg2.zzb(zzgfh.zzc);
            zzgfg2.zzf(zzgfi.zzc);
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzgfg2.zzg());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgmc.zza().zzb(zzd, zzgfk.class);
            zzgma.zzb().zzc(zze, zzgfk.class);
            zzgkz.zzc().zzf(zzc, i, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
