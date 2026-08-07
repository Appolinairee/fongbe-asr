package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaiv implements zzacn, zzadm {
    private int zzA;
    private zzagv zzB;
    private final zzakd zza;
    private final int zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzdy zze;
    private final zzdy zzf;
    private final ArrayDeque zzg;
    private final zzaiz zzh;
    private final List zzi;
    private zzfxn zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private int zzn;
    private zzdy zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private zzacq zzv;
    private zzaiu[] zzw;
    private long[][] zzx;
    private int zzy;
    private long zzz;

    @Deprecated
    public zzaiv() {
        this(zzakd.zza, 16);
    }

    private static int zzj(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzk(zzaje zzaje, long j) {
        int zza2 = zzaje.zza(j);
        return zza2 == -1 ? zzaje.zzb(j) : zza2;
    }

    private static long zzl(zzaje zzaje, long j, long j2) {
        int zzk2 = zzk(zzaje, j);
        if (zzk2 == -1) {
            return j2;
        }
        return Math.min(zzaje.zzc[zzk2], j2);
    }

    private final void zzm() {
        this.zzk = 0;
        this.zzn = 0;
    }

    private final void zzn(long j) throws zzbc {
        zzay zzay;
        long j2;
        int i;
        List list;
        ArrayList arrayList;
        int i2;
        zzay zzay2;
        int i3;
        int i4;
        while (!this.zzg.isEmpty() && ((zzen) this.zzg.peek()).zza == j) {
            zzen zzen = (zzen) this.zzg.pop();
            if (zzen.zzd == 1836019574) {
                zzen zza2 = zzen.zza(1835365473);
                new ArrayList();
                zzay zzb2 = zza2 != null ? zzaik.zzb(zza2) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z = this.zzA == 1;
                zzadb zzadb = new zzadb();
                zzeo zzb3 = zzen.zzb(1969517665);
                if (zzb3 != null) {
                    zzay zzc2 = zzaik.zzc(zzb3);
                    zzadb.zzb(zzc2);
                    zzay = zzc2;
                } else {
                    zzay = null;
                }
                zzeo zzb4 = zzen.zzb(1836476516);
                zzb4.getClass();
                zzeo zzeo = zzb4;
                ArrayList arrayList3 = arrayList2;
                long j3 = -9223372036854775807L;
                zzay zzay3 = new zzay(-9223372036854775807L, zzaik.zzd(zzb4.zza));
                List zzf2 = zzaik.zzf(zzen, zzadb, -9223372036854775807L, (zzu) null, 1 == (this.zzb & 1), z, new zzait());
                long j4 = -9223372036854775807L;
                int i5 = 0;
                int i6 = -1;
                int i7 = 0;
                while (true) {
                    j2 = 0;
                    if (i5 >= zzf2.size()) {
                        break;
                    }
                    zzaje zzaje = (zzaje) zzf2.get(i5);
                    if (zzaje.zzb == 0) {
                        list = zzf2;
                        i = i5;
                        arrayList = arrayList3;
                    } else {
                        zzajb zzajb = zzaje.zza;
                        int i8 = i7 + 1;
                        zzaiu zzaiu = new zzaiu(zzajb, zzaje, this.zzv.zzw(i7, zzajb.zzb));
                        List list2 = zzf2;
                        long j5 = zzajb.zze;
                        if (j5 == j3) {
                            j5 = zzaje.zzh;
                        }
                        zzaiu.zzc.zzl(j5);
                        j4 = Math.max(j4, j5);
                        if ("audio/true-hd".equals(zzajb.zzg.zzo)) {
                            i2 = zzaje.zze * 16;
                        } else {
                            i2 = zzaje.zze + 30;
                        }
                        zzz zzb5 = zzajb.zzg.zzb();
                        zzb5.zzR(i2);
                        if (zzajb.zzb == 2) {
                            zzab zzab = zzajb.zzg;
                            int i9 = this.zzb;
                            list = list2;
                            int i10 = zzab.zzf;
                            if ((i9 & 8) != 0) {
                                i10 |= i6 == -1 ? 1 : 2;
                            }
                            if (zzab.zzx == -1.0f && j5 > 0 && (i4 = zzaje.zzb) > 0) {
                                zzb5.zzI(((float) i4) / (((float) j5) / 1000000.0f));
                            }
                            zzb5.zzY(i10);
                        } else {
                            list = list2;
                        }
                        if (zzajb.zzb == 1 && zzadb.zza()) {
                            zzb5.zzG(zzadb.zza);
                            zzb5.zzH(zzadb.zzb);
                        }
                        int i11 = zzajb.zzb;
                        zzay[] zzayArr = new zzay[3];
                        if (this.zzi.isEmpty()) {
                            i3 = 0;
                            zzay2 = null;
                        } else {
                            zzay2 = new zzay(this.zzi);
                            i3 = 0;
                        }
                        zzayArr[i3] = zzay2;
                        zzayArr[1] = zzay;
                        zzayArr[2] = zzay3;
                        i = i5;
                        zzay zzay4 = new zzay(-9223372036854775807L, new zzax[i3]);
                        if (zzb2 != null) {
                            for (int i12 = 0; i12 < zzb2.zza(); i12++) {
                                zzax zzb6 = zzb2.zzb(i12);
                                if (zzb6 instanceof zzem) {
                                    zzem zzem = (zzem) zzb6;
                                    if (!zzem.zza.equals("com.android.capture.fps")) {
                                        zzay4 = zzay4.zzc(zzem);
                                    } else if (i11 == 2) {
                                        zzay4 = zzay4.zzc(zzem);
                                    }
                                }
                            }
                        }
                        for (int i13 = 0; i13 < 3; i13++) {
                            zzay4 = zzay4.zzd(zzayArr[i13]);
                        }
                        if (zzay4.zza() > 0) {
                            zzb5.zzT(zzay4);
                        }
                        zzaiu.zzc.zzm(zzb5.zzag());
                        if (zzajb.zzb == 2 && i6 == -1) {
                            i6 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzaiu);
                        i7 = i8;
                    }
                    i5 = i + 1;
                    arrayList3 = arrayList;
                    zzf2 = list;
                    j3 = -9223372036854775807L;
                }
                this.zzy = i6;
                this.zzz = j4;
                zzaiu[] zzaiuArr = (zzaiu[]) arrayList3.toArray(new zzaiu[0]);
                this.zzw = zzaiuArr;
                int length = zzaiuArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i14 = 0; i14 < zzaiuArr.length; i14++) {
                    jArr[i14] = new long[zzaiuArr[i14].zzb.zzb];
                    jArr2[i14] = zzaiuArr[i14].zzb.zzf[0];
                }
                int i15 = 0;
                while (i15 < zzaiuArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i16 = -1;
                    for (int i17 = 0; i17 < zzaiuArr.length; i17++) {
                        if (!zArr[i17]) {
                            long j7 = jArr2[i17];
                            if (j7 <= j6) {
                                i16 = i17;
                                j6 = j7;
                            }
                        }
                    }
                    int i18 = iArr[i16];
                    long[] jArr3 = jArr[i16];
                    jArr3[i18] = j2;
                    zzaje zzaje2 = zzaiuArr[i16].zzb;
                    j2 += (long) zzaje2.zzd[i18];
                    int i19 = i18 + 1;
                    iArr[i16] = i19;
                    if (i19 < jArr3.length) {
                        jArr2[i16] = zzaje2.zzf[i19];
                    } else {
                        zArr[i16] = true;
                        i15++;
                    }
                }
                this.zzx = jArr;
                this.zzv.zzD();
                this.zzv.zzO(this);
                this.zzg.clear();
                this.zzk = 2;
            } else if (!this.zzg.isEmpty()) {
                ((zzen) this.zzg.peek()).zzc(zzen);
            }
        }
        if (this.zzk != 2) {
            zzm();
        }
    }

    public final long zza() {
        return this.zzz;
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return this.zzj;
    }

    public final void zze(zzacq zzacq) {
        if ((this.zzb & 16) == 0) {
            zzacq = new zzakg(zzacq, this.zza);
        }
        this.zzv = zzacq;
    }

    public final void zzf(long j, long j2) {
        this.zzg.clear();
        this.zzn = 0;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = true;
        if (j != 0) {
            for (zzaiu zzaiu : this.zzw) {
                zzaje zzaje = zzaiu.zzb;
                int zza2 = zzaje.zza(j2);
                if (zza2 == -1) {
                    zza2 = zzaje.zzb(j2);
                }
                zzaiu.zze = zza2;
                zzadu zzadu = zzaiu.zzd;
                if (zzadu != null) {
                    zzadu.zzb();
                }
            }
        } else if (this.zzk != 3) {
            zzm();
        } else {
            this.zzh.zzb();
            this.zzi.clear();
        }
    }

    public final zzadk zzg(long j) {
        long j2;
        long j3;
        int zzb2;
        zzaiu[] zzaiuArr = this.zzw;
        if (zzaiuArr.length == 0) {
            zzadn zzadn = zzadn.zza;
            return new zzadk(zzadn, zzadn);
        }
        int i = this.zzy;
        long j4 = -1;
        if (i != -1) {
            zzaje zzaje = zzaiuArr[i].zzb;
            int zzk2 = zzk(zzaje, j);
            if (zzk2 == -1) {
                zzadn zzadn2 = zzadn.zza;
                return new zzadk(zzadn2, zzadn2);
            }
            long j5 = zzaje.zzf[zzk2];
            j2 = zzaje.zzc[zzk2];
            if (j5 >= j || zzk2 >= zzaje.zzb - 1 || (zzb2 = zzaje.zzb(j)) == -1 || zzb2 == zzk2) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzaje.zzf[zzb2];
                j4 = zzaje.zzc[zzb2];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzaiu[] zzaiuArr2 = this.zzw;
            if (i2 >= zzaiuArr2.length) {
                break;
            }
            if (i2 != this.zzy) {
                zzaje zzaje2 = zzaiuArr2[i2].zzb;
                long zzl2 = zzl(zzaje2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzl(zzaje2, j3, j4);
                }
                j2 = zzl2;
            }
            i2++;
        }
        zzadn zzadn3 = new zzadn(j, j2);
        if (j3 == -9223372036854775807L) {
            return new zzadk(zzadn3, zzadn3);
        }
        return new zzadk(zzadn3, new zzadn(j3, j4));
    }

    public final boolean zzh() {
        return true;
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        zzadq zzb2 = zzaja.zzb(zzaco, (this.zzb & 2) != 0);
        this.zzj = zzb2 != null ? zzfxn.zzo(zzb2) : zzfxn.zzn();
        return zzb2 == null;
    }

    public zzaiv(zzakd zzakd, int i) {
        this.zza = zzakd;
        this.zzb = i;
        this.zzj = zzfxn.zzn();
        this.zzk = (i & 4) != 0 ? 3 : 0;
        this.zzh = new zzaiz();
        this.zzi = new ArrayList();
        this.zzf = new zzdy(16);
        this.zzg = new ArrayDeque();
        this.zzc = new zzdy(zzfk.zza);
        this.zzd = new zzdy(5);
        this.zze = new zzdy();
        this.zzp = -1;
        this.zzv = zzacq.zza;
        this.zzw = new zzaiu[0];
        this.zzt = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:241:0x0097 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzaco r33, com.google.android.gms.internal.ads.zzadj r34) throws java.io.IOException {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.zzk
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r7 = 0
            r9 = 2
            r10 = -1
            r11 = 8
            r12 = 1
            if (r3 == 0) goto L_0x02aa
            r14 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r12) goto L_0x0219
            if (r3 == r9) goto L_0x002c
            com.google.android.gms.internal.ads.zzaiz r3 = r0.zzh
            java.util.List r4 = r0.zzi
            r3.zza(r1, r2, r4)
            long r1 = r2.zza
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x002b
            r32.zzm()
        L_0x002b:
            return r12
        L_0x002c:
            long r3 = r33.zzf()
            int r11 = r0.zzp
            if (r11 != r10) goto L_0x00b5
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r16
            r21 = r18
            r23 = r21
            r11 = 0
            r20 = 1
            r25 = -1
            r26 = -1
            r27 = 1
        L_0x0048:
            com.google.android.gms.internal.ads.zzaiu[] r5 = r0.zzw
            int r6 = r5.length
            if (r11 >= r6) goto L_0x009b
            r5 = r5[r11]
            int r6 = r5.zze
            com.google.android.gms.internal.ads.zzaje r5 = r5.zzb
            int r9 = r5.zzb
            if (r6 != r9) goto L_0x0058
            goto L_0x0097
        L_0x0058:
            long[] r5 = r5.zzc
            r28 = r5[r6]
            long[][] r5 = r0.zzx
            int r9 = com.google.android.gms.internal.ads.zzei.zza
            long[][] r5 = (long[][]) r5
            r5 = r5[r11]
            r30 = r5[r6]
            long r28 = r28 - r3
            int r5 = (r28 > r7 ? 1 : (r28 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x0073
            int r5 = (r28 > r14 ? 1 : (r28 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r5 = 0
            goto L_0x0074
        L_0x0073:
            r5 = 1
        L_0x0074:
            if (r5 != 0) goto L_0x007a
            if (r27 != 0) goto L_0x0082
            r6 = 0
            goto L_0x007c
        L_0x007a:
            r6 = r27
        L_0x007c:
            if (r5 != r6) goto L_0x008b
            int r9 = (r28 > r23 ? 1 : (r28 == r23 ? 0 : -1))
            if (r9 >= 0) goto L_0x008b
        L_0x0082:
            r27 = r5
            r26 = r11
            r23 = r28
            r21 = r30
            goto L_0x008d
        L_0x008b:
            r27 = r6
        L_0x008d:
            int r6 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r6 >= 0) goto L_0x0097
            r20 = r5
            r25 = r11
            r18 = r30
        L_0x0097:
            int r11 = r11 + 1
            r9 = 2
            goto L_0x0048
        L_0x009b:
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x00ad
            if (r20 == 0) goto L_0x00ad
            r5 = 10485760(0xa00000, double:5.180654E-317)
            long r18 = r18 + r5
            int r5 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r5 < 0) goto L_0x00ad
            r11 = r25
            goto L_0x00af
        L_0x00ad:
            r11 = r26
        L_0x00af:
            r0.zzp = r11
            if (r11 != r10) goto L_0x00b5
            goto L_0x0218
        L_0x00b5:
            com.google.android.gms.internal.ads.zzaiu[] r5 = r0.zzw
            r5 = r5[r11]
            com.google.android.gms.internal.ads.zzadt r6 = r5.zzc
            int r9 = r5.zze
            com.google.android.gms.internal.ads.zzaje r11 = r5.zzb
            long[] r10 = r11.zzc
            r12 = r10[r9]
            int[] r10 = r11.zzd
            r10 = r10[r9]
            com.google.android.gms.internal.ads.zzadu r11 = r5.zzd
            long r3 = r12 - r3
            int r14 = r0.zzq
            long r14 = (long) r14
            long r3 = r3 + r14
            int r14 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r14 < 0) goto L_0x0215
            r7 = 262144(0x40000, double:1.295163E-318)
            int r14 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r14 < 0) goto L_0x00dc
            goto L_0x0215
        L_0x00dc:
            com.google.android.gms.internal.ads.zzajb r2 = r5.zza
            int r2 = r2.zzh
            r7 = 1
            if (r2 != r7) goto L_0x00e8
            r7 = 8
            long r3 = r3 + r7
            int r10 = r10 + -8
        L_0x00e8:
            int r2 = (int) r3
            r1.zzk(r2)
            com.google.android.gms.internal.ads.zzajb r2 = r5.zza
            com.google.android.gms.internal.ads.zzab r2 = r2.zzg
            java.lang.String r2 = r2.zzo
            java.lang.String r3 = "video/avc"
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto L_0x00fe
            r2 = 1
            r0.zzt = r2
            goto L_0x00ff
        L_0x00fe:
            r2 = 1
        L_0x00ff:
            com.google.android.gms.internal.ads.zzajb r3 = r5.zza
            int r4 = r3.zzk
            if (r4 == 0) goto L_0x017e
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzd
            byte[] r3 = r3.zzN()
            r7 = 0
            r3[r7] = r7
            r3[r2] = r7
            r2 = 2
            r3[r2] = r7
            int r2 = r4 + 1
            r7 = 4
            int r4 = 4 - r4
        L_0x0118:
            int r7 = r0.zzr
            if (r7 >= r10) goto L_0x01c1
            int r7 = r0.zzs
            if (r7 != 0) goto L_0x0169
            r1.zzi(r3, r4, r2)
            int r7 = r0.zzq
            int r7 = r7 + r2
            r0.zzq = r7
            com.google.android.gms.internal.ads.zzdy r7 = r0.zzd
            r8 = 0
            r7.zzL(r8)
            com.google.android.gms.internal.ads.zzdy r7 = r0.zzd
            int r7 = r7.zzg()
            if (r7 <= 0) goto L_0x0161
            int r7 = r7 + -1
            r0.zzs = r7
            com.google.android.gms.internal.ads.zzdy r7 = r0.zzc
            r7.zzL(r8)
            com.google.android.gms.internal.ads.zzdy r7 = r0.zzc
            r8 = 4
            r6.zzr(r7, r8)
            com.google.android.gms.internal.ads.zzdy r7 = r0.zzd
            r12 = 1
            r6.zzr(r7, r12)
            int r7 = r0.zzr
            int r7 = r7 + 5
            r0.zzr = r7
            int r10 = r10 + r4
            boolean r7 = r0.zzt
            if (r7 != 0) goto L_0x0118
            byte r7 = r3[r8]
            boolean r7 = com.google.android.gms.internal.ads.zzfk.zzi(r7)
            if (r7 == 0) goto L_0x0118
            r0.zzt = r12
            goto L_0x0118
        L_0x0161:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        L_0x0169:
            r8 = 0
            int r7 = r6.zzf(r1, r7, r8)
            int r8 = r0.zzq
            int r8 = r8 + r7
            r0.zzq = r8
            int r8 = r0.zzr
            int r8 = r8 + r7
            r0.zzr = r8
            int r8 = r0.zzs
            int r8 = r8 - r7
            r0.zzs = r8
            goto L_0x0118
        L_0x017e:
            com.google.android.gms.internal.ads.zzab r2 = r3.zzg
            java.lang.String r3 = "audio/ac4"
            java.lang.String r2 = r2.zzo
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x01a1
            int r2 = r0.zzr
            if (r2 != 0) goto L_0x019e
            com.google.android.gms.internal.ads.zzdy r2 = r0.zze
            com.google.android.gms.internal.ads.zzabq.zzb(r10, r2)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zze
            r3 = 7
            r6.zzr(r2, r3)
            int r2 = r0.zzr
            int r2 = r2 + r3
            r0.zzr = r2
        L_0x019e:
            int r10 = r10 + 7
            goto L_0x01a6
        L_0x01a1:
            if (r11 == 0) goto L_0x01a6
            r11.zzd(r1)
        L_0x01a6:
            int r2 = r0.zzr
            if (r2 >= r10) goto L_0x01c1
            int r2 = r10 - r2
            r3 = 0
            int r2 = r6.zzf(r1, r2, r3)
            int r3 = r0.zzq
            int r3 = r3 + r2
            r0.zzq = r3
            int r3 = r0.zzr
            int r3 = r3 + r2
            r0.zzr = r3
            int r3 = r0.zzs
            int r3 = r3 - r2
            r0.zzs = r3
            goto L_0x01a6
        L_0x01c1:
            com.google.android.gms.internal.ads.zzaje r1 = r5.zzb
            long[] r2 = r1.zzf
            r3 = r2[r9]
            int[] r1 = r1.zzg
            r1 = r1[r9]
            boolean r2 = r0.zzt
            if (r2 != 0) goto L_0x01d2
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 | r2
        L_0x01d2:
            if (r11 == 0) goto L_0x01f2
            r22 = 0
            r23 = 0
            r16 = r11
            r17 = r6
            r18 = r3
            r20 = r1
            r21 = r10
            r16.zzc(r17, r18, r20, r21, r22, r23)
            r1 = 1
            int r9 = r9 + r1
            com.google.android.gms.internal.ads.zzaje r1 = r5.zzb
            int r1 = r1.zzb
            if (r9 != r1) goto L_0x0201
            r1 = 0
            r11.zza(r6, r1)
            goto L_0x0201
        L_0x01f2:
            r21 = 0
            r22 = 0
            r16 = r6
            r17 = r3
            r19 = r1
            r20 = r10
            r16.zzt(r17, r19, r20, r21, r22)
        L_0x0201:
            int r1 = r5.zze
            r2 = 1
            int r1 = r1 + r2
            r5.zze = r1
            r1 = -1
            r0.zzp = r1
            r1 = 0
            r0.zzq = r1
            r0.zzr = r1
            r0.zzs = r1
            r0.zzt = r2
            r10 = 0
            goto L_0x0218
        L_0x0215:
            r2.zza = r12
            r10 = 1
        L_0x0218:
            return r10
        L_0x0219:
            long r5 = r0.zzm
            int r3 = r0.zzn
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r33.zzf()
            long r7 = r7 + r5
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzo
            if (r3 == 0) goto L_0x027b
            byte[] r9 = r3.zzN()
            int r10 = r0.zzn
            int r6 = (int) r5
            r1.zzi(r9, r10, r6)
            int r5 = r0.zzl
            if (r5 != r4) goto L_0x0260
            r4 = 1
            r0.zzu = r4
            r3.zzL(r11)
            int r4 = r3.zzg()
            int r4 = zzj(r4)
            if (r4 == 0) goto L_0x0247
            goto L_0x025d
        L_0x0247:
            r4 = 4
            r3.zzM(r4)
        L_0x024b:
            int r4 = r3.zzb()
            if (r4 <= 0) goto L_0x025c
            int r4 = r3.zzg()
            int r4 = zzj(r4)
            if (r4 == 0) goto L_0x024b
            goto L_0x025d
        L_0x025c:
            r4 = 0
        L_0x025d:
            r0.zzA = r4
            goto L_0x0294
        L_0x0260:
            java.util.ArrayDeque r4 = r0.zzg
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0294
            java.util.ArrayDeque r4 = r0.zzg
            java.lang.Object r4 = r4.peek()
            com.google.android.gms.internal.ads.zzen r4 = (com.google.android.gms.internal.ads.zzen) r4
            com.google.android.gms.internal.ads.zzeo r5 = new com.google.android.gms.internal.ads.zzeo
            int r6 = r0.zzl
            r5.<init>(r6, r3)
            r4.zzd(r5)
            goto L_0x0294
        L_0x027b:
            boolean r3 = r0.zzu
            if (r3 != 0) goto L_0x0289
            int r3 = r0.zzl
            r4 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r3 != r4) goto L_0x0289
            r3 = 1
            r0.zzA = r3
        L_0x0289:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x0296
            int r3 = (int) r5
            r1.zzk(r3)
        L_0x0294:
            r13 = 0
            goto L_0x029e
        L_0x0296:
            long r3 = r33.zzf()
            long r3 = r3 + r5
            r2.zza = r3
            r13 = 1
        L_0x029e:
            r0.zzn(r7)
            if (r13 == 0) goto L_0x0006
            int r3 = r0.zzk
            r5 = 2
            if (r3 == r5) goto L_0x0006
            r3 = 1
            return r3
        L_0x02aa:
            r3 = 1
            r5 = 2
            int r6 = r0.zzn
            if (r6 != 0) goto L_0x031a
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzf
            byte[] r6 = r6.zzN()
            r9 = 0
            boolean r6 = r1.zzn(r6, r9, r11, r3)
            if (r6 != 0) goto L_0x0302
            int r1 = r0.zzA
            if (r1 != r5) goto L_0x0300
            int r1 = r0.zzb
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0300
            com.google.android.gms.internal.ads.zzacq r1 = r0.zzv
            r2 = 4
            com.google.android.gms.internal.ads.zzadt r1 = r1.zzw(r9, r2)
            com.google.android.gms.internal.ads.zzagv r2 = r0.zzB
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L_0x02d8
            r5 = 0
            goto L_0x02e2
        L_0x02d8:
            com.google.android.gms.internal.ads.zzay r5 = new com.google.android.gms.internal.ads.zzay
            r6 = 1
            com.google.android.gms.internal.ads.zzax[] r6 = new com.google.android.gms.internal.ads.zzax[r6]
            r6[r9] = r2
            r5.<init>(r3, r6)
        L_0x02e2:
            com.google.android.gms.internal.ads.zzz r2 = new com.google.android.gms.internal.ads.zzz
            r2.<init>()
            r2.zzT(r5)
            com.google.android.gms.internal.ads.zzab r2 = r2.zzag()
            r1.zzm(r2)
            com.google.android.gms.internal.ads.zzacq r1 = r0.zzv
            r1.zzD()
            com.google.android.gms.internal.ads.zzacq r1 = r0.zzv
            com.google.android.gms.internal.ads.zzadl r2 = new com.google.android.gms.internal.ads.zzadl
            r2.<init>(r3, r7)
            r1.zzO(r2)
        L_0x0300:
            r1 = -1
            return r1
        L_0x0302:
            r0.zzn = r11
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzf
            r5 = 0
            r3.zzL(r5)
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzf
            long r5 = r3.zzu()
            r0.zzm = r5
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzf
            int r3 = r3.zzg()
            r0.zzl = r3
        L_0x031a:
            long r5 = r0.zzm
            r9 = 1
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0339
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzf
            byte[] r3 = r3.zzN()
            r1.zzi(r3, r11, r11)
            int r3 = r0.zzn
            int r3 = r3 + r11
            r0.zzn = r3
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzf
            long r5 = r3.zzw()
            r0.zzm = r5
            goto L_0x0364
        L_0x0339:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0364
            long r5 = r33.zzd()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0355
            java.util.ArrayDeque r3 = r0.zzg
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzen r3 = (com.google.android.gms.internal.ads.zzen) r3
            if (r3 == 0) goto L_0x0354
            long r5 = r3.zza
            goto L_0x0355
        L_0x0354:
            r5 = r7
        L_0x0355:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0364
            long r7 = r33.zzf()
            long r5 = r5 - r7
            int r3 = r0.zzn
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.zzm = r5
        L_0x0364:
            long r5 = r0.zzm
            int r3 = r0.zzn
            long r7 = (long) r3
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x04a4
            int r5 = r0.zzl
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x0452
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x0452
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x0452
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x0452
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x0452
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x0452
            if (r5 == r7) goto L_0x0452
            r6 = 1701082724(0x65647664, float:6.7430217E22)
            if (r5 != r6) goto L_0x0399
            goto L_0x0452
        L_0x0399:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x041e
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x041e
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L_0x041e
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x041e
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x041e
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x041e
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x041e
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x041e
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x041e
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x041e
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x041e
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x041e
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x041e
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x041e
            if (r5 == r4) goto L_0x041e
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x041e
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x041e
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x03f1
            goto L_0x041e
        L_0x03f1:
            long r3 = r33.zzf()
            int r5 = r0.zzn
            long r5 = (long) r5
            long r10 = r3 - r5
            int r3 = r0.zzl
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0416
            long r14 = r10 + r5
            com.google.android.gms.internal.ads.zzagv r3 = new com.google.android.gms.internal.ads.zzagv
            long r7 = r0.zzm
            long r16 = r7 - r5
            r8 = 0
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r3
            r7.<init>(r8, r10, r12, r14, r16)
            r0.zzB = r3
        L_0x0416:
            r3 = 0
            r0.zzo = r3
            r3 = 1
            r0.zzk = r3
            goto L_0x0006
        L_0x041e:
            if (r3 != r11) goto L_0x0422
            r3 = 1
            goto L_0x0423
        L_0x0422:
            r3 = 0
        L_0x0423:
            com.google.android.gms.internal.ads.zzcw.zzf(r3)
            long r3 = r0.zzm
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0431
            r3 = 1
            goto L_0x0432
        L_0x0431:
            r3 = 0
        L_0x0432:
            com.google.android.gms.internal.ads.zzcw.zzf(r3)
            com.google.android.gms.internal.ads.zzdy r3 = new com.google.android.gms.internal.ads.zzdy
            long r4 = r0.zzm
            int r5 = (int) r4
            r3.<init>((int) r5)
            com.google.android.gms.internal.ads.zzdy r4 = r0.zzf
            byte[] r4 = r4.zzN()
            byte[] r5 = r3.zzN()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r11)
            r0.zzo = r3
            r3 = 1
            r0.zzk = r3
            goto L_0x0006
        L_0x0452:
            long r3 = r33.zzf()
            long r5 = r0.zzm
            long r3 = r3 + r5
            int r8 = r0.zzn
            long r8 = (long) r8
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0484
            int r5 = r0.zzl
            if (r5 != r7) goto L_0x0484
            com.google.android.gms.internal.ads.zzdy r5 = r0.zze
            r5.zzI(r11)
            com.google.android.gms.internal.ads.zzdy r5 = r0.zze
            byte[] r5 = r5.zzN()
            r6 = 0
            r1.zzh(r5, r6, r11)
            com.google.android.gms.internal.ads.zzdy r5 = r0.zze
            com.google.android.gms.internal.ads.zzaik.zzg(r5)
            com.google.android.gms.internal.ads.zzdy r5 = r0.zze
            int r5 = r5.zzd()
            r1.zzk(r5)
            r33.zzj()
        L_0x0484:
            long r3 = r3 - r8
            java.util.ArrayDeque r5 = r0.zzg
            com.google.android.gms.internal.ads.zzen r6 = new com.google.android.gms.internal.ads.zzen
            int r7 = r0.zzl
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.zzm
            int r7 = r0.zzn
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x049f
            r0.zzn(r3)
            goto L_0x0006
        L_0x049f:
            r32.zzm()
            goto L_0x0006
        L_0x04a4:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiv.zzb(com.google.android.gms.internal.ads.zzaco, com.google.android.gms.internal.ads.zzadj):int");
    }
}
