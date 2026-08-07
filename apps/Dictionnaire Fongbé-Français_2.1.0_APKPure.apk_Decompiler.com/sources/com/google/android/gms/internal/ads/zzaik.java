package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaik {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);

    static {
        int i = zzei.zza;
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    public static zzay zzb(zzen zzen) {
        zzem zzem;
        zzeo zzb2 = zzen.zzb(1751411826);
        zzeo zzb3 = zzen.zzb(1801812339);
        zzeo zzb4 = zzen.zzb(1768715124);
        if (!(zzb2 == null || zzb3 == null || zzb4 == null || zzi(zzb2.zza) != 1835299937)) {
            zzdy zzdy = zzb3.zza;
            zzdy.zzL(12);
            int zzg = zzdy.zzg();
            String[] strArr = new String[zzg];
            for (int i = 0; i < zzg; i++) {
                int zzg2 = zzdy.zzg();
                zzdy.zzM(4);
                strArr[i] = zzdy.zzB(zzg2 - 8, StandardCharsets.UTF_8);
            }
            zzdy zzdy2 = zzb4.zza;
            zzdy2.zzL(8);
            ArrayList arrayList = new ArrayList();
            while (zzdy2.zzb() > 8) {
                int zzd = zzdy2.zzd() + zzdy2.zzg();
                int zzg3 = zzdy2.zzg() - 1;
                if (zzg3 < 0 || zzg3 >= zzg) {
                    zzdo.zzf("BoxParsers", "Skipped metadata with unknown key index: " + zzg3);
                } else {
                    String str = strArr[zzg3];
                    while (true) {
                        int zzd2 = zzdy2.zzd();
                        if (zzd2 >= zzd) {
                            zzem = null;
                            break;
                        }
                        int zzg4 = zzdy2.zzg();
                        if (zzdy2.zzg() == 1684108385) {
                            int zzg5 = zzdy2.zzg();
                            int zzg6 = zzdy2.zzg();
                            int i2 = zzg4 - 16;
                            byte[] bArr = new byte[i2];
                            zzdy2.zzH(bArr, 0, i2);
                            zzem = new zzem(str, bArr, zzg6, zzg5);
                            break;
                        }
                        zzdy2.zzL(zzd2 + zzg4);
                    }
                    if (zzem != null) {
                        arrayList.add(zzem);
                    }
                }
                zzdy2.zzL(zzd);
            }
            if (!arrayList.isEmpty()) {
                return new zzay((List) arrayList);
            }
        }
        return null;
    }

    public static zzay zzc(zzeo zzeo) {
        int i;
        zzdy zzdy = zzeo.zza;
        zzdy.zzL(8);
        zzay zzay = new zzay(-9223372036854775807L, new zzax[0]);
        while (zzdy.zzb() >= 8) {
            int zzd = zzdy.zzd();
            int zzg = zzdy.zzg() + zzd;
            int zzg2 = zzdy.zzg();
            zzay zzay2 = null;
            if (zzg2 == 1835365473) {
                zzdy.zzL(zzd);
                zzdy.zzM(8);
                zzg(zzdy);
                while (true) {
                    if (zzdy.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzdy.zzd();
                    int zzg3 = zzdy.zzg() + zzd2;
                    if (zzdy.zzg() == 1768715124) {
                        zzdy.zzL(zzd2);
                        zzdy.zzM(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzdy.zzd() < zzg3) {
                            zzax zza2 = zzais.zza(zzdy);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzay2 = new zzay((List) arrayList);
                        }
                    } else {
                        zzdy.zzL(zzg3);
                    }
                }
                zzay = zzay.zzd(zzay2);
            } else if (zzg2 == 1936553057) {
                zzdy.zzL(zzd);
                zzdy.zzM(12);
                while (true) {
                    if (zzdy.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzdy.zzd();
                    int zzg4 = zzdy.zzg();
                    if (zzdy.zzg() != 1935766900) {
                        zzdy.zzL(zzd3 + zzg4);
                    } else if (zzg4 >= 16) {
                        zzdy.zzM(4);
                        int i2 = -1;
                        int i3 = 0;
                        for (int i4 = 0; i4 < 2; i4++) {
                            int zzm = zzdy.zzm();
                            int zzm2 = zzdy.zzm();
                            if (zzm == 0) {
                                i2 = zzm2;
                            } else if (zzm == 1) {
                                i3 = zzm2;
                            }
                        }
                        if (i2 == 12) {
                            i = 240;
                        } else if (i2 == 13) {
                            i = 120;
                        } else {
                            if (i2 == 21 && zzdy.zzb() >= 8 && zzdy.zzd() + 8 <= zzg) {
                                int zzg5 = zzdy.zzg();
                                int zzg6 = zzdy.zzg();
                                if (zzg5 >= 12 && zzg6 == 1936877170) {
                                    i = zzdy.zzn();
                                }
                            }
                            i = -2147483647;
                        }
                        if (i != -2147483647) {
                            zzay2 = new zzay(-9223372036854775807L, new zzahc((float) i, i3));
                        }
                    }
                }
                zzay = zzay.zzd(zzay2);
            } else if (zzg2 == -1451722374) {
                zzay = zzay.zzd(zzl(zzdy));
            }
            zzdy.zzL(zzg);
        }
        return zzay;
    }

    public static zzew zzd(zzdy zzdy) {
        long j;
        long j2;
        zzdy.zzL(8);
        if (zza(zzdy.zzg()) == 0) {
            j2 = zzdy.zzu();
            j = zzdy.zzu();
        } else {
            j2 = zzdy.zzt();
            j = zzdy.zzt();
        }
        return new zzew(j2, j, zzdy.zzu());
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x02a1 A[LOOP:7: B:105:0x02a1->B:109:0x02ab, LOOP_START, PHI: r16 
      PHI: (r16v27 int) = (r16v15 int), (r16v28 int) binds: [B:104:0x029f, B:109:0x02ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0298 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaje zze(com.google.android.gms.internal.ads.zzajb r43, com.google.android.gms.internal.ads.zzen r44, com.google.android.gms.internal.ads.zzadb r45) throws com.google.android.gms.internal.ads.zzbc {
        /*
            r1 = r43
            r0 = r44
            r2 = r45
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.gms.internal.ads.zzeo r3 = r0.zzb(r3)
            if (r3 == 0) goto L_0x0017
            com.google.android.gms.internal.ads.zzab r5 = r1.zzg
            com.google.android.gms.internal.ads.zzaig r6 = new com.google.android.gms.internal.ads.zzaig
            r6.<init>(r3, r5)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.gms.internal.ads.zzeo r3 = r0.zzb(r3)
            if (r3 == 0) goto L_0x063f
            com.google.android.gms.internal.ads.zzaih r6 = new com.google.android.gms.internal.ads.zzaih
            r6.<init>(r3)
        L_0x0025:
            int r3 = r6.zzb()
            r5 = 0
            if (r3 != 0) goto L_0x0043
            com.google.android.gms.internal.ads.zzaje r9 = new com.google.android.gms.internal.ads.zzaje
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = 0
            r4 = 0
            r0 = r9
            r1 = r43
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0043:
            int r7 = r1.zzb
            r8 = 2
            r9 = 0
            if (r7 != r8) goto L_0x0068
            long r11 = r1.zzf
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0068
            float r7 = (float) r3
            float r11 = (float) r11
            com.google.android.gms.internal.ads.zzab r12 = r1.zzg
            com.google.android.gms.internal.ads.zzz r12 = r12.zzb()
            r13 = 1232348160(0x49742400, float:1000000.0)
            float r11 = r11 / r13
            float r7 = r7 / r11
            r12.zzI(r7)
            com.google.android.gms.internal.ads.zzab r7 = r12.zzag()
            com.google.android.gms.internal.ads.zzajb r1 = r1.zza(r7)
        L_0x0068:
            r12 = r1
            r1 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.gms.internal.ads.zzeo r1 = r0.zzb(r1)
            if (r1 != 0) goto L_0x0081
            r1 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.gms.internal.ads.zzeo r1 = r0.zzb(r1)
            r1.getClass()
            r11 = r1
            com.google.android.gms.internal.ads.zzeo r11 = (com.google.android.gms.internal.ads.zzeo) r11
            r11 = 1
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            r13 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.gms.internal.ads.zzeo r13 = r0.zzb(r13)
            r13.getClass()
            r14 = r13
            com.google.android.gms.internal.ads.zzeo r14 = (com.google.android.gms.internal.ads.zzeo) r14
            com.google.android.gms.internal.ads.zzdy r13 = r13.zza
            r14 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.gms.internal.ads.zzeo r14 = r0.zzb(r14)
            r14.getClass()
            r15 = r14
            com.google.android.gms.internal.ads.zzeo r15 = (com.google.android.gms.internal.ads.zzeo) r15
            com.google.android.gms.internal.ads.zzdy r14 = r14.zza
            r15 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.gms.internal.ads.zzeo r15 = r0.zzb(r15)
            if (r15 == 0) goto L_0x00ac
            com.google.android.gms.internal.ads.zzdy r15 = r15.zza
            goto L_0x00ad
        L_0x00ac:
            r15 = 0
        L_0x00ad:
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.gms.internal.ads.zzeo r0 = r0.zzb(r4)
            if (r0 == 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzdy r0 = r0.zza
            goto L_0x00ba
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            com.google.android.gms.internal.ads.zzdy r1 = r1.zza
            com.google.android.gms.internal.ads.zzahz r4 = new com.google.android.gms.internal.ads.zzahz
            r4.<init>(r13, r1, r11)
            r1 = 12
            r14.zzL(r1)
            int r11 = r14.zzp()
            r13 = -1
            int r11 = r11 + r13
            int r17 = r14.zzp()
            int r9 = r14.zzp()
            if (r0 == 0) goto L_0x00de
            r0.zzL(r1)
            int r10 = r0.zzp()
            goto L_0x00df
        L_0x00de:
            r10 = 0
        L_0x00df:
            if (r15 == 0) goto L_0x00f3
            r15.zzL(r1)
            int r1 = r15.zzp()
            if (r1 <= 0) goto L_0x00f1
            int r16 = r15.zzp()
            int r16 = r16 + -1
            goto L_0x00f6
        L_0x00f1:
            r15 = 0
            goto L_0x00f4
        L_0x00f3:
            r1 = 0
        L_0x00f4:
            r16 = -1
        L_0x00f6:
            int r5 = r6.zza()
            com.google.android.gms.internal.ads.zzab r8 = r12.zzg
            if (r5 == r13) goto L_0x01b3
            java.lang.String r8 = r8.zzo
            java.lang.String r7 = "audio/raw"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0118
            java.lang.String r7 = "audio/g711-mlaw"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0118
            java.lang.String r7 = "audio/g711-alaw"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x01b3
        L_0x0118:
            if (r11 != 0) goto L_0x01b3
            if (r10 != 0) goto L_0x01b2
            if (r1 != 0) goto L_0x01b2
            int r0 = r4.zza
            long[] r1 = new long[r0]
            int[] r6 = new int[r0]
        L_0x0124:
            boolean r7 = r4.zza()
            if (r7 == 0) goto L_0x0135
            int r7 = r4.zzb
            long r10 = r4.zzd
            r1[r7] = r10
            int r8 = r4.zzc
            r6[r7] = r8
            goto L_0x0124
        L_0x0135:
            long r7 = (long) r9
            r4 = 8192(0x2000, float:1.14794E-41)
            int r4 = r4 / r5
            r9 = 0
            r10 = 0
        L_0x013b:
            if (r9 >= r0) goto L_0x0148
            r11 = r6[r9]
            int r14 = com.google.android.gms.internal.ads.zzei.zza
            int r11 = r11 + r4
            int r11 = r11 + r13
            int r11 = r11 / r4
            int r10 = r10 + r11
            int r9 = r9 + 1
            goto L_0x013b
        L_0x0148:
            long[] r9 = new long[r10]
            int[] r11 = new int[r10]
            long[] r14 = new long[r10]
            int[] r10 = new int[r10]
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0156:
            if (r15 >= r0) goto L_0x01a7
            r22 = r6[r15]
            r23 = r1[r15]
            r41 = r17
            r17 = r0
            r0 = r16
            r16 = r41
            r42 = r22
            r22 = r1
            r1 = r42
        L_0x016a:
            if (r1 <= 0) goto L_0x0196
            int r25 = java.lang.Math.min(r4, r1)
            r9[r16] = r23
            r26 = r4
            int r4 = r5 * r25
            r11[r16] = r4
            int r0 = java.lang.Math.max(r0, r4)
            r27 = r5
            long r4 = (long) r13
            long r4 = r4 * r7
            r14[r16] = r4
            r4 = 1
            r10[r16] = r4
            r4 = r11[r16]
            long r4 = (long) r4
            long r23 = r23 + r4
            int r13 = r13 + r25
            int r1 = r1 - r25
            int r16 = r16 + 1
            r4 = r26
            r5 = r27
            goto L_0x016a
        L_0x0196:
            r26 = r4
            r27 = r5
            int r15 = r15 + 1
            r1 = r22
            r41 = r16
            r16 = r0
            r0 = r17
            r17 = r41
            goto L_0x0156
        L_0x01a7:
            long r0 = (long) r13
            long r7 = r7 * r0
            r0 = r7
            r13 = r9
            r15 = r12
            r2 = r14
            r12 = r10
            r14 = r11
            goto L_0x036a
        L_0x01b2:
            r11 = 0
        L_0x01b3:
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            long[] r8 = new long[r3]
            int[] r13 = new int[r3]
            r27 = r11
            r28 = r12
            r11 = r16
            r12 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 0
            r30 = 0
            r16 = r10
            r10 = 0
        L_0x01cf:
            java.lang.String r2 = "BoxParsers"
            if (r10 >= r3) goto L_0x0298
            r31 = r22
            r22 = 1
        L_0x01d7:
            if (r26 != 0) goto L_0x01fc
            boolean r22 = r4.zza()
            if (r22 == 0) goto L_0x01f4
            r23 = r14
            r33 = r15
            long r14 = r4.zzd
            r34 = r3
            int r3 = r4.zzc
            r26 = r3
            r31 = r14
            r14 = r23
            r15 = r33
            r3 = r34
            goto L_0x01d7
        L_0x01f4:
            r34 = r3
            r23 = r14
            r33 = r15
            r3 = 0
            goto L_0x0204
        L_0x01fc:
            r34 = r3
            r23 = r14
            r33 = r15
            r3 = r26
        L_0x0204:
            if (r22 != 0) goto L_0x021e
            java.lang.String r3 = "Unexpected end of chunk data"
            com.google.android.gms.internal.ads.zzdo.zzf(r2, r3)
            long[] r5 = java.util.Arrays.copyOf(r5, r10)
            int[] r7 = java.util.Arrays.copyOf(r7, r10)
            long[] r8 = java.util.Arrays.copyOf(r8, r10)
            int[] r13 = java.util.Arrays.copyOf(r13, r10)
            r3 = r10
            goto L_0x029a
        L_0x021e:
            r2 = r30
            if (r0 != 0) goto L_0x0223
            goto L_0x0239
        L_0x0223:
            if (r29 != 0) goto L_0x0236
            if (r16 <= 0) goto L_0x0232
            int r16 = r16 + -1
            int r29 = r0.zzp()
            int r2 = r0.zzg()
            goto L_0x0223
        L_0x0232:
            r14 = -1
            r29 = 0
            goto L_0x0237
        L_0x0236:
            r14 = -1
        L_0x0237:
            int r29 = r29 + -1
        L_0x0239:
            r5[r10] = r31
            int r14 = r6.zzc()
            r7[r10] = r14
            if (r14 <= r12) goto L_0x0244
            r12 = r14
        L_0x0244:
            long r14 = (long) r2
            long r14 = r24 + r14
            r8[r10] = r14
            if (r33 != 0) goto L_0x024d
            r14 = 1
            goto L_0x024e
        L_0x024d:
            r14 = 0
        L_0x024e:
            r13[r10] = r14
            if (r10 != r11) goto L_0x0266
            r14 = 1
            r13[r10] = r14
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0266
            r33.getClass()
            r15 = r33
            com.google.android.gms.internal.ads.zzdy r15 = (com.google.android.gms.internal.ads.zzdy) r15
            int r11 = r33.zzp()
            r14 = -1
            int r11 = r11 + r14
        L_0x0266:
            long r14 = (long) r9
            long r24 = r24 + r14
            int r17 = r17 + -1
            if (r17 != 0) goto L_0x027f
            if (r27 <= 0) goto L_0x027d
            int r9 = r23.zzp()
            int r14 = r23.zzg()
            int r27 = r27 + -1
            r17 = r9
            r9 = r14
            goto L_0x027f
        L_0x027d:
            r17 = 0
        L_0x027f:
            r14 = r7[r10]
            long r14 = (long) r14
            long r14 = r31 + r14
            r22 = -1
            int r26 = r3 + -1
            int r10 = r10 + 1
            r30 = r2
            r3 = r34
            r41 = r14
            r14 = r23
            r22 = r41
            r15 = r33
            goto L_0x01cf
        L_0x0298:
            r34 = r3
        L_0x029a:
            r4 = r30
            long r9 = (long) r4
            long r9 = r24 + r9
            if (r0 == 0) goto L_0x02b1
        L_0x02a1:
            if (r16 <= 0) goto L_0x02b1
            int r4 = r0.zzp()
            if (r4 == 0) goto L_0x02ab
            r0 = 0
            goto L_0x02b2
        L_0x02ab:
            r0.zzg()
            int r16 = r16 + -1
            goto L_0x02a1
        L_0x02b1:
            r0 = 1
        L_0x02b2:
            if (r1 != 0) goto L_0x0308
            if (r17 != 0) goto L_0x02f9
            if (r26 != 0) goto L_0x02ec
            if (r27 != 0) goto L_0x02df
            if (r29 != 0) goto L_0x02d3
            if (r0 != 0) goto L_0x02c9
            r16 = r3
            r15 = r28
            r0 = 0
            r1 = 0
            r4 = 0
            r6 = 0
            r11 = 0
            r14 = 0
            goto L_0x0315
        L_0x02c9:
            r16 = r3
            r17 = r5
            r22 = r7
            r15 = r28
            goto L_0x035f
        L_0x02d3:
            r14 = r0
            r16 = r3
            r15 = r28
            r11 = r29
            r0 = 0
            r1 = 0
            r4 = 0
            r6 = 0
            goto L_0x0315
        L_0x02df:
            r14 = r0
            r16 = r3
            r6 = r27
            r15 = r28
            r11 = r29
            r0 = 0
            r1 = 0
            r4 = 0
            goto L_0x0315
        L_0x02ec:
            r14 = r0
            r16 = r3
            r4 = r26
            r6 = r27
            r15 = r28
            r11 = r29
            r0 = 0
            goto L_0x0306
        L_0x02f9:
            r14 = r0
            r16 = r3
            r0 = r17
            r4 = r26
            r6 = r27
            r15 = r28
            r11 = r29
        L_0x0306:
            r1 = 0
            goto L_0x0315
        L_0x0308:
            r14 = r0
            r16 = r3
            r0 = r17
            r4 = r26
            r6 = r27
            r15 = r28
            r11 = r29
        L_0x0315:
            int r3 = r15.zza
            r17 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r22 = r7
            java.lang.String r7 = "Inconsistent stbl box for track "
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r3 = ": remainingSynchronizationSamples "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = ", remainingSamplesAtTimestampDelta "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r0 = ", remainingSamplesAtTimestampOffset "
            r5.append(r0)
            r5.append(r11)
            r0 = 1
            if (r0 == r14) goto L_0x0353
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0355
        L_0x0353:
            java.lang.String r0 = ""
        L_0x0355:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r2, r0)
        L_0x035f:
            r2 = r8
            r0 = r9
            r3 = r16
            r14 = r22
            r16 = r12
            r12 = r13
            r13 = r17
        L_0x036a:
            long r8 = r15.zzc
            java.math.RoundingMode r10 = java.math.RoundingMode.DOWN
            r6 = 1000000(0xf4240, double:4.940656E-318)
            r4 = r0
            long r4 = com.google.android.gms.internal.ads.zzei.zzu(r4, r6, r8, r10)
            long[] r6 = r15.zzi
            r7 = 1000000(0xf4240, double:4.940656E-318)
            if (r6 != 0) goto L_0x0393
            long r0 = r15.zzc
            com.google.android.gms.internal.ads.zzei.zzF(r2, r7, r0)
            com.google.android.gms.internal.ads.zzaje r0 = new com.google.android.gms.internal.ads.zzaje
            r11 = r0
            r10 = r12
            r12 = r15
            r15 = r16
            r16 = r2
            r17 = r10
            r18 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0393:
            r10 = r12
            int r4 = r6.length
            r5 = 1
            if (r4 != r5) goto L_0x0453
            int r4 = r15.zzb
            if (r4 != r5) goto L_0x0453
            int r4 = r2.length
            r5 = 2
            if (r4 < r5) goto L_0x0453
            long[] r5 = r15.zzj
            r5.getClass()
            long[] r5 = (long[]) r5
            r9 = 0
            r11 = r5[r9]
            r22 = r6[r9]
            long r5 = r15.zzc
            long r7 = r15.zzd
            java.math.RoundingMode r28 = java.math.RoundingMode.DOWN
            r24 = r5
            r26 = r7
            long r5 = com.google.android.gms.internal.ads.zzei.zzu(r22, r24, r26, r28)
            long r5 = r5 + r11
            int r7 = r4 + -1
            r8 = 4
            int r8 = java.lang.Math.min(r8, r7)
            r9 = 0
            int r8 = java.lang.Math.max(r9, r8)
            int r4 = r4 + -4
            int r4 = java.lang.Math.min(r4, r7)
            int r4 = java.lang.Math.max(r9, r4)
            r22 = r2[r9]
            int r7 = (r22 > r11 ? 1 : (r22 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x0453
            r7 = r2[r8]
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0453
            r7 = r2[r4]
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0453
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0453
            long r31 = r11 - r22
            com.google.android.gms.internal.ads.zzab r4 = r15.zzg
            long r7 = r15.zzc
            int r4 = r4.zzE
            long r11 = (long) r4
            java.math.RoundingMode r37 = java.math.RoundingMode.DOWN
            r33 = r11
            r35 = r7
            long r7 = com.google.android.gms.internal.ads.zzei.zzu(r31, r33, r35, r37)
            com.google.android.gms.internal.ads.zzab r4 = r15.zzg
            long r11 = r15.zzc
            long r22 = r0 - r5
            int r4 = r4.zzE
            long r4 = (long) r4
            java.math.RoundingMode r28 = java.math.RoundingMode.DOWN
            r24 = r4
            r26 = r11
            long r4 = com.google.android.gms.internal.ads.zzei.zzu(r22, r24, r26, r28)
            r11 = 0
            int r6 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0419
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0453
            r7 = 0
        L_0x0419:
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x0453
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x0425
            goto L_0x0453
        L_0x0425:
            int r0 = (int) r7
            r1 = r45
            r1.zza = r0
            int r0 = (int) r4
            r1.zzb = r0
            long r0 = r15.zzc
            r3 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.zzei.zzF(r2, r3, r0)
            long[] r0 = r15.zzi
            r1 = 0
            r3 = r0[r1]
            long r7 = r15.zzd
            java.math.RoundingMode r9 = java.math.RoundingMode.DOWN
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r18 = com.google.android.gms.internal.ads.zzei.zzu(r3, r5, r7, r9)
            com.google.android.gms.internal.ads.zzaje r0 = new com.google.android.gms.internal.ads.zzaje
            r11 = r0
            r12 = r15
            r15 = r16
            r16 = r2
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0453:
            long[] r4 = r15.zzi
            int r5 = r4.length
            r6 = 1
            if (r5 != r6) goto L_0x04a3
            r6 = 0
            r7 = r4[r6]
            r4 = 0
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x04a2
            long[] r3 = r15.zzj
            r3.getClass()
            long[] r3 = (long[]) r3
            r4 = r3[r6]
            r3 = 0
        L_0x046c:
            int r6 = r2.length
            if (r3 >= r6) goto L_0x0485
            r6 = r2[r3]
            long r17 = r6 - r4
            long r6 = r15.zzc
            java.math.RoundingMode r23 = java.math.RoundingMode.DOWN
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r6
            long r6 = com.google.android.gms.internal.ads.zzei.zzu(r17, r19, r21, r23)
            r2[r3] = r6
            int r3 = r3 + 1
            goto L_0x046c
        L_0x0485:
            long r17 = r0 - r4
            long r0 = r15.zzc
            java.math.RoundingMode r23 = java.math.RoundingMode.DOWN
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r21 = r0
            long r18 = com.google.android.gms.internal.ads.zzei.zzu(r17, r19, r21, r23)
            com.google.android.gms.internal.ads.zzaje r0 = new com.google.android.gms.internal.ads.zzaje
            r11 = r0
            r12 = r15
            r15 = r16
            r16 = r2
            r17 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x04a2:
            r5 = 1
        L_0x04a3:
            int r0 = r15.zzb
            r1 = 1
            if (r0 != r1) goto L_0x04aa
            r0 = 1
            goto L_0x04ab
        L_0x04aa:
            r0 = 0
        L_0x04ab:
            long[] r1 = r15.zzj
            int[] r4 = new int[r5]
            int[] r5 = new int[r5]
            r1.getClass()
            long[] r1 = (long[]) r1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x04ba:
            long[] r11 = r15.zzi
            int r12 = r11.length
            if (r9 >= r12) goto L_0x053e
            r17 = r13
            r12 = r1[r9]
            r22 = -1
            int r24 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r24 == 0) goto L_0x052a
            r25 = r11[r9]
            r45 = r7
            r11 = r8
            long r7 = r15.zzc
            r22 = r5
            r23 = r6
            long r5 = r15.zzd
            java.math.RoundingMode r31 = java.math.RoundingMode.DOWN
            r27 = r7
            r29 = r5
            long r5 = com.google.android.gms.internal.ads.zzei.zzu(r25, r27, r29, r31)
            r7 = 1
            int r8 = com.google.android.gms.internal.ads.zzei.zzd(r2, r12, r7, r7)
            r4[r9] = r8
        L_0x04e7:
            r8 = r4[r9]
            if (r8 < 0) goto L_0x04f7
            r24 = r10[r8]
            r24 = r24 & 1
            if (r24 != 0) goto L_0x04f7
            int r8 = r8 + -1
            r4[r9] = r8
            r7 = 1
            goto L_0x04e7
        L_0x04f7:
            long r12 = r12 + r5
            r5 = 0
            int r6 = com.google.android.gms.internal.ads.zzei.zza(r2, r12, r0, r5)
            r22[r9] = r6
            int r7 = r15.zzb
            r8 = 2
            if (r7 != r8) goto L_0x0518
        L_0x0504:
            r6 = r22[r9]
            int r7 = r2.length
            r20 = -1
            int r7 = r7 + -1
            if (r6 >= r7) goto L_0x051a
            int r7 = r6 + 1
            r24 = r2[r7]
            int r21 = (r24 > r12 ? 1 : (r24 == r12 ? 0 : -1))
            if (r21 > 0) goto L_0x051a
            r22[r9] = r7
            goto L_0x0504
        L_0x0518:
            r20 = -1
        L_0x051a:
            r7 = r4[r9]
            int r12 = r6 - r7
            int r12 = r23 + r12
            if (r11 == r7) goto L_0x0524
            r7 = 1
            goto L_0x0525
        L_0x0524:
            r7 = 0
        L_0x0525:
            r7 = r45 | r7
            r11 = r6
            r6 = r12
            goto L_0x0535
        L_0x052a:
            r22 = r5
            r23 = r6
            r45 = r7
            r11 = r8
            r5 = 0
            r8 = 2
            r20 = -1
        L_0x0535:
            int r9 = r9 + 1
            r8 = r11
            r13 = r17
            r5 = r22
            goto L_0x04ba
        L_0x053e:
            r22 = r5
            r45 = r7
            r17 = r13
            r5 = 0
            if (r6 == r3) goto L_0x0549
            r0 = 1
            goto L_0x054a
        L_0x0549:
            r0 = 0
        L_0x054a:
            r0 = r45 | r0
            if (r0 == 0) goto L_0x0551
            long[] r1 = new long[r6]
            goto L_0x0553
        L_0x0551:
            r1 = r17
        L_0x0553:
            if (r0 == 0) goto L_0x0558
            int[] r3 = new int[r6]
            goto L_0x0559
        L_0x0558:
            r3 = r14
        L_0x0559:
            r7 = 1
            if (r7 != r0) goto L_0x055e
            r16 = 0
        L_0x055e:
            if (r0 == 0) goto L_0x0563
            int[] r12 = new int[r6]
            goto L_0x0564
        L_0x0563:
            r12 = r10
        L_0x0564:
            long[] r6 = new long[r6]
            r7 = 0
            r8 = 0
            r9 = 0
            r20 = 0
        L_0x056b:
            long[] r11 = r15.zzi
            int r11 = r11.length
            if (r9 >= r11) goto L_0x0601
            long[] r11 = r15.zzj
            r30 = r11[r9]
            r11 = r4[r9]
            r13 = r22[r9]
            if (r0 == 0) goto L_0x058a
            int r5 = r13 - r11
            r33 = r4
            r4 = r17
            java.lang.System.arraycopy(r4, r11, r1, r8, r5)
            java.lang.System.arraycopy(r14, r11, r3, r8, r5)
            java.lang.System.arraycopy(r10, r11, r12, r8, r5)
            goto L_0x058e
        L_0x058a:
            r33 = r4
            r4 = r17
        L_0x058e:
            r5 = r16
        L_0x0590:
            if (r11 >= r13) goto L_0x05e4
            r17 = r12
            r44 = r13
            long r12 = r15.zzd
            java.math.RoundingMode r29 = java.math.RoundingMode.DOWN
            r25 = 1000000(0xf4240, double:4.940656E-318)
            r23 = r20
            r27 = r12
            long r12 = com.google.android.gms.internal.ads.zzei.zzu(r23, r25, r27, r29)
            r23 = r2[r11]
            long r34 = r23 - r30
            r45 = r1
            r23 = r2
            long r1 = r15.zzc
            java.math.RoundingMode r40 = java.math.RoundingMode.DOWN
            r36 = 1000000(0xf4240, double:4.940656E-318)
            r38 = r1
            long r1 = com.google.android.gms.internal.ads.zzei.zzu(r34, r36, r38, r40)
            r18 = 0
            int r16 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x05c3
            r16 = 0
            goto L_0x05c5
        L_0x05c3:
            r16 = 1
        L_0x05c5:
            r24 = 1
            r16 = r16 ^ 1
            r7 = r16 | r7
            long r12 = r12 + r1
            r6[r8] = r12
            if (r0 == 0) goto L_0x05d7
            r1 = r3[r8]
            if (r1 <= r5) goto L_0x05d7
            r1 = r14[r11]
            r5 = r1
        L_0x05d7:
            int r8 = r8 + 1
            int r11 = r11 + 1
            r13 = r44
            r1 = r45
            r12 = r17
            r2 = r23
            goto L_0x0590
        L_0x05e4:
            r45 = r1
            r23 = r2
            r17 = r12
            r18 = 0
            long[] r1 = r15.zzi
            r11 = r1[r9]
            long r20 = r20 + r11
            int r9 = r9 + 1
            r1 = r45
            r16 = r5
            r12 = r17
            r5 = 0
            r17 = r4
            r4 = r33
            goto L_0x056b
        L_0x0601:
            r45 = r1
            r17 = r12
            long r0 = r15.zzd
            java.math.RoundingMode r29 = java.math.RoundingMode.DOWN
            r25 = 1000000(0xf4240, double:4.940656E-318)
            r23 = r20
            r27 = r0
            long r30 = com.google.android.gms.internal.ads.zzei.zzu(r23, r25, r27, r29)
            if (r7 == 0) goto L_0x062b
            com.google.android.gms.internal.ads.zzab r0 = r15.zzg
            com.google.android.gms.internal.ads.zzz r0 = r0.zzb()
            r1 = 1
            r0.zzJ(r1)
            com.google.android.gms.internal.ads.zzab r0 = r0.zzag()
            com.google.android.gms.internal.ads.zzajb r12 = r15.zza(r0)
            r24 = r12
            goto L_0x062d
        L_0x062b:
            r24 = r15
        L_0x062d:
            com.google.android.gms.internal.ads.zzaje r0 = new com.google.android.gms.internal.ads.zzaje
            r23 = r0
            r25 = r45
            r26 = r3
            r27 = r16
            r28 = r6
            r29 = r17
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)
            return r0
        L_0x063f:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zze(com.google.android.gms.internal.ads.zzajb, com.google.android.gms.internal.ads.zzen, com.google.android.gms.internal.ads.zzadb):com.google.android.gms.internal.ads.zzaje");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ef, code lost:
        if (r9 == 0) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:544:0x0c45  */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0c49  */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0c7f  */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x0cb2  */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x0cbf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x01fa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List zzf(com.google.android.gms.internal.ads.zzen r65, com.google.android.gms.internal.ads.zzadb r66, long r67, com.google.android.gms.internal.ads.zzu r69, boolean r70, boolean r71, com.google.android.gms.internal.ads.zzfuc r72) throws com.google.android.gms.internal.ads.zzbc {
        /*
            r0 = r65
            r11 = r69
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r14 = 0
        L_0x000a:
            java.util.List r1 = r0.zzc
            int r1 = r1.size()
            if (r14 >= r1) goto L_0x0cc7
            java.util.List r1 = r0.zzc
            java.lang.Object r1 = r1.get(r14)
            r15 = r1
            com.google.android.gms.internal.ads.zzen r15 = (com.google.android.gms.internal.ads.zzen) r15
            int r1 = r15.zzd
            r2 = 1953653099(0x7472616b, float:7.681346E31)
            if (r1 == r2) goto L_0x002b
            r3 = r66
            r0 = r72
            r2 = r12
            r34 = r14
            goto L_0x0cb6
        L_0x002b:
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.android.gms.internal.ads.zzeo r1 = r0.zzb(r1)
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzeo r2 = (com.google.android.gms.internal.ads.zzeo) r2
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzen r2 = r15.zza(r2)
            r2.getClass()
            r3 = r2
            com.google.android.gms.internal.ads.zzen r3 = (com.google.android.gms.internal.ads.zzen) r3
            r3 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.gms.internal.ads.zzeo r3 = r2.zzb(r3)
            r3.getClass()
            r4 = r3
            com.google.android.gms.internal.ads.zzeo r4 = (com.google.android.gms.internal.ads.zzeo) r4
            com.google.android.gms.internal.ads.zzdy r3 = r3.zza
            int r3 = zzi(r3)
            r4 = 1936684398(0x736f756e, float:1.8971874E31)
            r16 = 5
            r8 = -1
            if (r3 != r4) goto L_0x0062
            r6 = 1
            goto L_0x0088
        L_0x0062:
            r4 = 1986618469(0x76696465, float:1.1834389E33)
            if (r3 != r4) goto L_0x0069
            r6 = 2
            goto L_0x0088
        L_0x0069:
            r4 = 1952807028(0x74657874, float:7.272211E31)
            if (r3 == r4) goto L_0x0087
            r4 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r3 == r4) goto L_0x0087
            r4 = 1937072756(0x73756274, float:1.944137E31)
            if (r3 == r4) goto L_0x0087
            r4 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r3 != r4) goto L_0x007e
            goto L_0x0087
        L_0x007e:
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r3 != r4) goto L_0x0085
            r6 = 5
            goto L_0x0088
        L_0x0085:
            r6 = -1
            goto L_0x0088
        L_0x0087:
            r6 = 3
        L_0x0088:
            if (r6 != r8) goto L_0x0094
            r0 = r72
            r35 = r12
            r34 = r14
            r1 = r15
        L_0x0091:
            r5 = 0
            goto L_0x0c77
        L_0x0094:
            r3 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.android.gms.internal.ads.zzeo r3 = r15.zzb(r3)
            r3.getClass()
            r4 = r3
            com.google.android.gms.internal.ads.zzeo r4 = (com.google.android.gms.internal.ads.zzeo) r4
            com.google.android.gms.internal.ads.zzdy r3 = r3.zza
            r4 = 8
            r3.zzL(r4)
            int r17 = r3.zzg()
            int r17 = zza(r17)
            r7 = 16
            if (r17 != 0) goto L_0x00b7
            r5 = 8
            goto L_0x00b9
        L_0x00b7:
            r5 = 16
        L_0x00b9:
            r3.zzM(r5)
            int r5 = r3.zzg()
            r13 = 4
            r3.zzM(r13)
            int r20 = r3.zzd()
            r9 = 0
        L_0x00c9:
            if (r17 != 0) goto L_0x00cd
            r10 = 4
            goto L_0x00cf
        L_0x00cd:
            r10 = 8
        L_0x00cf:
            r23 = 0
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 >= r10) goto L_0x00f5
            byte[] r10 = r3.zzN()
            int r27 = r20 + r9
            byte r10 = r10[r27]
            if (r10 == r8) goto L_0x00f2
            if (r17 != 0) goto L_0x00e9
            long r9 = r3.zzu()
            goto L_0x00ed
        L_0x00e9:
            long r9 = r3.zzw()
        L_0x00ed:
            int r17 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r17 != 0) goto L_0x00fa
            goto L_0x00f8
        L_0x00f2:
            int r9 = r9 + 1
            goto L_0x00c9
        L_0x00f5:
            r3.zzM(r10)
        L_0x00f8:
            r9 = r25
        L_0x00fa:
            r3.zzM(r7)
            int r17 = r3.zzg()
            int r7 = r3.zzg()
            r3.zzM(r13)
            int r13 = r3.zzg()
            int r3 = r3.zzg()
            r8 = 65536(0x10000, float:9.18355E-41)
            r4 = -65536(0xffffffffffff0000, float:NaN)
            if (r17 != 0) goto L_0x0128
            if (r7 != r8) goto L_0x0126
            if (r13 != r4) goto L_0x0124
            if (r3 != 0) goto L_0x011f
            r3 = 90
            goto L_0x0149
        L_0x011f:
            r7 = 65536(0x10000, float:9.18355E-41)
            r13 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x0126
        L_0x0124:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x0126:
            r17 = 0
        L_0x0128:
            if (r17 != 0) goto L_0x013a
            if (r7 != r4) goto L_0x0137
            if (r13 != r8) goto L_0x0133
            if (r3 != 0) goto L_0x0134
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x0149
        L_0x0133:
            r8 = r13
        L_0x0134:
            r7 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x0138
        L_0x0137:
            r8 = r13
        L_0x0138:
            r13 = 0
            goto L_0x013d
        L_0x013a:
            r8 = r13
            r13 = r17
        L_0x013d:
            if (r13 != r4) goto L_0x0148
            if (r7 != 0) goto L_0x0148
            if (r8 != 0) goto L_0x0148
            if (r3 != r4) goto L_0x0148
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x0149
        L_0x0148:
            r3 = 0
        L_0x0149:
            com.google.android.gms.internal.ads.zzaii r13 = new com.google.android.gms.internal.ads.zzaii
            r13.<init>(r5, r9, r3)
            int r3 = (r67 > r25 ? 1 : (r67 == r25 ? 0 : -1))
            if (r3 != 0) goto L_0x0159
            long r3 = r13.zzb
            r34 = r3
            goto L_0x015b
        L_0x0159:
            r34 = r67
        L_0x015b:
            com.google.android.gms.internal.ads.zzdy r1 = r1.zza
            com.google.android.gms.internal.ads.zzew r1 = zzd(r1)
            long r9 = r1.zzc
            int r1 = (r34 > r25 ? 1 : (r34 == r25 ? 0 : -1))
            if (r1 != 0) goto L_0x016a
            r32 = r25
            goto L_0x0177
        L_0x016a:
            r36 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r40 = java.math.RoundingMode.DOWN
            r38 = r9
            long r3 = com.google.android.gms.internal.ads.zzei.zzu(r34, r36, r38, r40)
            r32 = r3
        L_0x0177:
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzen r1 = r2.zza(r1)
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzen r3 = (com.google.android.gms.internal.ads.zzen) r3
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzen r1 = r1.zza(r3)
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzen r3 = (com.google.android.gms.internal.ads.zzen) r3
            r3 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.android.gms.internal.ads.zzeo r2 = r2.zzb(r3)
            r2.getClass()
            r3 = r2
            com.google.android.gms.internal.ads.zzeo r3 = (com.google.android.gms.internal.ads.zzeo) r3
            com.google.android.gms.internal.ads.zzdy r2 = r2.zza
            r4 = 8
            r2.zzL(r4)
            int r3 = r2.zzg()
            int r3 = zza(r3)
            if (r3 != 0) goto L_0x01b2
            r5 = 8
            goto L_0x01b4
        L_0x01b2:
            r5 = 16
        L_0x01b4:
            r2.zzM(r5)
            long r7 = r2.zzu()
            int r5 = r2.zzd()
            r4 = 0
        L_0x01c0:
            if (r3 != 0) goto L_0x01c4
            r0 = 4
            goto L_0x01c6
        L_0x01c4:
            r0 = 8
        L_0x01c6:
            if (r4 >= r0) goto L_0x01fa
            byte[] r0 = r2.zzN()
            int r17 = r5 + r4
            byte r0 = r0[r17]
            r30 = r9
            r9 = -1
            if (r0 == r9) goto L_0x01f3
            if (r3 != 0) goto L_0x01dc
            long r3 = r2.zzu()
            goto L_0x01e0
        L_0x01dc:
            long r3 = r2.zzw()
        L_0x01e0:
            r34 = r3
            int r0 = (r34 > r23 ? 1 : (r34 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x01e7
            goto L_0x0200
        L_0x01e7:
            r36 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r40 = java.math.RoundingMode.DOWN
            r38 = r7
            long r25 = com.google.android.gms.internal.ads.zzei.zzu(r34, r36, r38, r40)
            goto L_0x0200
        L_0x01f3:
            int r4 = r4 + 1
            r0 = r65
            r9 = r30
            goto L_0x01c0
        L_0x01fa:
            r30 = r9
            r9 = -1
            r2.zzM(r0)
        L_0x0200:
            r37 = r25
            int r0 = r2.zzq()
            int r2 = r0 >> 10
            int r3 = r0 >> 5
            r0 = r0 & 31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r2 = r2 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            r4.append(r2)
            r2 = r3 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            r4.append(r2)
            int r0 = r0 + 96
            char r0 = (char) r0
            r4.append(r0)
            java.lang.String r39 = r4.toString()
            com.google.android.gms.internal.ads.zzaic r0 = new com.google.android.gms.internal.ads.zzaic
            r34 = r0
            r35 = r7
            r34.<init>(r35, r37, r39)
            r2 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.android.gms.internal.ads.zzeo r1 = r1.zzb(r2)
            if (r1 == 0) goto L_0x0cbf
            int r10 = r13.zza
            int r8 = r13.zzc
            java.lang.String r7 = r0.zzc
            com.google.android.gms.internal.ads.zzdy r5 = r1.zza
            r4 = 12
            r5.zzL(r4)
            int r3 = r5.zzg()
            com.google.android.gms.internal.ads.zzaif r2 = new com.google.android.gms.internal.ads.zzaif
            r2.<init>(r3)
            r1 = 0
        L_0x025a:
            if (r1 >= r3) goto L_0x0bbc
            r34 = r14
            int r14 = r5.zzd()
            r35 = r12
            int r12 = r5.zzg()
            if (r12 <= 0) goto L_0x026c
            r4 = 1
            goto L_0x026d
        L_0x026c:
            r4 = 0
        L_0x026d:
            java.lang.String r9 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzacr.zzb(r4, r9)
            int r4 = r5.zzg()
            r25 = r1
            r1 = 1635148593(0x61766331, float:2.840654E20)
            r26 = r3
            r3 = 1701733238(0x656e6376, float:7.035987E22)
            if (r4 == r1) goto L_0x047e
            r1 = 1635148595(0x61766333, float:2.8406544E20)
            if (r4 == r1) goto L_0x047e
            if (r4 == r3) goto L_0x047e
            r1 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 == r1) goto L_0x047e
            r1 = 1836070006(0x6d703476, float:4.646239E27)
            if (r4 == r1) goto L_0x047e
            r1 = 1752589105(0x68766331, float:4.6541277E24)
            if (r4 == r1) goto L_0x047e
            r1 = 1751479857(0x68657631, float:4.3344087E24)
            if (r4 == r1) goto L_0x047e
            r1 = 1932670515(0x73323633, float:1.4119387E31)
            if (r4 == r1) goto L_0x047e
            r1 = 1211250227(0x48323633, float:182488.8)
            if (r4 == r1) goto L_0x047e
            r1 = 1748121139(0x68323633, float:3.366324E24)
            if (r4 == r1) goto L_0x047e
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r4 == r1) goto L_0x047e
            r1 = 1987063865(0x76703039, float:1.2178997E33)
            if (r4 == r1) goto L_0x047e
            r1 = 1635135537(0x61763031, float:2.8383572E20)
            if (r4 == r1) goto L_0x047e
            r1 = 1685479798(0x64766176, float:1.8179687E22)
            if (r4 == r1) goto L_0x047e
            r1 = 1685479729(0x64766131, float:1.817961E22)
            if (r4 == r1) goto L_0x047e
            r1 = 1685481573(0x64766865, float:1.8181686E22)
            if (r4 == r1) goto L_0x047e
            r1 = 1685481521(0x64766831, float:1.8181627E22)
            if (r4 != r1) goto L_0x02d1
            goto L_0x047e
        L_0x02d1:
            r1 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r4 == r1) goto L_0x0443
            r1 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r4 == r1) goto L_0x0443
            r1 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r4 == r1) goto L_0x0443
            r1 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r4 == r1) goto L_0x0443
            r1 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r4 == r1) goto L_0x0443
            r1 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r4 == r1) goto L_0x0443
            r1 = 1685353315(0x64747363, float:1.803728E22)
            if (r4 == r1) goto L_0x0443
            r1 = 1685353317(0x64747365, float:1.8037282E22)
            if (r4 == r1) goto L_0x0443
            r1 = 1685353320(0x64747368, float:1.8037286E22)
            if (r4 == r1) goto L_0x0443
            r1 = 1685353324(0x6474736c, float:1.803729E22)
            if (r4 == r1) goto L_0x0443
            r1 = 1685353336(0x64747378, float:1.8037304E22)
            if (r4 == r1) goto L_0x0443
            r1 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r4 == r1) goto L_0x0443
            r1 = 1935767394(0x73617762, float:1.7863284E31)
            if (r4 == r1) goto L_0x0443
            r1 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r4 == r1) goto L_0x0443
            r1 = 1936684916(0x736f7774, float:1.89725E31)
            if (r4 == r1) goto L_0x0443
            r1 = 1953984371(0x74776f73, float:7.841539E31)
            if (r4 == r1) goto L_0x0443
            r1 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r4 == r1) goto L_0x0443
            r1 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r4 == r1) goto L_0x0443
            r1 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r4 == r1) goto L_0x0443
            r1 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r4 == r1) goto L_0x0443
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r4 == r1) goto L_0x0443
            r1 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r4 == r1) goto L_0x0443
            r1 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r4 == r1) goto L_0x0443
            r1 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r4 == r1) goto L_0x0443
            r1 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r4 == r1) goto L_0x0443
            r1 = 1767992678(0x69616d66, float:1.7032808E25)
            if (r4 != r1) goto L_0x0355
            goto L_0x0443
        L_0x0355:
            r1 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r4 == r1) goto L_0x03c0
            r1 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 == r1) goto L_0x03c0
            r1 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 == r1) goto L_0x03c0
            r1 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 == r1) goto L_0x03c0
            r1 = 1664495672(0x63363038, float:3.360782E21)
            if (r4 != r1) goto L_0x036f
            goto L_0x03c0
        L_0x036f:
            r1 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r4 != r1) goto L_0x0395
            int r1 = r14 + 16
            r5.zzL(r1)
            r1 = 0
            r5.zzy(r1)
            java.lang.String r3 = r5.zzy(r1)
            if (r3 == 0) goto L_0x03ad
            com.google.android.gms.internal.ads.zzz r1 = new com.google.android.gms.internal.ads.zzz
            r1.<init>()
            r1.zzL(r10)
            r1.zzaa(r3)
            com.google.android.gms.internal.ads.zzab r1 = r1.zzag()
            r2.zzb = r1
            goto L_0x03ad
        L_0x0395:
            r1 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r4 != r1) goto L_0x03ad
            com.google.android.gms.internal.ads.zzz r1 = new com.google.android.gms.internal.ads.zzz
            r1.<init>()
            r1.zzL(r10)
            java.lang.String r3 = "application/x-camera-motion"
            r1.zzaa(r3)
            com.google.android.gms.internal.ads.zzab r1 = r1.zzag()
            r2.zzb = r1
        L_0x03ad:
            r29 = r0
            r0 = r5
            r37 = r6
            r20 = r7
            r4 = r8
            r6 = r10
            r50 = r12
            r38 = r13
            r52 = r14
            r36 = r15
            goto L_0x043c
        L_0x03c0:
            int r1 = r14 + 16
            r5.zzL(r1)
            r1 = 1414810956(0x54544d4c, float:3.64731957E12)
            r36 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 != r1) goto L_0x03d6
            java.lang.String r1 = "application/ttml+xml"
        L_0x03d1:
            r41 = r36
        L_0x03d3:
            r3 = 0
            r9 = 1
            goto L_0x040c
        L_0x03d6:
            r1 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 != r1) goto L_0x03f2
            int r1 = r12 + -16
            byte[] r3 = new byte[r1]
            r4 = 0
            r5.zzH(r3, r4, r1)
            com.google.android.gms.internal.ads.zzfxn r1 = com.google.android.gms.internal.ads.zzfxn.zzo(r3)
            java.lang.String r3 = "application/x-quicktime-tx3g"
            r41 = r36
            r9 = 1
            r64 = r3
            r3 = r1
            r1 = r64
            goto L_0x040c
        L_0x03f2:
            r1 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 != r1) goto L_0x03fa
            java.lang.String r1 = "application/x-mp4-vtt"
            goto L_0x03d1
        L_0x03fa:
            r1 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 != r1) goto L_0x0404
            java.lang.String r1 = "application/ttml+xml"
            r41 = r23
            goto L_0x03d3
        L_0x0404:
            r9 = 1
            r2.zzd = r9
            java.lang.String r1 = "application/x-mp4-cea-608"
            r41 = r36
            r3 = 0
        L_0x040c:
            com.google.android.gms.internal.ads.zzz r4 = new com.google.android.gms.internal.ads.zzz
            r4.<init>()
            r4.zzL(r10)
            r4.zzaa(r1)
            r4.zzQ(r7)
            r18 = r10
            r9 = r41
            r4.zzae(r9)
            r4.zzN(r3)
            com.google.android.gms.internal.ads.zzab r1 = r4.zzag()
            r2.zzb = r1
            r29 = r0
            r0 = r5
            r37 = r6
            r20 = r7
            r4 = r8
            r50 = r12
            r38 = r13
            r52 = r14
            r36 = r15
            r6 = r18
        L_0x043c:
            r40 = r30
            r3 = 3
            r5 = r2
            r2 = -1
            goto L_0x0b98
        L_0x0443:
            r18 = r10
            r1 = r5
            r10 = r2
            r2 = r4
            r3 = r14
            r29 = r0
            r0 = 12
            r9 = 8
            r4 = r12
            r0 = r5
            r5 = r18
            r37 = r6
            r6 = r7
            r20 = r7
            r38 = r13
            r13 = 16
            r7 = r71
            r43 = r8
            r8 = r69
            r40 = r30
            r9 = r10
            r45 = r10
            r44 = r18
            r10 = r25
            zzo(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r50 = r12
            r52 = r14
            r36 = r15
            r4 = r43
            r6 = r44
            r5 = r45
            r2 = -1
            r3 = 3
            goto L_0x0b98
        L_0x047e:
            r29 = r0
            r45 = r2
            r0 = r5
            r37 = r6
            r20 = r7
            r43 = r8
            r44 = r10
            r38 = r13
            r40 = r30
            r13 = 16
            int r1 = r14 + 16
            r0.zzL(r1)
            r0.zzM(r13)
            int r1 = r0.zzq()
            int r2 = r0.zzq()
            r5 = 50
            r0.zzM(r5)
            int r5 = r0.zzd()
            if (r4 != r3) goto L_0x04e0
            android.util.Pair r4 = zzj(r0, r14, r12)
            if (r4 == 0) goto L_0x04d6
            java.lang.Object r3 = r4.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r11 != 0) goto L_0x04c0
            r7 = r45
            r6 = 0
            goto L_0x04cc
        L_0x04c0:
            java.lang.Object r6 = r4.second
            com.google.android.gms.internal.ads.zzajc r6 = (com.google.android.gms.internal.ads.zzajc) r6
            java.lang.String r6 = r6.zzb
            com.google.android.gms.internal.ads.zzu r6 = r11.zzb(r6)
            r7 = r45
        L_0x04cc:
            com.google.android.gms.internal.ads.zzajc[] r8 = r7.zza
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.zzajc r4 = (com.google.android.gms.internal.ads.zzajc) r4
            r8[r25] = r4
            r4 = r3
            goto L_0x04dc
        L_0x04d6:
            r7 = r45
            r6 = r11
            r4 = 1701733238(0x656e6376, float:7.035987E22)
        L_0x04dc:
            r0.zzL(r5)
            goto L_0x04e3
        L_0x04e0:
            r7 = r45
            r6 = r11
        L_0x04e3:
            r3 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 != r3) goto L_0x04f0
            java.lang.String r3 = "video/mpeg"
            r64 = r4
            r4 = r3
            r3 = r64
            goto L_0x04fa
        L_0x04f0:
            r3 = 1211250227(0x48323633, float:182488.8)
            if (r4 != r3) goto L_0x04f8
            java.lang.String r4 = "video/3gpp"
            goto L_0x04fa
        L_0x04f8:
            r3 = r4
            r4 = 0
        L_0x04fa:
            r8 = 1065353216(0x3f800000, float:1.0)
            r45 = r1
            r42 = r2
            r49 = r3
            r10 = r5
            r28 = r6
            r36 = r15
            r1 = -1
            r2 = -1
            r5 = 8
            r6 = 0
            r8 = 8
            r11 = -1
            r13 = -1
            r15 = 0
            r21 = 0
            r22 = 0
            r30 = 0
            r31 = 0
            r46 = -1
            r47 = 1065353216(0x3f800000, float:1.0)
            r48 = 0
        L_0x051f:
            int r3 = r10 - r14
            if (r3 >= r12) goto L_0x0af5
            r0.zzL(r10)
            int r3 = r0.zzd()
            int r50 = r0.zzg()
            if (r50 != 0) goto L_0x053e
            int r50 = r0.zzd()
            r51 = r10
            int r10 = r50 - r14
            if (r10 != r12) goto L_0x053c
            goto L_0x0af5
        L_0x053c:
            r10 = 0
            goto L_0x0542
        L_0x053e:
            r51 = r10
            r10 = r50
        L_0x0542:
            if (r10 <= 0) goto L_0x0548
            r50 = r12
            r12 = 1
            goto L_0x054b
        L_0x0548:
            r50 = r12
            r12 = 0
        L_0x054b:
            com.google.android.gms.internal.ads.zzacr.zzb(r12, r9)
            int r12 = r0.zzg()
            r52 = r14
            r14 = 1635148611(0x61766343, float:2.8406573E20)
            if (r12 != r14) goto L_0x05a2
            int r3 = r3 + 8
            if (r4 != 0) goto L_0x055f
            r1 = 1
            goto L_0x0560
        L_0x055f:
            r1 = 0
        L_0x0560:
            r2 = 0
            com.google.android.gms.internal.ads.zzacr.zzb(r1, r2)
            r0.zzL(r3)
            com.google.android.gms.internal.ads.zzabr r1 = com.google.android.gms.internal.ads.zzabr.zza(r0)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r7.zzc = r3
            if (r30 != 0) goto L_0x0579
            float r3 = r1.zzk
            r47 = r3
            r3 = 0
            goto L_0x057a
        L_0x0579:
            r3 = 1
        L_0x057a:
            java.lang.String r4 = r1.zzl
            int r5 = r1.zzj
            int r8 = r1.zzg
            int r11 = r1.zzh
            int r12 = r1.zzi
            int r14 = r1.zze
            int r1 = r1.zzf
            java.lang.String r15 = "video/avc"
            r30 = r3
            r48 = r4
            r46 = r5
            r53 = r7
            r56 = r9
            r57 = r11
            r5 = r14
            r4 = r15
            r63 = r49
            r3 = 3
            r15 = r2
            r11 = r8
            r2 = -1
            r8 = r1
            r1 = r12
            goto L_0x0ae5
        L_0x05a2:
            r14 = 1752589123(0x68766343, float:4.6541328E24)
            if (r12 != r14) goto L_0x05fd
            int r3 = r3 + 8
            if (r4 != 0) goto L_0x05ad
            r1 = 1
            goto L_0x05ae
        L_0x05ad:
            r1 = 0
        L_0x05ae:
            r2 = 0
            com.google.android.gms.internal.ads.zzacr.zzb(r1, r2)
            r0.zzL(r3)
            com.google.android.gms.internal.ads.zzadc r1 = com.google.android.gms.internal.ads.zzadc.zza(r0)
            java.util.List r2 = r1.zza
            int r3 = r1.zzb
            r7.zzc = r3
            if (r30 != 0) goto L_0x05c7
            float r3 = r1.zzi
            r47 = r3
            r3 = 0
            goto L_0x05c8
        L_0x05c7:
            r3 = 1
        L_0x05c8:
            int r4 = r1.zzj
            java.lang.String r5 = r1.zzk
            int r6 = r1.zzh
            r14 = -1
            if (r6 == r14) goto L_0x05d2
            r13 = r6
        L_0x05d2:
            int r6 = r1.zze
            int r8 = r1.zzf
            int r11 = r1.zzg
            int r12 = r1.zzc
            int r15 = r1.zzd
            com.google.android.gms.internal.ads.zzfh r1 = r1.zzl
            java.lang.String r30 = "video/hevc"
            r46 = r4
            r48 = r5
            r53 = r7
            r57 = r8
            r56 = r9
            r5 = r12
            r8 = r15
            r4 = r30
            r63 = r49
            r15 = r2
            r30 = r3
            r2 = -1
            r3 = 3
            r64 = r6
            r6 = r1
            r1 = r11
            r11 = r64
            goto L_0x0ae5
        L_0x05fd:
            r14 = 1818785347(0x6c687643, float:1.12411706E27)
            if (r12 != r14) goto L_0x06ae
            int r3 = r3 + 8
            java.lang.String r12 = "video/hevc"
            boolean r4 = r12.equals(r4)
            java.lang.String r12 = "lhvC must follow hvcC atom"
            com.google.android.gms.internal.ads.zzacr.zzb(r4, r12)
            if (r6 == 0) goto L_0x061e
            com.google.android.gms.internal.ads.zzfxn r4 = r6.zza
            int r4 = r4.size()
            r14 = 2
            if (r4 < r14) goto L_0x061c
            r4 = 1
            goto L_0x0621
        L_0x061c:
            r4 = 0
            goto L_0x0621
        L_0x061e:
            r14 = 2
            r4 = 0
            r6 = 0
        L_0x0621:
            java.lang.String r12 = "must have at least two layers"
            com.google.android.gms.internal.ads.zzacr.zzb(r4, r12)
            r0.zzL(r3)
            r6.getClass()
            r3 = r6
            com.google.android.gms.internal.ads.zzfh r3 = (com.google.android.gms.internal.ads.zzfh) r3
            com.google.android.gms.internal.ads.zzadc r3 = com.google.android.gms.internal.ads.zzadc.zzb(r0, r6)
            int r4 = r7.zzc
            int r12 = r3.zzb
            if (r4 != r12) goto L_0x063b
            r4 = 1
            goto L_0x063c
        L_0x063b:
            r4 = 0
        L_0x063c:
            java.lang.String r12 = "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms"
            com.google.android.gms.internal.ads.zzacr.zzb(r4, r12)
            int r4 = r3.zze
            r12 = -1
            if (r4 == r12) goto L_0x0650
            if (r11 != r4) goto L_0x064a
            r4 = 1
            goto L_0x064b
        L_0x064a:
            r4 = 0
        L_0x064b:
            java.lang.String r14 = "colorSpace must be the same for both views"
            com.google.android.gms.internal.ads.zzacr.zzb(r4, r14)
        L_0x0650:
            int r4 = r3.zzf
            if (r4 == r12) goto L_0x065e
            if (r2 != r4) goto L_0x0658
            r4 = 1
            goto L_0x0659
        L_0x0658:
            r4 = 0
        L_0x0659:
            java.lang.String r14 = "colorRange must be the same for both views"
            com.google.android.gms.internal.ads.zzacr.zzb(r4, r14)
        L_0x065e:
            int r4 = r3.zzg
            if (r4 == r12) goto L_0x066c
            if (r1 != r4) goto L_0x0666
            r4 = 1
            goto L_0x0667
        L_0x0666:
            r4 = 0
        L_0x0667:
            java.lang.String r12 = "colorTransfer must be the same for both views"
            com.google.android.gms.internal.ads.zzacr.zzb(r4, r12)
        L_0x066c:
            int r4 = r3.zzc
            if (r5 != r4) goto L_0x0672
            r4 = 1
            goto L_0x0673
        L_0x0672:
            r4 = 0
        L_0x0673:
            java.lang.String r12 = "bitdepthLuma must be the same for both views"
            com.google.android.gms.internal.ads.zzacr.zzb(r4, r12)
            int r4 = r3.zzd
            if (r8 != r4) goto L_0x067e
            r4 = 1
            goto L_0x067f
        L_0x067e:
            r4 = 0
        L_0x067f:
            java.lang.String r12 = "bitdepthChroma must be the same for both views"
            com.google.android.gms.internal.ads.zzacr.zzb(r4, r12)
            if (r15 == 0) goto L_0x0698
            com.google.android.gms.internal.ads.zzfxk r4 = new com.google.android.gms.internal.ads.zzfxk
            r4.<init>()
            r4.zzh(r15)
            java.util.List r12 = r3.zza
            r4.zzh(r12)
            com.google.android.gms.internal.ads.zzfxn r15 = r4.zzi()
            goto L_0x069e
        L_0x0698:
            java.lang.String r4 = "initializationData must be already set from hvcC atom"
            r12 = 0
            com.google.android.gms.internal.ads.zzacr.zzb(r12, r4)
        L_0x069e:
            java.lang.String r3 = r3.zzk
            java.lang.String r4 = "video/mv-hevc"
            r57 = r2
            r48 = r3
            r53 = r7
            r56 = r9
            r63 = r49
            goto L_0x08f6
        L_0x06ae:
            r14 = 1986361461(0x76657875, float:1.16355385E33)
            if (r12 != r14) goto L_0x07dc
            int r12 = r3 + 8
            r0.zzL(r12)
            int r12 = r0.zzd()
            r53 = r7
            r14 = r12
            r12 = 0
        L_0x06c0:
            int r7 = r14 - r3
            if (r7 >= r10) goto L_0x0765
            r0.zzL(r14)
            int r7 = r0.zzg()
            if (r7 <= 0) goto L_0x06d1
            r54 = r8
            r8 = 1
            goto L_0x06d4
        L_0x06d1:
            r54 = r8
            r8 = 0
        L_0x06d4:
            com.google.android.gms.internal.ads.zzacr.zzb(r8, r9)
            int r8 = r0.zzg()
            r55 = r5
            r5 = 1702454643(0x65796573, float:7.360879E22)
            if (r8 != r5) goto L_0x0752
            int r5 = r14 + 8
            r0.zzL(r5)
            int r5 = r0.zzd()
        L_0x06eb:
            int r8 = r5 - r14
            if (r8 >= r7) goto L_0x074a
            r0.zzL(r5)
            int r8 = r0.zzg()
            if (r8 <= 0) goto L_0x06fa
            r12 = 1
            goto L_0x06fb
        L_0x06fa:
            r12 = 0
        L_0x06fb:
            com.google.android.gms.internal.ads.zzacr.zzb(r12, r9)
            int r12 = r0.zzg()
            r56 = r9
            r9 = 1937011305(0x73747269, float:1.936708E31)
            if (r12 != r9) goto L_0x0742
            r9 = 4
            r0.zzM(r9)
            int r5 = r0.zzm()
            r8 = r5 & 1
            r9 = r5 & 2
            r12 = 2
            if (r9 != r12) goto L_0x071a
            r9 = 1
            goto L_0x071b
        L_0x071a:
            r9 = 0
        L_0x071b:
            r12 = r5 & 8
            r57 = r2
            r2 = 8
            if (r12 != r2) goto L_0x0725
            r12 = 1
            goto L_0x0726
        L_0x0725:
            r12 = 0
        L_0x0726:
            r5 = r5 & 4
            r2 = 4
            if (r5 != r2) goto L_0x072d
            r2 = 1
            goto L_0x072e
        L_0x072d:
            r2 = 0
        L_0x072e:
            r5 = 1
            if (r5 == r8) goto L_0x0733
            r5 = 0
            goto L_0x0734
        L_0x0733:
            r5 = 1
        L_0x0734:
            com.google.android.gms.internal.ads.zzaib r8 = new com.google.android.gms.internal.ads.zzaib
            r58 = r15
            com.google.android.gms.internal.ads.zzaie r15 = new com.google.android.gms.internal.ads.zzaie
            r15.<init>(r5, r9, r12, r2)
            r8.<init>(r15)
            r12 = r8
            goto L_0x0758
        L_0x0742:
            r57 = r2
            r58 = r15
            int r5 = r5 + r8
            r9 = r56
            goto L_0x06eb
        L_0x074a:
            r57 = r2
            r56 = r9
            r58 = r15
            r12 = 0
            goto L_0x0758
        L_0x0752:
            r57 = r2
            r56 = r9
            r58 = r15
        L_0x0758:
            int r14 = r14 + r7
            r8 = r54
            r5 = r55
            r9 = r56
            r2 = r57
            r15 = r58
            goto L_0x06c0
        L_0x0765:
            r57 = r2
            r55 = r5
            r54 = r8
            r56 = r9
            r58 = r15
            if (r12 != 0) goto L_0x0773
            r5 = 0
            goto L_0x0778
        L_0x0773:
            com.google.android.gms.internal.ads.zzaij r5 = new com.google.android.gms.internal.ads.zzaij
            r5.<init>(r12)
        L_0x0778:
            if (r5 == 0) goto L_0x07d4
            if (r6 == 0) goto L_0x07a5
            com.google.android.gms.internal.ads.zzfxn r2 = r6.zza
            int r2 = r2.size()
            r3 = 2
            if (r2 < r3) goto L_0x07a2
            boolean r2 = r5.zzb()
            java.lang.String r3 = "both eye views must be marked as available"
            com.google.android.gms.internal.ads.zzacr.zzb(r2, r3)
            com.google.android.gms.internal.ads.zzaib r2 = r5.zza
            com.google.android.gms.internal.ads.zzaie r2 = r2.zza
            boolean r2 = r2.zzc
            r3 = 1
            r2 = r2 ^ r3
            java.lang.String r5 = "for MV-HEVC, eye_views_reversed must be set to false"
            com.google.android.gms.internal.ads.zzacr.zzb(r2, r5)
            goto L_0x07d4
        L_0x07a2:
            r3 = 1
            r2 = -1
            goto L_0x07a8
        L_0x07a5:
            r3 = 1
            r2 = -1
            r6 = 0
        L_0x07a8:
            if (r13 != r2) goto L_0x07ca
            com.google.android.gms.internal.ads.zzaib r2 = r5.zza
            com.google.android.gms.internal.ads.zzaie r2 = r2.zza
            boolean r2 = r2.zzc
            r63 = r49
            r8 = r54
            r5 = r55
            r15 = r58
            if (r3 == r2) goto L_0x07c5
            r2 = -1
            r3 = 3
            r13 = 4
            goto L_0x0ae5
        L_0x07c5:
            r2 = -1
            r3 = 3
            r13 = 5
            goto L_0x0ae5
        L_0x07ca:
            r63 = r49
            r8 = r54
            r5 = r55
            r15 = r58
            goto L_0x08f7
        L_0x07d4:
            r63 = r49
            r2 = -1
            r3 = 3
            r49 = r6
            goto L_0x0add
        L_0x07dc:
            r57 = r2
            r55 = r5
            r53 = r7
            r54 = r8
            r56 = r9
            r58 = r15
            r2 = 1685480259(0x64766343, float:1.8180206E22)
            if (r12 == r2) goto L_0x0aca
            r2 = 1685485123(0x64767643, float:1.8185683E22)
            if (r12 != r2) goto L_0x07f4
            goto L_0x0aca
        L_0x07f4:
            r2 = 1987076931(0x76706343, float:1.21891066E33)
            if (r12 != r2) goto L_0x0891
            if (r4 != 0) goto L_0x07fe
            r1 = 0
            r7 = 1
            goto L_0x0800
        L_0x07fe:
            r1 = 0
            r7 = 0
        L_0x0800:
            com.google.android.gms.internal.ads.zzacr.zzb(r7, r1)
            int r3 = r3 + 12
            r0.zzL(r3)
            int r1 = r0.zzm()
            byte r1 = (byte) r1
            int r2 = r0.zzm()
            byte r2 = (byte) r2
            int r3 = r0.zzm()
            int r4 = r3 >> 4
            int r5 = r3 >> 1
            r7 = 1987063864(0x76703038, float:1.21789965E33)
            r8 = r49
            if (r8 != r7) goto L_0x0824
            java.lang.String r7 = "video/x-vnd.on2.vp8"
            goto L_0x0826
        L_0x0824:
            java.lang.String r7 = "video/x-vnd.on2.vp9"
        L_0x0826:
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x0866
            r5 = r5 & 7
            byte r9 = (byte) r4
            int r11 = com.google.android.gms.internal.ads.zzcy.zza
            byte r5 = (byte) r5
            r14 = 12
            byte[] r11 = new byte[r14]
            r12 = 1
            r15 = 0
            r11[r15] = r12
            r11[r12] = r12
            r15 = 2
            r11[r15] = r1
            r1 = 3
            r11[r1] = r15
            r15 = 4
            r11[r15] = r12
            r11[r16] = r2
            r2 = 6
            r11[r2] = r1
            r2 = 7
            r11[r2] = r12
            r2 = 8
            r11[r2] = r9
            r2 = 9
            r11[r2] = r15
            r2 = 10
            r11[r2] = r12
            r2 = 11
            r11[r2] = r5
            com.google.android.gms.internal.ads.zzfxn r2 = com.google.android.gms.internal.ads.zzfxn.zzo(r11)
            r58 = r2
            goto L_0x086b
        L_0x0866:
            r1 = 3
            r12 = 1
            r14 = 12
            r15 = 4
        L_0x086b:
            r2 = r3 & 1
            int r3 = r0.zzm()
            int r5 = r0.zzm()
            int r3 = com.google.android.gms.internal.ads.zzk.zza(r3)
            if (r12 == r2) goto L_0x087d
            r9 = 2
            goto L_0x087e
        L_0x087d:
            r9 = 1
        L_0x087e:
            int r2 = com.google.android.gms.internal.ads.zzk.zzb(r5)
            r1 = r2
            r11 = r3
            r5 = r4
            r63 = r8
            r57 = r9
            r15 = r58
            r2 = -1
            r3 = 3
            r8 = r5
            r4 = r7
            goto L_0x0ae5
        L_0x0891:
            r8 = r49
            r2 = 3
            r14 = 12
            r15 = 4
            r5 = 1635135811(0x61763143, float:2.8384055E20)
            if (r12 != r5) goto L_0x08cb
            int r3 = r3 + 8
            int r1 = r10 + -8
            byte[] r4 = new byte[r1]
            r5 = 0
            r0.zzH(r4, r5, r1)
            com.google.android.gms.internal.ads.zzfxn r1 = com.google.android.gms.internal.ads.zzfxn.zzo(r4)
            r0.zzL(r3)
            com.google.android.gms.internal.ads.zzk r3 = zzk(r0)
            int r4 = r3.zzf
            int r7 = r3.zzg
            int r9 = r3.zzb
            int r11 = r3.zzc
            int r3 = r3.zzd
            java.lang.String r12 = "video/av01"
            r15 = r1
            r1 = r3
            r5 = r4
            r63 = r8
            r57 = r11
            r4 = r12
            r2 = -1
            r3 = 3
            r8 = r7
            r11 = r9
            goto L_0x0ae5
        L_0x08cb:
            r5 = 0
            r7 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r12 != r7) goto L_0x08fa
            if (r21 != 0) goto L_0x08d7
            java.nio.ByteBuffer r21 = zzn()
        L_0x08d7:
            r3 = r21
            r7 = 21
            r3.position(r7)
            short r7 = r0.zzE()
            r3.putShort(r7)
            short r7 = r0.zzE()
            r3.putShort(r7)
            r21 = r3
            r63 = r8
        L_0x08f0:
            r8 = r54
            r5 = r55
            r15 = r58
        L_0x08f6:
            r2 = -1
        L_0x08f7:
            r3 = 3
            goto L_0x0ae5
        L_0x08fa:
            r7 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r12 != r7) goto L_0x0966
            if (r21 != 0) goto L_0x0905
            java.nio.ByteBuffer r21 = zzn()
        L_0x0905:
            r3 = r21
            short r7 = r0.zzE()
            short r9 = r0.zzE()
            short r12 = r0.zzE()
            short r5 = r0.zzE()
            short r14 = r0.zzE()
            short r15 = r0.zzE()
            short r2 = r0.zzE()
            r49 = r6
            short r6 = r0.zzE()
            long r59 = r0.zzu()
            long r61 = r0.zzu()
            r63 = r8
            r8 = 1
            r3.position(r8)
            r3.putShort(r14)
            r3.putShort(r15)
            r3.putShort(r7)
            r3.putShort(r9)
            r3.putShort(r12)
            r3.putShort(r5)
            r3.putShort(r2)
            r3.putShort(r6)
            r5 = 10000(0x2710, double:4.9407E-320)
            long r5 = r59 / r5
            int r2 = (int) r5
            short r2 = (short) r2
            r3.putShort(r2)
            r5 = 10000(0x2710, double:4.9407E-320)
            long r5 = r61 / r5
            int r2 = (int) r5
            short r2 = (short) r2
            r3.putShort(r2)
            r21 = r3
        L_0x0963:
            r6 = r49
            goto L_0x08f0
        L_0x0966:
            r49 = r6
            r63 = r8
            r2 = 1681012275(0x64323633, float:1.3149704E22)
            if (r12 != r2) goto L_0x097d
            if (r4 != 0) goto L_0x0974
            r2 = 0
            r7 = 1
            goto L_0x0976
        L_0x0974:
            r2 = 0
            r7 = 0
        L_0x0976:
            com.google.android.gms.internal.ads.zzacr.zzb(r7, r2)
            java.lang.String r3 = "video/3gpp"
        L_0x097b:
            r4 = r3
            goto L_0x0963
        L_0x097d:
            r2 = 0
            r5 = 1702061171(0x65736473, float:7.183675E22)
            if (r12 != r5) goto L_0x09ad
            if (r4 != 0) goto L_0x0987
            r7 = 1
            goto L_0x0988
        L_0x0987:
            r7 = 0
        L_0x0988:
            com.google.android.gms.internal.ads.zzacr.zzb(r7, r2)
            com.google.android.gms.internal.ads.zzaia r2 = zzm(r0, r3)
            java.lang.String r3 = r2.zza
            byte[] r4 = r2.zzb
            if (r4 == 0) goto L_0x09aa
            com.google.android.gms.internal.ads.zzfxn r4 = com.google.android.gms.internal.ads.zzfxn.zzo(r4)
            r22 = r2
            r15 = r4
            r6 = r49
            r8 = r54
            r5 = r55
            r2 = -1
            r4 = r3
            goto L_0x08f7
        L_0x09aa:
            r22 = r2
            goto L_0x097b
        L_0x09ad:
            r2 = 1885434736(0x70617370, float:2.7909473E29)
            if (r12 != r2) goto L_0x09d2
            int r3 = r3 + 8
            r0.zzL(r3)
            int r2 = r0.zzp()
            int r3 = r0.zzp()
            float r2 = (float) r2
            float r3 = (float) r3
            float r2 = r2 / r3
            r47 = r2
            r6 = r49
            r8 = r54
            r5 = r55
            r15 = r58
            r2 = -1
            r3 = 3
            r30 = 1
            goto L_0x0ae5
        L_0x09d2:
            r2 = 1937126244(0x73763364, float:1.9506033E31)
            if (r12 != r2) goto L_0x0a0a
            int r2 = r3 + 8
        L_0x09d9:
            int r5 = r2 - r3
            if (r5 >= r10) goto L_0x09fc
            r0.zzL(r2)
            int r5 = r0.zzg()
            int r5 = r5 + r2
            int r6 = r0.zzg()
            r7 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r6 != r7) goto L_0x09fa
            byte[] r3 = r0.zzN()
            byte[] r2 = java.util.Arrays.copyOfRange(r3, r2, r5)
            r31 = r2
            goto L_0x0963
        L_0x09fa:
            r2 = r5
            goto L_0x09d9
        L_0x09fc:
            r6 = r49
            r8 = r54
            r5 = r55
            r15 = r58
            r2 = -1
            r3 = 3
            r31 = 0
            goto L_0x0ae5
        L_0x0a0a:
            r2 = 1936995172(0x73743364, float:1.9347576E31)
            if (r12 != r2) goto L_0x0a59
            int r2 = r0.zzm()
            r3 = 3
            r0.zzM(r3)
            if (r2 != 0) goto L_0x0ac8
            int r2 = r0.zzm()
            if (r2 == 0) goto L_0x0a4d
            r5 = 1
            if (r2 == r5) goto L_0x0a41
            r5 = 2
            if (r2 == r5) goto L_0x0a35
            if (r2 == r3) goto L_0x0a29
            goto L_0x0ac8
        L_0x0a29:
            r6 = r49
            r8 = r54
            r5 = r55
            r15 = r58
            r2 = -1
            r13 = 3
            goto L_0x0ae5
        L_0x0a35:
            r6 = r49
            r8 = r54
            r5 = r55
            r15 = r58
            r2 = -1
            r13 = 2
            goto L_0x0ae5
        L_0x0a41:
            r6 = r49
            r8 = r54
            r5 = r55
            r15 = r58
            r2 = -1
            r13 = 1
            goto L_0x0ae5
        L_0x0a4d:
            r6 = r49
            r8 = r54
            r5 = r55
            r15 = r58
            r2 = -1
            r13 = 0
            goto L_0x0ae5
        L_0x0a59:
            r3 = 3
            r2 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r12 != r2) goto L_0x0ac8
            r2 = -1
            if (r11 != r2) goto L_0x0add
            if (r1 != r2) goto L_0x0abe
            int r1 = r0.zzg()
            r5 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r1 == r5) goto L_0x0a8c
            r5 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r1 != r5) goto L_0x0a73
            goto L_0x0a8c
        L_0x0a73:
            java.lang.String r5 = "Unsupported color type: "
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeq.zze(r1)
            java.lang.String r1 = r5.concat(r1)
            java.lang.String r5 = "BoxParsers"
            com.google.android.gms.internal.ads.zzdo.zzf(r5, r1)
            r6 = r49
            r8 = r54
            r5 = r55
            r15 = r58
            r1 = -1
            goto L_0x0ac6
        L_0x0a8c:
            int r1 = r0.zzq()
            int r5 = r0.zzq()
            r6 = 2
            r0.zzM(r6)
            r6 = 19
            if (r10 != r6) goto L_0x0aaa
            int r7 = r0.zzm()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0aa6
            r7 = 1
            goto L_0x0aa7
        L_0x0aa6:
            r7 = 0
        L_0x0aa7:
            r10 = 19
            goto L_0x0aab
        L_0x0aaa:
            r7 = 0
        L_0x0aab:
            int r1 = com.google.android.gms.internal.ads.zzk.zza(r1)
            r6 = 1
            if (r6 == r7) goto L_0x0ab4
            r9 = 2
            goto L_0x0ab5
        L_0x0ab4:
            r9 = 1
        L_0x0ab5:
            int r5 = com.google.android.gms.internal.ads.zzk.zzb(r5)
            r11 = r1
            r1 = r5
            r57 = r9
            goto L_0x0add
        L_0x0abe:
            r6 = r49
            r8 = r54
            r5 = r55
            r15 = r58
        L_0x0ac6:
            r11 = -1
            goto L_0x0ae5
        L_0x0ac8:
            r2 = -1
            goto L_0x0add
        L_0x0aca:
            r63 = r49
            r2 = -1
            r3 = 3
            r49 = r6
            com.google.android.gms.internal.ads.zzacj r5 = com.google.android.gms.internal.ads.zzacj.zza(r0)
            if (r5 == 0) goto L_0x0add
            java.lang.String r4 = r5.zza
            java.lang.String r5 = "video/dolby-vision"
            r48 = r4
            r4 = r5
        L_0x0add:
            r6 = r49
            r8 = r54
            r5 = r55
            r15 = r58
        L_0x0ae5:
            int r10 = r51 + r10
            r12 = r50
            r14 = r52
            r7 = r53
            r9 = r56
            r2 = r57
            r49 = r63
            goto L_0x051f
        L_0x0af5:
            r57 = r2
            r55 = r5
            r53 = r7
            r54 = r8
            r50 = r12
            r52 = r14
            r58 = r15
            r2 = -1
            r3 = 3
            if (r4 != 0) goto L_0x0b0f
            r4 = r43
            r6 = r44
            r5 = r53
            goto L_0x0b98
        L_0x0b0f:
            com.google.android.gms.internal.ads.zzz r5 = new com.google.android.gms.internal.ads.zzz
            r5.<init>()
            r6 = r44
            r5.zzL(r6)
            r5.zzaa(r4)
            r4 = r48
            r5.zzA(r4)
            r4 = r45
            r5.zzaf(r4)
            r4 = r42
            r5.zzK(r4)
            r8 = r47
            r5.zzW(r8)
            r4 = r43
            r5.zzZ(r4)
            r7 = r31
            r5.zzX(r7)
            r5.zzad(r13)
            r15 = r58
            r5.zzN(r15)
            r7 = r46
            r5.zzS(r7)
            r7 = r28
            r5.zzF(r7)
            com.google.android.gms.internal.ads.zzi r7 = new com.google.android.gms.internal.ads.zzi
            r7.<init>()
            r7.zzc(r11)
            r8 = r57
            r7.zzb(r8)
            r7.zzd(r1)
            if (r21 == 0) goto L_0x0b63
            byte[] r1 = r21.array()
            goto L_0x0b64
        L_0x0b63:
            r1 = 0
        L_0x0b64:
            r7.zze(r1)
            r1 = r55
            r7.zzf(r1)
            r8 = r54
            r7.zza(r8)
            com.google.android.gms.internal.ads.zzk r1 = r7.zzg()
            r5.zzB(r1)
            if (r22 == 0) goto L_0x0b90
            long r7 = r22.zzc
            int r1 = com.google.android.gms.internal.ads.zzgaq.zze(r7)
            r5.zzy(r1)
            long r7 = r22.zzd
            int r1 = com.google.android.gms.internal.ads.zzgaq.zze(r7)
            r5.zzV(r1)
        L_0x0b90:
            com.google.android.gms.internal.ads.zzab r1 = r5.zzag()
            r5 = r53
            r5.zzb = r1
        L_0x0b98:
            int r14 = r52 + r50
            r0.zzL(r14)
            int r1 = r25 + 1
            r11 = r69
            r8 = r4
            r2 = r5
            r10 = r6
            r7 = r20
            r3 = r26
            r14 = r34
            r12 = r35
            r15 = r36
            r6 = r37
            r13 = r38
            r30 = r40
            r4 = 12
            r9 = -1
            r5 = r0
            r0 = r29
            goto L_0x025a
        L_0x0bbc:
            r29 = r0
            r5 = r2
            r37 = r6
            r35 = r12
            r38 = r13
            r34 = r14
            r36 = r15
            r40 = r30
            if (r70 != 0) goto L_0x0c3d
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r1 = r36
            com.google.android.gms.internal.ads.zzen r0 = r1.zza(r0)
            if (r0 == 0) goto L_0x0c3f
            r2 = 1701606260(0x656c7374, float:6.9788014E22)
            com.google.android.gms.internal.ads.zzeo r0 = r0.zzb(r2)
            if (r0 != 0) goto L_0x0be3
            r0 = 0
            goto L_0x0c32
        L_0x0be3:
            com.google.android.gms.internal.ads.zzdy r0 = r0.zza
            r2 = 8
            r0.zzL(r2)
            int r2 = r0.zzg()
            int r2 = zza(r2)
            int r3 = r0.zzp()
            long[] r4 = new long[r3]
            long[] r6 = new long[r3]
            r7 = 0
        L_0x0bfb:
            if (r7 >= r3) goto L_0x0c2e
            r8 = 1
            if (r2 != r8) goto L_0x0c05
            long r9 = r0.zzw()
            goto L_0x0c09
        L_0x0c05:
            long r9 = r0.zzu()
        L_0x0c09:
            r4[r7] = r9
            if (r2 != r8) goto L_0x0c12
            long r9 = r0.zzt()
            goto L_0x0c17
        L_0x0c12:
            int r9 = r0.zzg()
            long r9 = (long) r9
        L_0x0c17:
            r6[r7] = r9
            short r9 = r0.zzE()
            if (r9 != r8) goto L_0x0c26
            r9 = 2
            r0.zzM(r9)
            int r7 = r7 + 1
            goto L_0x0bfb
        L_0x0c26:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0c2e:
            android.util.Pair r0 = android.util.Pair.create(r4, r6)
        L_0x0c32:
            if (r0 == 0) goto L_0x0c3f
            java.lang.Object r2 = r0.first
            long[] r2 = (long[]) r2
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            goto L_0x0c41
        L_0x0c3d:
            r1 = r36
        L_0x0c3f:
            r0 = 0
            r2 = 0
        L_0x0c41:
            com.google.android.gms.internal.ads.zzab r3 = r5.zzb
            if (r3 != 0) goto L_0x0c49
            r0 = r72
            goto L_0x0091
        L_0x0c49:
            com.google.android.gms.internal.ads.zzajb r4 = new com.google.android.gms.internal.ads.zzajb
            r17 = r4
            int r18 = r38.zza
            long r20 = r29.zza
            long r26 = r29.zzb
            int r6 = r5.zzd
            r29 = r6
            com.google.android.gms.internal.ads.zzajc[] r6 = r5.zza
            r30 = r6
            int r5 = r5.zzc
            r31 = r5
            r19 = r37
            r22 = r40
            r24 = r32
            r28 = r3
            r32 = r2
            r33 = r0
            r17.<init>(r18, r19, r20, r22, r24, r26, r28, r29, r30, r31, r32, r33)
            r0 = r72
            r5 = r4
        L_0x0c77:
            java.lang.Object r2 = r0.apply(r5)
            com.google.android.gms.internal.ads.zzajb r2 = (com.google.android.gms.internal.ads.zzajb) r2
            if (r2 == 0) goto L_0x0cb2
            r3 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzen r1 = r1.zza(r3)
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzen r3 = (com.google.android.gms.internal.ads.zzen) r3
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzen r1 = r1.zza(r3)
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzen r3 = (com.google.android.gms.internal.ads.zzen) r3
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzen r1 = r1.zza(r3)
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzen r3 = (com.google.android.gms.internal.ads.zzen) r3
            r3 = r66
            com.google.android.gms.internal.ads.zzaje r1 = zze(r2, r1, r3)
            r2 = r35
            r2.add(r1)
            goto L_0x0cb6
        L_0x0cb2:
            r3 = r66
            r2 = r35
        L_0x0cb6:
            int r14 = r34 + 1
            r0 = r65
            r11 = r69
            r12 = r2
            goto L_0x000a
        L_0x0cbf:
            java.lang.String r0 = "Malformed sample table (stbl) missing sample description (stsd)"
            r1 = 0
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r1)
            throw r0
        L_0x0cc7:
            r2 = r12
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzf(com.google.android.gms.internal.ads.zzen, com.google.android.gms.internal.ads.zzadb, long, com.google.android.gms.internal.ads.zzu, boolean, boolean, com.google.android.gms.internal.ads.zzfuc):java.util.List");
    }

    public static void zzg(zzdy zzdy) {
        int zzd = zzdy.zzd();
        zzdy.zzM(4);
        if (zzdy.zzg() != 1751411826) {
            zzd += 4;
        }
        zzdy.zzL(zzd);
    }

    private static int zzh(zzdy zzdy) {
        int zzm = zzdy.zzm();
        int i = zzm & WorkQueueKt.MASK;
        while ((zzm & 128) == 128) {
            zzm = zzdy.zzm();
            i = (i << 7) | (zzm & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zzi(zzdy zzdy) {
        zzdy.zzL(16);
        return zzdy.zzg();
    }

    private static Pair zzj(zzdy zzdy, int i, int i2) throws zzbc {
        Pair pair;
        Integer num;
        zzajc zzajc;
        int i3;
        int i4;
        byte[] bArr;
        zzdy zzdy2 = zzdy;
        int zzd = zzdy.zzd();
        while (zzd - i < i2) {
            zzdy2.zzL(zzd);
            int zzg = zzdy.zzg();
            boolean z = true;
            zzacr.zzb(zzg > 0, "childAtomSize must be positive");
            if (zzdy.zzg() == 1936289382) {
                int i5 = zzd + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - zzd < zzg) {
                    zzdy2.zzL(i5);
                    int zzg2 = zzdy.zzg();
                    int zzg3 = zzdy.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzdy.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzdy2.zzM(4);
                        str = zzdy2.zzB(4, StandardCharsets.UTF_8);
                    } else if (zzg3 == 1935894633) {
                        i6 = i5;
                        i7 = zzg2;
                    }
                    i5 += zzg2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzacr.zzb(num2 != null, "frma atom is mandatory");
                    zzacr.zzb(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            zzajc = null;
                            break;
                        }
                        zzdy2.zzL(i8);
                        int zzg4 = zzdy.zzg();
                        if (zzdy.zzg() == 1952804451) {
                            int zza2 = zza(zzdy.zzg());
                            zzdy2.zzM(1);
                            if (zza2 == 0) {
                                zzdy2.zzM(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int zzm = zzdy.zzm();
                                i4 = zzm & 15;
                                i3 = (zzm & 240) >> 4;
                            }
                            boolean z2 = zzdy.zzm() == 1;
                            int zzm2 = zzdy.zzm();
                            byte[] bArr2 = new byte[16];
                            zzdy2.zzH(bArr2, 0, 16);
                            if (!z2 || zzm2 != 0) {
                                bArr = null;
                            } else {
                                int zzm3 = zzdy.zzm();
                                byte[] bArr3 = new byte[zzm3];
                                zzdy2.zzH(bArr3, 0, zzm3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzajc = new zzajc(z2, str, zzm2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i8 += zzg4;
                        }
                    }
                    if (zzajc == null) {
                        z = false;
                    }
                    zzacr.zzb(z, "tenc atom is mandatory");
                    int i9 = zzei.zza;
                    zzajc zzajc2 = zzajc;
                    pair = Pair.create(num, zzajc);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            zzd += zzg;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0144, code lost:
        if (r6 == 1) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzk zzk(com.google.android.gms.internal.ads.zzdy r15) {
        /*
            com.google.android.gms.internal.ads.zzi r0 = new com.google.android.gms.internal.ads.zzi
            r0.<init>()
            com.google.android.gms.internal.ads.zzdx r1 = new com.google.android.gms.internal.ads.zzdx
            byte[] r2 = r15.zzN()
            int r3 = r2.length
            r1.<init>(r2, r3)
            int r15 = r15.zzd()
            r2 = 8
            int r15 = r15 * 8
            r1.zzl(r15)
            r15 = 1
            r1.zzo(r15)
            r3 = 3
            int r4 = r1.zzd(r3)
            r5 = 6
            r1.zzn(r5)
            boolean r5 = r1.zzp()
            boolean r6 = r1.zzp()
            r7 = 12
            r8 = 10
            r9 = 0
            r10 = 2
            if (r4 != r10) goto L_0x0047
            if (r5 == 0) goto L_0x0045
            if (r15 == r6) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r8 = 12
        L_0x003e:
            r0.zzf(r8)
            r0.zza(r8)
            goto L_0x0053
        L_0x0045:
            r4 = 2
            r5 = 0
        L_0x0047:
            if (r4 > r10) goto L_0x0053
            if (r15 == r5) goto L_0x004d
            r8 = 8
        L_0x004d:
            r0.zzf(r8)
            r0.zza(r8)
        L_0x0053:
            r4 = 13
            r1.zzn(r4)
            r1.zzm()
            r5 = 4
            int r6 = r1.zzd(r5)
            java.lang.String r8 = "BoxParsers"
            if (r6 == r15) goto L_0x007a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported obu_type: "
            r15.<init>(r1)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            com.google.android.gms.internal.ads.zzdo.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x007a:
            boolean r6 = r1.zzp()
            if (r6 == 0) goto L_0x008a
            java.lang.String r15 = "Unsupported obu_extension_flag"
            com.google.android.gms.internal.ads.zzdo.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x008a:
            boolean r6 = r1.zzp()
            r1.zzm()
            if (r6 == 0) goto L_0x00a6
            int r6 = r1.zzd(r2)
            r11 = 127(0x7f, float:1.78E-43)
            if (r6 > r11) goto L_0x009c
            goto L_0x00a6
        L_0x009c:
            java.lang.String r15 = "Excessive obu_size"
            com.google.android.gms.internal.ads.zzdo.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x00a6:
            int r6 = r1.zzd(r3)
            r1.zzm()
            boolean r11 = r1.zzp()
            if (r11 == 0) goto L_0x00bd
            java.lang.String r15 = "Unsupported reduced_still_picture_header"
            com.google.android.gms.internal.ads.zzdo.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x00bd:
            boolean r11 = r1.zzp()
            if (r11 == 0) goto L_0x00cd
            java.lang.String r15 = "Unsupported timing_info_present_flag"
            com.google.android.gms.internal.ads.zzdo.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x00cd:
            boolean r11 = r1.zzp()
            if (r11 == 0) goto L_0x00dd
            java.lang.String r15 = "Unsupported initial_display_delay_present_flag"
            com.google.android.gms.internal.ads.zzdo.zze(r8, r15)
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        L_0x00dd:
            r8 = 5
            int r11 = r1.zzd(r8)
            r12 = 0
        L_0x00e3:
            r13 = 7
            if (r12 > r11) goto L_0x00f5
            r1.zzn(r7)
            int r14 = r1.zzd(r8)
            if (r14 <= r13) goto L_0x00f2
            r1.zzm()
        L_0x00f2:
            int r12 = r12 + 1
            goto L_0x00e3
        L_0x00f5:
            int r7 = r1.zzd(r5)
            int r5 = r1.zzd(r5)
            int r7 = r7 + r15
            r1.zzn(r7)
            int r5 = r5 + r15
            r1.zzn(r5)
            boolean r5 = r1.zzp()
            if (r5 == 0) goto L_0x010e
            r1.zzn(r13)
        L_0x010e:
            r1.zzn(r13)
            boolean r5 = r1.zzp()
            if (r5 == 0) goto L_0x011a
            r1.zzn(r10)
        L_0x011a:
            boolean r7 = r1.zzp()
            if (r7 == 0) goto L_0x0121
            goto L_0x0127
        L_0x0121:
            int r7 = r1.zzd(r15)
            if (r7 <= 0) goto L_0x0130
        L_0x0127:
            boolean r7 = r1.zzp()
            if (r7 != 0) goto L_0x0130
            r1.zzn(r15)
        L_0x0130:
            if (r5 == 0) goto L_0x0135
            r1.zzn(r3)
        L_0x0135:
            r1.zzn(r3)
            boolean r3 = r1.zzp()
            if (r6 != r10) goto L_0x0144
            if (r3 == 0) goto L_0x0147
            r1.zzm()
            goto L_0x0147
        L_0x0144:
            if (r6 != r15) goto L_0x0147
            goto L_0x014e
        L_0x0147:
            boolean r3 = r1.zzp()
            if (r3 == 0) goto L_0x014e
            r9 = 1
        L_0x014e:
            boolean r3 = r1.zzp()
            if (r3 == 0) goto L_0x0188
            int r3 = r1.zzd(r2)
            int r5 = r1.zzd(r2)
            int r2 = r1.zzd(r2)
            if (r9 != 0) goto L_0x016e
            if (r3 != r15) goto L_0x016e
            if (r5 != r4) goto L_0x016b
            if (r2 != 0) goto L_0x016c
            r1 = 1
            r3 = 1
            goto L_0x0173
        L_0x016b:
            r4 = r5
        L_0x016c:
            r3 = 1
            goto L_0x016f
        L_0x016e:
            r4 = r5
        L_0x016f:
            int r1 = r1.zzd(r15)
        L_0x0173:
            int r2 = com.google.android.gms.internal.ads.zzk.zza(r3)
            r0.zzc(r2)
            if (r1 != r15) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r15 = 2
        L_0x017e:
            r0.zzb(r15)
            int r15 = com.google.android.gms.internal.ads.zzk.zzb(r4)
            r0.zzd(r15)
        L_0x0188:
            com.google.android.gms.internal.ads.zzk r15 = r0.zzg()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzk(com.google.android.gms.internal.ads.zzdy):com.google.android.gms.internal.ads.zzk");
    }

    private static zzay zzl(zzdy zzdy) {
        short zzE = zzdy.zzE();
        zzdy.zzM(2);
        String zzB = zzdy.zzB(zzE, StandardCharsets.UTF_8);
        int max = Math.max(zzB.lastIndexOf(43), zzB.lastIndexOf(45));
        try {
            return new zzay(-9223372036854775807L, new zzet(Float.parseFloat(zzB.substring(0, max)), Float.parseFloat(zzB.substring(max, zzB.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzaia zzm(zzdy zzdy, int i) {
        zzdy.zzL(i + 12);
        zzdy.zzM(1);
        zzh(zzdy);
        zzdy.zzM(2);
        int zzm = zzdy.zzm();
        if ((zzm & 128) != 0) {
            zzdy.zzM(2);
        }
        if ((zzm & 64) != 0) {
            zzdy.zzM(zzdy.zzm());
        }
        if ((zzm & 32) != 0) {
            zzdy.zzM(2);
        }
        zzdy.zzM(1);
        zzh(zzdy);
        String zzd = zzbb.zzd(zzdy.zzm());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzaia(zzd, (byte[]) null, -1, -1);
        }
        zzdy.zzM(4);
        long zzu = zzdy.zzu();
        long zzu2 = zzdy.zzu();
        zzdy.zzM(1);
        int zzh = zzh(zzdy);
        byte[] bArr = new byte[zzh];
        zzdy.zzH(bArr, 0, zzh);
        return new zzaia(zzd, bArr, zzu2 <= 0 ? -1 : zzu2, zzu > 0 ? zzu : -1);
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzo(com.google.android.gms.internal.ads.zzdy r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, com.google.android.gms.internal.ads.zzu r33, com.google.android.gms.internal.ads.zzaif r34, int r35) throws com.google.android.gms.internal.ads.zzbc {
        /*
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r33
            r7 = r34
            int r8 = r2 + 16
            r0.zzL(r8)
            r8 = 6
            r9 = 8
            if (r32 == 0) goto L_0x0022
            int r11 = r26.zzq()
            r0.zzM(r8)
            goto L_0x0026
        L_0x0022:
            r0.zzM(r9)
            r11 = 0
        L_0x0026:
            r14 = 32
            r15 = 4
            r12 = 2
            r10 = 1
            r13 = 16
            if (r11 == 0) goto L_0x0087
            if (r11 != r10) goto L_0x0032
            goto L_0x0087
        L_0x0032:
            if (r11 != r12) goto L_0x054f
            r0.zzM(r13)
            long r19 = r26.zzt()
            double r19 = java.lang.Double.longBitsToDouble(r19)
            long r10 = java.lang.Math.round(r19)
            int r8 = (int) r10
            int r10 = r26.zzp()
            r0.zzM(r15)
            int r11 = r26.zzp()
            int r19 = r26.zzp()
            r20 = r19 & 1
            r19 = r19 & 2
            if (r20 != 0) goto L_0x007c
            if (r11 != r9) goto L_0x005d
            r11 = 3
            goto L_0x0081
        L_0x005d:
            if (r11 != r13) goto L_0x0066
            if (r19 == 0) goto L_0x0064
            r11 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0081
        L_0x0064:
            r11 = 2
            goto L_0x0081
        L_0x0066:
            r13 = 24
            if (r11 != r13) goto L_0x0072
            if (r19 == 0) goto L_0x006f
            r11 = 1342177280(0x50000000, float:8.5899346E9)
            goto L_0x0081
        L_0x006f:
            r11 = 21
            goto L_0x0081
        L_0x0072:
            if (r11 != r14) goto L_0x0080
            if (r19 == 0) goto L_0x0079
            r11 = 1610612736(0x60000000, float:3.6893488E19)
            goto L_0x0081
        L_0x0079:
            r11 = 22
            goto L_0x0081
        L_0x007c:
            if (r11 != r14) goto L_0x0080
            r11 = 4
            goto L_0x0081
        L_0x0080:
            r11 = -1
        L_0x0081:
            r0.zzM(r9)
            r9 = r10
            r10 = 0
            goto L_0x00a6
        L_0x0087:
            int r9 = r26.zzq()
            r0.zzM(r8)
            int r8 = r26.zzn()
            int r10 = r26.zzd()
            int r10 = r10 + -4
            r0.zzL(r10)
            int r10 = r26.zzg()
            r15 = 1
            if (r11 != r15) goto L_0x00a5
            r0.zzM(r13)
        L_0x00a5:
            r11 = -1
        L_0x00a6:
            r13 = 1767992678(0x69616d66, float:1.7032808E25)
            if (r1 != r13) goto L_0x00ac
            r8 = -1
        L_0x00ac:
            if (r1 != r13) goto L_0x00af
            r9 = -1
        L_0x00af:
            int r15 = r26.zzd()
            r12 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r1 != r12) goto L_0x00e0
            android.util.Pair r1 = zzj(r0, r2, r3)
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r12 = r1.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r6 != 0) goto L_0x00ca
            r6 = 0
            goto L_0x00d4
        L_0x00ca:
            java.lang.Object r14 = r1.second
            com.google.android.gms.internal.ads.zzajc r14 = (com.google.android.gms.internal.ads.zzajc) r14
            java.lang.String r14 = r14.zzb
            com.google.android.gms.internal.ads.zzu r6 = r6.zzb(r14)
        L_0x00d4:
            com.google.android.gms.internal.ads.zzajc[] r14 = r7.zza
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.zzajc r1 = (com.google.android.gms.internal.ads.zzajc) r1
            r14[r35] = r1
        L_0x00dc:
            r0.zzL(r15)
            goto L_0x00e1
        L_0x00e0:
            r12 = r1
        L_0x00e1:
            r1 = 1633889587(0x61632d33, float:2.6191674E20)
            java.lang.String r13 = "audio/mhm1"
            java.lang.String r14 = "audio/ac4"
            if (r12 != r1) goto L_0x00ef
            java.lang.String r1 = "audio/ac3"
        L_0x00ec:
            r12 = r11
            goto L_0x01be
        L_0x00ef:
            r1 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r12 != r1) goto L_0x00f7
            java.lang.String r1 = "audio/eac3"
            goto L_0x00ec
        L_0x00f7:
            r1 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r12 != r1) goto L_0x0100
            r12 = r11
            r1 = r14
            goto L_0x01be
        L_0x0100:
            r1 = 1685353315(0x64747363, float:1.803728E22)
            if (r12 != r1) goto L_0x0108
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x00ec
        L_0x0108:
            r1 = 1685353320(0x64747368, float:1.8037286E22)
            if (r12 == r1) goto L_0x01ba
            r1 = 1685353324(0x6474736c, float:1.803729E22)
            if (r12 != r1) goto L_0x0114
            goto L_0x01ba
        L_0x0114:
            r1 = 1685353317(0x64747365, float:1.8037282E22)
            if (r12 != r1) goto L_0x011c
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00ec
        L_0x011c:
            r1 = 1685353336(0x64747378, float:1.8037304E22)
            if (r12 != r1) goto L_0x0124
            java.lang.String r1 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x00ec
        L_0x0124:
            r1 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r12 != r1) goto L_0x012c
            java.lang.String r1 = "audio/3gpp"
            goto L_0x00ec
        L_0x012c:
            r1 = 1935767394(0x73617762, float:1.7863284E31)
            if (r12 != r1) goto L_0x0134
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x00ec
        L_0x0134:
            r1 = 1936684916(0x736f7774, float:1.89725E31)
            java.lang.String r23 = "audio/raw"
            if (r12 != r1) goto L_0x0140
        L_0x013b:
            r1 = r23
            r12 = 2
            goto L_0x01be
        L_0x0140:
            r1 = 1953984371(0x74776f73, float:7.841539E31)
            if (r12 != r1) goto L_0x014b
            r1 = r23
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x01be
        L_0x014b:
            r1 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r12 != r1) goto L_0x0159
            r1 = -1
            if (r11 != r1) goto L_0x0154
            goto L_0x013b
        L_0x0154:
            r12 = r11
            r1 = r23
            goto L_0x01be
        L_0x0159:
            r1 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r12 == r1) goto L_0x01b6
            r1 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r12 != r1) goto L_0x0164
            goto L_0x01b6
        L_0x0164:
            r1 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r12 != r1) goto L_0x016c
            java.lang.String r1 = "audio/mha1"
            goto L_0x00ec
        L_0x016c:
            r1 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r12 != r1) goto L_0x0174
            r12 = r11
            r1 = r13
            goto L_0x01be
        L_0x0174:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r12 != r1) goto L_0x017d
            java.lang.String r1 = "audio/alac"
            goto L_0x00ec
        L_0x017d:
            r1 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r12 != r1) goto L_0x0186
            java.lang.String r1 = "audio/g711-alaw"
            goto L_0x00ec
        L_0x0186:
            r1 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r12 != r1) goto L_0x018f
            java.lang.String r1 = "audio/g711-mlaw"
            goto L_0x00ec
        L_0x018f:
            r1 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r12 != r1) goto L_0x0198
            java.lang.String r1 = "audio/opus"
            goto L_0x00ec
        L_0x0198:
            r1 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r12 != r1) goto L_0x01a1
            java.lang.String r1 = "audio/flac"
            goto L_0x00ec
        L_0x01a1:
            r1 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r12 != r1) goto L_0x01aa
            java.lang.String r1 = "audio/true-hd"
            goto L_0x00ec
        L_0x01aa:
            r1 = 1767992678(0x69616d66, float:1.7032808E25)
            if (r12 != r1) goto L_0x01b3
            java.lang.String r1 = "audio/iamf"
            goto L_0x00ec
        L_0x01b3:
            r12 = r11
            r1 = 0
            goto L_0x01be
        L_0x01b6:
            java.lang.String r1 = "audio/mpeg"
            goto L_0x00ec
        L_0x01ba:
            java.lang.String r1 = "audio/vnd.dts.hd"
            goto L_0x00ec
        L_0x01be:
            r16 = r12
            r12 = 0
            r22 = 0
            r23 = 0
        L_0x01c5:
            int r11 = r15 - r2
            if (r11 >= r3) goto L_0x0506
            r0.zzL(r15)
            int r11 = r26.zzg()
            if (r11 <= 0) goto L_0x01d4
            r2 = 1
            goto L_0x01d5
        L_0x01d4:
            r2 = 0
        L_0x01d5:
            java.lang.String r3 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzacr.zzb(r2, r3)
            int r2 = r26.zzg()
            r33 = r8
            r8 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r2 != r8) goto L_0x023e
            int r2 = r15 + 8
            r0.zzL(r2)
            r2 = 1
            r0.zzM(r2)
            int r3 = r26.zzm()
            r0.zzM(r2)
            boolean r8 = java.util.Objects.equals(r1, r13)
            if (r8 == 0) goto L_0x020d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r2 = 0
            r8[r2] = r3
            java.lang.String r3 = "mhm1.%02X"
            java.lang.String r3 = java.lang.String.format(r3, r8)
            r35 = r13
            goto L_0x021f
        L_0x020d:
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r35 = r13
            r8 = 1
            java.lang.Object[] r13 = new java.lang.Object[r8]
            r13[r2] = r3
            java.lang.String r3 = "mha1.%02X"
            java.lang.String r3 = java.lang.String.format(r3, r13)
        L_0x021f:
            int r8 = r26.zzq()
            byte[] r13 = new byte[r8]
            r0.zzH(r13, r2, r8)
            if (r12 != 0) goto L_0x022f
            com.google.android.gms.internal.ads.zzfxn r12 = com.google.android.gms.internal.ads.zzfxn.zzo(r13)
            goto L_0x0239
        L_0x022f:
            java.lang.Object r8 = r12.get(r2)
            byte[] r8 = (byte[]) r8
            com.google.android.gms.internal.ads.zzfxn r12 = com.google.android.gms.internal.ads.zzfxn.zzp(r13, r8)
        L_0x0239:
            r8 = r33
            r23 = r3
            goto L_0x0269
        L_0x023e:
            r35 = r13
            r8 = 1835557200(0x6d686150, float:4.4948854E27)
            if (r2 != r8) goto L_0x027d
            int r2 = r15 + 8
            r0.zzL(r2)
            int r2 = r26.zzm()
            if (r2 <= 0) goto L_0x0272
            byte[] r3 = new byte[r2]
            r8 = 0
            r0.zzH(r3, r8, r2)
            if (r12 != 0) goto L_0x025d
            com.google.android.gms.internal.ads.zzfxn r12 = com.google.android.gms.internal.ads.zzfxn.zzo(r3)
            goto L_0x0267
        L_0x025d:
            java.lang.Object r2 = r12.get(r8)
            byte[] r2 = (byte[]) r2
            com.google.android.gms.internal.ads.zzfxn r12 = com.google.android.gms.internal.ads.zzfxn.zzp(r2, r3)
        L_0x0267:
            r8 = r33
        L_0x0269:
            r24 = r10
        L_0x026b:
            r10 = 0
            r17 = 3
            r20 = 2
            goto L_0x04f9
        L_0x0272:
            r3 = r33
            r24 = r10
            r10 = 0
            r17 = 3
            r20 = 2
            goto L_0x04f8
        L_0x027d:
            r8 = 1702061171(0x65736473, float:7.183675E22)
            if (r2 == r8) goto L_0x0457
            if (r32 == 0) goto L_0x02c7
            r13 = 2002876005(0x77617665, float:4.5729223E33)
            if (r2 != r13) goto L_0x02c7
            int r2 = r26.zzd()
            if (r2 < r15) goto L_0x0292
            r8 = 0
            r13 = 1
            goto L_0x0294
        L_0x0292:
            r8 = 0
            r13 = 0
        L_0x0294:
            com.google.android.gms.internal.ads.zzacr.zzb(r13, r8)
        L_0x0297:
            int r8 = r2 - r15
            if (r8 >= r11) goto L_0x02bc
            r0.zzL(r2)
            int r8 = r26.zzg()
            if (r8 <= 0) goto L_0x02a6
            r13 = 1
            goto L_0x02a7
        L_0x02a6:
            r13 = 0
        L_0x02a7:
            com.google.android.gms.internal.ads.zzacr.zzb(r13, r3)
            int r13 = r26.zzg()
            r25 = r3
            r3 = 1702061171(0x65736473, float:7.183675E22)
            if (r13 == r3) goto L_0x02b9
            int r2 = r2 + r8
            r3 = r25
            goto L_0x0297
        L_0x02b9:
            r3 = r33
            goto L_0x02bf
        L_0x02bc:
            r3 = r33
            r2 = -1
        L_0x02bf:
            r8 = -1
            r13 = 4
            r17 = 3
            r20 = 2
            goto L_0x0460
        L_0x02c7:
            r3 = 1684103987(0x64616333, float:1.6630662E22)
            if (r2 != r3) goto L_0x02dc
            int r2 = r15 + 8
            r0.zzL(r2)
            java.lang.String r2 = java.lang.Integer.toString(r30)
            com.google.android.gms.internal.ads.zzab r2 = com.google.android.gms.internal.ads.zzabn.zzc(r0, r2, r5, r6)
            r7.zzb = r2
            goto L_0x0272
        L_0x02dc:
            r3 = 1684366131(0x64656333, float:1.692581E22)
            if (r2 != r3) goto L_0x02f1
            int r2 = r15 + 8
            r0.zzL(r2)
            java.lang.String r2 = java.lang.Integer.toString(r30)
            com.google.android.gms.internal.ads.zzab r2 = com.google.android.gms.internal.ads.zzabn.zzd(r0, r2, r5, r6)
            r7.zzb = r2
            goto L_0x0272
        L_0x02f1:
            r3 = 1684103988(0x64616334, float:1.6630663E22)
            if (r2 != r3) goto L_0x0337
            int r2 = r15 + 8
            r0.zzL(r2)
            java.lang.String r2 = java.lang.Integer.toString(r30)
            int r3 = com.google.android.gms.internal.ads.zzabq.zza
            r3 = 1
            r0.zzM(r3)
            int r8 = r26.zzm()
            r13 = 32
            r8 = r8 & r13
            com.google.android.gms.internal.ads.zzz r13 = new com.google.android.gms.internal.ads.zzz
            r13.<init>()
            r13.zzM(r2)
            r13.zzaa(r14)
            r2 = 2
            r13.zzz(r2)
            int r2 = r8 >> 5
            if (r3 == r2) goto L_0x0323
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L_0x0326
        L_0x0323:
            r2 = 48000(0xbb80, float:6.7262E-41)
        L_0x0326:
            r13.zzab(r2)
            r13.zzF(r6)
            r13.zzQ(r5)
            com.google.android.gms.internal.ads.zzab r2 = r13.zzag()
            r7.zzb = r2
            goto L_0x0272
        L_0x0337:
            r3 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r2 != r3) goto L_0x0358
            if (r10 <= 0) goto L_0x0344
            r8 = r10
            r24 = r8
            r9 = 2
            goto L_0x026b
        L_0x0344:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r3 = 0
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r3)
            throw r0
        L_0x0358:
            r3 = 0
            r8 = 1684305011(0x64647473, float:1.6856995E22)
            if (r2 == r8) goto L_0x042e
            r8 = 1969517683(0x75647473, float:2.8960097E32)
            if (r2 != r8) goto L_0x0365
            goto L_0x042e
        L_0x0365:
            r8 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r2 != r8) goto L_0x0383
            int r2 = r15 + 8
            int r8 = r11 + -8
            byte[] r12 = zzb
            int r13 = r12.length
            int r13 = r13 + r8
            byte[] r13 = java.util.Arrays.copyOf(r12, r13)
            r0.zzL(r2)
            int r2 = r12.length
            r0.zzH(r13, r2, r8)
            java.util.List r12 = com.google.android.gms.internal.ads.zzadi.zze(r13)
            goto L_0x0267
        L_0x0383:
            r8 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r2 != r8) goto L_0x03ba
            int r2 = r15 + 12
            int r8 = r11 + -12
            int r12 = r11 + -8
            byte[] r12 = new byte[r12]
            r13 = 102(0x66, float:1.43E-43)
            r18 = 0
            r12[r18] = r13
            r13 = 76
            r21 = 1
            r12[r21] = r13
            r13 = 97
            r20 = 2
            r12[r20] = r13
            r13 = 67
            r17 = 3
            r12[r17] = r13
            r0.zzL(r2)
            r13 = 4
            r0.zzH(r12, r13, r8)
            com.google.android.gms.internal.ads.zzfxn r12 = com.google.android.gms.internal.ads.zzfxn.zzo(r12)
        L_0x03b3:
            r8 = r33
        L_0x03b5:
            r24 = r10
            r10 = 0
            goto L_0x04f9
        L_0x03ba:
            r8 = 1634492771(0x616c6163, float:2.7252807E20)
            r13 = 4
            r17 = 3
            r20 = 2
            if (r2 != r8) goto L_0x040d
            int r2 = r15 + 12
            int r9 = r11 + -12
            byte[] r12 = new byte[r9]
            r0.zzL(r2)
            r2 = 0
            r0.zzH(r12, r2, r9)
            int r2 = com.google.android.gms.internal.ads.zzcy.zza
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            r2.<init>((byte[]) r12)
            r9 = 9
            r2.zzL(r9)
            int r9 = r2.zzm()
            r3 = 20
            r2.zzL(r3)
            int r2 = r2.zzp()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            android.util.Pair r2 = android.util.Pair.create(r2, r3)
            java.lang.Object r3 = r2.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.zzfxn r12 = com.google.android.gms.internal.ads.zzfxn.zzo(r12)
            r9 = r2
            r8 = r3
            goto L_0x03b5
        L_0x040d:
            r3 = 1767990114(0x69616362, float:1.7029852E25)
            if (r2 != r3) goto L_0x042a
            int r2 = r15 + 9
            r0.zzL(r2)
            long r2 = r26.zzv()
            int r2 = com.google.android.gms.internal.ads.zzgaq.zzb(r2)
            byte[] r3 = new byte[r2]
            r12 = 0
            r0.zzH(r3, r12, r2)
            com.google.android.gms.internal.ads.zzfxn r12 = com.google.android.gms.internal.ads.zzfxn.zzo(r3)
            goto L_0x03b3
        L_0x042a:
            r3 = r33
            goto L_0x04f5
        L_0x042e:
            r8 = 1634492771(0x616c6163, float:2.7252807E20)
            r13 = 4
            r17 = 3
            r20 = 2
            com.google.android.gms.internal.ads.zzz r2 = new com.google.android.gms.internal.ads.zzz
            r2.<init>()
            r2.zzL(r4)
            r2.zzaa(r1)
            r2.zzz(r9)
            r3 = r33
            r2.zzab(r3)
            r2.zzF(r6)
            r2.zzQ(r5)
            com.google.android.gms.internal.ads.zzab r2 = r2.zzag()
            r7.zzb = r2
            goto L_0x04f5
        L_0x0457:
            r3 = r33
            r13 = 4
            r17 = 3
            r20 = 2
            r2 = r15
            r8 = -1
        L_0x0460:
            if (r2 == r8) goto L_0x04f5
            com.google.android.gms.internal.ads.zzaia r22 = zzm(r0, r2)
            java.lang.String r1 = r22.zza
            byte[] r2 = r22.zzb
            if (r2 == 0) goto L_0x04f5
            java.lang.String r12 = "audio/vorbis"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x04d7
            com.google.android.gms.internal.ads.zzdy r12 = new com.google.android.gms.internal.ads.zzdy
            r12.<init>((byte[]) r2)
            r8 = 1
            r12.zzM(r8)
            r13 = 0
        L_0x0482:
            int r21 = r12.zzb()
            r8 = 255(0xff, float:3.57E-43)
            if (r21 <= 0) goto L_0x049a
            int r0 = r12.zzf()
            if (r0 != r8) goto L_0x049a
            r0 = 1
            r12.zzM(r0)
            int r13 = r13 + 255
            r0 = r26
            r8 = 1
            goto L_0x0482
        L_0x049a:
            int r0 = r12.zzm()
            int r13 = r13 + r0
            r0 = 0
        L_0x04a0:
            int r24 = r12.zzb()
            if (r24 <= 0) goto L_0x04b7
            r24 = r10
            int r10 = r12.zzf()
            if (r10 != r8) goto L_0x04b9
            r10 = 1
            r12.zzM(r10)
            int r0 = r0 + 255
            r10 = r24
            goto L_0x04a0
        L_0x04b7:
            r24 = r10
        L_0x04b9:
            r10 = 1
            int r8 = r12.zzm()
            int r0 = r0 + r8
            byte[] r8 = new byte[r13]
            int r12 = r12.zzd()
            r10 = 0
            java.lang.System.arraycopy(r2, r12, r8, r10, r13)
            int r12 = r12 + r13
            int r13 = r2.length
            int r12 = r12 + r0
            int r13 = r13 - r12
            byte[] r0 = new byte[r13]
            java.lang.System.arraycopy(r2, r12, r0, r10, r13)
            com.google.android.gms.internal.ads.zzfxn r12 = com.google.android.gms.internal.ads.zzfxn.zzp(r8, r0)
            goto L_0x04f8
        L_0x04d7:
            r24 = r10
            r10 = 0
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04ef
            com.google.android.gms.internal.ads.zzabi r0 = com.google.android.gms.internal.ads.zzabk.zza(r2)
            int r8 = r0.zza
            int r9 = r0.zzb
            java.lang.String r0 = r0.zzc
            r23 = r0
            goto L_0x04f0
        L_0x04ef:
            r8 = r3
        L_0x04f0:
            com.google.android.gms.internal.ads.zzfxn r12 = com.google.android.gms.internal.ads.zzfxn.zzo(r2)
            goto L_0x04f9
        L_0x04f5:
            r24 = r10
            r10 = 0
        L_0x04f8:
            r8 = r3
        L_0x04f9:
            int r15 = r15 + r11
            r0 = r26
            r2 = r28
            r3 = r29
            r13 = r35
            r10 = r24
            goto L_0x01c5
        L_0x0506:
            r3 = r8
            com.google.android.gms.internal.ads.zzab r0 = r7.zzb
            if (r0 != 0) goto L_0x054f
            if (r1 == 0) goto L_0x054f
            com.google.android.gms.internal.ads.zzz r0 = new com.google.android.gms.internal.ads.zzz
            r0.<init>()
            r0.zzL(r4)
            r0.zzaa(r1)
            r1 = r23
            r0.zzA(r1)
            r0.zzz(r9)
            r0.zzab(r3)
            r11 = r16
            r0.zzU(r11)
            r0.zzN(r12)
            r0.zzF(r6)
            r0.zzQ(r5)
            if (r22 == 0) goto L_0x0549
            long r1 = r22.zzc
            int r1 = com.google.android.gms.internal.ads.zzgaq.zze(r1)
            r0.zzy(r1)
            long r1 = r22.zzd
            int r1 = com.google.android.gms.internal.ads.zzgaq.zze(r1)
            r0.zzV(r1)
        L_0x0549:
            com.google.android.gms.internal.ads.zzab r0 = r0.zzag()
            r7.zzb = r0
        L_0x054f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaik.zzo(com.google.android.gms.internal.ads.zzdy, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzu, com.google.android.gms.internal.ads.zzaif, int):void");
    }
}
