package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzahw {
    public final zzadf zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzahw(zzadf zzadf, long j, long j2, long[] jArr, int i, int i2) {
        this.zza = new zzadf(zzadf);
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static zzahw zzb(zzadf zzadf, zzdy zzdy) {
        long[] jArr;
        int i;
        int i2;
        int zzg = zzdy.zzg();
        int zzp = (zzg & 1) != 0 ? zzdy.zzp() : -1;
        long zzu = (zzg & 2) != 0 ? zzdy.zzu() : -1;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = (long) zzdy.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzdy.zzM(4);
        }
        if (zzdy.zzb() >= 24) {
            zzdy.zzM(21);
            int zzo = zzdy.zzo();
            i = zzo & 4095;
            i2 = zzo >> 12;
        } else {
            i2 = -1;
            i = -1;
        }
        return new zzahw(zzadf, (long) zzp, zzu, jArr, i2, i);
    }

    public final long zza() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        zzadf zzadf = this.zza;
        return zzei.zzt((j * ((long) zzadf.zzg)) - 1, zzadf.zzd);
    }
}
