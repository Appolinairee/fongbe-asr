package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzgld {
    private final zzgvo zza;
    private final Class zzb;

    /* synthetic */ zzgld(zzgvo zzgvo, Class cls, zzglc zzglc) {
        this.zza = zzgvo;
        this.zzb = cls;
    }

    public static zzgld zzb(zzglb zzglb, zzgvo zzgvo, Class cls) {
        return new zzgla(zzgvo, cls, zzglb);
    }

    public abstract zzgdx zza(zzgnm zzgnm, @Nullable zzgeo zzgeo) throws GeneralSecurityException;

    public final zzgvo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
