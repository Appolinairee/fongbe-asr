package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzgfp implements zzglz {
    public final zzgdx zza(zzgek zzgek, Integer num) {
        zzgfu zzgfu = (zzgfu) zzgek;
        int i = zzgfq.zza;
        if (zzgfu.zzc() != 24) {
            zzgfl zzgfl = new zzgfl((zzgfm) null);
            zzgfl.zzc(zzgfu);
            zzgfl.zza(num);
            zzgfl.zzb(zzgvp.zzc(zzgfu.zzc()));
            return zzgfl.zzd();
        }
        throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
    }
}
