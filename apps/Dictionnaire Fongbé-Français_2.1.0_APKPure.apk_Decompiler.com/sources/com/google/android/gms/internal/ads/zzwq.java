package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzwq extends zzws {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected zzwq(zzbr zzbr, int[] iArr, int i, zzyj zzyj, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzcx zzcx) {
        super(zzbr, iArr, 0);
        zzbr zzbr2 = zzbr;
        int[] iArr2 = iArr;
        zzfxn.zzl(list);
    }

    static /* bridge */ /* synthetic */ zzfxn zzh(zzxu[] zzxuArr) {
        int i;
        int i2;
        double d;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            zzxu zzxu = zzxuArr[i3];
            if (zzxu == null || zzxu.zzb.length <= 1) {
                arrayList.add((Object) null);
            } else {
                zzfxk zzfxk = new zzfxk();
                zzfxk.zzf(new zzwo(0, 0));
                arrayList.add(zzfxk);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i4 = 0; i4 < 2; i4++) {
            zzxu zzxu2 = zzxuArr[i4];
            if (zzxu2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[zzxu2.zzb.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = zzxu2.zzb;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    long j = (long) zzxu2.zza.zzb(iArr[i5]).zzj;
                    long[] jArr2 = jArr[i4];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i5] = j;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0 : jArr4[0];
        }
        zzi(arrayList, jArr3);
        zzfxy zza = zzfyt.zzc(zzfyy.zzc()).zzb(2).zza();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr5 = jArr[i7];
                    double d2 = 0.0d;
                    if (i8 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i8];
                    if (j2 != -1) {
                        d2 = Math.log((double) j2);
                    }
                    dArr[i8] = d2;
                    i8++;
                }
                int i9 = length - 1;
                double d3 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    double d4 = dArr[i10];
                    i10++;
                    double d5 = d4 + dArr[i10];
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = ((d5 * 0.5d) - dArr[c]) / d3;
                    }
                    zza.zzq(Double.valueOf(d), Integer.valueOf(i7));
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        zzfxn zzl = zzfxn.zzl(zza.zzr());
        for (int i11 = 0; i11 < zzl.size(); i11++) {
            int intValue = ((Integer) zzl.get(i11)).intValue();
            int i12 = iArr2[intValue] + 1;
            iArr2[intValue] = i12;
            jArr3[intValue] = jArr[intValue][i12];
            zzi(arrayList, jArr3);
        }
        for (int i13 = 0; i13 < 2; i13++) {
            if (arrayList.get(i13) != null) {
                long j3 = jArr3[i13];
                jArr3[i13] = j3 + j3;
            }
        }
        zzi(arrayList, jArr3);
        zzfxk zzfxk2 = new zzfxk();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            zzfxk zzfxk3 = (zzfxk) arrayList.get(i14);
            zzfxk2.zzf(zzfxk3 == null ? zzfxn.zzn() : zzfxk3.zzi());
        }
        return zzfxk2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfxk zzfxk = (zzfxk) list.get(i2);
            if (zzfxk != null) {
                zzfxk.zzf(new zzwo(j, jArr[i2]));
            }
        }
    }
}
