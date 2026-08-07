package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzkj {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ zzkj(zzkh zzkh, zzki zzki) {
        this.zza = zzkh.zza;
        this.zzb = zzkh.zzb;
        this.zzc = zzkh.zzc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkj)) {
            return false;
        }
        zzkj zzkj = (zzkj) obj;
        return this.zza == zzkj.zza && this.zzb == zzkj.zzb && this.zzc == zzkj.zzc;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc)});
    }

    public final zzkh zza() {
        return new zzkh(this, (zzki) null);
    }
}
