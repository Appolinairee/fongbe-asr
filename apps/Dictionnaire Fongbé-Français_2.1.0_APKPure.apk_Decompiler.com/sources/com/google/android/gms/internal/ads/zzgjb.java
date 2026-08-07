package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgjb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc = zzgmt.zzb(new zzgix(), zzgfu.class, zzgni.class);
    private static final zzgmp zzd;
    private static final zzglh zze = zzglh.zzb(new zzgiz(), zzgfn.class, zzgnh.class);
    private static final zzgld zzf;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzb2;
        zzd = zzgmp.zzb(new zzgiy(), zzb2, zzgni.class);
        zzf = zzgld.zzb(new zzgja(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzgfn zza(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgqz zzd2 = zzgqz.zzd(zzgnh.zze(), zzgxb.zza());
                if (zzd2.zza() == 0) {
                    zzgfr zzd3 = zzgfu.zzd();
                    zzd3.zzb(zzd2.zzg().zzd());
                    zzd3.zza(zzd2.zzf().zza());
                    zzd3.zzc(16);
                    zzd3.zzd(zzf(zzgnh.zzc()));
                    zzgfu zze2 = zzd3.zze();
                    zzgfl zza2 = zzgfn.zza();
                    zza2.zzc(zze2);
                    zza2.zzb(zzgvp.zzb(zzd2.zzg().zzA(), zzgeo));
                    zza2.zza(zzgnh.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgfu zzb(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgrc zzd2 = zzgrc.zzd(zzgni.zzc().zzh(), zzgxb.zza());
                zzgfr zzd3 = zzgfu.zzd();
                zzd3.zzb(zzd2.zza());
                zzd3.zza(zzd2.zzf().zza());
                zzd3.zzc(16);
                zzd3.zzd(zzf(zzgni.zzc().zzg()));
                return zzd3.zze();
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgnh zzc(zzgfn zzgfn, zzgeo zzgeo) {
        zzgqx zzb2 = zzgqz.zzb();
        zzb2.zzb(zzg(zzgfn.zzb()));
        byte[] zzd2 = zzgfn.zzd().zzd(zzgeo);
        zzb2.zza(zzgwj.zzv(zzd2, 0, zzd2.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgqz) zzb2.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzh(zzgfn.zzb().zze()), zzgfn.zze());
    }

    public static /* synthetic */ zzgni zzd(zzgfu zzgfu) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgra zzb2 = zzgrc.zzb();
        zzb2.zzb(zzg(zzgfu));
        zzb2.zza(zzgfu.zzc());
        zza2.zzc(((zzgrc) zzb2.zzbr()).zzaN());
        zza2.zza(zzh(zzgfu.zze()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zzc);
        zzgmk.zzh(zzd);
        zzgmk.zzg(zze);
        zzgmk.zzf(zzf);
    }

    private static zzgfs zzf(zzgtp zzgtp) throws GeneralSecurityException {
        int ordinal = zzgtp.ordinal();
        if (ordinal == 1) {
            return zzgfs.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgfs.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgtp.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzgfs.zzb;
    }

    private static zzgrf zzg(zzgfu zzgfu) throws GeneralSecurityException {
        zzgrd zzb2 = zzgrf.zzb();
        zzb2.zza(zzgfu.zzb());
        return (zzgrf) zzb2.zzbr();
    }

    private static zzgtp zzh(zzgfs zzgfs) throws GeneralSecurityException {
        if (zzgfs.zza.equals(zzgfs)) {
            return zzgtp.TINK;
        }
        if (zzgfs.zzb.equals(zzgfs)) {
            return zzgtp.CRUNCHY;
        }
        if (zzgfs.zzc.equals(zzgfs)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgfs))));
    }
}
