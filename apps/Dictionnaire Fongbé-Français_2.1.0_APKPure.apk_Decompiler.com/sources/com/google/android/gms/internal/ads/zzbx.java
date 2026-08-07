package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbx {
    public final int zza;
    private final zzbr zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzbx(zzbr zzbr, boolean z, int[] iArr, boolean[] zArr) {
        int i = zzbr.zza;
        this.zza = i;
        boolean z2 = true;
        zzcw.zzd(i == iArr.length && i == zArr.length);
        this.zzb = zzbr;
        this.zzc = (!z || i <= 1) ? false : z2;
        this.zzd = (int[]) iArr.clone();
        this.zze = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbx zzbx = (zzbx) obj;
            return this.zzc == zzbx.zzc && this.zzb.equals(zzbx.zzb) && Arrays.equals(this.zzd, zzbx.zzd) && Arrays.equals(this.zze, zzbx.zze);
        }
    }

    public final int hashCode() {
        return (((((this.zzb.hashCode() * 31) + (this.zzc ? 1 : 0)) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final zzab zzb(int i) {
        return this.zzb.zzb(i);
    }

    public final boolean zzc() {
        for (boolean z : this.zze) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int i) {
        return this.zze[i];
    }
}
