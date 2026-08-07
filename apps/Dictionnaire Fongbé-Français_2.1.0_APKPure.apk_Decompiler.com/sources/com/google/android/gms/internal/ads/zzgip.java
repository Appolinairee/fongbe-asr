package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgip {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgim(), zzgil.class, zzgdn.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgdn.class, zzgsj.SYMMETRIC, zzgue.zzg());
    private static final zzgmb zzd = new zzgin();
    private static final zzglz zze = new zzgio();

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgks.zza(1)) {
            int i = zzgkp.zza;
            zzgkp.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", zzgir.zzc(zzgiq.zza));
            hashMap.put("XCHACHA20_POLY1305_RAW", zzgir.zzc(zzgiq.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgma.zzb().zzc(zze, zzgir.class);
            zzgmc.zza().zzb(zzd, zzgir.class);
            zzgkz.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
