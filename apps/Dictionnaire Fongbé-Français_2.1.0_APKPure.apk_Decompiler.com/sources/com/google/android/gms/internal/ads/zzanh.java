package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzanh {
    private final zzef zza = new zzef(0);
    private final zzdy zzb = new zzdy();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    zzanh() {
    }

    public static long zzc(zzdy zzdy) {
        zzdy zzdy2 = zzdy;
        int zzd2 = zzdy.zzd();
        if (zzdy.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzdy2.zzH(bArr, 0, 9);
        zzdy2.zzL(zzd2);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = (long) b;
        long j2 = (long) bArr[1];
        long j3 = (long) b2;
        long j4 = (j2 & 255) << 20;
        long j5 = (j3 & 3) << 13;
        long j6 = j5 | j4 | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (((248 & j3) >> 3) << 15);
        return j6 | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    private final int zzf(zzaco zzaco) {
        byte[] bArr = zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzaco.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzaco zzaco, zzadj zzadj) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzaco.zzd();
            int min = (int) Math.min(20000, zzd2);
            long j2 = zzd2 - ((long) min);
            if (zzaco.zzf() != j2) {
                zzadj.zza = j2;
                return 1;
            }
            this.zzb.zzI(min);
            zzaco.zzj();
            zzaco.zzh(this.zzb.zzN(), 0, min);
            zzdy zzdy = this.zzb;
            int zzd3 = zzdy.zzd();
            int zze2 = zzdy.zze() - 4;
            while (true) {
                if (zze2 < zzd3) {
                    break;
                }
                if (zzg(zzdy.zzN(), zze2) == 442) {
                    zzdy.zzL(zze2 + 4);
                    long zzc2 = zzc(zzdy);
                    if (zzc2 != -9223372036854775807L) {
                        j = zzc2;
                        break;
                    }
                }
                zze2--;
            }
            this.zzg = j;
            this.zze = true;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzaco);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(20000, zzaco.zzd());
            if (zzaco.zzf() != 0) {
                zzadj.zza = 0;
                return 1;
            }
            this.zzb.zzI(min2);
            zzaco.zzj();
            zzaco.zzh(this.zzb.zzN(), 0, min2);
            zzdy zzdy2 = this.zzb;
            int zzd4 = zzdy2.zzd();
            int zze3 = zzdy2.zze();
            while (true) {
                if (zzd4 >= zze3 - 3) {
                    break;
                }
                if (zzg(zzdy2.zzN(), zzd4) == 442) {
                    zzdy2.zzL(zzd4 + 4);
                    long zzc3 = zzc(zzdy2);
                    if (zzc3 != -9223372036854775807L) {
                        j = zzc3;
                        break;
                    }
                }
                zzd4++;
            }
            this.zzf = j;
            this.zzd = true;
        } else {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzaco);
                return 0;
            }
            zzef zzef = this.zza;
            this.zzh = zzef.zzc(this.zzg) - zzef.zzb(j3);
            zzf(zzaco);
            return 0;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzef zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
