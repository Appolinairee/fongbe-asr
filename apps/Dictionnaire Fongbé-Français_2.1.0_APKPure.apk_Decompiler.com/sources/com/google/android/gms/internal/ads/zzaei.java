package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaei {
    protected final zzadt zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private long[] zzl;
    private int[] zzm;

    public zzaei(int i, int i2, long j, int i3, zzadt zzadt) {
        i2 = i2 != 1 ? 2 : i2;
        this.zzd = j;
        this.zze = i3;
        this.zza = zzadt;
        this.zzb = zzh(i, i2 == 2 ? 1667497984 : 1651965952);
        this.zzc = i2 == 2 ? zzh(i, 1650720768) : -1;
        this.zzk = -1;
        this.zzl = new long[512];
        this.zzm = new int[512];
    }

    private static int zzh(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final long zzi(int i) {
        return (this.zzd * ((long) i)) / ((long) this.zze);
    }

    private final zzadn zzj(int i) {
        return new zzadn(((long) this.zzm[i]) * zzi(1), this.zzl[i]);
    }

    public final zzadk zza(long j) {
        if (this.zzj != 0) {
            int zzi2 = (int) (j / zzi(1));
            int zzc2 = zzei.zzc(this.zzm, zzi2, true, true);
            if (this.zzm[zzc2] == zzi2) {
                zzadn zzj2 = zzj(zzc2);
                return new zzadk(zzj2, zzj2);
            }
            zzadn zzj3 = zzj(zzc2);
            int i = zzc2 + 1;
            if (i < this.zzl.length) {
                return new zzadk(zzj3, zzj(i));
            }
            return new zzadk(zzj3, zzj3);
        }
        zzadn zzadn = new zzadn(0, this.zzk);
        return new zzadk(zzadn, zzadn);
    }

    public final void zzb(long j, boolean z) {
        if (this.zzk == -1) {
            this.zzk = j;
        }
        if (z) {
            if (this.zzj == this.zzm.length) {
                long[] jArr = this.zzl;
                this.zzl = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.zzm;
                this.zzm = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.zzl;
            int i = this.zzj;
            jArr2[i] = j;
            this.zzm[i] = this.zzi;
            this.zzj = i + 1;
        }
        this.zzi++;
    }

    public final void zzc() {
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
        this.zzm = Arrays.copyOf(this.zzm, this.zzj);
    }

    public final void zzd(int i) {
        this.zzf = i;
        this.zzg = i;
    }

    public final void zze(long j) {
        if (this.zzj == 0) {
            this.zzh = 0;
            return;
        }
        this.zzh = this.zzm[zzei.zzd(this.zzl, j, true, true)];
    }

    public final boolean zzf(int i) {
        return this.zzb == i || this.zzc == i;
    }

    public final boolean zzg(zzaco zzaco) throws IOException {
        int i = this.zzg;
        int zzf2 = i - this.zza.zzf(zzaco, i, false);
        this.zzg = zzf2;
        boolean z = zzf2 == 0;
        if (z) {
            if (this.zzf > 0) {
                this.zza.zzt(zzi(this.zzh), Arrays.binarySearch(this.zzm, this.zzh) >= 0 ? 1 : 0, this.zzf, 0, (zzads) null);
            }
            this.zzh++;
        }
        return z;
    }
}
