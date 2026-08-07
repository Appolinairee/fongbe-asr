package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzlp {
    public static final zzlp zza;
    public static final zzlp zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzlp zzlp = new zzlp(0, 0);
        zza = zzlp;
        new zzlp(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzlp(Long.MAX_VALUE, 0);
        new zzlp(0, Long.MAX_VALUE);
        zzb = zzlp;
    }

    public zzlp(long j, long j2) {
        boolean z = true;
        zzcw.zzd(j >= 0);
        zzcw.zzd(j2 < 0 ? false : z);
        this.zzc = j;
        this.zzd = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzlp zzlp = (zzlp) obj;
            return this.zzc == zzlp.zzc && this.zzd == zzlp.zzd;
        }
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}
