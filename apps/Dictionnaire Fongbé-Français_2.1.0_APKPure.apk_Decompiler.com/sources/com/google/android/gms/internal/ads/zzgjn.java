package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgjn {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc = zzgmt.zzb(new zzgjj(), zzggq.class, zzgni.class);
    private static final zzgmp zzd;
    private static final zzglh zze = zzglh.zzb(new zzgjl(), zzggi.class, zzgnh.class);
    private static final zzgld zzf;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzb2;
        zzd = zzgmp.zzb(new zzgjk(), zzb2, zzgni.class);
        zzf = zzgld.zzb(new zzgjm(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzggi zza(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgro zzd2 = zzgro.zzd(zzgnh.zze(), zzgxb.zza());
                if (zzd2.zza() == 0) {
                    zzggn zzc2 = zzggq.zzc();
                    zzc2.zza(zzd2.zzf().zzd());
                    zzc2.zzb(zzf(zzgnh.zzc()));
                    zzggq zzc3 = zzc2.zzc();
                    zzggg zza2 = zzggi.zza();
                    zza2.zzc(zzc3);
                    zza2.zzb(zzgvp.zzb(zzd2.zzf().zzA(), zzgeo));
                    zza2.zza(zzgnh.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzggq zzb(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgrr zzf2 = zzgrr.zzf(zzgni.zzc().zzh(), zzgxb.zza());
                if (zzf2.zzb() == 0) {
                    zzggn zzc2 = zzggq.zzc();
                    zzc2.zza(zzf2.zza());
                    zzc2.zzb(zzf(zzgni.zzc().zzg()));
                    return zzc2.zzc();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgnh zzc(zzggi zzggi, zzgeo zzgeo) {
        zzgrm zzb2 = zzgro.zzb();
        byte[] zzd2 = zzggi.zzd().zzd(zzgeo);
        zzb2.zza(zzgwj.zzv(zzd2, 0, zzd2.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgro) zzb2.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzg(zzggi.zzb().zzd()), zzggi.zze());
    }

    public static /* synthetic */ zzgni zzd(zzggq zzggq) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgrp zzc2 = zzgrr.zzc();
        zzc2.zza(zzggq.zzb());
        zza2.zzc(((zzgrr) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzggq.zzd()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zzc);
        zzgmk.zzh(zzd);
        zzgmk.zzg(zze);
        zzgmk.zzf(zzf);
    }

    private static zzggo zzf(zzgtp zzgtp) throws GeneralSecurityException {
        int ordinal = zzgtp.ordinal();
        if (ordinal == 1) {
            return zzggo.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzggo.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgtp.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzggo.zzb;
    }

    private static zzgtp zzg(zzggo zzggo) throws GeneralSecurityException {
        if (zzggo.zza.equals(zzggo)) {
            return zzgtp.TINK;
        }
        if (zzggo.zzb.equals(zzggo)) {
            return zzgtp.CRUNCHY;
        }
        if (zzggo.zzc.equals(zzggo)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzggo))));
    }
}
