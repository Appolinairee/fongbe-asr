package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgni implements zzgnm {
    private final zzgvo zza;
    private final zzgsp zzb;

    private zzgni(zzgsp zzgsp, zzgvo zzgvo) {
        this.zzb = zzgsp;
        this.zza = zzgvo;
    }

    public static zzgni zza(zzgsp zzgsp) throws GeneralSecurityException {
        return new zzgni(zzgsp, zzgnu.zza(zzgsp.zzi()));
    }

    public static zzgni zzb(zzgsp zzgsp) {
        return new zzgni(zzgsp, zzgnu.zzb(zzgsp.zzi()));
    }

    public final zzgsp zzc() {
        return this.zzb;
    }

    public final zzgvo zzd() {
        return this.zza;
    }
}
