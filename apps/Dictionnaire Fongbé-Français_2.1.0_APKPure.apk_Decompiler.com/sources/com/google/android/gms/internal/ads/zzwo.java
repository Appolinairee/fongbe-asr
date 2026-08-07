package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzwo {
    public final long zza;
    public final long zzb;

    public zzwo(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwo)) {
            return false;
        }
        zzwo zzwo = (zzwo) obj;
        return this.zza == zzwo.zza && this.zzb == zzwo.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
