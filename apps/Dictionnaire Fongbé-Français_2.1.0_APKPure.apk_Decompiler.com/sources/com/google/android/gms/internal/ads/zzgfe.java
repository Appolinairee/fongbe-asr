package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzgfe implements zzglz {
    public final zzgdx zza(zzgek zzgek, Integer num) {
        zzgfk zzgfk = (zzgfk) zzgek;
        int i = zzgff.zza;
        if (zzgfk.zzb() == 16 || zzgfk.zzb() == 32) {
            zzgez zzgez = new zzgez((zzgfa) null);
            zzgez.zzd(zzgfk);
            zzgez.zzc(num);
            zzgez.zza(zzgvp.zzc(zzgfk.zzb()));
            zzgez.zzb(zzgvp.zzc(zzgfk.zzc()));
            return zzgez.zze();
        }
        throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
    }
}
