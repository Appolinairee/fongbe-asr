package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgju {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc = zzgmt.zzb(new zzgjq(), zzggw.class, zzgni.class);
    private static final zzgmp zzd;
    private static final zzglh zze = zzglh.zzb(new zzgjs(), zzggr.class, zzgnh.class);
    private static final zzgld zzf;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzb2;
        zzd = zzgmp.zzb(new zzgjr(), zzb2, zzgni.class);
        zzf = zzgld.zzb(new zzgjt(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzggr zza(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgru zzd2 = zzgru.zzd(zzgnh.zze(), zzgxb.zza());
                if (zzd2.zza() == 0) {
                    return zzggr.zza(zzf(zzgnh.zzc()), zzgvp.zzb(zzd2.zzf().zzA(), zzgeo), zzgnh.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzggw zzb(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgrx.zzc(zzgni.zzc().zzh(), zzgxb.zza());
                return zzggw.zzc(zzf(zzgni.zzc().zzg()));
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static /* synthetic */ zzgnh zzc(zzggr zzggr, zzgeo zzgeo) {
        zzgrs zzb2 = zzgru.zzb();
        byte[] zzd2 = zzggr.zzd().zzd(zzgeo);
        zzb2.zza(zzgwj.zzv(zzd2, 0, zzd2.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzgru) zzb2.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzg(zzggr.zzb().zzb()), zzggr.zze());
    }

    public static /* synthetic */ zzgni zzd(zzggw zzggw) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza2.zzc(zzgrx.zzb().zzaN());
        zza2.zza(zzg(zzggw.zzb()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zzc);
        zzgmk.zzh(zzd);
        zzgmk.zzg(zze);
        zzgmk.zzf(zzf);
    }

    private static zzggv zzf(zzgtp zzgtp) throws GeneralSecurityException {
        int ordinal = zzgtp.ordinal();
        if (ordinal == 1) {
            return zzggv.zza;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return zzggv.zzc;
            }
            if (ordinal != 4) {
                int zza2 = zzgtp.zza();
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
            }
        }
        return zzggv.zzb;
    }

    private static zzgtp zzg(zzggv zzggv) throws GeneralSecurityException {
        if (zzggv.zza.equals(zzggv)) {
            return zzgtp.TINK;
        }
        if (zzggv.zzb.equals(zzggv)) {
            return zzgtp.CRUNCHY;
        }
        if (zzggv.zzc.equals(zzggv)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzggv.toString()));
    }
}
