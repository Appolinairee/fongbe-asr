package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzggz {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzggx(), zzghe.class, zzgdn.class);
    private static final zzgdy zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgdn.class, zzgsj.REMOTE, zzgtf.zzg());
    private static final zzglz zzd = new zzggy();

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgks.zza(1)) {
            int i = zzghl.zza;
            zzghl.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgma.zzb().zzc(zzd, zzghg.class);
            zzgkz.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
