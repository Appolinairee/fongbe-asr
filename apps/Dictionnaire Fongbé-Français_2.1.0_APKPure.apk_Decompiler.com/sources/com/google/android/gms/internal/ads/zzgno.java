package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzgno {
    private final Class zza;
    private final zzgvo zzb;

    /* synthetic */ zzgno(Class cls, zzgvo zzgvo, zzgnq zzgnq) {
        this.zza = cls;
        this.zzb = zzgvo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgno)) {
            return false;
        }
        zzgno zzgno = (zzgno) obj;
        if (!zzgno.zza.equals(this.zza) || !zzgno.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        zzgvo zzgvo = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String valueOf = String.valueOf(zzgvo);
        return simpleName + ", object identifier: " + valueOf;
    }
}
