package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzghl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc = zzgmt.zzb(new zzghh(), zzghg.class, zzgni.class);
    private static final zzgmp zzd;
    private static final zzglh zze = zzglh.zzb(new zzghj(), zzghe.class, zzgnh.class);
    private static final zzgld zzf;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzb2;
        zzd = zzgmp.zzb(new zzghi(), zzb2, zzgni.class);
        zzf = zzgld.zzb(new zzghk(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzghe zza(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzgtf zzd2 = zzgtf.zzd(zzgnh.zze(), zzgxb.zza());
                if (zzd2.zza() == 0) {
                    return zzghe.zza(zzghg.zzc(zzd2.zzf().zzf(), zzf(zzgnh.zzc())), zzgnh.zzf());
                }
                String valueOf = String.valueOf(zzd2);
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + valueOf);
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzghg zzb(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzghg.zzc(zzgti.zzd(zzgni.zzc().zzh(), zzgxb.zza()).zzf(), zzf(zzgni.zzc().zzg()));
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgnh zzc(zzghe zzghe, zzgeo zzgeo) {
        zzgtd zzb2 = zzgtf.zzb();
        zzgtg zza2 = zzgti.zza();
        zza2.zza(zzghe.zzb().zzd());
        zzb2.zza((zzgti) zza2.zzbr());
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzgtf) zzb2.zzbr()).zzaN(), zzgsj.REMOTE, zzg(zzghe.zzb().zzb()), zzghe.zzd());
    }

    public static /* synthetic */ zzgni zzd(zzghg zzghg) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzgtg zza3 = zzgti.zza();
        zza3.zza(zzghg.zzd());
        zza2.zzc(((zzgti) zza3.zzbr()).zzaN());
        zza2.zza(zzg(zzghg.zzb()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zzc);
        zzgmk.zzh(zzd);
        zzgmk.zzg(zze);
        zzgmk.zzf(zzf);
    }

    private static zzghf zzf(zzgtp zzgtp) throws GeneralSecurityException {
        int ordinal = zzgtp.ordinal();
        if (ordinal == 1) {
            return zzghf.zza;
        }
        if (ordinal == 3) {
            return zzghf.zzb;
        }
        int zza2 = zzgtp.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    private static zzgtp zzg(zzghf zzghf) throws GeneralSecurityException {
        if (zzghf.zza.equals(zzghf)) {
            return zzgtp.TINK;
        }
        if (zzghf.zzb.equals(zzghf)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghf.toString()));
    }
}
