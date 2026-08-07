package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzglk extends zzgdx {
    private final zzgnh zza;

    public zzglk(zzgnh zzgnh, @Nullable zzgeo zzgeo) throws GeneralSecurityException {
        zzc(zzgnh, zzgeo);
        this.zza = zzgnh;
    }

    private static void zzc(zzgnh zzgnh, @Nullable zzgeo zzgeo) throws GeneralSecurityException {
        int i = zzglj.zzb[zzgnh.zzb().ordinal()];
    }

    public final zzgnh zza(@Nullable zzgeo zzgeo) throws GeneralSecurityException {
        zzc(this.zza, zzgeo);
        return this.zza;
    }

    @Nullable
    public final Integer zzb() {
        return this.zza.zzf();
    }
}
