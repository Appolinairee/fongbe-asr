package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzggu {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzggs(), zzggr.class, zzgdn.class);
    private static final zzglz zzc = new zzggt();
    private static final zzgdy zzd = zzgli.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgdn.class, zzgsj.SYMMETRIC, zzgru.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgks.zza(1)) {
            int i = zzgju.zza;
            zzgju.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgma.zzb().zzc(zzc, zzggw.class);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", zzggw.zzc(zzggv.zza));
            hashMap.put("CHACHA20_POLY1305_RAW", zzggw.zzc(zzggv.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgkz.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
