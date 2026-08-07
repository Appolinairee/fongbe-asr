package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzgly implements zzglz {
    public final zzgdx zza(zzgek zzgek, Integer num) {
        int i = zzgma.zza;
        zzgsp zzc = ((zzgll) zzgek).zzb().zzc();
        zzgdy zzb = zzgkz.zzc().zzb(zzc.zzi());
        if (zzgkz.zzc().zze(zzc.zzi())) {
            zzgsl zza = zzb.zza(zzc.zzh());
            return new zzglk(zzgnh.zza(zza.zzg(), zza.zzf(), zza.zzb(), zzc.zzg(), num), zzgdw.zza());
        }
        throw new GeneralSecurityException("Creating new keys is not allowed.");
    }
}
