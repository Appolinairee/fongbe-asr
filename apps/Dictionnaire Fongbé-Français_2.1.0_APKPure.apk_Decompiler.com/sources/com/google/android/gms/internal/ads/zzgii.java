package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgii {
    private static final zzglz zza = new zzgig();
    private static final zzgmx zzb = zzgmx.zzb(new zzgih(), zzgif.class, zzgdn.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzgkj.zza;
        zzgkj.zze(zzgmk.zzc());
        zzgmg zzb2 = zzgmg.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzgie.zzg);
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzgmh.zza().zze(zzb);
        zzgma.zzb().zzc(zza, zzgik.class);
    }
}
