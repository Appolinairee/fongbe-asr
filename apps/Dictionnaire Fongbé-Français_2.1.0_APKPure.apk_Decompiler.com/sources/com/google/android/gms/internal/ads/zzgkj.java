package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgkj {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc = zzgmt.zzb(new zzgkf(), zzgik.class, zzgni.class);
    private static final zzgmp zzd;
    private static final zzglh zze = zzglh.zzb(new zzgkh(), zzgif.class, zzgnh.class);
    private static final zzgld zzf;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzb2;
        zzd = zzgmp.zzb(new zzgkg(), zzb2, zzgni.class);
        zzf = zzgld.zzb(new zzgki(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzgif zza(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzgtv zzd2 = zzgtv.zzd(zzgnh.zze(), zzgxb.zza());
                if (zzd2.zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } else if (zzd2.zzg().zzd() == 32) {
                    return zzgif.zza(zzgik.zzd(zzf(zzgnh.zzc()), zzd2.zzf().zza()), zzgvp.zzb(zzd2.zzg().zzA(), zzgeo), zzgnh.zzf());
                } else {
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                }
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing XAesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgik zzb(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzgty zzd2 = zzgty.zzd(zzgni.zzc().zzh(), zzgxb.zza());
                if (zzd2.zza() == 0) {
                    return zzgik.zzd(zzf(zzgni.zzc().zzg()), zzd2.zzf().zza());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgnh zzc(zzgif zzgif, zzgeo zzgeo) {
        zzgtt zzb2 = zzgtv.zzb();
        byte[] zzd2 = zzgif.zzd().zzd(zzgeo);
        zzb2.zza(zzgwj.zzv(zzd2, 0, zzd2.length));
        zzgtz zzb3 = zzgub.zzb();
        zzb3.zza(zzgif.zzb().zzb());
        zzb2.zzb((zzgub) zzb3.zzbr());
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzgtv) zzb2.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzg(zzgif.zzb().zzc()), zzgif.zze());
    }

    public static /* synthetic */ zzgni zzd(zzgik zzgik) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzgtw zzb2 = zzgty.zzb();
        zzgtz zzb3 = zzgub.zzb();
        zzb3.zza(zzgik.zzb());
        zzb2.zza((zzgub) zzb3.zzbr());
        zza2.zzc(((zzgty) zzb2.zzbr()).zzaN());
        zza2.zza(zzg(zzgik.zzc()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zzc);
        zzgmk.zzh(zzd);
        zzgmk.zzg(zze);
        zzgmk.zzf(zzf);
    }

    private static zzgij zzf(zzgtp zzgtp) throws GeneralSecurityException {
        int ordinal = zzgtp.ordinal();
        if (ordinal == 1) {
            return zzgij.zza;
        }
        if (ordinal == 3) {
            return zzgij.zzb;
        }
        int zza2 = zzgtp.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    private static zzgtp zzg(zzgij zzgij) throws GeneralSecurityException {
        if (Objects.equals(zzgij, zzgij.zza)) {
            return zzgtp.TINK;
        }
        if (Objects.equals(zzgij, zzgij.zzb)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgij.toString()));
    }
}
