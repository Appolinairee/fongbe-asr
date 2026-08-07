package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgpo {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc = zzgmt.zzb(new zzgpk(), zzgof.class, zzgni.class);
    private static final zzgmp zzd;
    private static final zzglh zze = zzglh.zzb(new zzgpm(), zzgnx.class, zzgnh.class);
    private static final zzgld zzf;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
        zzd = zzgmp.zzb(new zzgpl(), zzb2, zzgni.class);
        zzf = zzgld.zzb(new zzgpn(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzgnh zza(zzgnx zzgnx, zzgeo zzgeo) {
        zzgpz zzb2 = zzgqb.zzb();
        zzb2.zzb(zzg(zzgnx.zzb()));
        byte[] zzd2 = zzgnx.zzd().zzd(zzgeo);
        zzb2.zza(zzgwj.zzv(zzd2, 0, zzd2.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgqb) zzb2.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzh(zzgnx.zzb().zzf()), zzgnx.zze());
    }

    public static /* synthetic */ zzgni zzb(zzgof zzgof) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgqc zzb2 = zzgqe.zzb();
        zzb2.zzb(zzg(zzgof));
        zzb2.zza(zzgof.zzc());
        zza2.zzc(((zzgqe) zzb2.zzbr()).zzaN());
        zza2.zza(zzh(zzgof.zzf()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static /* synthetic */ zzgnx zzc(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgqb zzd2 = zzgqb.zzd(zzgnh.zze(), zzgxb.zza());
                if (zzd2.zza() == 0) {
                    zzgoc zze2 = zzgof.zze();
                    zze2.zza(zzd2.zzg().zzd());
                    zze2.zzb(zzd2.zzf().zza());
                    zze2.zzc(zzf(zzgnh.zzc()));
                    zzgof zzd3 = zze2.zzd();
                    zzgnv zza2 = zzgnx.zza();
                    zza2.zzc(zzd3);
                    zza2.zza(zzgvp.zzb(zzd2.zzg().zzA(), zzgeo));
                    zza2.zzb(zzgnh.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgof zzd(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgqe zzd2 = zzgqe.zzd(zzgni.zzc().zzh(), zzgxb.zza());
                zzgoc zze2 = zzgof.zze();
                zze2.zza(zzd2.zza());
                zze2.zzb(zzd2.zzf().zza());
                zze2.zzc(zzf(zzgni.zzc().zzg()));
                return zze2.zzd();
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zzc);
        zzgmk.zzh(zzd);
        zzgmk.zzg(zze);
        zzgmk.zzf(zzf);
    }

    private static zzgod zzf(zzgtp zzgtp) throws GeneralSecurityException {
        int ordinal = zzgtp.ordinal();
        if (ordinal == 1) {
            return zzgod.zza;
        }
        if (ordinal == 2) {
            return zzgod.zzc;
        }
        if (ordinal == 3) {
            return zzgod.zzd;
        }
        if (ordinal == 4) {
            return zzgod.zzb;
        }
        int zza2 = zzgtp.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    private static zzgqh zzg(zzgof zzgof) {
        zzgqf zzb2 = zzgqh.zzb();
        zzb2.zza(zzgof.zzb());
        return (zzgqh) zzb2.zzbr();
    }

    private static zzgtp zzh(zzgod zzgod) throws GeneralSecurityException {
        if (zzgod.zza.equals(zzgod)) {
            return zzgtp.TINK;
        }
        if (zzgod.zzb.equals(zzgod)) {
            return zzgtp.CRUNCHY;
        }
        if (zzgod.zzd.equals(zzgod)) {
            return zzgtp.RAW;
        }
        if (zzgod.zzc.equals(zzgod)) {
            return zzgtp.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgod))));
    }
}
