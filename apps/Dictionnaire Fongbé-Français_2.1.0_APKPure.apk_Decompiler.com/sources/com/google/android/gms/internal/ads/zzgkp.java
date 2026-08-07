package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgkp {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc = zzgmt.zzb(new zzgkl(), zzgir.class, zzgni.class);
    private static final zzgmp zzd;
    private static final zzglh zze = zzglh.zzb(new zzgkn(), zzgil.class, zzgnh.class);
    private static final zzgld zzf;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzb2;
        zzd = zzgmp.zzb(new zzgkm(), zzb2, zzgni.class);
        zzf = zzgld.zzb(new zzgko(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzgil zza(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzgue zzd2 = zzgue.zzd(zzgnh.zze(), zzgxb.zza());
                if (zzd2.zza() == 0) {
                    return zzgil.zza(zzf(zzgnh.zzc()), zzgvp.zzb(zzd2.zzf().zzA(), zzgeo), zzgnh.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgir zzb(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzguh.zzd(zzgni.zzc().zzh(), zzgxb.zza()).zza() == 0) {
                    return zzgir.zzc(zzf(zzgni.zzc().zzg()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgnh zzc(zzgil zzgil, zzgeo zzgeo) {
        zzguc zzb2 = zzgue.zzb();
        byte[] zzd2 = zzgil.zzd().zzd(zzgeo);
        zzb2.zza(zzgwj.zzv(zzd2, 0, zzd2.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzgue) zzb2.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzg(zzgil.zzb().zzb()), zzgil.zze());
    }

    public static /* synthetic */ zzgni zzd(zzgir zzgir) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza2.zzc(zzguh.zzc().zzaN());
        zza2.zza(zzg(zzgir.zzb()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zzc);
        zzgmk.zzh(zzd);
        zzgmk.zzg(zze);
        zzgmk.zzf(zzf);
    }

    private static zzgiq zzf(zzgtp zzgtp) throws GeneralSecurityException {
        int ordinal = zzgtp.ordinal();
        if (ordinal == 1) {
            return zzgiq.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzgiq.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgtp.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzgiq.zzb;
    }

    private static zzgtp zzg(zzgiq zzgiq) throws GeneralSecurityException {
        if (zzgiq.zza.equals(zzgiq)) {
            return zzgtp.TINK;
        }
        if (zzgiq.zzb.equals(zzgiq)) {
            return zzgtp.CRUNCHY;
        }
        if (zzgiq.zzc.equals(zzgiq)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgiq.toString()));
    }
}
