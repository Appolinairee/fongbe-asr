package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgob {
    private static final zzglz zza = new zzgny();
    private static final zzgmx zzb = zzgmx.zzb(new zzgnz(), zzgnx.class, zzgog.class);
    private static final zzgmx zzc = zzgmx.zzb(new zzgoa(), zzgnx.class, zzgej.class);
    private static final zzgdy zzd = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgej.class, zzgsj.SYMMETRIC, zzgqb.zzh());

    public static /* synthetic */ zzgnx zzb(zzgof zzgof, Integer num) {
        zze(zzgof);
        zzgnv zzgnv = new zzgnv((zzgnw) null);
        zzgnv.zzc(zzgof);
        zzgnv.zza(zzgvp.zzc(zzgof.zzc()));
        zzgnv.zzb(num);
        return zzgnv.zzd();
    }

    public static void zzd(boolean z) throws GeneralSecurityException {
        if (zzgks.zza(1)) {
            int i = zzgpo.zza;
            zzgpo.zze(zzgmk.zzc());
            zzgma.zzb().zzc(zza, zzgof.class);
            zzgmh.zza().zze(zzb);
            zzgmh.zza().zze(zzc);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES_CMAC", zzgpj.zzc);
            hashMap.put("AES256_CMAC", zzgpj.zzc);
            zzgoc zzgoc = new zzgoc((zzgoe) null);
            zzgoc.zza(32);
            zzgoc.zzb(16);
            zzgoc.zzc(zzgod.zzd);
            hashMap.put("AES256_CMAC_RAW", zzgoc.zzd());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgkz.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
    }

    /* access modifiers changed from: private */
    public static void zze(zzgof zzgof) throws GeneralSecurityException {
        if (zzgof.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
