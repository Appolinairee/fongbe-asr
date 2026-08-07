package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcj {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private double zzw;

    public zzcj(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = ((float) i) / ((float) i3);
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final int zzg(short[] sArr, int i, int i2, int i3) {
        int i4 = 1;
        int i5 = 255;
        int i6 = 0;
        int i7 = 0;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = this.zzb * i;
                i8 += Math.abs(sArr[i10 + i9] - sArr[(i10 + i2) + i9]);
            }
            int i11 = i8 * i6;
            int i12 = i4 * i2;
            if (i11 < i12) {
                i4 = i8;
            }
            if (i11 < i12) {
                i6 = i2;
            }
            int i13 = i8 * i5;
            int i14 = i7 * i2;
            if (i13 > i14) {
                i7 = i8;
            }
            if (i13 > i14) {
                i5 = i2;
            }
            i2++;
        }
        this.zzu = i4 / i6;
        this.zzv = i7 / i5;
        return i6;
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] zzl2 = zzl(this.zzl, this.zzm, i2);
        this.zzl = zzl2;
        int i3 = this.zzm;
        int i4 = this.zzb;
        System.arraycopy(sArr, i * i4, zzl2, i3 * i4, i2 * i4);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3;
        for (int i4 = 0; i4 < this.zzh / i2; i4++) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.zzb;
                i3 = i7 * i2;
                if (i5 >= i3) {
                    break;
                }
                i6 += sArr[(i7 * i) + (i3 * i4) + i5];
                i5++;
            }
            this.zzi[i4] = (short) (i6 / i3);
        }
    }

    private static void zzj(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int zza() {
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = 0.0d;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i = this.zzm - min;
        this.zzm = i;
        int i2 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zze() {
        int i;
        int i2 = this.zzk;
        int i3 = this.zzr;
        int i4 = this.zzm;
        float f = this.zzc;
        float f2 = this.zzd;
        int i5 = i4 + ((int) ((((((((double) (i2 - i3)) / ((double) (f / f2))) + ((double) i3)) + this.zzw) + ((double) this.zzo)) / ((double) (this.zze * f2))) + 0.5d));
        this.zzw = 0.0d;
        int i6 = this.zzh;
        this.zzj = zzl(this.zzj, i2, i6 + i6 + i2);
        int i7 = 0;
        while (true) {
            int i8 = this.zzh;
            int i9 = this.zzb;
            i = i8 + i8;
            if (i7 >= i * i9) {
                break;
            }
            this.zzj[(i9 * i2) + i7] = 0;
            i7++;
        }
        this.zzk += i;
        zzk();
        if (this.zzm > i5) {
            this.zzm = i5;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] zzl2 = zzl(this.zzj, this.zzk, i2);
        this.zzj = zzl2;
        shortBuffer.get(zzl2, this.zzk * this.zzb, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }

    private final void zzk() {
        int i;
        int i2;
        int i3;
        long j;
        long j2;
        int i4;
        int i5;
        int i6;
        int i7;
        double d = (double) (this.zzc / this.zzd);
        int i8 = 0;
        int i9 = 1;
        int i10 = (d > 1.00001d ? 1 : (d == 1.00001d ? 0 : -1));
        int i11 = this.zzm;
        if (i10 > 0 || d < 0.99999d) {
            int i12 = this.zzk;
            if (i12 >= this.zzh) {
                int i13 = 0;
                while (true) {
                    int i14 = this.zzr;
                    if (i14 > 0) {
                        int min = Math.min(this.zzh, i14);
                        zzh(this.zzj, i13, min);
                        this.zzr -= min;
                        i13 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i15 = this.zza;
                        int i16 = i15 > 4000 ? i15 / 4000 : 1;
                        if (this.zzb == i9 && i16 == i9) {
                            i4 = zzg(sArr, i13, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i13, i16);
                            int zzg2 = zzg(this.zzi, i8, this.zzf / i16, this.zzg / i16);
                            if (i16 != i9) {
                                int i17 = zzg2 * i16;
                                int i18 = i16 * 4;
                                int i19 = this.zzf;
                                int i20 = i17 - i18;
                                if (i20 >= i19) {
                                    i19 = i20;
                                }
                                int i21 = i17 + i18;
                                int i22 = this.zzg;
                                if (i21 > i22) {
                                    i21 = i22;
                                }
                                if (this.zzb == i9) {
                                    i4 = zzg(sArr, i13, i19, i21);
                                } else {
                                    zzi(sArr, i13, i9);
                                    i4 = zzg(this.zzi, i8, i19, i21);
                                }
                            } else {
                                i4 = zzg2;
                            }
                        }
                        int i23 = this.zzu;
                        int i24 = (i23 == 0 || (i7 = this.zzs) == 0 || this.zzv > i23 * 3 || i23 + i23 <= this.zzt * 3) ? i4 : i7;
                        int i25 = i13 + i24;
                        this.zzt = i23;
                        this.zzs = i4;
                        double d2 = (double) i24;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzj;
                            double d3 = -1.0d + d;
                            if (d >= 2.0d) {
                                double d4 = (d2 / d3) + this.zzw;
                                int round = (int) Math.round(d4);
                                this.zzw = d4 - ((double) round);
                                i6 = round;
                            } else {
                                double d5 = ((d2 * (2.0d - d)) / d3) + this.zzw;
                                int round2 = (int) Math.round(d5);
                                this.zzr = round2;
                                this.zzw = d5 - ((double) round2);
                                i6 = i24;
                            }
                            short[] zzl2 = zzl(this.zzl, this.zzm, i6);
                            this.zzl = zzl2;
                            zzj(i6, this.zzb, zzl2, this.zzm, sArr2, i13, sArr2, i25);
                            this.zzm += i6;
                            i13 += i24 + i6;
                        } else {
                            int i26 = i24;
                            short[] sArr3 = this.zzj;
                            double d6 = 1.0d - d;
                            if (d < 0.5d) {
                                double d7 = ((d2 * d) / d6) + this.zzw;
                                int round3 = (int) Math.round(d7);
                                this.zzw = d7 - ((double) round3);
                                i5 = round3;
                            } else {
                                double d8 = ((d2 * ((d + d) - 4.0d)) / d6) + this.zzw;
                                int round4 = (int) Math.round(d8);
                                this.zzr = round4;
                                this.zzw = d8 - ((double) round4);
                                i5 = i26;
                            }
                            int i27 = i26 + i5;
                            short[] zzl3 = zzl(this.zzl, this.zzm, i27);
                            this.zzl = zzl3;
                            int i28 = this.zzb;
                            System.arraycopy(sArr3, i13 * i28, zzl3, this.zzm * i28, i28 * i26);
                            zzj(i5, this.zzb, this.zzl, this.zzm + i26, sArr3, i25, sArr3, i13);
                            this.zzm += i27;
                            i13 += i5;
                        }
                    }
                    if (this.zzh + i13 > i12) {
                        break;
                    }
                    i8 = 0;
                    i9 = 1;
                }
                int i29 = this.zzk - i13;
                short[] sArr4 = this.zzj;
                int i30 = this.zzb;
                System.arraycopy(sArr4, i13 * i30, sArr4, 0, i30 * i29);
                this.zzk = i29;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        float f = this.zze * this.zzd;
        if (f != 1.0f && this.zzm != i11) {
            int i31 = this.zza;
            long j3 = (long) i31;
            long j4 = (long) (((float) i31) / f);
            while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                j4 /= 2;
                j3 /= 2;
            }
            int i32 = this.zzm - i11;
            short[] zzl4 = zzl(this.zzn, this.zzo, i32);
            this.zzn = zzl4;
            short[] sArr5 = this.zzl;
            int i33 = this.zzb;
            System.arraycopy(sArr5, i11 * i33, zzl4, this.zzo * i33, i33 * i32);
            this.zzm = i11;
            this.zzo += i32;
            int i34 = 0;
            while (true) {
                i = this.zzo;
                i2 = i - 1;
                if (i34 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.zzp + 1;
                    j = (long) i3;
                    j2 = (long) this.zzq;
                    if (j * j4 <= j2 * j3) {
                        break;
                    }
                    this.zzl = zzl(this.zzl, this.zzm, 1);
                    int i35 = 0;
                    while (true) {
                        int i36 = this.zzb;
                        if (i35 >= i36) {
                            break;
                        }
                        short[] sArr6 = this.zzl;
                        int i37 = this.zzm * i36;
                        short[] sArr7 = this.zzn;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr7[i38];
                        short s2 = sArr7[i38 + i36];
                        long j5 = ((long) this.zzq) * j3;
                        int i39 = this.zzp;
                        long j6 = j3;
                        long j7 = ((long) (i39 + 1)) * j4;
                        long j8 = j7 - (((long) i39) * j4);
                        long j9 = j7 - j5;
                        sArr6[i37 + i35] = (short) ((int) (((j9 * ((long) s)) + ((j8 - j9) * ((long) s2))) / j8));
                        i35++;
                        i34 = i34;
                        j3 = j6;
                        j4 = j4;
                    }
                    int i40 = i34;
                    this.zzq++;
                    this.zzm++;
                    j3 = j3;
                    j4 = j4;
                }
                long j10 = j3;
                long j11 = j4;
                int i41 = i34;
                this.zzp = i3;
                if (j == j10) {
                    this.zzp = 0;
                    zzcw.zzf(j2 == j11);
                    this.zzq = 0;
                }
                i34 = i41 + 1;
                j3 = j10;
                j4 = j11;
            }
            if (i2 != 0) {
                short[] sArr8 = this.zzn;
                int i42 = this.zzb;
                System.arraycopy(sArr8, i2 * i42, sArr8, 0, (i - i2) * i42);
                this.zzo -= i2;
            }
        }
    }
}
