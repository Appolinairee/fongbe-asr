package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzghw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc = zzgmt.zzb(new zzghs(), zzghr.class, zzgni.class);
    private static final zzgmp zzd;
    private static final zzglh zze = zzglh.zzb(new zzghu(), zzghm.class, zzgnh.class);
    private static final zzgld zzf;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzb2;
        zzd = zzgmp.zzb(new zzght(), zzb2, zzgni.class);
        zzf = zzgld.zzb(new zzghv(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzghm zza(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzgtl zzd2 = zzgtl.zzd(zzgnh.zze(), zzgxb.zza());
                if (zzd2.zza() == 0) {
                    return zzghm.zza(zzf(zzd2.zzf(), zzgnh.zzc()), zzgnh.zzf());
                }
                String valueOf = String.valueOf(zzd2);
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + valueOf);
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzghr zzb(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zzf(zzgto.zzf(zzgni.zzc().zzh(), zzgxb.zza()), zzgni.zzc().zzg());
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgnh zzc(zzghm zzghm, zzgeo zzgeo) {
        zzgtj zzb2 = zzgtl.zzb();
        zzb2.zza(zzg(zzghm.zzb()));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgtl) zzb2.zzbr()).zzaN(), zzgsj.REMOTE, zzh(zzghm.zzb().zzc()), zzghm.zzd());
    }

    public static /* synthetic */ zzgni zzd(zzghr zzghr) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza2.zzc(zzg(zzghr).zzaN());
        zza2.zza(zzh(zzghr.zzc()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zzc);
        zzgmk.zzh(zzd);
        zzgmk.zzg(zze);
        zzgmk.zzf(zzf);
    }

    private static zzghr zzf(zzgto zzgto, zzgtp zzgtp) throws GeneralSecurityException {
        zzgho zzgho;
        zzghp zzghp;
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb(zzgto.zza().zzi());
        zza2.zzc(zzgto.zza().zzh());
        zza2.zza(zzgtp.RAW);
        zzgek zza3 = zzgeq.zza(((zzgsp) zza2.zzbr()).zzaV());
        if (zza3 instanceof zzggf) {
            zzgho = zzgho.zza;
        } else if (zza3 instanceof zzggw) {
            zzgho = zzgho.zzc;
        } else if (zza3 instanceof zzgir) {
            zzgho = zzgho.zzb;
        } else if (zza3 instanceof zzgfk) {
            zzgho = zzgho.zzd;
        } else if (zza3 instanceof zzgfu) {
            zzgho = zzgho.zze;
        } else if (zza3 instanceof zzggq) {
            zzgho = zzgho.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zza3.toString()));
        }
        zzghn zzghn = new zzghn((zzghq) null);
        int ordinal = zzgtp.ordinal();
        if (ordinal == 1) {
            zzghp = zzghp.zza;
        } else if (ordinal == 3) {
            zzghp = zzghp.zzb;
        } else {
            int zza4 = zzgtp.zza();
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza4);
        }
        zzghn.zzd(zzghp);
        zzghn.zzc(zzgto.zzg());
        zzghn.zza((zzgeu) zza3);
        zzghn.zzb(zzgho);
        return zzghn.zze();
    }

    private static zzgto zzg(zzghr zzghr) throws GeneralSecurityException {
        try {
            zzgsp zzf2 = zzgsp.zzf(zzgeq.zzb(zzghr.zzb()), zzgxb.zza());
            zzgtm zzb2 = zzgto.zzb();
            zzb2.zzb(zzghr.zzd());
            zzb2.zza(zzf2);
            return (zzgto) zzb2.zzbr();
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzgtp zzh(zzghp zzghp) throws GeneralSecurityException {
        if (zzghp.zza.equals(zzghp)) {
            return zzgtp.TINK;
        }
        if (zzghp.zzb.equals(zzghp)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzghp))));
    }
}
