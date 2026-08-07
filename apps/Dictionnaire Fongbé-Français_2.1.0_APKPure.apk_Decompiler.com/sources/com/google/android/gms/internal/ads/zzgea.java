package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgea {
    public static final zzgek zza(zzgek zzgek) throws GeneralSecurityException {
        return zzgek != null ? zzgek : zzgeq.zza(zzb((zzgek) null).zzaV());
    }

    static final zzgsp zzb(zzgek zzgek) {
        try {
            return ((zzgni) zzgmk.zzc().zze((zzgek) null, zzgni.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzgnt("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }
}
