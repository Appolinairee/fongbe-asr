package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgpw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgkx zzc;
    private static final zzgkx zzd;
    private static final zzgmt zze = zzgmt.zzb(new zzgps(), zzgow.class, zzgni.class);
    private static final zzgmp zzf;
    private static final zzglh zzg = zzglh.zzb(new zzgpu(), zzgom.class, zzgnh.class);
    private static final zzgld zzh;

    static {
        zzgvo zzb2 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzgkv zza2 = zzgkx.zza();
        zza2.zza(zzgtp.RAW, zzgou.zzd);
        zza2.zza(zzgtp.TINK, zzgou.zza);
        zza2.zza(zzgtp.LEGACY, zzgou.zzc);
        zza2.zza(zzgtp.CRUNCHY, zzgou.zzb);
        zzc = zza2.zzb();
        zzgkv zza3 = zzgkx.zza();
        zza3.zza(zzgry.SHA1, zzgot.zza);
        zza3.zza(zzgry.SHA224, zzgot.zzb);
        zza3.zza(zzgry.SHA256, zzgot.zzc);
        zza3.zza(zzgry.SHA384, zzgot.zzd);
        zza3.zza(zzgry.SHA512, zzgot.zze);
        zzd = zza3.zzb();
        zzf = zzgmp.zzb(new zzgpt(), zzb2, zzgni.class);
        zzh = zzgld.zzb(new zzgpv(), zzb2, zzgnh.class);
    }

    public static /* synthetic */ zzgnh zza(zzgom zzgom, zzgeo zzgeo) {
        zzgrz zzb2 = zzgsb.zzb();
        zzb2.zzb(zzf(zzgom.zzb()));
        byte[] zzd2 = zzgom.zzd().zzd(zzgeo);
        zzb2.zza(zzgwj.zzv(zzd2, 0, zzd2.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgsb) zzb2.zzbr()).zzaN(), zzgsj.SYMMETRIC, (zzgtp) zzc.zzb(zzgom.zzb().zzg()), zzgom.zze());
    }

    public static /* synthetic */ zzgni zzb(zzgow zzgow) {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgsc zzc2 = zzgse.zzc();
        zzc2.zzb(zzf(zzgow));
        zzc2.zza(zzgow.zzc());
        zza2.zzc(((zzgse) zzc2.zzbr()).zzaN());
        zza2.zza((zzgtp) zzc.zzb(zzgow.zzg()));
        return zzgni.zzb((zzgsp) zza2.zzbr());
    }

    public static /* synthetic */ zzgom zzc(zzgnh zzgnh, zzgeo zzgeo) {
        if (zzgnh.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgsb zzf2 = zzgsb.zzf(zzgnh.zze(), zzgxb.zza());
                if (zzf2.zza() == 0) {
                    zzgos zze2 = zzgow.zze();
                    zze2.zzb(zzf2.zzh().zzd());
                    zze2.zzc(zzf2.zzg().zza());
                    zze2.zza((zzgot) zzd.zzc(zzf2.zzg().zzb()));
                    zze2.zzd((zzgou) zzc.zzc(zzgnh.zzc()));
                    zzgow zze3 = zze2.zze();
                    zzgok zza2 = zzgom.zza();
                    zza2.zzc(zze3);
                    zza2.zzb(zzgvp.zzb(zzf2.zzh().zzA(), zzgeo));
                    zza2.zza(zzgnh.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyg | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzgow zzd(zzgni zzgni) {
        if (zzgni.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgse zzg2 = zzgse.zzg(zzgni.zzc().zzh(), zzgxb.zza());
                if (zzg2.zzb() == 0) {
                    zzgos zze2 = zzgow.zze();
                    zze2.zzb(zzg2.zza());
                    zze2.zzc(zzg2.zzh().zza());
                    zze2.zza((zzgot) zzd.zzc(zzg2.zzh().zzb()));
                    zze2.zzd((zzgou) zzc.zzc(zzgni.zzc().zzg()));
                    return zze2.zze();
                }
                int zzb2 = zzg2.zzb();
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzb2);
            } catch (zzgyg e) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgni.zzc().zzi())));
        }
    }

    public static void zze(zzgmk zzgmk) throws GeneralSecurityException {
        zzgmk.zzi(zze);
        zzgmk.zzh(zzf);
        zzgmk.zzg(zzg);
        zzgmk.zzf(zzh);
    }

    private static zzgsh zzf(zzgow zzgow) throws GeneralSecurityException {
        zzgsf zzc2 = zzgsh.zzc();
        zzc2.zzb(zzgow.zzb());
        zzc2.zza((zzgry) zzd.zzb(zzgow.zzf()));
        return (zzgsh) zzc2.zzbr();
    }
}
