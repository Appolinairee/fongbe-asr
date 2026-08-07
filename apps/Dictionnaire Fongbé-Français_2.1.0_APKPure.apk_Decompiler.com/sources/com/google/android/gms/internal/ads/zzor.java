package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzor {
    public static final zzor zza = new zzop().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzor(zzop zzop, zzoq zzoq) {
        this.zzb = zzop.zza;
        this.zzc = zzop.zzb;
        this.zzd = zzop.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzor zzor = (zzor) obj;
            return this.zzb == zzor.zzb && this.zzc == zzor.zzc && this.zzd == zzor.zzd;
        }
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return ((z ? 1 : 0) << true) + (z2 ? 1 : 0) + z2 + (this.zzd ? 1 : 0);
    }
}
