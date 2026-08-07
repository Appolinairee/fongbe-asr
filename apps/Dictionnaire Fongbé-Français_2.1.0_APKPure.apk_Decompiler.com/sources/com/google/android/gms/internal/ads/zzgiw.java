package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgiw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc = zzgmt.zzb(new zzgis(), zzgfk.class, zzgni.class);
    private static final zzgmp zzd;
    private static final zzglh zze = zzglh.zzb(new zzgiu(), zzgfb.class, zzgnh.class);
    private static final zzgld zzf;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzb2;
        zzd = zzgmp.zzb(new zzgit(), zzb2, zzgni.class);
        zzf = zzgld.zzb(new zzgiv(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzgfb zza(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgqk zzd2 = zzgqk.zzd(zzgnh.zze(), zzgxb.zza());
                if (zzd2.zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } else if (zzd2.zzf().zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                } else if (zzd2.zzg().zza() == 0) {
                    zzgfg zzf2 = zzgfk.zzf();
                    zzf2.zza(zzd2.zzf().zzg().zzd());
                    zzf2.zzc(zzd2.zzg().zzh().zzd());
                    zzf2.zzd(zzd2.zzf().zzf().zza());
                    zzf2.zze(zzd2.zzg().zzg().zza());
                    zzf2.zzb(zzf(zzd2.zzg().zzg().zzb()));
                    zzf2.zzf(zzg(zzgnh.zzc()));
                    zzgfk zzg = zzf2.zzg();
                    zzgez zza2 = zzgfb.zza();
                    zza2.zzd(zzg);
                    zza2.zza(zzgvp.zzb(zzd2.zzf().zzg().zzA(), zzgeo));
                    zza2.zzb(zzgvp.zzb(zzd2.zzg().zzh().zzA(), zzgeo));
                    zza2.zzc(zzgnh.zzf());
                    return zza2.zze();
                } else {
                    throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                }
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgfk zzb(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgqn zzc2 = zzgqn.zzc(zzgni.zzc().zzh(), zzgxb.zza());
                if (zzc2.zzf().zzb() == 0) {
                    zzgfg zzf2 = zzgfk.zzf();
                    zzf2.zza(zzc2.zzd().zza());
                    zzf2.zzc(zzc2.zzf().zza());
                    zzf2.zzd(zzc2.zzd().zzf().zza());
                    zzf2.zze(zzc2.zzf().zzh().zza());
                    zzf2.zzb(zzf(zzc2.zzf().zzh().zzb()));
                    zzf2.zzf(zzg(zzgni.zzc().zzg()));
                    return zzf2.zzg();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgnh zzc(zzgfb zzgfb, zzgeo zzgeo) {
        zzgqi zzb2 = zzgqk.zzb();
        zzgqo zzb3 = zzgqq.zzb();
        zzgqu zzb4 = zzgqw.zzb();
        zzb4.zza(zzgfb.zzb().zzd());
        zzb3.zzb((zzgqw) zzb4.zzbr());
        byte[] zzd2 = zzgfb.zzd().zzd(zzgeo);
        zzb3.zza(zzgwj.zzv(zzd2, 0, zzd2.length));
        zzb2.zza((zzgqq) zzb3.zzbr());
        zzgrz zzb5 = zzgsb.zzb();
        zzb5.zzb(zzh(zzgfb.zzb()));
        byte[] zzd3 = zzgfb.zze().zzd(zzgeo);
        zzb5.zza(zzgwj.zzv(zzd3, 0, zzd3.length));
        zzb2.zzb((zzgsb) zzb5.zzbr());
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgqk) zzb2.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzi(zzgfb.zzb().zzh()), zzgfb.zzf());
    }

    public static /* synthetic */ zzgni zzd(zzgfk zzgfk) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgql zza3 = zzgqn.zza();
        zzgqr zzb2 = zzgqt.zzb();
        zzgqu zzb3 = zzgqw.zzb();
        zzb3.zza(zzgfk.zzd());
        zzb2.zzb((zzgqw) zzb3.zzbr());
        zzb2.zza(zzgfk.zzb());
        zza3.zza((zzgqt) zzb2.zzbr());
        zzgsc zzc2 = zzgse.zzc();
        zzc2.zzb(zzh(zzgfk));
        zzc2.zza(zzgfk.zzc());
        zza3.zzb((zzgse) zzc2.zzbr());
        zza2.zzc(((zzgqn) zza3.zzbr()).zzaN());
        zza2.zza(zzi(zzgfk.zzh()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zzc);
        zzgmk.zzh(zzd);
        zzgmk.zzg(zze);
        zzgmk.zzf(zzf);
    }

    private static zzgfh zzf(zzgry zzgry) throws GeneralSecurityException {
        int ordinal = zzgry.ordinal();
        if (ordinal == 1) {
            return zzgfh.zza;
        }
        if (ordinal == 2) {
            return zzgfh.zzd;
        }
        if (ordinal == 3) {
            return zzgfh.zzc;
        }
        if (ordinal == 4) {
            return zzgfh.zze;
        }
        if (ordinal == 5) {
            return zzgfh.zzb;
        }
        int zza2 = zzgry.zza();
        throw new GeneralSecurityException("Unable to parse HashType: " + zza2);
    }

    private static zzgfi zzg(zzgtp zzgtp) throws GeneralSecurityException {
        int ordinal = zzgtp.ordinal();
        if (ordinal == 1) {
            return zzgfi.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgfi.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgtp.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzgfi.zzb;
    }

    private static zzgsh zzh(zzgfk zzgfk) throws GeneralSecurityException {
        zzgry zzgry;
        zzgsf zzc2 = zzgsh.zzc();
        zzc2.zzb(zzgfk.zze());
        zzgfh zzg = zzgfk.zzg();
        if (zzgfh.zza.equals(zzg)) {
            zzgry = zzgry.SHA1;
        } else if (zzgfh.zzb.equals(zzg)) {
            zzgry = zzgry.SHA224;
        } else if (zzgfh.zzc.equals(zzg)) {
            zzgry = zzgry.SHA256;
        } else if (zzgfh.zzd.equals(zzg)) {
            zzgry = zzgry.SHA384;
        } else if (zzgfh.zze.equals(zzg)) {
            zzgry = zzgry.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(zzg))));
        }
        zzc2.zza(zzgry);
        return (zzgsh) zzc2.zzbr();
    }

    private static zzgtp zzi(zzgfi zzgfi) throws GeneralSecurityException {
        if (zzgfi.zza.equals(zzgfi)) {
            return zzgtp.TINK;
        }
        if (zzgfi.zzb.equals(zzgfi)) {
            return zzgtp.CRUNCHY;
        }
        if (zzgfi.zzc.equals(zzgfi)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgfi))));
    }
}
