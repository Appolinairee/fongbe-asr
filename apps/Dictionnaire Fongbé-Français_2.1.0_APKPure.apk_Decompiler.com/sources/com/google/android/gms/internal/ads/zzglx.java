package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzglx {
    public static final zzglp zza = new zzglv((zzglw) null);

    public static zzglu zza(zzgnf zzgnf) {
        zzgdz zzgdz;
        zzglr zzglr = new zzglr();
        zzglr.zzb(zzgnf.zza());
        for (List it : zzgnf.zze()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzgnd zzgnd = (zzgnd) it2.next();
                    int zzf = zzgnd.zzf() - 2;
                    if (zzf == 1) {
                        zzgdz = zzgdz.zza;
                    } else if (zzf == 2) {
                        zzgdz = zzgdz.zzb;
                    } else if (zzf == 3) {
                        zzgdz = zzgdz.zzc;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    int zza2 = zzgnd.zza();
                    String zze = zzgnd.zze();
                    if (zze.startsWith("type.googleapis.com/google.crypto.")) {
                        zze = zze.substring(34);
                    }
                    zzglr.zza(zzgdz, zza2, zze, zzgnd.zzb().name());
                }
            }
        }
        if (zzgnf.zzc() != null) {
            zzglr.zzc(zzgnf.zzc().zza());
        }
        try {
            return zzglr.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
