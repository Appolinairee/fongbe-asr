package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzggb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgfy(), zzgfx.class, zzgdn.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgdn.class, zzgsj.SYMMETRIC, zzgri.zzg());
    private static final zzgmb zzd = new zzgfz();
    private static final zzglz zze = new zzgga();
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (zzgks.zza(i)) {
            int i2 = zzgji.zza;
            zzgji.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", zzgie.zza);
            zzggc zzggc = new zzggc((zzgge) null);
            zzggc.zza(12);
            zzggc.zzb(16);
            zzggc.zzc(16);
            zzggc.zzd(zzggd.zzc);
            hashMap.put("AES128_GCM_RAW", zzggc.zze());
            hashMap.put("AES256_GCM", zzgie.zzb);
            zzggc zzggc2 = new zzggc((zzgge) null);
            zzggc2.zza(12);
            zzggc2.zzb(32);
            zzggc2.zzc(16);
            zzggc2.zzd(zzggd.zzc);
            hashMap.put("AES256_GCM_RAW", zzggc2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgmc.zza().zzb(zzd, zzggf.class);
            zzgma.zzb().zzc(zze, zzggf.class);
            zzgkz.zzc().zzf(zzc, i, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
