package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzbq {
    public static final zzbq zza = new zzbn();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    protected zzbq() {
    }

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbq)) {
            return false;
        }
        zzbq zzbq = (zzbq) obj;
        if (zzbq.zzc() == zzc() && zzbq.zzb() == zzb()) {
            zzbp zzbp = new zzbp();
            zzbo zzbo = new zzbo();
            zzbp zzbp2 = new zzbp();
            zzbo zzbo2 = new zzbo();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzbp, 0).equals(zzbq.zze(i, zzbp2, 0))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzb(); i2++) {
                if (!zzd(i2, zzbo, true).equals(zzbq.zzd(i2, zzbo2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzbq.zzg(true) && (zzh = zzh(true)) == zzbq.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzbq.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzbp zzbp = new zzbp();
        zzbo zzbo = new zzbo();
        int zzc = zzc() + 217;
        int i2 = 0;
        while (true) {
            i = zzc * 31;
            if (i2 >= zzc()) {
                break;
            }
            zzc = i + zze(i2, zzbp, 0).hashCode();
            i2++;
        }
        int zzb = i + zzb();
        for (int i3 = 0; i3 < zzb(); i3++) {
            zzb = (zzb * 31) + zzd(i3, zzbo, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb = (zzb * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzbo zzd(int i, zzbo zzbo, boolean z);

    public abstract zzbp zze(int i, zzbp zzbp, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzbo zzbo, zzbp zzbp, int i2, boolean z) {
        int i3 = zzd(i, zzbo, false).zzc;
        if (zze(i3, zzbp, 0).zzo != i) {
            return i + 1;
        }
        int zzj = zzj(i3, i2, z);
        if (zzj == -1) {
            return -1;
        }
        return zze(zzj, zzbp, 0).zzn;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == zzh(z) ? zzg(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == zzh(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzbp zzbp, zzbo zzbo, int i, long j) {
        Pair zzm = zzm(zzbp, zzbo, i, j, 0);
        zzm.getClass();
        Pair pair = zzm;
        return zzm;
    }

    public final Pair zzm(zzbp zzbp, zzbo zzbo, int i, long j, long j2) {
        zzcw.zza(i, 0, zzc());
        zze(i, zzbp, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzbp.zzl;
            j = 0;
        }
        int i2 = zzbp.zzn;
        zzd(i2, zzbo, false);
        while (i2 < zzbp.zzo) {
            long j4 = zzbo.zze;
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = zzd(i4, zzbo, false).zze;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        zzd(i2, zzbo, true);
        long j6 = zzbo.zze;
        long j7 = zzbo.zzd;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0, j);
        Object obj = zzbo.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzbo zzn(Object obj, zzbo zzbo) {
        return zzd(zza(obj), zzbo, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
