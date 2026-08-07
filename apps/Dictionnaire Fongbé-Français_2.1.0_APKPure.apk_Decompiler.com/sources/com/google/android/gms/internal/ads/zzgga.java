package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzgga implements zzglz {
    public final zzgdx zza(zzgek zzgek, Integer num) {
        zzggf zzggf = (zzggf) zzgek;
        int i = zzggb.zza;
        if (zzggf.zzb() != 24) {
            zzgfv zzgfv = new zzgfv((zzgfw) null);
            zzgfv.zzc(zzggf);
            zzgfv.zza(num);
            zzgfv.zzb(zzgvp.zzc(zzggf.zzb()));
            return zzgfv.zzd();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }
}
