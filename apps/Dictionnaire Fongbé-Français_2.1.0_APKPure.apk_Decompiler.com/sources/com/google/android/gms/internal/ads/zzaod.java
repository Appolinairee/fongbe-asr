package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaod implements zzaoc {
    private final zzacq zza;
    private final zzadt zzb;
    private final zzaof zzc;
    private final zzab zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaod(zzacq zzacq, zzadt zzadt, zzaof zzaof, String str, int i) throws zzbc {
        this.zza = zzacq;
        this.zzb = zzadt;
        this.zzc = zzaof;
        int i2 = zzaof.zzb * zzaof.zze;
        int i3 = zzaof.zzd;
        int i4 = i2 / 8;
        if (i3 == i4) {
            int i5 = zzaof.zzc * i4;
            int i6 = i5 * 8;
            int max = Math.max(i4, i5 / 10);
            this.zze = max;
            zzz zzz = new zzz();
            zzz.zzaa(str);
            zzz.zzy(i6);
            zzz.zzV(i6);
            zzz.zzR(max);
            zzz.zzz(zzaof.zzb);
            zzz.zzab(zzaof.zzc);
            zzz.zzU(i);
            this.zzd = zzz.zzag();
            return;
        }
        throw zzbc.zza("Expected block size: " + i4 + "; got: " + i3, (Throwable) null);
    }

    public final void zza(int i, long j) {
        this.zza.zzO(new zzaoi(this.zzc, 1, (long) i, j));
        this.zzb.zzm(this.zzd);
    }

    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0;
    }

    public final boolean zzc(zzaco zzaco, long j) throws IOException {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i <= 0 || (i2 = this.zzg) >= (i3 = this.zze)) {
                zzaof zzaof = this.zzc;
                int i4 = this.zzg;
                int i5 = zzaof.zzd;
                int i6 = i4 / i5;
            } else {
                int zzf2 = this.zzb.zzf(zzaco, (int) Math.min((long) (i3 - i2), j2), true);
                if (zzf2 == -1) {
                    j2 = 0;
                } else {
                    this.zzg += zzf2;
                    j2 -= (long) zzf2;
                }
            }
        }
        zzaof zzaof2 = this.zzc;
        int i42 = this.zzg;
        int i52 = zzaof2.zzd;
        int i62 = i42 / i52;
        if (i62 > 0) {
            int i7 = i62 * i52;
            int i8 = this.zzg - i7;
            this.zzb.zzt(this.zzf + zzei.zzu(this.zzh, 1000000, (long) zzaof2.zzc, RoundingMode.DOWN), 1, i7, i8, (zzads) null);
            this.zzh += (long) i62;
            this.zzg = i8;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }
}
