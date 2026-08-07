package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzazs {
    final long zza;
    final String zzb;
    final int zzc;

    zzazs(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzazs)) {
            zzazs zzazs = (zzazs) obj;
            return zzazs.zza == this.zza && zzazs.zzc == this.zzc;
        }
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
