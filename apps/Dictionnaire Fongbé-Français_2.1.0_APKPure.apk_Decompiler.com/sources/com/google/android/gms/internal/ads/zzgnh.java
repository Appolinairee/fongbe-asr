package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgnh implements zzgnm {
    private final String zza;
    private final zzgvo zzb;
    private final zzgwj zzc;
    private final zzgsj zzd;
    private final zzgtp zze;
    @Nullable
    private final Integer zzf;

    private zzgnh(String str, zzgvo zzgvo, zzgwj zzgwj, zzgsj zzgsj, zzgtp zzgtp, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzgvo;
        this.zzc = zzgwj;
        this.zzd = zzgsj;
        this.zze = zzgtp;
        this.zzf = num;
    }

    public static zzgnh zza(String str, zzgwj zzgwj, zzgsj zzgsj, zzgtp zzgtp, @Nullable Integer num) throws GeneralSecurityException {
        if (zzgtp == zzgtp.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgnh(str, zzgnu.zza(str), zzgwj, zzgsj, zzgtp, num);
    }

    public final zzgsj zzb() {
        return this.zzd;
    }

    public final zzgtp zzc() {
        return this.zze;
    }

    public final zzgvo zzd() {
        return this.zzb;
    }

    public final zzgwj zze() {
        return this.zzc;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
