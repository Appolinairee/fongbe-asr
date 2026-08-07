package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgor {
    private static final zzgmx zza = zzgmx.zzb(new zzgon(), zzgom.class, zzgog.class);
    private static final zzgmx zzb = zzgmx.zzb(new zzgoo(), zzgom.class, zzgej.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzgej.class, zzgsj.SYMMETRIC, zzgsb.zzi());
    private static final zzgmb zzd = new zzgop();
    private static final zzglz zze = new zzgoq();
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (zzgks.zza(i)) {
            int i2 = zzgpw.zza;
            zzgpw.zze(zzgmk.zzc());
            zzgmh.zza().zze(zza);
            zzgmh.zza().zze(zzb);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", zzgpj.zza);
            zzgos zzgos = new zzgos((zzgov) null);
            zzgos.zzb(32);
            zzgos.zzc(16);
            zzgos.zzd(zzgou.zzd);
            zzgos.zza(zzgot.zzc);
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgos.zze());
            zzgos zzgos2 = new zzgos((zzgov) null);
            zzgos2.zzb(32);
            zzgos2.zzc(32);
            zzgos2.zzd(zzgou.zza);
            zzgos2.zza(zzgot.zzc);
            hashMap.put("HMAC_SHA256_256BITTAG", zzgos2.zze());
            zzgos zzgos3 = new zzgos((zzgov) null);
            zzgos3.zzb(32);
            zzgos3.zzc(32);
            zzgos3.zzd(zzgou.zzd);
            zzgos3.zza(zzgot.zzc);
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgos3.zze());
            zzgos zzgos4 = new zzgos((zzgov) null);
            zzgos4.zzb(64);
            zzgos4.zzc(16);
            zzgos4.zzd(zzgou.zza);
            zzgos4.zza(zzgot.zze);
            hashMap.put("HMAC_SHA512_128BITTAG", zzgos4.zze());
            zzgos zzgos5 = new zzgos((zzgov) null);
            zzgos5.zzb(64);
            zzgos5.zzc(16);
            zzgos5.zzd(zzgou.zzd);
            zzgos5.zza(zzgot.zze);
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgos5.zze());
            zzgos zzgos6 = new zzgos((zzgov) null);
            zzgos6.zzb(64);
            zzgos6.zzc(32);
            zzgos6.zzd(zzgou.zza);
            zzgos6.zza(zzgot.zze);
            hashMap.put("HMAC_SHA512_256BITTAG", zzgos6.zze());
            zzgos zzgos7 = new zzgos((zzgov) null);
            zzgos7.zzb(64);
            zzgos7.zzc(32);
            zzgos7.zzd(zzgou.zzd);
            zzgos7.zza(zzgot.zze);
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgos7.zze());
            hashMap.put("HMAC_SHA512_512BITTAG", zzgpj.zzb);
            zzgos zzgos8 = new zzgos((zzgov) null);
            zzgos8.zzb(64);
            zzgos8.zzc(64);
            zzgos8.zzd(zzgou.zzd);
            zzgos8.zza(zzgot.zze);
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgos8.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgma.zzb().zzc(zze, zzgow.class);
            zzgmc.zza().zzb(zzd, zzgow.class);
            zzgkz.zzc().zzf(zzc, i, true);
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
