package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgoj implements zzgng {
    private static final zzgoj zza = new zzgoj();

    private zzgoj() {
    }

    static void zzd() throws GeneralSecurityException {
        zzgmh.zza().zzf(zza);
    }

    public final Class zza() {
        return zzgog.class;
    }

    public final Class zzb() {
        return zzgog.class;
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzgnf zzgnf) throws GeneralSecurityException {
        if (zzgnf.zzc() != null) {
            for (List<zzgnd> it : zzgnf.zze()) {
                for (zzgnd zzd : it) {
                    zzgog zzgog = (zzgog) zzd.zzd();
                }
            }
            return new zzgoh(zzgnf, (zzgoi) null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
