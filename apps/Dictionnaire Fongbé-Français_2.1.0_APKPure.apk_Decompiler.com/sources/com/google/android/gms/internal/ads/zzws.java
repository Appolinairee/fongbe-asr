package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzws implements zzxv {
    protected final zzbr zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzab[] zzd;
    private int zze;

    public zzws(zzbr zzbr, int[] iArr, int i) {
        int length = iArr.length;
        zzcw.zzf(length > 0);
        zzbr.getClass();
        zzbr zzbr2 = zzbr;
        this.zza = zzbr;
        this.zzb = length;
        this.zzd = new zzab[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzbr.zzb(iArr[i2]);
        }
        Arrays.sort(this.zzd, new zzwr());
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzbr.zza(this.zzd[i3]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzws zzws = (zzws) obj;
            return this.zza.equals(zzws.zza) && Arrays.equals(this.zzc, zzws.zzc);
        }
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.zza) * 31) + Arrays.hashCode(this.zzc);
        this.zze = identityHashCode;
        return identityHashCode;
    }

    public final int zza(int i) {
        return this.zzc[i];
    }

    public final int zzb() {
        return this.zzc[0];
    }

    public final int zzc(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int zzd() {
        return this.zzc.length;
    }

    public final zzab zze(int i) {
        return this.zzd[i];
    }

    public final zzab zzf() {
        return this.zzd[0];
    }

    public final zzbr zzg() {
        return this.zza;
    }
}
