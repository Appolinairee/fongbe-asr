package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgma {
    public static final /* synthetic */ int zza = 0;
    private static final zzglz zzb = new zzgly();
    private static final zzgma zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgma zzb() {
        return zzc;
    }

    private final synchronized zzgdx zzd(zzgek zzgek, @Nullable Integer num) throws GeneralSecurityException {
        zzglz zzglz;
        zzglz = (zzglz) this.zzd.get(zzgek.getClass());
        if (zzglz != null) {
        } else {
            String obj = zzgek.toString();
            throw new GeneralSecurityException("Cannot create a new key for parameters " + obj + ": no key creator for this class was registered.");
        }
        return zzglz.zza(zzgek, num);
    }

    private static zzgma zze() {
        zzgma zzgma = new zzgma();
        try {
            zzgma.zzc(zzb, zzgll.class);
            return zzgma;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final zzgdx zza(zzgek zzgek, @Nullable Integer num) throws GeneralSecurityException {
        return zzd(zzgek, num);
    }

    public final synchronized void zzc(zzglz zzglz, Class cls) throws GeneralSecurityException {
        zzglz zzglz2 = (zzglz) this.zzd.get(cls);
        if (zzglz2 != null) {
            if (!zzglz2.equals(zzglz)) {
                String obj = cls.toString();
                throw new GeneralSecurityException("Different key creator for parameters class " + obj + " already inserted");
            }
        }
        this.zzd.put(cls, zzglz);
    }
}
