package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgji {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc = zzgmt.zzb(new zzgje(), zzggf.class, zzgni.class);
    private static final zzgmp zzd;
    private static final zzglh zze = zzglh.zzb(new zzgjg(), zzgfx.class, zzgnh.class);
    private static final zzgld zzf;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzb2;
        zzd = zzgmp.zzb(new zzgjf(), zzb2, zzgni.class);
        zzf = zzgld.zzb(new zzgjh(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzgfx zza(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgri zzd2 = zzgri.zzd(zzgnh.zze(), zzgxb.zza());
                if (zzd2.zza() == 0) {
                    zzggc zzc2 = zzggf.zzc();
                    zzc2.zzb(zzd2.zzf().zzd());
                    zzc2.zza(12);
                    zzc2.zzc(16);
                    zzc2.zzd(zzf(zzgnh.zzc()));
                    zzggf zze2 = zzc2.zze();
                    zzgfv zza2 = zzgfx.zza();
                    zza2.zzc(zze2);
                    zza2.zzb(zzgvp.zzb(zzd2.zzf().zzA(), zzgeo));
                    zza2.zza(zzgnh.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzggf zzb(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgrl zzf2 = zzgrl.zzf(zzgni.zzc().zzh(), zzgxb.zza());
                if (zzf2.zzb() == 0) {
                    zzggc zzc2 = zzggf.zzc();
                    zzc2.zzb(zzf2.zza());
                    zzc2.zza(12);
                    zzc2.zzc(16);
                    zzc2.zzd(zzf(zzgni.zzc().zzg()));
                    return zzc2.zze();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgnh zzc(zzgfx zzgfx, zzgeo zzgeo) {
        zzgrg zzb2 = zzgri.zzb();
        byte[] zzd2 = zzgfx.zzd().zzd(zzgeo);
        zzb2.zza(zzgwj.zzv(zzd2, 0, zzd2.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgri) zzb2.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzg(zzgfx.zzb().zzd()), zzgfx.zze());
    }

    public static /* synthetic */ zzgni zzd(zzggf zzggf) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgrj zzc2 = zzgrl.zzc();
        zzc2.zza(zzggf.zzb());
        zza2.zzc(((zzgrl) zzc2.zzbr()).zzaN());
        zza2.zza(zzg(zzggf.zzd()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zzc);
        zzgmk.zzh(zzd);
        zzgmk.zzg(zze);
        zzgmk.zzf(zzf);
    }

    private static zzggd zzf(zzgtp zzgtp) throws GeneralSecurityException {
        int ordinal = zzgtp.ordinal();
        if (ordinal == 1) {
            return zzggd.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzggd.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgtp.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzggd.zzb;
    }

    private static zzgtp zzg(zzggd zzggd) throws GeneralSecurityException {
        if (zzggd.zza.equals(zzggd)) {
            return zzgtp.TINK;
        }
        if (zzggd.zzb.equals(zzggd)) {
            return zzgtp.CRUNCHY;
        }
        if (zzggd.zzc.equals(zzggd)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzggd))));
    }
}
