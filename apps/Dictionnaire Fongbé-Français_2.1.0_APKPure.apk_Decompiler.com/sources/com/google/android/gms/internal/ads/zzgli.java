package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgli implements zzgdy {
    final String zza;
    final Class zzb;
    final zzgsj zzc;

    zzgli(String str, Class cls, zzgsj zzgsj, zzgzk zzgzk) {
        this.zza = str;
        this.zzb = cls;
        this.zzc = zzgsj;
    }

    public static zzgdy zzd(String str, Class cls, zzgsj zzgsj, zzgzk zzgzk) {
        return new zzgli(str, cls, zzgsj, zzgzk);
    }

    public final zzgsl zza(zzgwj zzgwj) throws GeneralSecurityException {
        zzgsn zza2 = zzgsp.zza();
        zza2.zzb(this.zza);
        zza2.zzc(zzgwj);
        zza2.zza(zzgtp.RAW);
        zzgnh zzgnh = (zzgnh) zzgmk.zzc().zzd(zzgma.zzb().zza(zzgmk.zzc().zzb(zzgni.zza((zzgsp) zza2.zzbr())), (Integer) null), zzgnh.class, zzgdw.zza());
        zzgsi zza3 = zzgsl.zza();
        zza3.zzb(zzgnh.zzg());
        zza3.zzc(zzgnh.zze());
        zza3.zza(zzgnh.zzb());
        return (zzgsl) zza3.zzbr();
    }

    public final Class zzb() {
        return this.zzb;
    }

    public final Object zzc(zzgwj zzgwj) throws GeneralSecurityException {
        return zzgmh.zza().zzc(zzgmk.zzc().zza(zzgnh.zza(this.zza, zzgwj, this.zzc, zzgtp.RAW, (Integer) null), zzgdw.zza()), this.zzb);
    }
}
