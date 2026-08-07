package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaja {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static zzadq zza(zzaco zzaco) throws IOException {
        return zzc(zzaco, true, false);
    }

    public static zzadq zzb(zzaco zzaco, boolean z) throws IOException {
        return zzc(zzaco, false, z);
    }

    private static zzadq zzc(zzaco zzaco, boolean z, boolean z2) throws IOException {
        int i;
        int i2;
        long j;
        int[] iArr;
        zzaco zzaco2 = zzaco;
        boolean z3 = z2;
        long zzd = zzaco.zzd();
        long j2 = 4096;
        long j3 = -1;
        int i3 = (zzd > -1 ? 1 : (zzd == -1 ? 0 : -1));
        if (i3 != 0 && zzd <= 4096) {
            j2 = zzd;
        }
        zzdy zzdy = new zzdy(64);
        int i4 = (int) j2;
        boolean z4 = false;
        int i5 = 0;
        boolean z5 = false;
        while (true) {
            if (i5 >= i4) {
                break;
            }
            zzdy.zzI(8);
            if (!zzaco2.zzm(zzdy.zzN(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long zzu = zzdy.zzu();
            int zzg = zzdy.zzg();
            if (zzu == 1) {
                zzaco2.zzh(zzdy.zzN(), 8, 8);
                i2 = 16;
                zzdy.zzK(16);
                i = i4;
                j = zzdy.zzt();
            } else {
                if (zzu == 0) {
                    long zzd2 = zzaco.zzd();
                    if (zzd2 != j3) {
                        zzu = (zzd2 - zzaco.zze()) + 8;
                    }
                }
                i = i4;
                j = zzu;
                i2 = 8;
            }
            long j4 = (long) i2;
            if (j < j4) {
                return new zzahy(zzg, j, i2);
            }
            i5 += i2;
            if (zzg == 1836019574) {
                i4 = i + ((int) j);
                if (i3 != 0 && ((long) i4) > zzd) {
                    i4 = (int) zzd;
                }
                z4 = false;
            } else if (zzg == 1836019558 || zzg == 1836475768) {
                z4 = true;
            } else {
                z5 |= !(zzg != 1835295092);
                int i6 = zzg;
                long j5 = zzd;
                int i7 = i;
                if ((((long) i5) + j) - j4 >= ((long) i7)) {
                    z4 = false;
                    break;
                }
                int i8 = (int) (j - j4);
                i5 += i8;
                if (i6 != 1718909296) {
                    z4 = false;
                    if (i8 != 0) {
                        zzaco2.zzg(i8);
                    }
                } else if (i8 < 8) {
                    return new zzahy(1718909296, (long) i8, 8);
                } else {
                    zzdy.zzI(i8);
                    z4 = false;
                    zzaco2.zzh(zzdy.zzN(), 0, i8);
                    int zzg2 = zzdy.zzg();
                    boolean zzd3 = zzd(zzg2, z3) | z5;
                    zzdy.zzM(4);
                    int zzb = zzdy.zzb() / 4;
                    if (!zzd3 && zzb > 0) {
                        iArr = new int[zzb];
                        int i9 = 0;
                        while (true) {
                            if (i9 >= zzb) {
                                break;
                            }
                            int zzg3 = zzdy.zzg();
                            iArr[i9] = zzg3;
                            if (zzd(zzg3, z3)) {
                                zzd3 = true;
                                break;
                            }
                            i9++;
                        }
                    } else {
                        iArr = null;
                    }
                    if (!zzd3) {
                        return new zzajf(zzg2, iArr);
                    }
                    z5 = zzd3;
                }
                i4 = i7;
                zzd = j5;
            }
            j3 = -1;
        }
        if (!z5) {
            return zzaiw.zza;
        }
        if (z != z4) {
            return z4 ? zzair.zza : zzair.zzb;
        }
        return null;
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
