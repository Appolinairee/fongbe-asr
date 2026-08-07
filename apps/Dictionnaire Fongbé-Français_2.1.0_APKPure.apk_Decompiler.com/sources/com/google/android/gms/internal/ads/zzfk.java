package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfk {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        int i3 = i2 - i;
        boolean z2 = false;
        zzcw.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzh(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zzh(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        zzh(zArr);
                        return i6;
                    }
                    i5 = i6;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1) : !(bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1)) {
                z = false;
            } else {
                z = true;
            }
            zArr[0] = z;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z2 = true;
            }
            zArr[2] = z2;
            return i2;
        } else {
            zzh(zArr);
            return i - 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:195:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfe zzc(byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzfh r35) {
        /*
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            com.google.android.gms.internal.ads.zzfl r4 = new com.google.android.gms.internal.ads.zzfl
            r4.<init>(r0, r1, r2)
            com.google.android.gms.internal.ads.zzey r6 = zzl(r4)
            com.google.android.gms.internal.ads.zzfl r4 = new com.google.android.gms.internal.ads.zzfl
            r5 = 2
            int r1 = r1 + r5
            r4.<init>(r0, r1, r2)
            r0 = 4
            r4.zzf(r0)
            r1 = 3
            int r2 = r4.zza(r1)
            int r7 = r6.zzb
            r8 = 1
            if (r7 == 0) goto L_0x002c
            r7 = 7
            if (r2 != r7) goto L_0x002c
            r2 = 7
            r7 = 1
            goto L_0x002d
        L_0x002c:
            r7 = 0
        L_0x002d:
            r10 = -1
            if (r3 == 0) goto L_0x0050
            com.google.android.gms.internal.ads.zzfxn r11 = r3.zza
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0050
            int r11 = r6.zzb
            com.google.android.gms.internal.ads.zzfxn r12 = r3.zza
            int r12 = r12.size()
            int r12 = r12 + r10
            com.google.android.gms.internal.ads.zzfxn r13 = r3.zza
            int r11 = java.lang.Math.min(r11, r12)
            java.lang.Object r11 = r13.get(r11)
            com.google.android.gms.internal.ads.zzex r11 = (com.google.android.gms.internal.ads.zzex) r11
            int r11 = r11.zza
            goto L_0x0051
        L_0x0050:
            r11 = 0
        L_0x0051:
            r12 = 0
            if (r7 != 0) goto L_0x005c
            r4.zze()
            com.google.android.gms.internal.ads.zzez r12 = zzm(r4, r8, r2, r12)
            goto L_0x0076
        L_0x005c:
            if (r3 == 0) goto L_0x0076
            com.google.android.gms.internal.ads.zzfa r13 = r3.zzb
            int[] r14 = r13.zzb
            r14 = r14[r11]
            com.google.android.gms.internal.ads.zzfxn r13 = r13.zza
            int r13 = r13.size()
            if (r13 <= r14) goto L_0x0076
            com.google.android.gms.internal.ads.zzfa r12 = r3.zzb
            com.google.android.gms.internal.ads.zzfxn r12 = r12.zza
            java.lang.Object r12 = r12.get(r14)
            com.google.android.gms.internal.ads.zzez r12 = (com.google.android.gms.internal.ads.zzez) r12
        L_0x0076:
            int r13 = r4.zzc()
            r14 = 8
            if (r7 == 0) goto L_0x00bf
            boolean r15 = r4.zzh()
            if (r15 == 0) goto L_0x0089
            int r15 = r4.zza(r14)
            goto L_0x008a
        L_0x0089:
            r15 = -1
        L_0x008a:
            if (r3 == 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzfc r9 = r3.zzc
            if (r9 == 0) goto L_0x00b9
            if (r15 != r10) goto L_0x0096
            int[] r15 = r9.zzb
            r15 = r15[r11]
        L_0x0096:
            if (r15 == r10) goto L_0x00b9
            com.google.android.gms.internal.ads.zzfxn r9 = r9.zza
            int r9 = r9.size()
            if (r9 <= r15) goto L_0x00b9
            com.google.android.gms.internal.ads.zzfc r9 = r3.zzc
            com.google.android.gms.internal.ads.zzfxn r9 = r9.zza
            java.lang.Object r9 = r9.get(r15)
            com.google.android.gms.internal.ads.zzfb r9 = (com.google.android.gms.internal.ads.zzfb) r9
            int r15 = r9.zza
            int r10 = r9.zzd
            int r14 = r9.zze
            int r5 = r9.zzb
            int r9 = r9.zzc
            r0 = r10
            r8 = r15
            r10 = r9
            r9 = r5
            goto L_0x00fe
        L_0x00b9:
            r0 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r14 = 0
            goto L_0x00fe
        L_0x00bf:
            int r5 = r4.zzc()
            if (r5 != r1) goto L_0x00ca
            r4.zze()
            r9 = 3
            goto L_0x00cb
        L_0x00ca:
            r9 = r5
        L_0x00cb:
            int r10 = r4.zzc()
            int r14 = r4.zzc()
            boolean r15 = r4.zzh()
            if (r15 == 0) goto L_0x00f2
            int r15 = r4.zzc()
            int r1 = r4.zzc()
            int r0 = r4.zzc()
            int r8 = r4.zzc()
            int r10 = zzk(r10, r9, r15, r1)
            int r0 = zzj(r14, r9, r0, r8)
            r14 = r0
        L_0x00f2:
            int r0 = r4.zzc()
            int r1 = r4.zzc()
            r9 = r0
            r8 = r5
            r0 = r10
            r10 = r1
        L_0x00fe:
            int r1 = r4.zzc()
            if (r7 != 0) goto L_0x0126
            boolean r5 = r4.zzh()
            r15 = 1
            if (r15 == r5) goto L_0x010d
            r5 = r2
            goto L_0x010e
        L_0x010d:
            r5 = 0
        L_0x010e:
            r15 = -1
        L_0x010f:
            if (r5 > r2) goto L_0x0127
            r4.zzc()
            r20 = r2
            int r2 = r4.zzc()
            int r15 = java.lang.Math.max(r2, r15)
            r4.zzc()
            int r5 = r5 + 1
            r2 = r20
            goto L_0x010f
        L_0x0126:
            r15 = -1
        L_0x0127:
            r4.zzc()
            r4.zzc()
            r4.zzc()
            r4.zzc()
            r4.zzc()
            r4.zzc()
            boolean r2 = r4.zzh()
            if (r2 == 0) goto L_0x01a2
            r2 = 6
            if (r7 == 0) goto L_0x014c
            boolean r5 = r4.zzh()
            if (r5 == 0) goto L_0x014c
            r4.zzf(r2)
            goto L_0x01a2
        L_0x014c:
            boolean r5 = r4.zzh()
            if (r5 == 0) goto L_0x01a2
            r5 = 0
        L_0x0153:
            r7 = 4
            if (r5 >= r7) goto L_0x01a2
            r7 = 0
        L_0x0157:
            if (r7 >= r2) goto L_0x0198
            boolean r20 = r4.zzh()
            if (r20 != 0) goto L_0x016a
            r4.zzc()
            r20 = r0
            r22 = r15
            r0 = 3
            r18 = 4
            goto L_0x018c
        L_0x016a:
            int r20 = r5 + r5
            r18 = 4
            int r20 = r20 + 4
            r22 = r15
            r2 = 1
            int r15 = r2 << r20
            r20 = r0
            r0 = 64
            int r0 = java.lang.Math.min(r0, r15)
            if (r5 <= r2) goto L_0x0182
            r4.zzb()
        L_0x0182:
            r2 = 0
        L_0x0183:
            if (r2 >= r0) goto L_0x018b
            r4.zzb()
            int r2 = r2 + 1
            goto L_0x0183
        L_0x018b:
            r0 = 3
        L_0x018c:
            if (r5 != r0) goto L_0x0190
            r0 = 3
            goto L_0x0191
        L_0x0190:
            r0 = 1
        L_0x0191:
            int r7 = r7 + r0
            r0 = r20
            r15 = r22
            r2 = 6
            goto L_0x0157
        L_0x0198:
            r20 = r0
            r22 = r15
            r18 = 4
            int r5 = r5 + 1
            r2 = 6
            goto L_0x0153
        L_0x01a2:
            r20 = r0
            r22 = r15
            r0 = 2
            r4.zzf(r0)
            boolean r0 = r4.zzh()
            if (r0 == 0) goto L_0x01be
            r0 = 8
            r4.zzf(r0)
            r4.zzc()
            r4.zzc()
            r4.zze()
        L_0x01be:
            int r0 = r4.zzc()
            r2 = 0
            int[] r5 = new int[r2]
            int[] r7 = new int[r2]
            r18 = r13
            r2 = -1
            r13 = -1
            r15 = 0
        L_0x01cc:
            if (r15 >= r0) goto L_0x0301
            if (r15 == 0) goto L_0x02a2
            boolean r21 = r4.zzh()
            if (r21 == 0) goto L_0x02a2
            r21 = r0
            int r0 = r2 + r13
            boolean r23 = r4.zzh()
            int r24 = r4.zzc()
            r19 = 1
            int r24 = r24 + 1
            int r23 = r23 + r23
            int r23 = 1 - r23
            r25 = r10
            int r10 = r0 + 1
            r26 = r9
            boolean[] r9 = new boolean[r10]
            r27 = r8
            r8 = 0
        L_0x01f5:
            if (r8 > r0) goto L_0x020b
            boolean r28 = r4.zzh()
            if (r28 != 0) goto L_0x0204
            boolean r28 = r4.zzh()
            r9[r8] = r28
            goto L_0x0206
        L_0x0204:
            r9[r8] = r19
        L_0x0206:
            int r8 = r8 + 1
            r19 = 1
            goto L_0x01f5
        L_0x020b:
            int r8 = r13 + -1
            r28 = r8
            int[] r8 = new int[r10]
            int[] r10 = new int[r10]
            r29 = 0
        L_0x0215:
            int r30 = r23 * r24
            if (r28 < 0) goto L_0x022e
            r31 = r7[r28]
            int r31 = r31 + r30
            if (r31 >= 0) goto L_0x022b
            int r30 = r2 + r28
            boolean r30 = r9[r30]
            if (r30 == 0) goto L_0x022b
            int r30 = r29 + 1
            r8[r29] = r31
            r29 = r30
        L_0x022b:
            int r28 = r28 + -1
            goto L_0x0215
        L_0x022e:
            if (r30 >= 0) goto L_0x023a
            boolean r23 = r9[r0]
            if (r23 == 0) goto L_0x023a
            int r23 = r29 + 1
            r8[r29] = r30
            r29 = r23
        L_0x023a:
            r24 = r6
            r23 = r12
            r12 = r29
            r6 = 0
        L_0x0241:
            if (r6 >= r2) goto L_0x0256
            r28 = r5[r6]
            int r28 = r28 + r30
            if (r28 >= 0) goto L_0x0253
            boolean r29 = r9[r6]
            if (r29 == 0) goto L_0x0253
            int r29 = r12 + 1
            r8[r12] = r28
            r12 = r29
        L_0x0253:
            int r6 = r6 + 1
            goto L_0x0241
        L_0x0256:
            int[] r6 = java.util.Arrays.copyOf(r8, r12)
            int r8 = r2 + -1
            r28 = 0
        L_0x025e:
            if (r8 < 0) goto L_0x0273
            r29 = r5[r8]
            int r29 = r29 + r30
            if (r29 <= 0) goto L_0x0270
            boolean r31 = r9[r8]
            if (r31 == 0) goto L_0x0270
            int r31 = r28 + 1
            r10[r28] = r29
            r28 = r31
        L_0x0270:
            int r8 = r8 + -1
            goto L_0x025e
        L_0x0273:
            if (r30 <= 0) goto L_0x027f
            boolean r0 = r9[r0]
            if (r0 == 0) goto L_0x027f
            int r0 = r28 + 1
            r10[r28] = r30
            r28 = r0
        L_0x027f:
            r0 = r28
            r5 = 0
        L_0x0282:
            if (r5 >= r13) goto L_0x0299
            r8 = r7[r5]
            int r8 = r8 + r30
            if (r8 <= 0) goto L_0x0296
            int r28 = r2 + r5
            boolean r28 = r9[r28]
            if (r28 == 0) goto L_0x0296
            int r28 = r0 + 1
            r10[r0] = r8
            r0 = r28
        L_0x0296:
            int r5 = r5 + 1
            goto L_0x0282
        L_0x0299:
            int[] r2 = java.util.Arrays.copyOf(r10, r0)
            r13 = r0
            r7 = r2
            r5 = r6
            r2 = r12
            goto L_0x02f1
        L_0x02a2:
            r21 = r0
            r24 = r6
            r27 = r8
            r26 = r9
            r25 = r10
            r23 = r12
            int r0 = r4.zzc()
            int r2 = r4.zzc()
            int[] r5 = new int[r0]
            r6 = 0
        L_0x02b9:
            if (r6 >= r0) goto L_0x02d2
            if (r6 <= 0) goto L_0x02c2
            int r7 = r6 + -1
            r7 = r5[r7]
            goto L_0x02c3
        L_0x02c2:
            r7 = 0
        L_0x02c3:
            int r8 = r4.zzc()
            r9 = 1
            int r8 = r8 + r9
            int r7 = r7 - r8
            r5[r6] = r7
            r4.zze()
            int r6 = r6 + 1
            goto L_0x02b9
        L_0x02d2:
            int[] r6 = new int[r2]
            r7 = 0
        L_0x02d5:
            if (r7 >= r2) goto L_0x02ee
            if (r7 <= 0) goto L_0x02de
            int r8 = r7 + -1
            r8 = r6[r8]
            goto L_0x02df
        L_0x02de:
            r8 = 0
        L_0x02df:
            int r9 = r4.zzc()
            r10 = 1
            int r9 = r9 + r10
            int r8 = r8 + r9
            r6[r7] = r8
            r4.zze()
            int r7 = r7 + 1
            goto L_0x02d5
        L_0x02ee:
            r13 = r2
            r7 = r6
            r2 = r0
        L_0x02f1:
            int r15 = r15 + 1
            r0 = r21
            r12 = r23
            r6 = r24
            r10 = r25
            r9 = r26
            r8 = r27
            goto L_0x01cc
        L_0x0301:
            r24 = r6
            r27 = r8
            r26 = r9
            r25 = r10
            r23 = r12
            boolean r0 = r4.zzh()
            if (r0 == 0) goto L_0x0320
            int r0 = r4.zzc()
            r9 = 0
        L_0x0316:
            if (r9 >= r0) goto L_0x0320
            int r2 = r1 + 5
            r4.zzf(r2)
            int r9 = r9 + 1
            goto L_0x0316
        L_0x0320:
            r0 = 2
            r4.zzf(r0)
            boolean r1 = r4.zzh()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x03e9
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x036a
            r1 = 8
            int r5 = r4.zza(r1)
            r1 = 255(0xff, float:3.57E-43)
            if (r5 != r1) goto L_0x034e
            r1 = 16
            int r5 = r4.zza(r1)
            int r1 = r4.zza(r1)
            if (r5 == 0) goto L_0x036a
            if (r1 == 0) goto L_0x036a
            float r2 = (float) r5
            float r1 = (float) r1
            float r2 = r2 / r1
            goto L_0x036a
        L_0x034e:
            r1 = 17
            if (r5 >= r1) goto L_0x0357
            float[] r1 = zzb
            r2 = r1[r5]
            goto L_0x036a
        L_0x0357:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "Unexpected aspect_ratio_idc value: "
            r1.<init>(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "NalUnitUtil"
            com.google.android.gms.internal.ads.zzdo.zzf(r5, r1)
        L_0x036a:
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x0373
            r4.zze()
        L_0x0373:
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x03a5
            r1 = 3
            r4.zzf(r1)
            boolean r1 = r4.zzh()
            r3 = 1
            if (r3 == r1) goto L_0x0386
            r5 = 2
            goto L_0x0387
        L_0x0386:
            r5 = 1
        L_0x0387:
            boolean r0 = r4.zzh()
            if (r0 == 0) goto L_0x03a3
            r0 = 8
            int r1 = r4.zza(r0)
            int r3 = r4.zza(r0)
            r4.zzf(r0)
            int r10 = com.google.android.gms.internal.ads.zzk.zza(r1)
            int r0 = com.google.android.gms.internal.ads.zzk.zzb(r3)
            goto L_0x03cc
        L_0x03a3:
            r0 = -1
            goto L_0x03cb
        L_0x03a5:
            if (r3 == 0) goto L_0x03c9
            com.google.android.gms.internal.ads.zzfg r0 = r3.zzd
            if (r0 == 0) goto L_0x03c9
            int[] r1 = r0.zzb
            r1 = r1[r11]
            com.google.android.gms.internal.ads.zzfxn r0 = r0.zza
            int r0 = r0.size()
            if (r0 <= r1) goto L_0x03c9
            com.google.android.gms.internal.ads.zzfg r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfxn r0 = r0.zza
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzff r0 = (com.google.android.gms.internal.ads.zzff) r0
            int r10 = r0.zza
            int r1 = r0.zzb
            int r0 = r0.zzc
            r5 = r1
            goto L_0x03cc
        L_0x03c9:
            r0 = -1
            r5 = -1
        L_0x03cb:
            r10 = -1
        L_0x03cc:
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x03d8
            r4.zzc()
            r4.zzc()
        L_0x03d8:
            r4.zze()
            boolean r1 = r4.zzh()
            if (r1 == 0) goto L_0x03e2
            int r14 = r14 + r14
        L_0x03e2:
            r17 = r5
            r16 = r10
            r13 = r14
            r14 = r2
            goto L_0x03f1
        L_0x03e9:
            r13 = r14
            r0 = -1
            r14 = 1065353216(0x3f800000, float:1.0)
            r16 = -1
            r17 = -1
        L_0x03f1:
            com.google.android.gms.internal.ads.zzfe r1 = new com.google.android.gms.internal.ads.zzfe
            r5 = r1
            r6 = r24
            r7 = r23
            r8 = r27
            r9 = r26
            r10 = r25
            r11 = r18
            r12 = r20
            r15 = r22
            r18 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfk.zzc(byte[], int, int, com.google.android.gms.internal.ads.zzfh):com.google.android.gms.internal.ads.zzfe");
    }

    /* JADX WARNING: Removed duplicated region for block: B:277:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x05c1  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x05d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfh zzd(byte[] r36, int r37, int r38) {
        /*
            com.google.android.gms.internal.ads.zzfl r0 = new com.google.android.gms.internal.ads.zzfl
            r1 = r36
            r2 = r37
            r3 = r38
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.ads.zzey r2 = zzl(r0)
            r1 = 4
            r0.zzf(r1)
            boolean r3 = r0.zzh()
            boolean r4 = r0.zzh()
            r5 = 6
            int r6 = r0.zza(r5)
            int r7 = r6 + 1
            r8 = 3
            int r9 = r0.zza(r8)
            r10 = 17
            r0.zzf(r10)
            r10 = 1
            r11 = 0
            com.google.android.gms.internal.ads.zzez r12 = zzm(r0, r10, r9, r11)
            boolean r13 = r0.zzh()
            r14 = 0
            if (r10 == r13) goto L_0x003b
            r13 = r9
            goto L_0x003c
        L_0x003b:
            r13 = 0
        L_0x003c:
            if (r13 > r9) goto L_0x004a
            r0.zzc()
            r0.zzc()
            r0.zzc()
            int r13 = r13 + 1
            goto L_0x003c
        L_0x004a:
            int r13 = r0.zza(r5)
            int r15 = r0.zzc()
            int r15 = r15 + r10
            com.google.android.gms.internal.ads.zzfxn r11 = com.google.android.gms.internal.ads.zzfxn.zzo(r12)
            com.google.android.gms.internal.ads.zzfa r5 = new com.google.android.gms.internal.ads.zzfa
            int[] r8 = new int[r10]
            r5.<init>(r11, r8)
            r8 = 2
            if (r7 < r8) goto L_0x0065
            if (r15 < r8) goto L_0x0065
            r11 = 1
            goto L_0x0066
        L_0x0065:
            r11 = 0
        L_0x0066:
            if (r3 == 0) goto L_0x006c
            if (r4 == 0) goto L_0x006c
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            int r4 = r13 + 1
            if (r11 == 0) goto L_0x0839
            if (r3 == 0) goto L_0x0839
            if (r4 >= r7) goto L_0x0077
            goto L_0x0839
        L_0x0077:
            int[] r3 = new int[r8]
            r3[r10] = r4
            r3[r14] = r15
            java.lang.Class r11 = java.lang.Integer.TYPE
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r11, r3)
            int[][] r3 = (int[][]) r3
            int[] r11 = new int[r15]
            int[] r8 = new int[r15]
            r16 = r3[r14]
            r16[r14] = r14
            r11[r14] = r10
            r8[r14] = r14
        L_0x0091:
            if (r10 >= r15) goto L_0x00b0
            r18 = 0
        L_0x0095:
            if (r14 > r13) goto L_0x00ac
            boolean r19 = r0.zzh()
            if (r19 == 0) goto L_0x00a7
            r19 = r3[r10]
            int r20 = r18 + 1
            r19[r18] = r14
            r8[r10] = r14
            r18 = r20
        L_0x00a7:
            r11[r10] = r18
            int r14 = r14 + 1
            goto L_0x0095
        L_0x00ac:
            int r10 = r10 + 1
            r14 = 0
            goto L_0x0091
        L_0x00b0:
            boolean r10 = r0.zzh()
            if (r10 == 0) goto L_0x0166
            r10 = 64
            r0.zzf(r10)
            boolean r10 = r0.zzh()
            if (r10 == 0) goto L_0x00c4
            r0.zzc()
        L_0x00c4:
            int r10 = r0.zzc()
            r1 = 0
        L_0x00c9:
            if (r1 >= r10) goto L_0x0166
            r0.zzc()
            if (r1 == 0) goto L_0x00de
            boolean r19 = r0.zzh()
            if (r19 == 0) goto L_0x00d7
            goto L_0x00de
        L_0x00d7:
            r19 = 0
            r20 = 0
        L_0x00db:
            r21 = 0
            goto L_0x0105
        L_0x00de:
            boolean r19 = r0.zzh()
            boolean r20 = r0.zzh()
            if (r19 != 0) goto L_0x00ea
            if (r20 == 0) goto L_0x00db
        L_0x00ea:
            boolean r21 = r0.zzh()
            if (r21 == 0) goto L_0x00f5
            r14 = 19
            r0.zzf(r14)
        L_0x00f5:
            r14 = 8
            r0.zzf(r14)
            if (r21 == 0) goto L_0x0100
            r14 = 4
            r0.zzf(r14)
        L_0x0100:
            r14 = 15
            r0.zzf(r14)
        L_0x0105:
            r14 = 0
        L_0x0106:
            if (r14 > r9) goto L_0x015c
            boolean r22 = r0.zzh()
            if (r22 != 0) goto L_0x0121
            boolean r22 = r0.zzh()
            if (r22 == 0) goto L_0x0115
            goto L_0x0121
        L_0x0115:
            boolean r22 = r0.zzh()
            if (r22 == 0) goto L_0x0124
            r22 = r8
            r23 = r10
            r10 = 0
            goto L_0x012e
        L_0x0121:
            r0.zzc()
        L_0x0124:
            int r22 = r0.zzc()
            r23 = r10
            r10 = r22
            r22 = r8
        L_0x012e:
            int r8 = r19 + r20
            r24 = r3
            r3 = 0
        L_0x0133:
            if (r3 >= r8) goto L_0x0153
            r25 = r8
            r8 = 0
        L_0x0138:
            if (r8 > r10) goto L_0x014e
            r0.zzc()
            r0.zzc()
            if (r21 == 0) goto L_0x0148
            r0.zzc()
            r0.zzc()
        L_0x0148:
            r0.zze()
            int r8 = r8 + 1
            goto L_0x0138
        L_0x014e:
            int r3 = r3 + 1
            r8 = r25
            goto L_0x0133
        L_0x0153:
            int r14 = r14 + 1
            r8 = r22
            r10 = r23
            r3 = r24
            goto L_0x0106
        L_0x015c:
            r24 = r3
            r22 = r8
            r23 = r10
            int r1 = r1 + 1
            goto L_0x00c9
        L_0x0166:
            r24 = r3
            r22 = r8
            boolean r1 = r0.zzh()
            if (r1 != 0) goto L_0x017e
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x017e:
            r0.zzd()
            r1 = 0
            com.google.android.gms.internal.ads.zzez r3 = zzm(r0, r1, r9, r12)
            boolean r1 = r0.zzh()
            r8 = 16
            boolean[] r10 = new boolean[r8]
            r19 = r3
            r3 = 0
            r14 = 0
        L_0x0192:
            if (r14 >= r8) goto L_0x01a1
            boolean r20 = r0.zzh()
            r10[r14] = r20
            if (r20 == 0) goto L_0x019e
            int r3 = r3 + 1
        L_0x019e:
            int r14 = r14 + 1
            goto L_0x0192
        L_0x01a1:
            if (r3 == 0) goto L_0x0828
            r14 = 1
            boolean r20 = r10[r14]
            if (r20 != 0) goto L_0x01aa
            goto L_0x0828
        L_0x01aa:
            int r14 = r3 + 1
            int[] r8 = new int[r3]
            r23 = r11
            r21 = r12
            r12 = 0
        L_0x01b3:
            int r11 = r3 - r1
            if (r12 >= r11) goto L_0x01c1
            r11 = 3
            int r25 = r0.zza(r11)
            r8[r12] = r25
            int r12 = r12 + 1
            goto L_0x01b3
        L_0x01c1:
            int[] r11 = new int[r14]
            if (r1 == 0) goto L_0x01e0
            r12 = 1
        L_0x01c6:
            if (r12 >= r3) goto L_0x01dd
            r14 = 0
        L_0x01c9:
            if (r14 >= r12) goto L_0x01da
            r25 = r11[r12]
            r26 = r8[r14]
            r16 = 1
            int r26 = r26 + 1
            int r25 = r25 + r26
            r11[r12] = r25
            int r14 = r14 + 1
            goto L_0x01c9
        L_0x01da:
            int r12 = r12 + 1
            goto L_0x01c6
        L_0x01dd:
            r12 = 6
            r11[r3] = r12
        L_0x01e0:
            r12 = 2
            int[] r14 = new int[r12]
            r12 = 1
            r14[r12] = r3
            r12 = 0
            r14[r12] = r7
            java.lang.Class r12 = java.lang.Integer.TYPE
            java.lang.Object r12 = java.lang.reflect.Array.newInstance(r12, r14)
            int[][] r12 = (int[][]) r12
            int[] r14 = new int[r7]
            r17 = 0
            r14[r17] = r17
            boolean r25 = r0.zzh()
            r26 = r9
            r27 = r15
            r9 = 1
        L_0x0200:
            if (r9 >= r7) goto L_0x0251
            if (r25 == 0) goto L_0x020c
            r15 = 6
            int r29 = r0.zza(r15)
            r14[r9] = r29
            goto L_0x020f
        L_0x020c:
            r15 = 6
            r14[r9] = r9
        L_0x020f:
            if (r1 != 0) goto L_0x022c
            r15 = 0
        L_0x0212:
            if (r15 >= r3) goto L_0x0229
            r28 = r12[r9]
            r29 = r8[r15]
            r30 = r1
            r16 = 1
            int r1 = r29 + 1
            int r1 = r0.zza(r1)
            r28[r15] = r1
            int r15 = r15 + 1
            r1 = r30
            goto L_0x0212
        L_0x0229:
            r30 = r1
            goto L_0x024c
        L_0x022c:
            r30 = r1
            r1 = 0
        L_0x022f:
            if (r1 >= r3) goto L_0x024c
            r15 = r12[r9]
            r29 = r14[r9]
            int r31 = r1 + 1
            r32 = r11[r31]
            r16 = 1
            int r32 = r16 << r32
            r28 = -1
            int r32 = r32 + -1
            r29 = r29 & r32
            r32 = r11[r1]
            int r29 = r29 >> r32
            r15[r1] = r29
            r1 = r31
            goto L_0x022f
        L_0x024c:
            int r9 = r9 + 1
            r1 = r30
            goto L_0x0200
        L_0x0251:
            int[] r1 = new int[r4]
            r3 = 1
            r8 = 0
        L_0x0255:
            if (r8 >= r7) goto L_0x0296
            r9 = r14[r8]
            r11 = -1
            r1[r9] = r11
            r9 = 0
            r11 = 0
        L_0x025e:
            r15 = 16
            if (r9 >= r15) goto L_0x027e
            boolean r15 = r10[r9]
            if (r15 == 0) goto L_0x027b
            r15 = 1
            if (r9 != r15) goto L_0x0274
            r9 = r14[r8]
            r16 = r12[r8]
            r16 = r16[r11]
            r1[r9] = r16
            r16 = 1
            goto L_0x0276
        L_0x0274:
            r16 = r9
        L_0x0276:
            int r11 = r11 + 1
            r9 = r16
            goto L_0x027c
        L_0x027b:
            r15 = 1
        L_0x027c:
            int r9 = r9 + r15
            goto L_0x025e
        L_0x027e:
            if (r8 <= 0) goto L_0x0293
            r9 = 0
        L_0x0281:
            if (r9 >= r8) goto L_0x0291
            r11 = r14[r8]
            r11 = r1[r11]
            r15 = r14[r9]
            r15 = r1[r15]
            if (r11 != r15) goto L_0x028e
            goto L_0x0293
        L_0x028e:
            int r9 = r9 + 1
            goto L_0x0281
        L_0x0291:
            int r3 = r3 + 1
        L_0x0293:
            int r8 = r8 + 1
            goto L_0x0255
        L_0x0296:
            r8 = 4
            int r9 = r0.zza(r8)
            r8 = 2
            if (r3 < r8) goto L_0x0817
            if (r9 != 0) goto L_0x02a2
            goto L_0x0817
        L_0x02a2:
            int[] r8 = new int[r3]
            r10 = 0
        L_0x02a5:
            if (r10 >= r3) goto L_0x02b0
            int r11 = r0.zza(r9)
            r8[r10] = r11
            int r10 = r10 + 1
            goto L_0x02a5
        L_0x02b0:
            int[] r9 = new int[r4]
            r10 = 0
        L_0x02b3:
            if (r10 >= r7) goto L_0x02c0
            r11 = r14[r10]
            int r11 = java.lang.Math.min(r11, r13)
            r9[r11] = r10
            int r10 = r10 + 1
            goto L_0x02b3
        L_0x02c0:
            com.google.android.gms.internal.ads.zzfxk r10 = new com.google.android.gms.internal.ads.zzfxk
            r10.<init>()
            r11 = 0
        L_0x02c6:
            if (r11 > r13) goto L_0x02e8
            r12 = r1[r11]
            r25 = r1
            r15 = -1
            int r1 = r3 + -1
            int r1 = java.lang.Math.min(r12, r1)
            if (r1 < 0) goto L_0x02d8
            r1 = r8[r1]
            goto L_0x02d9
        L_0x02d8:
            r1 = -1
        L_0x02d9:
            com.google.android.gms.internal.ads.zzex r12 = new com.google.android.gms.internal.ads.zzex
            r15 = r9[r11]
            r12.<init>(r15, r1)
            r10.zzf(r12)
            int r11 = r11 + 1
            r1 = r25
            goto L_0x02c6
        L_0x02e8:
            com.google.android.gms.internal.ads.zzfxn r3 = r10.zzi()
            r1 = 0
            java.lang.Object r8 = r3.get(r1)
            com.google.android.gms.internal.ads.zzex r8 = (com.google.android.gms.internal.ads.zzex) r8
            int r1 = r8.zzb
            r8 = -1
            if (r1 != r8) goto L_0x0306
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x0306:
            r1 = 1
        L_0x0307:
            if (r1 > r13) goto L_0x0318
            java.lang.Object r8 = r3.get(r1)
            com.google.android.gms.internal.ads.zzex r8 = (com.google.android.gms.internal.ads.zzex) r8
            int r8 = r8.zzb
            r9 = -1
            if (r8 == r9) goto L_0x0315
            goto L_0x031a
        L_0x0315:
            int r1 = r1 + 1
            goto L_0x0307
        L_0x0318:
            r9 = -1
            r1 = -1
        L_0x031a:
            if (r1 != r9) goto L_0x032a
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x032a:
            r8 = 2
            int[] r9 = new int[r8]
            r10 = 1
            r9[r10] = r7
            r11 = 0
            r9[r11] = r7
            java.lang.Class r12 = java.lang.Boolean.TYPE
            java.lang.Object r9 = java.lang.reflect.Array.newInstance(r12, r9)
            boolean[][] r9 = (boolean[][]) r9
            int[] r12 = new int[r8]
            r12[r10] = r7
            r12[r11] = r7
            java.lang.Class r8 = java.lang.Boolean.TYPE
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r12)
            boolean[][] r8 = (boolean[][]) r8
            r10 = 1
        L_0x034a:
            if (r10 >= r7) goto L_0x0361
            r11 = 0
        L_0x034d:
            if (r11 >= r10) goto L_0x035e
            r12 = r9[r10]
            r13 = r8[r10]
            boolean r15 = r0.zzh()
            r13[r11] = r15
            r12[r11] = r15
            int r11 = r11 + 1
            goto L_0x034d
        L_0x035e:
            int r10 = r10 + 1
            goto L_0x034a
        L_0x0361:
            r10 = 1
        L_0x0362:
            if (r10 >= r7) goto L_0x0383
            r11 = 0
        L_0x0365:
            if (r11 >= r6) goto L_0x0380
            r12 = 0
        L_0x0368:
            if (r12 >= r10) goto L_0x037d
            r13 = r8[r10]
            boolean r15 = r13[r12]
            if (r15 == 0) goto L_0x037a
            r15 = r8[r12]
            boolean r15 = r15[r11]
            if (r15 == 0) goto L_0x037a
            r15 = 1
            r13[r11] = r15
            goto L_0x037d
        L_0x037a:
            int r12 = r12 + 1
            goto L_0x0368
        L_0x037d:
            int r11 = r11 + 1
            goto L_0x0365
        L_0x0380:
            int r10 = r10 + 1
            goto L_0x0362
        L_0x0383:
            int[] r10 = new int[r4]
            r11 = 0
        L_0x0386:
            if (r11 >= r7) goto L_0x039b
            r12 = 0
            r13 = 0
        L_0x038a:
            if (r12 >= r11) goto L_0x0394
            r15 = r9[r11]
            boolean r15 = r15[r12]
            int r13 = r13 + r15
            int r12 = r12 + 1
            goto L_0x038a
        L_0x0394:
            r12 = r14[r11]
            r10[r12] = r13
            int r11 = r11 + 1
            goto L_0x0386
        L_0x039b:
            r11 = 0
            r12 = 0
        L_0x039d:
            if (r11 >= r7) goto L_0x03aa
            r13 = r14[r11]
            r13 = r10[r13]
            if (r13 != 0) goto L_0x03a7
            int r12 = r12 + 1
        L_0x03a7:
            int r11 = r11 + 1
            goto L_0x039d
        L_0x03aa:
            r11 = 1
            if (r12 <= r11) goto L_0x03bb
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x03bb:
            int[] r11 = new int[r7]
            r15 = r27
            int[] r12 = new int[r15]
            boolean r13 = r0.zzh()
            if (r13 == 0) goto L_0x03dd
            r13 = 0
        L_0x03c8:
            if (r13 >= r7) goto L_0x03d8
            r25 = r14
            r14 = 3
            int r27 = r0.zza(r14)
            r11[r13] = r27
            int r13 = r13 + 1
            r14 = r25
            goto L_0x03c8
        L_0x03d8:
            r25 = r14
            r13 = r26
            goto L_0x03e5
        L_0x03dd:
            r25 = r14
            r13 = r26
            r14 = 0
            java.util.Arrays.fill(r11, r14, r7, r13)
        L_0x03e5:
            r14 = 0
        L_0x03e6:
            if (r14 >= r15) goto L_0x0416
            r27 = r1
            r37 = r8
            r26 = r10
            r8 = 0
            r10 = 0
        L_0x03f0:
            r1 = r23[r14]
            if (r10 >= r1) goto L_0x0409
            r1 = r24[r14]
            r1 = r1[r10]
            java.lang.Object r1 = r3.get(r1)
            com.google.android.gms.internal.ads.zzex r1 = (com.google.android.gms.internal.ads.zzex) r1
            int r1 = r1.zza
            r1 = r11[r1]
            int r8 = java.lang.Math.max(r8, r1)
            int r10 = r10 + 1
            goto L_0x03f0
        L_0x0409:
            int r8 = r8 + 1
            r12[r14] = r8
            int r14 = r14 + 1
            r8 = r37
            r10 = r26
            r1 = r27
            goto L_0x03e6
        L_0x0416:
            r27 = r1
            r37 = r8
            r26 = r10
            boolean r1 = r0.zzh()
            if (r1 == 0) goto L_0x0439
            r1 = 0
        L_0x0423:
            if (r1 >= r6) goto L_0x0439
            int r8 = r1 + 1
            r10 = r8
        L_0x0428:
            if (r10 >= r7) goto L_0x0437
            r11 = r9[r10]
            boolean r11 = r11[r1]
            if (r11 == 0) goto L_0x0434
            r11 = 3
            r0.zzf(r11)
        L_0x0434:
            int r10 = r10 + 1
            goto L_0x0428
        L_0x0437:
            r1 = r8
            goto L_0x0423
        L_0x0439:
            r0.zze()
            int r1 = r0.zzc()
            r6 = 1
            int r1 = r1 + r6
            com.google.android.gms.internal.ads.zzfxk r8 = new com.google.android.gms.internal.ads.zzfxk
            r8.<init>()
            r10 = r21
            r8.zzf(r10)
            if (r1 <= r6) goto L_0x0464
            r6 = r19
            r8.zzf(r6)
            r10 = 2
        L_0x0454:
            if (r10 >= r1) goto L_0x0464
            boolean r11 = r0.zzh()
            com.google.android.gms.internal.ads.zzez r6 = zzm(r0, r11, r13, r6)
            r8.zzf(r6)
            int r10 = r10 + 1
            goto L_0x0454
        L_0x0464:
            com.google.android.gms.internal.ads.zzfxn r6 = r8.zzi()
            int r8 = r0.zzc()
            int r8 = r8 + r15
            if (r8 <= r15) goto L_0x047d
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x047d:
            r10 = 2
            int r11 = r0.zza(r10)
            int[] r13 = new int[r10]
            r10 = 1
            r13[r10] = r4
            r10 = 0
            r13[r10] = r8
            java.lang.Class r14 = java.lang.Boolean.TYPE
            java.lang.Object r13 = java.lang.reflect.Array.newInstance(r14, r13)
            boolean[][] r13 = (boolean[][]) r13
            int[] r14 = new int[r8]
            int[] r10 = new int[r8]
            r19 = r6
            r6 = 0
        L_0x0499:
            if (r6 >= r15) goto L_0x04ef
            r21 = r15
            r15 = 0
            r14[r6] = r15
            r15 = r22[r6]
            r10[r6] = r15
            if (r11 != 0) goto L_0x04bb
            r15 = r13[r6]
            r28 = r9
            r9 = r23[r6]
            r30 = r7
            r29 = r12
            r7 = 1
            r12 = 0
            java.util.Arrays.fill(r15, r12, r9, r7)
            r9 = r23[r6]
            r14[r6] = r9
        L_0x04b9:
            r9 = 0
            goto L_0x04e4
        L_0x04bb:
            r30 = r7
            r28 = r9
            r29 = r12
            r7 = 1
            if (r11 != r7) goto L_0x04dd
            r7 = 0
        L_0x04c5:
            r9 = r23[r6]
            if (r7 >= r9) goto L_0x04d9
            r9 = r13[r6]
            r12 = r24[r6]
            r12 = r12[r7]
            if (r12 != r15) goto L_0x04d3
            r12 = 1
            goto L_0x04d4
        L_0x04d3:
            r12 = 0
        L_0x04d4:
            r9[r7] = r12
            int r7 = r7 + 1
            goto L_0x04c5
        L_0x04d9:
            r7 = 1
            r14[r6] = r7
            goto L_0x04b9
        L_0x04dd:
            r9 = 0
            r12 = r13[r9]
            r12[r9] = r7
            r14[r9] = r7
        L_0x04e4:
            int r6 = r6 + 1
            r15 = r21
            r9 = r28
            r12 = r29
            r7 = r30
            goto L_0x0499
        L_0x04ef:
            r30 = r7
            r28 = r9
            r29 = r12
            r21 = r15
            r7 = 1
            r9 = 0
            int[] r6 = new int[r4]
            r12 = 2
            int[] r15 = new int[r12]
            r15[r7] = r4
            r15[r9] = r8
            java.lang.Class r4 = java.lang.Boolean.TYPE
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r15)
            boolean[][] r4 = (boolean[][]) r4
            r7 = 0
            r9 = 1
        L_0x050c:
            if (r9 >= r8) goto L_0x0602
            if (r11 != r12) goto L_0x0532
            r12 = 0
        L_0x0511:
            r15 = r23[r9]
            if (r12 >= r15) goto L_0x0532
            r15 = r13[r9]
            boolean r22 = r0.zzh()
            r15[r12] = r22
            r15 = r14[r9]
            r22 = r13[r9]
            boolean r22 = r22[r12]
            int r15 = r15 + r22
            r14[r9] = r15
            if (r22 == 0) goto L_0x052f
            r15 = r24[r9]
            r15 = r15[r12]
            r10[r9] = r15
        L_0x052f:
            int r12 = r12 + 1
            goto L_0x0511
        L_0x0532:
            if (r7 != 0) goto L_0x0565
            r7 = r24[r9]
            r12 = 0
            r7 = r7[r12]
            if (r7 != 0) goto L_0x055f
            r7 = r13[r9]
            boolean r7 = r7[r12]
            if (r7 == 0) goto L_0x055f
            r7 = 0
            r15 = 1
        L_0x0543:
            r12 = r23[r9]
            if (r15 >= r12) goto L_0x0565
            r12 = r24[r9]
            r12 = r12[r15]
            r22 = r11
            r11 = r27
            if (r12 != r11) goto L_0x0558
            r12 = r13[r9]
            boolean r12 = r12[r11]
            if (r12 == 0) goto L_0x0558
            r7 = r9
        L_0x0558:
            int r15 = r15 + 1
            r27 = r11
            r11 = r22
            goto L_0x0543
        L_0x055f:
            r22 = r11
            r11 = r27
            r7 = 0
            goto L_0x0569
        L_0x0565:
            r22 = r11
            r11 = r27
        L_0x0569:
            r12 = 0
        L_0x056a:
            r15 = r23[r9]
            if (r12 >= r15) goto L_0x05e1
            r15 = 1
            if (r1 <= r15) goto L_0x05d0
            r15 = r4[r9]
            r27 = r13[r9]
            boolean r27 = r27[r12]
            r15[r12] = r27
            r15 = r10
            r27 = r11
            double r10 = (double) r1
            r31 = r1
            java.math.RoundingMode r1 = java.math.RoundingMode.CEILING
            int r1 = com.google.android.gms.internal.ads.zzgag.zza(r10, r1)
            r10 = r4[r9]
            boolean r10 = r10[r12]
            if (r10 != 0) goto L_0x05b9
            r10 = r24[r9]
            r10 = r10[r12]
            java.lang.Object r10 = r3.get(r10)
            com.google.android.gms.internal.ads.zzex r10 = (com.google.android.gms.internal.ads.zzex) r10
            int r10 = r10.zza
            r11 = 0
        L_0x0598:
            if (r11 >= r12) goto L_0x05b9
            r32 = r24[r9]
            r33 = r13
            r13 = r32[r11]
            java.lang.Object r13 = r3.get(r13)
            com.google.android.gms.internal.ads.zzex r13 = (com.google.android.gms.internal.ads.zzex) r13
            int r13 = r13.zza
            r32 = r37[r10]
            boolean r13 = r32[r13]
            if (r13 == 0) goto L_0x05b4
            r10 = r4[r9]
            r11 = 1
            r10[r12] = r11
            goto L_0x05bb
        L_0x05b4:
            int r11 = r11 + 1
            r13 = r33
            goto L_0x0598
        L_0x05b9:
            r33 = r13
        L_0x05bb:
            r10 = r4[r9]
            boolean r10 = r10[r12]
            if (r10 == 0) goto L_0x05d7
            if (r7 <= 0) goto L_0x05cc
            if (r9 != r7) goto L_0x05cc
            int r1 = r0.zza(r1)
            r6[r12] = r1
            goto L_0x05d7
        L_0x05cc:
            r0.zzf(r1)
            goto L_0x05d7
        L_0x05d0:
            r31 = r1
            r15 = r10
            r27 = r11
            r33 = r13
        L_0x05d7:
            int r12 = r12 + 1
            r10 = r15
            r11 = r27
            r1 = r31
            r13 = r33
            goto L_0x056a
        L_0x05e1:
            r31 = r1
            r15 = r10
            r27 = r11
            r33 = r13
            r1 = r14[r9]
            r10 = 1
            if (r1 != r10) goto L_0x05f6
            r1 = r15[r9]
            r1 = r26[r1]
            if (r1 <= 0) goto L_0x05f6
            r0.zze()
        L_0x05f6:
            int r9 = r9 + 1
            r10 = r15
            r11 = r22
            r1 = r31
            r13 = r33
            r12 = 2
            goto L_0x050c
        L_0x0602:
            if (r7 != 0) goto L_0x0612
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x0612:
            int r1 = r0.zzc()
            int r5 = r1 + 1
            com.google.android.gms.internal.ads.zzfxk r7 = com.google.android.gms.internal.ads.zzfxn.zzi(r5)
            r9 = r30
            int[] r10 = new int[r9]
            r11 = 0
        L_0x0621:
            if (r11 >= r5) goto L_0x0695
            r12 = 16
            int r13 = r0.zza(r12)
            int r14 = r0.zza(r12)
            boolean r15 = r0.zzh()
            if (r15 == 0) goto L_0x064c
            r15 = 2
            int r12 = r0.zza(r15)
            r15 = 3
            if (r12 != r15) goto L_0x063e
            r0.zze()
        L_0x063e:
            r15 = 4
            int r22 = r0.zza(r15)
            int r24 = r0.zza(r15)
            r32 = r22
            r33 = r24
            goto L_0x0651
        L_0x064c:
            r12 = 0
            r32 = 0
            r33 = 0
        L_0x0651:
            boolean r15 = r0.zzh()
            if (r15 == 0) goto L_0x0676
            int r15 = r0.zzc()
            r37 = r3
            int r3 = r0.zzc()
            r22 = r2
            int r2 = r0.zzc()
            r24 = r6
            int r6 = r0.zzc()
            int r13 = zzk(r13, r12, r15, r3)
            int r14 = zzj(r14, r12, r2, r6)
            goto L_0x067c
        L_0x0676:
            r22 = r2
            r37 = r3
            r24 = r6
        L_0x067c:
            r34 = r13
            r35 = r14
            com.google.android.gms.internal.ads.zzfb r2 = new com.google.android.gms.internal.ads.zzfb
            r30 = r2
            r31 = r12
            r30.<init>(r31, r32, r33, r34, r35)
            r7.zzf(r2)
            int r11 = r11 + 1
            r3 = r37
            r2 = r22
            r6 = r24
            goto L_0x0621
        L_0x0695:
            r22 = r2
            r37 = r3
            r24 = r6
            r2 = 1
            if (r5 <= r2) goto L_0x06b7
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x06b7
            double r1 = (double) r5
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            int r1 = com.google.android.gms.internal.ads.zzgag.zza(r1, r3)
            r2 = 1
        L_0x06ac:
            if (r2 >= r9) goto L_0x06c3
            int r3 = r0.zza(r1)
            r10[r2] = r3
            int r2 = r2 + 1
            goto L_0x06ac
        L_0x06b7:
            r2 = 1
        L_0x06b8:
            if (r2 >= r9) goto L_0x06c3
            int r3 = java.lang.Math.min(r2, r1)
            r10[r2] = r3
            int r2 = r2 + 1
            goto L_0x06b8
        L_0x06c3:
            com.google.android.gms.internal.ads.zzfc r5 = new com.google.android.gms.internal.ads.zzfc
            com.google.android.gms.internal.ads.zzfxn r1 = r7.zzi()
            r5.<init>(r1, r10)
            r1 = 2
            r0.zzf(r1)
            r1 = 1
        L_0x06d1:
            if (r1 >= r9) goto L_0x06df
            r2 = r25[r1]
            r2 = r26[r2]
            if (r2 != 0) goto L_0x06dc
            r0.zze()
        L_0x06dc:
            int r1 = r1 + 1
            goto L_0x06d1
        L_0x06df:
            r1 = 1
        L_0x06e0:
            if (r1 >= r8) goto L_0x0718
            boolean r2 = r0.zzh()
            r3 = 0
        L_0x06e7:
            r6 = r29[r1]
            if (r3 >= r6) goto L_0x0715
            if (r3 <= 0) goto L_0x06f4
            if (r2 == 0) goto L_0x06f4
            boolean r6 = r0.zzh()
            goto L_0x06f9
        L_0x06f4:
            if (r3 != 0) goto L_0x06f8
            r6 = 1
            goto L_0x06f9
        L_0x06f8:
            r6 = 0
        L_0x06f9:
            if (r6 == 0) goto L_0x0712
            r6 = 0
        L_0x06fc:
            r7 = r23[r1]
            if (r6 >= r7) goto L_0x070c
            r7 = r4[r1]
            boolean r7 = r7[r6]
            if (r7 == 0) goto L_0x0709
            r0.zzc()
        L_0x0709:
            int r6 = r6 + 1
            goto L_0x06fc
        L_0x070c:
            r0.zzc()
            r0.zzc()
        L_0x0712:
            int r3 = r3 + 1
            goto L_0x06e7
        L_0x0715:
            int r1 = r1 + 1
            goto L_0x06e0
        L_0x0718:
            int r1 = r0.zzc()
            r14 = 2
            int r1 = r1 + r14
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x0728
            r0.zzf(r1)
            goto L_0x073d
        L_0x0728:
            r2 = 1
        L_0x0729:
            if (r2 >= r9) goto L_0x073d
            r3 = 0
        L_0x072c:
            if (r3 >= r2) goto L_0x073a
            r4 = r28[r2]
            boolean r4 = r4[r3]
            if (r4 == 0) goto L_0x0737
            r0.zzf(r1)
        L_0x0737:
            int r3 = r3 + 1
            goto L_0x072c
        L_0x073a:
            int r2 = r2 + 1
            goto L_0x0729
        L_0x073d:
            int r1 = r0.zzc()
            r2 = 1
        L_0x0742:
            if (r2 > r1) goto L_0x074c
            r3 = 8
            r0.zzf(r3)
            int r2 = r2 + 1
            goto L_0x0742
        L_0x074c:
            boolean r1 = r0.zzh()
            if (r1 == 0) goto L_0x0802
            r0.zzd()
            boolean r1 = r0.zzh()
            if (r1 != 0) goto L_0x0761
            boolean r1 = r0.zzh()
            if (r1 == 0) goto L_0x0764
        L_0x0761:
            r0.zze()
        L_0x0764:
            boolean r1 = r0.zzh()
            boolean r2 = r0.zzh()
            if (r1 != 0) goto L_0x0770
            if (r2 == 0) goto L_0x079e
        L_0x0770:
            r15 = r21
            r3 = 0
        L_0x0773:
            if (r3 >= r15) goto L_0x079e
            r4 = 0
        L_0x0776:
            r6 = r29[r3]
            if (r4 >= r6) goto L_0x079b
            if (r1 == 0) goto L_0x0781
            boolean r6 = r0.zzh()
            goto L_0x0782
        L_0x0781:
            r6 = 0
        L_0x0782:
            if (r2 == 0) goto L_0x0789
            boolean r7 = r0.zzh()
            goto L_0x078a
        L_0x0789:
            r7 = 0
        L_0x078a:
            if (r6 == 0) goto L_0x0791
            r6 = 32
            r0.zzf(r6)
        L_0x0791:
            if (r7 == 0) goto L_0x0798
            r6 = 18
            r0.zzf(r6)
        L_0x0798:
            int r4 = r4 + 1
            goto L_0x0776
        L_0x079b:
            int r3 = r3 + 1
            goto L_0x0773
        L_0x079e:
            boolean r1 = r0.zzh()
            if (r1 == 0) goto L_0x07ac
            r2 = 4
            int r3 = r0.zza(r2)
            r2 = 1
            int r3 = r3 + r2
            goto L_0x07ae
        L_0x07ac:
            r2 = 1
            r3 = r9
        L_0x07ae:
            com.google.android.gms.internal.ads.zzfxk r4 = com.google.android.gms.internal.ads.zzfxn.zzi(r3)
            int[] r6 = new int[r9]
            r7 = 0
        L_0x07b5:
            if (r7 >= r3) goto L_0x07e5
            r8 = 3
            r0.zzf(r8)
            boolean r10 = r0.zzh()
            if (r2 == r10) goto L_0x07c3
            r2 = 2
            goto L_0x07c4
        L_0x07c3:
            r2 = 1
        L_0x07c4:
            r10 = 8
            int r11 = r0.zza(r10)
            int r11 = com.google.android.gms.internal.ads.zzk.zza(r11)
            int r12 = r0.zza(r10)
            int r12 = com.google.android.gms.internal.ads.zzk.zzb(r12)
            r0.zzf(r10)
            com.google.android.gms.internal.ads.zzff r13 = new com.google.android.gms.internal.ads.zzff
            r13.<init>(r11, r2, r12)
            r4.zzf(r13)
            int r7 = r7 + 1
            r2 = 1
            goto L_0x07b5
        L_0x07e5:
            if (r1 == 0) goto L_0x07f7
            r1 = 1
            if (r3 <= r1) goto L_0x07f7
            r14 = 0
        L_0x07eb:
            if (r14 >= r9) goto L_0x07f7
            r1 = 4
            int r2 = r0.zza(r1)
            r6[r14] = r2
            int r14 = r14 + 1
            goto L_0x07eb
        L_0x07f7:
            com.google.android.gms.internal.ads.zzfg r0 = new com.google.android.gms.internal.ads.zzfg
            com.google.android.gms.internal.ads.zzfxn r1 = r4.zzi()
            r0.<init>(r1, r6)
            r6 = r0
            goto L_0x0803
        L_0x0802:
            r6 = 0
        L_0x0803:
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            com.google.android.gms.internal.ads.zzfa r4 = new com.google.android.gms.internal.ads.zzfa
            r1 = r19
            r2 = r24
            r4.<init>(r1, r2)
            r1 = r0
            r2 = r22
            r3 = r37
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x0817:
            r22 = r2
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r2 = r22
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x0828:
            r22 = r2
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r2 = r22
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0849
        L_0x0839:
            r22 = r2
            com.google.android.gms.internal.ads.zzfh r0 = new com.google.android.gms.internal.ads.zzfh
            r6 = 0
            r7 = 0
            r3 = 0
            r1 = r0
            r2 = r22
            r4 = r5
            r5 = r6
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0849:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfk.zzd(byte[], int, int):com.google.android.gms.internal.ads.zzfh");
    }

    public static zzfi zze(byte[] bArr, int i, int i2) {
        zzfl zzfl = new zzfl(bArr, 4, i2);
        int zzc2 = zzfl.zzc();
        int zzc3 = zzfl.zzc();
        zzfl.zze();
        return new zzfi(zzc2, zzc3, zzfl.zzh());
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzfj zzf(byte[] r32, int r33, int r34) {
        /*
            com.google.android.gms.internal.ads.zzfl r0 = new com.google.android.gms.internal.ads.zzfl
            r1 = r32
            r2 = r33
            r3 = r34
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r2 = r0.zza(r1)
            int r5 = r0.zza(r1)
            int r6 = r0.zza(r1)
            int r7 = r0.zzc()
            r3 = 86
            r4 = 44
            r8 = 122(0x7a, float:1.71E-43)
            r9 = 110(0x6e, float:1.54E-43)
            r10 = 244(0xf4, float:3.42E-43)
            r11 = 3
            r12 = 16
            r14 = 1
            r15 = 100
            if (r2 == r15) goto L_0x0054
            if (r2 == r9) goto L_0x0054
            if (r2 == r8) goto L_0x0054
            if (r2 == r10) goto L_0x0054
            if (r2 == r4) goto L_0x0054
            r13 = 83
            if (r2 == r13) goto L_0x0054
            if (r2 == r3) goto L_0x0054
            r13 = 118(0x76, float:1.65E-43)
            if (r2 == r13) goto L_0x0054
            r13 = 128(0x80, float:1.794E-43)
            if (r2 == r13) goto L_0x0054
            r13 = 138(0x8a, float:1.93E-43)
            if (r2 != r13) goto L_0x004c
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x0054
        L_0x004c:
            r13 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            goto L_0x00b3
        L_0x0054:
            int r13 = r0.zzc()
            if (r13 != r11) goto L_0x0060
            boolean r16 = r0.zzh()
            r1 = 3
            goto L_0x0063
        L_0x0060:
            r1 = r13
            r16 = 0
        L_0x0063:
            int r17 = r0.zzc()
            int r18 = r0.zzc()
            r0.zze()
            boolean r19 = r0.zzh()
            if (r19 == 0) goto L_0x00b3
            if (r1 == r11) goto L_0x0079
            r1 = 8
            goto L_0x007b
        L_0x0079:
            r1 = 12
        L_0x007b:
            r10 = 0
        L_0x007c:
            if (r10 >= r1) goto L_0x00b3
            boolean r19 = r0.zzh()
            if (r19 == 0) goto L_0x00aa
            r8 = 6
            if (r10 >= r8) goto L_0x008a
            r8 = 16
            goto L_0x008c
        L_0x008a:
            r8 = 64
        L_0x008c:
            r9 = 0
            r20 = 8
            r21 = 8
        L_0x0091:
            if (r9 >= r8) goto L_0x00aa
            if (r20 == 0) goto L_0x00a1
            int r20 = r0.zzb()
            int r15 = r21 + r20
            int r15 = r15 + 256
            int r15 = r15 % 256
            r20 = r15
        L_0x00a1:
            if (r20 == 0) goto L_0x00a5
            r21 = r20
        L_0x00a5:
            int r9 = r9 + 1
            r15 = 100
            goto L_0x0091
        L_0x00aa:
            int r10 = r10 + 1
            r8 = 122(0x7a, float:1.71E-43)
            r9 = 110(0x6e, float:1.54E-43)
            r15 = 100
            goto L_0x007c
        L_0x00b3:
            int r1 = r0.zzc()
            int r1 = r1 + 4
            int r8 = r0.zzc()
            if (r8 != 0) goto L_0x00cc
            int r9 = r0.zzc()
            int r9 = r9 + 4
            r24 = r8
            r25 = r9
        L_0x00c9:
            r26 = 0
            goto L_0x00f5
        L_0x00cc:
            if (r8 != r14) goto L_0x00f0
            boolean r8 = r0.zzh()
            r0.zzb()
            r0.zzb()
            int r9 = r0.zzc()
            long r9 = (long) r9
            r15 = 0
        L_0x00de:
            long r3 = (long) r15
            int r24 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r24 >= 0) goto L_0x00e9
            r0.zzc()
            int r15 = r15 + 1
            goto L_0x00de
        L_0x00e9:
            r26 = r8
            r24 = 1
            r25 = 0
            goto L_0x00f5
        L_0x00f0:
            r24 = r8
            r25 = 0
            goto L_0x00c9
        L_0x00f5:
            int r8 = r0.zzc()
            r0.zze()
            int r3 = r0.zzc()
            int r3 = r3 + r14
            int r4 = r0.zzc()
            int r4 = r4 + r14
            boolean r15 = r0.zzh()
            int r9 = 2 - r15
            if (r15 != 0) goto L_0x0111
            r0.zze()
        L_0x0111:
            int r4 = r4 * r9
            r0.zze()
            int r3 = r3 * 16
            int r4 = r4 * 16
            boolean r10 = r0.zzh()
            r27 = 2
            if (r10 == 0) goto L_0x0150
            int r10 = r0.zzc()
            int r28 = r0.zzc()
            int r29 = r0.zzc()
            int r30 = r0.zzc()
            if (r13 != 0) goto L_0x0137
            r31 = 1
            goto L_0x0145
        L_0x0137:
            if (r13 != r11) goto L_0x013c
            r31 = 1
            goto L_0x013e
        L_0x013c:
            r31 = 2
        L_0x013e:
            if (r13 != r14) goto L_0x0142
            r13 = 2
            goto L_0x0143
        L_0x0142:
            r13 = 1
        L_0x0143:
            int r9 = r9 * r13
        L_0x0145:
            int r10 = r10 + r28
            int r10 = r10 * r31
            int r3 = r3 - r10
            int r29 = r29 + r30
            int r29 = r29 * r9
            int r4 = r4 - r29
        L_0x0150:
            r9 = r3
            r10 = r4
            r3 = 44
            if (r2 == r3) goto L_0x016c
            r3 = 86
            if (r2 == r3) goto L_0x016c
            r3 = 100
            if (r2 == r3) goto L_0x016c
            r3 = 110(0x6e, float:1.54E-43)
            if (r2 == r3) goto L_0x016c
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 == r3) goto L_0x016c
            r3 = 244(0xf4, float:3.42E-43)
            if (r2 != r3) goto L_0x0173
            r2 = 244(0xf4, float:3.42E-43)
        L_0x016c:
            r3 = r5 & 16
            if (r3 == 0) goto L_0x0173
            r4 = r2
            r13 = 0
            goto L_0x0176
        L_0x0173:
            r4 = r2
            r13 = 16
        L_0x0176:
            boolean r2 = r0.zzh()
            r19 = -1
            if (r2 == 0) goto L_0x025b
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x01bb
            r2 = 8
            int r3 = r0.zza(r2)
            r2 = 255(0xff, float:3.57E-43)
            if (r3 != r2) goto L_0x019f
            int r2 = r0.zza(r12)
            int r3 = r0.zza(r12)
            if (r2 == 0) goto L_0x01bb
            if (r3 == 0) goto L_0x01bb
            float r2 = (float) r2
            float r3 = (float) r3
            float r3 = r2 / r3
            goto L_0x01bd
        L_0x019f:
            r2 = 17
            if (r3 >= r2) goto L_0x01a8
            float[] r2 = zzb
            r3 = r2[r3]
            goto L_0x01bd
        L_0x01a8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r12 = "Unexpected aspect_ratio_idc value: "
            r2.<init>(r12)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NalUnitUtil"
            com.google.android.gms.internal.ads.zzdo.zzf(r3, r2)
        L_0x01bb:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x01bd:
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x01c6
            r0.zze()
        L_0x01c6:
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x01f9
            r0.zzf(r11)
            boolean r2 = r0.zzh()
            if (r14 == r2) goto L_0x01d6
            r14 = 2
        L_0x01d6:
            boolean r2 = r0.zzh()
            if (r2 == 0) goto L_0x01f7
            r2 = 8
            int r11 = r0.zza(r2)
            int r12 = r0.zza(r2)
            r0.zzf(r2)
            int r19 = com.google.android.gms.internal.ads.zzk.zza(r11)
            int r2 = com.google.android.gms.internal.ads.zzk.zzb(r12)
            r11 = r2
            r2 = r19
            r19 = r14
            goto L_0x01fb
        L_0x01f7:
            r19 = r14
        L_0x01f9:
            r2 = -1
            r11 = -1
        L_0x01fb:
            boolean r12 = r0.zzh()
            if (r12 == 0) goto L_0x0207
            r0.zzc()
            r0.zzc()
        L_0x0207:
            boolean r12 = r0.zzh()
            if (r12 == 0) goto L_0x0212
            r12 = 65
            r0.zzf(r12)
        L_0x0212:
            boolean r12 = r0.zzh()
            if (r12 == 0) goto L_0x021b
            zzn(r0)
        L_0x021b:
            boolean r14 = r0.zzh()
            if (r14 == 0) goto L_0x0224
            zzn(r0)
        L_0x0224:
            if (r12 != 0) goto L_0x0228
            if (r14 == 0) goto L_0x022b
        L_0x0228:
            r0.zze()
        L_0x022b:
            r0.zze()
            boolean r12 = r0.zzh()
            if (r12 == 0) goto L_0x0251
            r0.zze()
            r0.zzc()
            r0.zzc()
            r0.zzc()
            r0.zzc()
            int r12 = r0.zzc()
            r0.zzc()
            r20 = r2
            r22 = r11
            r23 = r12
            goto L_0x0257
        L_0x0251:
            r20 = r2
            r22 = r11
            r23 = r13
        L_0x0257:
            r21 = r19
            r11 = r3
            goto L_0x0265
        L_0x025b:
            r23 = r13
            r11 = 1065353216(0x3f800000, float:1.0)
            r20 = -1
            r21 = -1
            r22 = -1
        L_0x0265:
            com.google.android.gms.internal.ads.zzfj r0 = new com.google.android.gms.internal.ads.zzfj
            r3 = r0
            r12 = r17
            r13 = r18
            r14 = r16
            r16 = r1
            r17 = r24
            r18 = r25
            r19 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfk.zzf(byte[], int, int):com.google.android.gms.internal.ads.zzfj");
    }

    public static String zzg(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                zzfxk zzfxk = new zzfxk();
                int i2 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i2 >= length2) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, length2, zArr);
                    if (zza2 != length2) {
                        zzfxk.zzf(Integer.valueOf(zza2));
                    }
                    i2 = zza2 + 3;
                }
                zzfxn zzi = zzfxk.zzi();
                for (int i3 = 0; i3 < zzi.size(); i3++) {
                    if (((Integer) zzi.get(i3)).intValue() + 3 < length) {
                        zzfl zzfl = new zzfl(bArr, ((Integer) zzi.get(i3)).intValue() + 3, length);
                        zzey zzl = zzl(zzfl);
                        if (zzl.zza == 33 && zzl.zzb == 0) {
                            zzfl.zzf(4);
                            int zza3 = zzfl.zza(3);
                            zzfl.zze();
                            zzez zzm = zzm(zzfl, true, zza3, (zzez) null);
                            return zzcy.zzd(zzm.zza, zzm.zzb, zzm.zzc, zzm.zzd, zzm.zze, zzm.zzf);
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void zzh(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean zzi(byte b) {
        if (((b & 96) >> 5) != 0) {
            return true;
        }
        byte b2 = b & Ascii.US;
        return (b2 == 1 || b2 == 9 || b2 == 14) ? false : true;
    }

    private static int zzj(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 == 1) {
            i5 = 2;
        }
        return i - (i5 * (i3 + i4));
    }

    private static int zzk(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (!(i2 == 1 || i2 == 2)) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    private static zzey zzl(zzfl zzfl) {
        zzfl.zze();
        return new zzey(zzfl.zza(6), zzfl.zza(6), zzfl.zza(3) - 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzez zzm(com.google.android.gms.internal.ads.zzfl r18, boolean r19, int r20, com.google.android.gms.internal.ads.zzez r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L_0x003c
            r2 = 2
            int r2 = r0.zza(r2)
            boolean r7 = r18.zzh()
            r8 = 5
            int r8 = r0.zza(r8)
            r9 = 0
            r10 = 0
        L_0x001e:
            r11 = 32
            if (r9 >= r11) goto L_0x002e
            boolean r11 = r18.zzh()
            if (r11 == 0) goto L_0x002b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L_0x002b:
            int r9 = r9 + 1
            goto L_0x001e
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 >= r3) goto L_0x003a
            int r11 = r0.zza(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L_0x002f
        L_0x003a:
            r12 = r2
            goto L_0x0049
        L_0x003c:
            if (r2 == 0) goto L_0x004f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
        L_0x0049:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L_0x0055
        L_0x004f:
            r16 = r4
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0055:
            int r17 = r0.zza(r5)
            r2 = 0
        L_0x005a:
            if (r6 >= r1) goto L_0x006f
            boolean r3 = r18.zzh()
            if (r3 == 0) goto L_0x0064
            int r2 = r2 + 88
        L_0x0064:
            boolean r3 = r18.zzh()
            if (r3 == 0) goto L_0x006c
            int r2 = r2 + 8
        L_0x006c:
            int r6 = r6 + 1
            goto L_0x005a
        L_0x006f:
            r0.zzf(r2)
            if (r1 <= 0) goto L_0x0079
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzf(r5)
        L_0x0079:
            com.google.android.gms.internal.ads.zzez r0 = new com.google.android.gms.internal.ads.zzez
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfk.zzm(com.google.android.gms.internal.ads.zzfl, boolean, int, com.google.android.gms.internal.ads.zzez):com.google.android.gms.internal.ads.zzez");
    }

    private static void zzn(zzfl zzfl) {
        int zzc2 = zzfl.zzc() + 1;
        zzfl.zzf(8);
        for (int i = 0; i < zzc2; i++) {
            zzfl.zzc();
            zzfl.zzc();
            zzfl.zze();
        }
        zzfl.zzf(20);
    }

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    int i5 = i3 + 1;
                    if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                        break;
                    }
                    i3 = i5;
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < i4) {
                try {
                    int i9 = zzd[i6] - i7;
                    System.arraycopy(bArr, i7, bArr, i8, i9);
                    int i10 = i8 + i9;
                    int i11 = i10 + 1;
                    bArr[i10] = 0;
                    i8 = i10 + 2;
                    bArr[i11] = 0;
                    i7 += i9 + 3;
                    i6++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            System.arraycopy(bArr, i7, bArr, i8, i2 - i8);
        }
        return i2;
    }
}
