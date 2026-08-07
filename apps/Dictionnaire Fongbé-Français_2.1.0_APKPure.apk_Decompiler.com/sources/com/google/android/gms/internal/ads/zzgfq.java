package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgfq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgfo(), zzgfn.class, zzgdn.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgdn.class, zzgsj.SYMMETRIC, zzgqz.zzh());
    private static final zzglz zzd = new zzgfp();

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgks.zza(1)) {
            int i = zzgjb.zza;
            zzgjb.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", zzgie.zzc);
            zzgfr zzgfr = new zzgfr((zzgft) null);
            zzgfr.zza(16);
            zzgfr.zzb(16);
            zzgfr.zzc(16);
            zzgfr.zzd(zzgfs.zzc);
            hashMap.put("AES128_EAX_RAW", zzgfr.zze());
            hashMap.put("AES256_EAX", zzgie.zzd);
            zzgfr zzgfr2 = new zzgfr((zzgft) null);
            zzgfr2.zza(16);
            zzgfr2.zzb(32);
            zzgfr2.zzc(16);
            zzgfr2.zzd(zzgfs.zzc);
            hashMap.put("AES256_EAX_RAW", zzgfr2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgma.zzb().zzc(zzd, zzgfu.class);
            zzgkz.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}
