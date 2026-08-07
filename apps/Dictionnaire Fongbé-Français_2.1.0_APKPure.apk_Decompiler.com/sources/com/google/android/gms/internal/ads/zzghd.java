package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzghd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgdy zzb = zzgli.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgdn.class, zzgsj.SYMMETRIC, zzgtl.zzg());
    private static final zzglz zzc = new zzghb();
    private static final zzgmx zzd = zzgmx.zzb(new zzghc(), zzghm.class, zzgdn.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zzgks.zza(1)) {
            int i = zzghw.zza;
            zzghw.zze(zzgmk.zzc());
            zzgma.zzb().zzc(zzc, zzghr.class);
            zzgmh.zza().zze(zzd);
            zzgkz.zzc().zzd(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
