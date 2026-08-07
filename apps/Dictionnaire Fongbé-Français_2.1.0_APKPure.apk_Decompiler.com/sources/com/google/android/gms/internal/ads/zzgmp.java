package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzgmp {
    private final zzgvo zza;
    private final Class zzb;

    /* synthetic */ zzgmp(zzgvo zzgvo, Class cls, zzgmo zzgmo) {
        this.zza = zzgvo;
        this.zzb = cls;
    }

    public static zzgmp zzb(zzgmn zzgmn, zzgvo zzgvo, Class cls) {
        return new zzgmm(zzgvo, cls, zzgmn);
    }

    public abstract zzgek zza(zzgnm zzgnm) throws GeneralSecurityException;

    public final zzgvo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
