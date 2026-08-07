package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzghc implements zzgmv {
    public final Object zza(zzgdx zzgdx) {
        zzghm zzghm = (zzghm) zzgdx;
        int i = zzghd.zza;
        String zzd = zzghm.zzb().zzd();
        zzgeu zzb = zzghm.zzb().zzb();
        zzgdn zzb2 = zzgei.zza(zzd).zzb();
        int i2 = zzgha.zza;
        try {
            return zzgkc.zzc(new zzgha(zzgsp.zzf(zzgeq.zzb(zzb), zzgxb.zza()), zzb2), zzghm.zzc());
        } catch (zzgyg e) {
            throw new GeneralSecurityException(e);
        }
    }
}
