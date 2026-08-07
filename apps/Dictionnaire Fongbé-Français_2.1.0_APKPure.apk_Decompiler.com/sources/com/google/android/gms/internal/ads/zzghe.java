package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzghe extends zzget {
    private final zzghg zza;
    private final zzgvo zzb;
    @Nullable
    private final Integer zzc;

    private zzghe(zzghg zzghg, zzgvo zzgvo, @Nullable Integer num) {
        this.zza = zzghg;
        this.zzb = zzgvo;
        this.zzc = num;
    }

    public static zzghe zza(zzghg zzghg, @Nullable Integer num) throws GeneralSecurityException {
        zzgvo zzgvo;
        if (zzghg.zzb() == zzghf.zza) {
            if (num != null) {
                zzgvo = zzgvo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (zzghg.zzb() != zzghf.zzb) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(zzghg.zzb().toString()));
        } else if (num == null) {
            zzgvo = zzgvo.zzb(new byte[0]);
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        return new zzghe(zzghg, zzgvo, num);
    }

    public final zzghg zzb() {
        return this.zza;
    }

    public final zzgvo zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
