package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzahv implements zzahu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahv(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
    }

    public static zzahv zzb(long j, long j2, zzadf zzadf, zzdy zzdy) {
        int i;
        long j3 = j;
        zzadf zzadf2 = zzadf;
        zzdy zzdy2 = zzdy;
        zzdy2.zzM(10);
        int zzg = zzdy.zzg();
        if (zzg <= 0) {
            return null;
        }
        int i2 = zzadf2.zzd;
        long zzu = zzei.zzu((long) zzg, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, (long) i2, RoundingMode.DOWN);
        int zzq = zzdy.zzq();
        int zzq2 = zzdy.zzq();
        int zzq3 = zzdy.zzq();
        zzdy2.zzM(2);
        long j4 = j2 + ((long) zzadf2.zzc);
        long[] jArr = new long[zzq];
        long[] jArr2 = new long[zzq];
        long j5 = j2;
        int i3 = 0;
        while (i3 < zzq) {
            long j6 = zzu;
            jArr[i3] = (((long) i3) * zzu) / ((long) zzq);
            jArr2[i3] = Math.max(j5, j4);
            if (zzq3 == 1) {
                i = zzdy.zzm();
            } else if (zzq3 == 2) {
                i = zzdy.zzq();
            } else if (zzq3 == 3) {
                i = zzdy.zzo();
            } else if (zzq3 != 4) {
                return null;
            } else {
                i = zzdy.zzp();
            }
            j5 += ((long) i) * ((long) zzq2);
            i3++;
            zzadf zzadf3 = zzadf;
            zzdy zzdy3 = zzdy;
            zzu = j6;
        }
        long j7 = zzu;
        if (!(j3 == -1 || j3 == j5)) {
            zzdo.zzf("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new zzahv(jArr, jArr2, j7, j5, zzadf.zzf);
    }

    public final long zza() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zze;
    }

    public final long zzd() {
        return this.zzd;
    }

    public final long zze(long j) {
        return this.zza[zzei.zzd(this.zzb, j, true, true)];
    }

    public final zzadk zzg(long j) {
        long[] jArr = this.zza;
        int zzd2 = zzei.zzd(jArr, j, true, true);
        zzadn zzadn = new zzadn(jArr[zzd2], this.zzb[zzd2]);
        if (zzadn.zzb < j) {
            long[] jArr2 = this.zza;
            if (zzd2 != jArr2.length - 1) {
                int i = zzd2 + 1;
                return new zzadk(zzadn, new zzadn(jArr2[i], this.zzb[i]));
            }
        }
        return new zzadk(zzadn, zzadn);
    }

    public final boolean zzh() {
        return true;
    }
}
