package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzahm implements zzacn {
    private static final byte[] zza = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */
    public static final byte[] zzb = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzc = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] zzd = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */
    public static final UUID zze = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */
    public static final Map zzf;
    private long zzA;
    private zzahk zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzdp zzJ;
    private zzdp zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzacq zzai;
    private final zzahh zzaj;
    private final zzaho zzg;
    private final SparseArray zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final zzakd zzk;
    private final zzdy zzl;
    private final zzdy zzm;
    private final zzdy zzn;
    private final zzdy zzo;
    private final zzdy zzp;
    private final zzdy zzq;
    private final zzdy zzr;
    private final zzdy zzs;
    private final zzdy zzt;
    private final zzdy zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzei.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(hashMap);
    }

    @Deprecated
    public zzahm() {
        this(new zzahh(), 2, zzakd.zza);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzp(zzaco zzaco, zzahk zzahk, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzahk.zzb)) {
            zzx(zzaco, zza, i);
            int i3 = this.zzaa;
            zzw();
            return i3;
        } else if ("S_TEXT/ASS".equals(zzahk.zzb)) {
            zzx(zzaco, zzc, i);
            int i4 = this.zzaa;
            zzw();
            return i4;
        } else if ("S_TEXT/WEBVTT".equals(zzahk.zzb)) {
            zzx(zzaco, zzd, i);
            int i5 = this.zzaa;
            zzw();
            return i5;
        } else {
            zzadt zzadt = zzahk.zzW;
            boolean z2 = true;
            if (!this.zzac) {
                if (zzahk.zzg) {
                    this.zzV &= -1073741825;
                    int i6 = 128;
                    if (!this.zzad) {
                        zzaco.zzi(this.zzn.zzN(), 0, 1);
                        this.zzZ++;
                        if ((this.zzn.zzN()[0] & 128) != 128) {
                            this.zzag = this.zzn.zzN()[0];
                            this.zzad = true;
                        } else {
                            throw zzbc.zza("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b = this.zzag;
                    if ((b & 1) == 1) {
                        byte b2 = b & 2;
                        this.zzV |= 1073741824;
                        if (!this.zzah) {
                            zzaco.zzi(this.zzs.zzN(), 0, 8);
                            this.zzZ += 8;
                            this.zzah = true;
                            zzdy zzdy = this.zzn;
                            if (b2 != 2) {
                                i6 = 0;
                            }
                            zzdy.zzN()[0] = (byte) (i6 | 8);
                            this.zzn.zzL(0);
                            zzadt.zzs(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzL(0);
                            zzadt.zzs(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (b2 == 2) {
                            if (!this.zzae) {
                                zzaco.zzi(this.zzn.zzN(), 0, 1);
                                this.zzZ++;
                                this.zzn.zzL(0);
                                this.zzaf = this.zzn.zzm();
                                this.zzae = true;
                            }
                            int i7 = this.zzaf * 4;
                            this.zzn.zzI(i7);
                            zzaco.zzi(this.zzn.zzN(), 0, i7);
                            this.zzZ += i7;
                            int i8 = (this.zzaf >> 1) + 1;
                            int i9 = (i8 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.zzv = ByteBuffer.allocate(i9);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i8);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i2 = this.zzaf;
                                if (i10 >= i2) {
                                    break;
                                }
                                int zzp2 = this.zzn.zzp();
                                int i12 = zzp2 - i11;
                                if (i10 % 2 == 0) {
                                    this.zzv.putShort((short) i12);
                                } else {
                                    this.zzv.putInt(i12);
                                }
                                i10++;
                                i11 = zzp2;
                            }
                            int i13 = (i - this.zzZ) - i11;
                            if ((i2 & 1) == 1) {
                                this.zzv.putInt(i13);
                            } else {
                                this.zzv.putShort((short) i13);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzJ(this.zzv.array(), i9);
                            zzadt.zzs(this.zzt, i9, 1);
                            this.zzaa += i9;
                        }
                    }
                } else {
                    byte[] bArr = zzahk.zzh;
                    if (bArr != null) {
                        this.zzq.zzJ(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzahk.zzb) ? zzahk.zzf > 0 : z) {
                    this.zzV |= 268435456;
                    this.zzu.zzI(0);
                    int zze2 = (this.zzq.zze() + i) - this.zzZ;
                    this.zzn.zzI(4);
                    this.zzn.zzN()[0] = (byte) ((zze2 >> 24) & 255);
                    this.zzn.zzN()[1] = (byte) ((zze2 >> 16) & 255);
                    this.zzn.zzN()[2] = (byte) ((zze2 >> 8) & 255);
                    this.zzn.zzN()[3] = (byte) (zze2 & 255);
                    zzadt.zzs(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int zze3 = i + this.zzq.zze();
            if (!"V_MPEG4/ISO/AVC".equals(zzahk.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahk.zzb)) {
                if (zzahk.zzT != null) {
                    if (this.zzq.zze() != 0) {
                        z2 = false;
                    }
                    zzcw.zzf(z2);
                    zzahk.zzT.zzd(zzaco);
                }
                while (true) {
                    int i14 = this.zzZ;
                    if (i14 >= zze3) {
                        break;
                    }
                    int zzq2 = zzq(zzaco, zzadt, zze3 - i14);
                    this.zzZ += zzq2;
                    this.zzaa += zzq2;
                }
            } else {
                byte[] zzN2 = this.zzm.zzN();
                zzN2[0] = 0;
                zzN2[1] = 0;
                zzN2[2] = 0;
                int i15 = zzahk.zzX;
                int i16 = 4 - i15;
                while (this.zzZ < zze3) {
                    int i17 = this.zzab;
                    if (i17 == 0) {
                        int min = Math.min(i15, this.zzq.zzb());
                        zzaco.zzi(zzN2, i16 + min, i15 - min);
                        if (min > 0) {
                            this.zzq.zzH(zzN2, i16, min);
                        }
                        this.zzZ += i15;
                        this.zzm.zzL(0);
                        this.zzab = this.zzm.zzp();
                        this.zzl.zzL(0);
                        zzadt.zzr(this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int zzq3 = zzq(zzaco, zzadt, i17);
                        this.zzZ += zzq3;
                        this.zzaa += zzq3;
                        this.zzab -= zzq3;
                    }
                }
            }
            if ("A_VORBIS".equals(zzahk.zzb)) {
                this.zzo.zzL(0);
                zzadt.zzr(this.zzo, 4);
                this.zzaa += 4;
            }
            int i18 = this.zzaa;
            zzw();
            return i18;
        }
    }

    private final int zzq(zzaco zzaco, zzadt zzadt, int i) throws IOException {
        int zzb2 = this.zzq.zzb();
        if (zzb2 <= 0) {
            return zzadt.zzf(zzaco, i, false);
        }
        int min = Math.min(i, zzb2);
        zzadt.zzr(this.zzq, min);
        return min;
    }

    private final long zzr(long j) throws zzbc {
        long j2 = this.zzy;
        if (j2 != -9223372036854775807L) {
            return zzei.zzu(j, j2, 1000, RoundingMode.DOWN);
        }
        throw zzbc.zza("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzs(int i) throws zzbc {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbc.zza("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzt(int i) throws zzbc {
        if (this.zzB == null) {
            throw zzbc.zza("Element " + i + " must be in a TrackEntry", (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e0 A[EDGE_INSN: B:59:0x00e0->B:48:0x00e0 ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzu(com.google.android.gms.internal.ads.zzahk r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.gms.internal.ads.zzadu r2 = r1.zzT
            r9 = 1
            if (r2 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzadt r3 = r1.zzW
            com.google.android.gms.internal.ads.zzads r8 = r1.zzi
            r1 = r2
            r2 = r3
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r1.zzc(r2, r3, r5, r6, r7, r8)
            goto L_0x0121
        L_0x001c:
            java.lang.String r2 = r1.zzb
            java.lang.String r3 = "S_TEXT/UTF8"
            boolean r2 = r3.equals(r2)
            java.lang.String r4 = "S_TEXT/WEBVTT"
            java.lang.String r5 = "S_TEXT/ASS"
            r6 = 0
            r7 = 2
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r1.zzb
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = r1.zzb
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0058
        L_0x003c:
            int r2 = r0.zzR
            java.lang.String r8 = "MatroskaExtractor"
            if (r2 <= r9) goto L_0x0048
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            com.google.android.gms.internal.ads.zzdo.zzf(r8, r2)
            goto L_0x0058
        L_0x0048:
            long r10 = r0.zzP
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x005c
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            com.google.android.gms.internal.ads.zzdo.zzf(r8, r2)
        L_0x0058:
            r2 = r22
            goto L_0x00f3
        L_0x005c:
            java.lang.String r2 = r1.zzb
            com.google.android.gms.internal.ads.zzdy r8 = r0.zzr
            byte[] r8 = r8.zzN()
            int r12 = r2.hashCode()
            r13 = 738597099(0x2c0618eb, float:1.9056378E-12)
            if (r12 == r13) goto L_0x0088
            r5 = 1045209816(0x3e4ca2d8, float:0.19983995)
            if (r12 == r5) goto L_0x0080
            r4 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r12 == r4) goto L_0x0078
            goto L_0x0090
        L_0x0078:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0090
            r2 = 0
            goto L_0x0091
        L_0x0080:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0090
            r2 = 2
            goto L_0x0091
        L_0x0088:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0090
            r2 = 1
            goto L_0x0091
        L_0x0090:
            r2 = -1
        L_0x0091:
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x00b3
            if (r2 == r9) goto L_0x00a8
            if (r2 != r7) goto L_0x00a2
            java.lang.String r2 = "%02d:%02d:%02d.%03d"
            byte[] r2 = zzy(r10, r2, r3)
            r3 = 25
            goto L_0x00bb
        L_0x00a2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x00a8:
            java.lang.String r2 = "%01d:%02d:%02d:%02d"
            r3 = 10000(0x2710, double:4.9407E-320)
            byte[] r2 = zzy(r10, r2, r3)
            r3 = 21
            goto L_0x00bb
        L_0x00b3:
            java.lang.String r2 = "%02d:%02d:%02d,%03d"
            byte[] r2 = zzy(r10, r2, r3)
            r3 = 19
        L_0x00bb:
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r6, r8, r3, r4)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzr
            int r2 = r2.zzd()
        L_0x00c5:
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzr
            int r3 = r3.zze()
            if (r2 >= r3) goto L_0x00e0
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzr
            byte[] r3 = r3.zzN()
            byte r3 = r3[r2]
            if (r3 != 0) goto L_0x00dd
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzr
            r3.zzK(r2)
            goto L_0x00e0
        L_0x00dd:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00e0:
            com.google.android.gms.internal.ads.zzadt r2 = r1.zzW
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzr
            int r4 = r3.zze()
            r2.zzr(r3, r4)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzr
            int r2 = r2.zze()
            int r2 = r22 + r2
        L_0x00f3:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r21 & r3
            if (r3 == 0) goto L_0x0111
            int r3 = r0.zzR
            if (r3 <= r9) goto L_0x0103
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzu
            r3.zzI(r6)
            goto L_0x0111
        L_0x0103:
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzu
            int r3 = r3.zze()
            com.google.android.gms.internal.ads.zzadt r4 = r1.zzW
            com.google.android.gms.internal.ads.zzdy r5 = r0.zzu
            r4.zzs(r5, r3, r7)
            int r2 = r2 + r3
        L_0x0111:
            r14 = r2
            com.google.android.gms.internal.ads.zzadt r10 = r1.zzW
            com.google.android.gms.internal.ads.zzads r1 = r1.zzi
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.zzt(r11, r13, r14, r15, r16)
        L_0x0121:
            r0.zzM = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzu(com.google.android.gms.internal.ads.zzahk, long, int, int, int):void");
    }

    private final void zzv(zzaco zzaco, int i) throws IOException {
        if (this.zzn.zze() < i) {
            if (this.zzn.zzc() < i) {
                zzdy zzdy = this.zzn;
                int zzc2 = zzdy.zzc();
                zzdy.zzF(Math.max(zzc2 + zzc2, i));
            }
            zzdy zzdy2 = this.zzn;
            zzaco.zzi(zzdy2.zzN(), zzdy2.zze(), i - zzdy2.zze());
            this.zzn.zzK(i);
        }
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = 0;
        this.zzah = false;
        this.zzq.zzI(0);
    }

    private final void zzx(zzaco zzaco, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzc() < i2) {
            zzdy zzdy = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzdy.zzJ(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzN(), 0, length);
        }
        zzaco.zzi(this.zzr.zzN(), length, i);
        this.zzr.zzL(0);
        this.zzr.zzK(i2);
    }

    private static byte[] zzy(long j, String str, long j2) {
        zzcw.zzd(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, new Object[]{valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))});
        int i4 = zzei.zza;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    private static int[] zzz(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    public final int zzb(zzaco zzaco, zzadj zzadj) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (this.zzaj.zzc(zzaco)) {
                long zzf2 = zzaco.zzf();
                if (this.zzF) {
                    this.zzH = zzf2;
                    zzadj.zza = this.zzG;
                    this.zzF = false;
                    return 1;
                } else if (this.zzC) {
                    long j = this.zzH;
                    if (j != -1) {
                        zzadj.zza = j;
                        this.zzH = -1;
                        return 1;
                    }
                }
            } else {
                for (int i = 0; i < this.zzh.size(); i++) {
                    zzahk zzahk = (zzahk) this.zzh.valueAt(i);
                    zzahk.zzW.getClass();
                    zzadu zzadu = zzahk.zzT;
                    if (zzadu != null) {
                        zzadu.zza(zzahk.zzW, zzahk.zzi);
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        if (this.zzj) {
            zzacq = new zzakg(zzacq, this.zzk);
        }
        this.zzai = zzacq;
    }

    public final void zzf(long j, long j2) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzaj.zzb();
        this.zzg.zze();
        zzw();
        for (int i = 0; i < this.zzh.size(); i++) {
            zzadu zzadu = ((zzahk) this.zzh.valueAt(i)).zzT;
            if (zzadu != null) {
                zzadu.zzb();
            }
        }
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        return new zzahn().zza(zzaco);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e9, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L_0x0316;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(int r22) throws com.google.android.gms.internal.ads.zzbc {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            com.google.android.gms.internal.ads.zzacq r1 = r7.zzai
            com.google.android.gms.internal.ads.zzcw.zzb(r1)
            r1 = 160(0xa0, float:2.24E-43)
            r2 = 8
            java.lang.String r3 = "A_OPUS"
            r4 = 2
            r5 = 0
            if (r0 == r1) goto L_0x0335
            r1 = 174(0xae, float:2.44E-43)
            r10 = -1
            if (r0 == r1) goto L_0x0188
            r1 = 19899(0x4dbb, float:2.7884E-41)
            r2 = -1
            r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r0 == r1) goto L_0x0170
            r1 = 25152(0x6240, float:3.5245E-41)
            if (r0 == r1) goto L_0x013d
            r1 = 28032(0x6d80, float:3.9281E-41)
            if (r0 == r1) goto L_0x0126
            r1 = 357149030(0x1549a966, float:4.072526E-26)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r1) goto L_0x010e
            r1 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r0 == r1) goto L_0x00f8
            if (r0 == r4) goto L_0x003d
            goto L_0x03b1
        L_0x003d:
            boolean r0 = r7.zzC
            if (r0 != 0) goto L_0x00f2
            com.google.android.gms.internal.ads.zzacq r0 = r7.zzai
            com.google.android.gms.internal.ads.zzdp r1 = r7.zzJ
            com.google.android.gms.internal.ads.zzdp r4 = r7.zzK
            long r14 = r7.zzx
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L_0x00e5
            long r2 = r7.zzA
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00e5
            if (r1 == 0) goto L_0x00e5
            int r2 = r1.zza()
            if (r2 == 0) goto L_0x00e5
            if (r4 == 0) goto L_0x00e5
            int r2 = r4.zza()
            int r3 = r1.zza()
            if (r2 == r3) goto L_0x0069
            goto L_0x00e5
        L_0x0069:
            int r2 = r1.zza()
            int[] r3 = new int[r2]
            long[] r12 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r15 = 0
        L_0x0076:
            if (r15 >= r2) goto L_0x008b
            long r16 = r1.zzb(r15)
            r14[r15] = r16
            long r8 = r7.zzx
            long r18 = r4.zzb(r15)
            long r8 = r8 + r18
            r12[r15] = r8
            int r15 = r15 + 1
            goto L_0x0076
        L_0x008b:
            r9 = 0
        L_0x008c:
            int r1 = r2 + -1
            if (r9 >= r1) goto L_0x00a6
            int r1 = r9 + 1
            r17 = r12[r1]
            r19 = r12[r9]
            long r10 = r17 - r19
            int r4 = (int) r10
            r3[r9] = r4
            r10 = r14[r1]
            r17 = r14[r9]
            long r10 = r10 - r17
            r13[r9] = r10
            r9 = r1
            r10 = -1
            goto L_0x008c
        L_0x00a6:
            long r8 = r7.zzx
            long r10 = r7.zzw
            long r8 = r8 + r10
            r10 = r12[r1]
            long r8 = r8 - r10
            int r2 = (int) r8
            r3[r1] = r2
            long r8 = r7.zzA
            r10 = r14[r1]
            long r8 = r8 - r10
            r13[r1] = r8
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x00df
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Discarding last cue point with unexpected duration: "
            r2.<init>(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MatroskaExtractor"
            com.google.android.gms.internal.ads.zzdo.zzf(r4, r2)
            int[] r3 = java.util.Arrays.copyOf(r3, r1)
            long[] r12 = java.util.Arrays.copyOf(r12, r1)
            long[] r13 = java.util.Arrays.copyOf(r13, r1)
            long[] r14 = java.util.Arrays.copyOf(r14, r1)
        L_0x00df:
            com.google.android.gms.internal.ads.zzaca r1 = new com.google.android.gms.internal.ads.zzaca
            r1.<init>(r3, r12, r13, r14)
            goto L_0x00ec
        L_0x00e5:
            com.google.android.gms.internal.ads.zzadl r1 = new com.google.android.gms.internal.ads.zzadl
            long r2 = r7.zzA
            r1.<init>(r2, r5)
        L_0x00ec:
            r0.zzO(r1)
            r0 = 1
            r7.zzC = r0
        L_0x00f2:
            r0 = 0
            r7.zzJ = r0
            r7.zzK = r0
            return
        L_0x00f8:
            r0 = 0
            android.util.SparseArray r1 = r7.zzh
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0107
            com.google.android.gms.internal.ads.zzacq r0 = r7.zzai
            r0.zzD()
            return
        L_0x0107:
            java.lang.String r1 = "No valid tracks were found"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r1, r0)
            throw r0
        L_0x010e:
            long r0 = r7.zzy
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0119
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r7.zzy = r0
        L_0x0119:
            long r0 = r7.zzz
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x03b1
            long r0 = r7.zzr(r0)
            r7.zzA = r0
            return
        L_0x0126:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzahk r0 = r7.zzB
            boolean r1 = r0.zzg
            if (r1 == 0) goto L_0x03b1
            byte[] r0 = r0.zzh
            if (r0 != 0) goto L_0x0135
            goto L_0x03b1
        L_0x0135:
            java.lang.String r0 = "Combining encryption and compression is not supported"
            r1 = 0
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r1)
            throw r0
        L_0x013d:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzahk r0 = r7.zzB
            boolean r1 = r0.zzg
            if (r1 == 0) goto L_0x03b1
            com.google.android.gms.internal.ads.zzads r1 = r0.zzi
            if (r1 == 0) goto L_0x0168
            com.google.android.gms.internal.ads.zzu r1 = new com.google.android.gms.internal.ads.zzu
            r2 = 1
            com.google.android.gms.internal.ads.zzt[] r2 = new com.google.android.gms.internal.ads.zzt[r2]
            com.google.android.gms.internal.ads.zzt r3 = new com.google.android.gms.internal.ads.zzt
            java.util.UUID r4 = com.google.android.gms.internal.ads.zzh.zza
            com.google.android.gms.internal.ads.zzahk r5 = r7.zzB
            com.google.android.gms.internal.ads.zzads r5 = r5.zzi
            byte[] r5 = r5.zzb
            java.lang.String r6 = "video/webm"
            r8 = 0
            r3.<init>(r4, r8, r6, r5)
            r4 = 0
            r2[r4] = r3
            r1.<init>(r8, r2)
            r0.zzk = r1
            return
        L_0x0168:
            r8 = 0
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r8)
            throw r0
        L_0x0170:
            int r0 = r7.zzD
            r1 = -1
            if (r0 == r1) goto L_0x0180
            long r5 = r7.zzE
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0180
            if (r0 != r4) goto L_0x03b1
            r7.zzG = r5
            return
        L_0x0180:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            r1 = 0
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r1)
            throw r0
        L_0x0188:
            r1 = -1
            com.google.android.gms.internal.ads.zzahk r0 = r7.zzB
            com.google.android.gms.internal.ads.zzcw.zzb(r0)
            r5 = r0
            com.google.android.gms.internal.ads.zzahk r5 = (com.google.android.gms.internal.ads.zzahk) r5
            java.lang.String r5 = r0.zzb
            if (r5 == 0) goto L_0x032d
            int r6 = r5.hashCode()
            switch(r6) {
                case -2095576542: goto L_0x030b;
                case -2095575984: goto L_0x0301;
                case -1985379776: goto L_0x02f6;
                case -1784763192: goto L_0x02eb;
                case -1730367663: goto L_0x02e0;
                case -1482641358: goto L_0x02d5;
                case -1482641357: goto L_0x02ca;
                case -1373388978: goto L_0x02bf;
                case -933872740: goto L_0x02b4;
                case -538363189: goto L_0x02a9;
                case -538363109: goto L_0x029e;
                case -425012669: goto L_0x0292;
                case -356037306: goto L_0x0286;
                case 62923557: goto L_0x027a;
                case 62923603: goto L_0x026e;
                case 62927045: goto L_0x0262;
                case 82318131: goto L_0x0257;
                case 82338133: goto L_0x024c;
                case 82338134: goto L_0x0241;
                case 99146302: goto L_0x0235;
                case 444813526: goto L_0x0229;
                case 542569478: goto L_0x021d;
                case 635596514: goto L_0x0211;
                case 725948237: goto L_0x0205;
                case 725957860: goto L_0x01f9;
                case 738597099: goto L_0x01ed;
                case 855502857: goto L_0x01e3;
                case 1045209816: goto L_0x01d7;
                case 1422270023: goto L_0x01cb;
                case 1809237540: goto L_0x01c0;
                case 1950749482: goto L_0x01b4;
                case 1950789798: goto L_0x01a8;
                case 1951062397: goto L_0x019e;
                default: goto L_0x019c;
            }
        L_0x019c:
            goto L_0x0315
        L_0x019e:
            boolean r2 = r5.equals(r3)
            if (r2 == 0) goto L_0x0315
            r2 = 11
            goto L_0x0316
        L_0x01a8:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 22
            goto L_0x0316
        L_0x01b4:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 17
            goto L_0x0316
        L_0x01c0:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 3
            goto L_0x0316
        L_0x01cb:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 27
            goto L_0x0316
        L_0x01d7:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 29
            goto L_0x0316
        L_0x01e3:
            java.lang.String r3 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0315
            goto L_0x0316
        L_0x01ed:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 28
            goto L_0x0316
        L_0x01f9:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 24
            goto L_0x0316
        L_0x0205:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 25
            goto L_0x0316
        L_0x0211:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 26
            goto L_0x0316
        L_0x021d:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 20
            goto L_0x0316
        L_0x0229:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 10
            goto L_0x0316
        L_0x0235:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 31
            goto L_0x0316
        L_0x0241:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 1
            goto L_0x0316
        L_0x024c:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 0
            goto L_0x0316
        L_0x0257:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 2
            goto L_0x0316
        L_0x0262:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 19
            goto L_0x0316
        L_0x026e:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 16
            goto L_0x0316
        L_0x027a:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 13
            goto L_0x0316
        L_0x0286:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 21
            goto L_0x0316
        L_0x0292:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 30
            goto L_0x0316
        L_0x029e:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 7
            goto L_0x0316
        L_0x02a9:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 5
            goto L_0x0316
        L_0x02b4:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 32
            goto L_0x0316
        L_0x02bf:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 9
            goto L_0x0316
        L_0x02ca:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 15
            goto L_0x0316
        L_0x02d5:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 14
            goto L_0x0316
        L_0x02e0:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 12
            goto L_0x0316
        L_0x02eb:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 18
            goto L_0x0316
        L_0x02f6:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 23
            goto L_0x0316
        L_0x0301:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 4
            goto L_0x0316
        L_0x030b:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0315
            r2 = 6
            goto L_0x0316
        L_0x0315:
            r2 = -1
        L_0x0316:
            switch(r2) {
                case 0: goto L_0x031b;
                case 1: goto L_0x031b;
                case 2: goto L_0x031b;
                case 3: goto L_0x031b;
                case 4: goto L_0x031b;
                case 5: goto L_0x031b;
                case 6: goto L_0x031b;
                case 7: goto L_0x031b;
                case 8: goto L_0x031b;
                case 9: goto L_0x031b;
                case 10: goto L_0x031b;
                case 11: goto L_0x031b;
                case 12: goto L_0x031b;
                case 13: goto L_0x031b;
                case 14: goto L_0x031b;
                case 15: goto L_0x031b;
                case 16: goto L_0x031b;
                case 17: goto L_0x031b;
                case 18: goto L_0x031b;
                case 19: goto L_0x031b;
                case 20: goto L_0x031b;
                case 21: goto L_0x031b;
                case 22: goto L_0x031b;
                case 23: goto L_0x031b;
                case 24: goto L_0x031b;
                case 25: goto L_0x031b;
                case 26: goto L_0x031b;
                case 27: goto L_0x031b;
                case 28: goto L_0x031b;
                case 29: goto L_0x031b;
                case 30: goto L_0x031b;
                case 31: goto L_0x031b;
                case 32: goto L_0x031b;
                default: goto L_0x0319;
            }
        L_0x0319:
            r0 = 0
            goto L_0x032a
        L_0x031b:
            com.google.android.gms.internal.ads.zzacq r1 = r7.zzai
            int r2 = r0.zzc
            r0.zze(r1, r2)
            android.util.SparseArray r1 = r7.zzh
            int r2 = r0.zzc
            r1.put(r2, r0)
            goto L_0x0319
        L_0x032a:
            r7.zzB = r0
            return
        L_0x032d:
            r0 = 0
            java.lang.String r1 = "CodecId is missing in TrackEntry element"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r1, r0)
            throw r0
        L_0x0335:
            int r0 = r7.zzN
            if (r0 != r4) goto L_0x03b1
            android.util.SparseArray r0 = r7.zzh
            int r1 = r7.zzT
            java.lang.Object r0 = r0.get(r1)
            r8 = r0
            com.google.android.gms.internal.ads.zzahk r8 = (com.google.android.gms.internal.ads.zzahk) r8
            r8.zzW.getClass()
            long r0 = r7.zzY
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x036f
            java.lang.String r0 = r8.zzb
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x036f
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzu
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            long r2 = r7.zzY
            java.nio.ByteBuffer r1 = r1.putLong(r2)
            byte[] r1 = r1.array()
            int r2 = r1.length
            r0.zzJ(r1, r2)
        L_0x036f:
            r0 = 0
            r4 = 0
        L_0x0371:
            int r1 = r7.zzR
            if (r4 >= r1) goto L_0x037d
            int[] r1 = r7.zzS
            r1 = r1[r4]
            int r0 = r0 + r1
            int r4 = r4 + 1
            goto L_0x0371
        L_0x037d:
            r4 = 0
        L_0x037e:
            int r1 = r7.zzR
            if (r4 >= r1) goto L_0x03ae
            long r1 = r7.zzO
            int r3 = r8.zze
            int r3 = r3 * r4
            int r3 = r3 / 1000
            long r5 = (long) r3
            long r2 = r1 + r5
            int r1 = r7.zzV
            if (r4 != 0) goto L_0x039a
            boolean r4 = r7.zzX
            if (r4 != 0) goto L_0x0397
            r1 = r1 | 1
        L_0x0397:
            r4 = r1
            r9 = 0
            goto L_0x039c
        L_0x039a:
            r9 = r4
            r4 = r1
        L_0x039c:
            int[] r1 = r7.zzS
            r5 = r1[r9]
            int r10 = r0 - r5
            r0 = r21
            r1 = r8
            r6 = r10
            r0.zzu(r1, r2, r4, r5, r6)
            r0 = 1
            int r4 = r9 + 1
            r0 = r10
            goto L_0x037e
        L_0x03ae:
            r1 = 0
            r7.zzN = r1
        L_0x03b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzj(int):void");
    }

    /* access modifiers changed from: protected */
    public final void zzm(int i, long j, long j2) throws zzbc {
        zzcw.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0;
        } else if (i == 174) {
            this.zzB = new zzahk();
        } else if (i == 187) {
            this.zzL = false;
        } else if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1;
        } else if (i == 20533) {
            zzt(i);
            this.zzB.zzg = true;
        } else if (i == 21968) {
            zzt(i);
            this.zzB.zzx = true;
        } else if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 == -1 || j3 == j) {
                this.zzx = j;
                this.zzw = j2;
                return;
            }
            throw zzbc.zza("Multiple Segment elements not supported", (Throwable) null);
        } else if (i == 475249515) {
            this.zzJ = new zzdp(32);
            this.zzK = new zzdp(32);
        } else if (i != 524531317 || this.zzC) {
        } else {
            if (!this.zzi || this.zzG == -1) {
                this.zzai.zzO(new zzadl(this.zzA, 0));
                this.zzC = true;
                return;
            }
            this.zzF = true;
        }
    }

    zzahm(zzahh zzahh, int i, zzakd zzakd) {
        this.zzx = -1;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1;
        this.zzH = -1;
        this.zzI = -9223372036854775807L;
        this.zzaj = zzahh;
        zzahh.zza(new zzahj(this, (zzahl) null));
        this.zzk = zzakd;
        boolean z = false;
        this.zzi = 1 == ((i & 1) ^ 1);
        this.zzj = (i & 2) == 0 ? true : z;
        this.zzg = new zzaho();
        this.zzh = new SparseArray();
        this.zzn = new zzdy(4);
        this.zzo = new zzdy(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzdy(4);
        this.zzl = new zzdy(zzfk.zza);
        this.zzm = new zzdy(4);
        this.zzq = new zzdy();
        this.zzr = new zzdy();
        this.zzs = new zzdy(8);
        this.zzt = new zzdy();
        this.zzu = new zzdy();
        this.zzS = new int[1];
    }

    /* access modifiers changed from: protected */
    public final void zzn(int i, String str) throws zzbc {
        if (i == 134) {
            zzt(i);
            this.zzB.zzb = str;
        } else if (i != 17026) {
            if (i == 21358) {
                zzt(i);
                this.zzB.zza = str;
            } else if (i == 2274716) {
                zzt(i);
                this.zzB.zzZ = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw zzbc.zza("DocType " + str + " not supported", (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x026f, code lost:
        throw com.google.android.gms.internal.ads.zzbc.zza("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh(int r22, int r23, com.google.android.gms.internal.ads.zzaco r24) throws java.io.IOException {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            r1 = r23
            r8 = r24
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 0
            r4 = 4
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r10 = 0
            if (r0 == r2) goto L_0x00fd
            if (r0 == r5) goto L_0x00fd
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00cc
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00a6
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x0097
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x0085
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0062
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0053
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x0040
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzahk r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzv = r2
            byte[] r0 = r0.zzv
            r8.zzi(r0, r10, r1)
            return
        L_0x0040:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected id: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r3)
            throw r0
        L_0x0053:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzahk r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzj = r2
            byte[] r0 = r0.zzj
            r8.zzi(r0, r10, r1)
            return
        L_0x0062:
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzp
            byte[] r0 = r0.zzN()
            java.util.Arrays.fill(r0, r10)
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzp
            int r2 = 4 - r1
            byte[] r0 = r0.zzN()
            r8.zzi(r0, r2, r1)
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzp
            r0.zzL(r10)
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzp
            long r0 = r0.zzu()
            int r1 = (int) r0
            r7.zzD = r1
            return
        L_0x0085:
            byte[] r2 = new byte[r1]
            r8.zzi(r2, r10, r1)
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzahk r0 = r7.zzB
            com.google.android.gms.internal.ads.zzads r1 = new com.google.android.gms.internal.ads.zzads
            r1.<init>(r9, r2, r10, r10)
            r0.zzi = r1
            return
        L_0x0097:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzahk r0 = r7.zzB
            byte[] r2 = new byte[r1]
            r0.zzh = r2
            byte[] r0 = r0.zzh
            r8.zzi(r0, r10, r1)
            return
        L_0x00a6:
            r21.zzt(r22)
            com.google.android.gms.internal.ads.zzahk r0 = r7.zzB
            int r2 = r0.zzY
            r3 = 1685485123(0x64767643, float:1.8185683E22)
            if (r2 == r3) goto L_0x00c2
            int r2 = r0.zzY
            r3 = 1685480259(0x64766343, float:1.8180206E22)
            if (r2 != r3) goto L_0x00be
            goto L_0x00c2
        L_0x00be:
            r8.zzk(r1)
            return
        L_0x00c2:
            byte[] r2 = new byte[r1]
            r0.zzN = r2
            byte[] r0 = r0.zzN
            r8.zzi(r0, r10, r1)
            return
        L_0x00cc:
            int r0 = r7.zzN
            if (r0 == r6) goto L_0x00d2
            goto L_0x0316
        L_0x00d2:
            android.util.SparseArray r0 = r7.zzh
            int r2 = r7.zzT
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.ads.zzahk r0 = (com.google.android.gms.internal.ads.zzahk) r0
            int r2 = r7.zzW
            if (r2 != r4) goto L_0x00f9
            java.lang.String r0 = r0.zzb
            java.lang.String r2 = "V_VP9"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00f9
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzu
            r0.zzI(r1)
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzu
            byte[] r0 = r0.zzN()
            r8.zzi(r0, r10, r1)
            return
        L_0x00f9:
            r8.zzk(r1)
            return
        L_0x00fd:
            int r2 = r7.zzN
            r11 = 8
            if (r2 != 0) goto L_0x0122
            com.google.android.gms.internal.ads.zzaho r2 = r7.zzg
            long r12 = r2.zzd(r8, r10, r9, r11)
            int r2 = (int) r12
            r7.zzT = r2
            com.google.android.gms.internal.ads.zzaho r2 = r7.zzg
            int r2 = r2.zza()
            r7.zzU = r2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.zzP = r12
            r7.zzN = r9
            com.google.android.gms.internal.ads.zzdy r2 = r7.zzn
            r2.zzI(r10)
        L_0x0122:
            android.util.SparseArray r2 = r7.zzh
            int r12 = r7.zzT
            java.lang.Object r2 = r2.get(r12)
            r12 = r2
            com.google.android.gms.internal.ads.zzahk r12 = (com.google.android.gms.internal.ads.zzahk) r12
            if (r12 != 0) goto L_0x0139
            int r0 = r7.zzU
            int r0 = r1 - r0
            r8.zzk(r0)
            r7.zzN = r10
            return
        L_0x0139:
            r12.zzW.getClass()
            int r2 = r7.zzN
            if (r2 != r9) goto L_0x02ce
            r2 = 3
            r7.zzv(r8, r2)
            com.google.android.gms.internal.ads.zzdy r13 = r7.zzn
            byte[] r13 = r13.zzN()
            byte r13 = r13[r6]
            r13 = r13 & 6
            int r13 = r13 >> r9
            r14 = 255(0xff, float:3.57E-43)
            if (r13 != 0) goto L_0x0166
            r7.zzR = r9
            int[] r2 = r7.zzS
            int[] r2 = zzz(r2, r9)
            r7.zzS = r2
            int r3 = r7.zzU
            int r1 = r1 - r3
            int r1 = r1 + -3
            r2[r10] = r1
            goto L_0x0281
        L_0x0166:
            r7.zzv(r8, r4)
            com.google.android.gms.internal.ads.zzdy r15 = r7.zzn
            byte[] r15 = r15.zzN()
            byte r15 = r15[r2]
            r15 = r15 & r14
            int r15 = r15 + r9
            r7.zzR = r15
            int[] r4 = r7.zzS
            int[] r4 = zzz(r4, r15)
            r7.zzS = r4
            if (r13 != r6) goto L_0x018c
            int r2 = r7.zzU
            int r1 = r1 - r2
            int r1 = r1 + -4
            int r2 = r7.zzR
            int r1 = r1 / r2
            java.util.Arrays.fill(r4, r10, r2, r1)
            goto L_0x0281
        L_0x018c:
            if (r13 != r9) goto L_0x01c6
            r2 = 0
            r3 = 0
            r4 = 4
        L_0x0191:
            int r13 = r7.zzR
            int r13 = r13 + -1
            if (r2 >= r13) goto L_0x01bb
            int[] r13 = r7.zzS
            r13[r2] = r10
        L_0x019b:
            int r13 = r4 + 1
            r7.zzv(r8, r13)
            com.google.android.gms.internal.ads.zzdy r15 = r7.zzn
            byte[] r15 = r15.zzN()
            byte r4 = r15[r4]
            r4 = r4 & r14
            int[] r15 = r7.zzS
            r16 = r15[r2]
            int r16 = r16 + r4
            r15[r2] = r16
            if (r4 == r14) goto L_0x01b9
            int r3 = r3 + r16
            int r2 = r2 + 1
            r4 = r13
            goto L_0x0191
        L_0x01b9:
            r4 = r13
            goto L_0x019b
        L_0x01bb:
            int[] r2 = r7.zzS
            int r15 = r7.zzU
            int r1 = r1 - r15
            int r1 = r1 - r4
            int r1 = r1 - r3
            r2[r13] = r1
            goto L_0x0281
        L_0x01c6:
            if (r13 != r2) goto L_0x02c6
            r2 = 0
            r4 = 4
            r13 = 0
        L_0x01cb:
            int r15 = r7.zzR
            int r15 = r15 + -1
            if (r2 >= r15) goto L_0x0278
            int[] r15 = r7.zzS
            r15[r2] = r10
            int r15 = r4 + 1
            r7.zzv(r8, r15)
            com.google.android.gms.internal.ads.zzdy r5 = r7.zzn
            byte[] r5 = r5.zzN()
            byte r5 = r5[r4]
            if (r5 == 0) goto L_0x0270
            r5 = 0
        L_0x01e5:
            if (r5 >= r11) goto L_0x023c
            int r17 = 7 - r5
            int r6 = r9 << r17
            com.google.android.gms.internal.ads.zzdy r9 = r7.zzn
            byte[] r9 = r9.zzN()
            byte r9 = r9[r4]
            r9 = r9 & r6
            if (r9 == 0) goto L_0x0234
            int r15 = r15 + r5
            r7.zzv(r8, r15)
            com.google.android.gms.internal.ads.zzdy r9 = r7.zzn
            int r18 = r4 + 1
            byte[] r9 = r9.zzN()
            byte r4 = r9[r4]
            r4 = r4 & r14
            int r6 = ~r6
            r4 = r4 & r6
            long r3 = (long) r4
            r9 = r18
        L_0x020a:
            if (r9 >= r15) goto L_0x0223
            long r3 = r3 << r11
            com.google.android.gms.internal.ads.zzdy r6 = r7.zzn
            int r19 = r9 + 1
            byte[] r6 = r6.zzN()
            byte r6 = r6[r9]
            r6 = r6 & r14
            r20 = r15
            long r14 = (long) r6
            long r3 = r3 | r14
            r9 = r19
            r15 = r20
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x020a
        L_0x0223:
            r20 = r15
            if (r2 <= 0) goto L_0x0240
            int r5 = r5 * 7
            int r5 = r5 + 6
            r14 = 1
            long r5 = r14 << r5
            r14 = -1
            long r5 = r5 + r14
            long r3 = r3 - r5
            goto L_0x0240
        L_0x0234:
            int r5 = r5 + 1
            r3 = 0
            r6 = 2
            r9 = 1
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01e5
        L_0x023c:
            r3 = 0
            r20 = r15
        L_0x0240:
            r5 = -2147483648(0xffffffff80000000, double:NaN)
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 < 0) goto L_0x0268
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 > 0) goto L_0x0268
            int[] r5 = r7.zzS
            int r4 = (int) r3
            if (r2 == 0) goto L_0x0258
            int r3 = r2 + -1
            r3 = r5[r3]
            int r4 = r4 + r3
        L_0x0258:
            r5[r2] = r4
            int r13 = r13 + r4
            int r2 = r2 + 1
            r4 = r20
            r3 = 0
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 2
            r9 = 1
            r14 = 255(0xff, float:3.57E-43)
            goto L_0x01cb
        L_0x0268:
            java.lang.String r0 = "EBML lacing sample size out of range."
            r1 = 0
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r1)
            throw r0
        L_0x0270:
            r1 = r3
            java.lang.String r0 = "No valid varint length mask found"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r1)
            throw r0
        L_0x0278:
            int[] r2 = r7.zzS
            int r3 = r7.zzU
            int r1 = r1 - r3
            int r1 = r1 - r4
            int r1 = r1 - r13
            r2[r15] = r1
        L_0x0281:
            com.google.android.gms.internal.ads.zzdy r1 = r7.zzn
            byte[] r1 = r1.zzN()
            byte r1 = r1[r10]
            int r1 = r1 << r11
            com.google.android.gms.internal.ads.zzdy r2 = r7.zzn
            byte[] r2 = r2.zzN()
            r3 = 1
            byte r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            long r3 = r7.zzI
            r1 = r1 | r2
            long r1 = (long) r1
            long r1 = r7.zzr(r1)
            long r3 = r3 + r1
            r7.zzO = r3
            int r1 = r12.zzd
            r2 = 2
            if (r1 == r2) goto L_0x02be
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02bc
            com.google.android.gms.internal.ads.zzdy r0 = r7.zzn
            byte[] r0 = r0.zzN()
            byte r0 = r0[r2]
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != r1) goto L_0x02ba
            r0 = 163(0xa3, float:2.28E-43)
            goto L_0x02be
        L_0x02ba:
            r0 = 163(0xa3, float:2.28E-43)
        L_0x02bc:
            r3 = 0
            goto L_0x02bf
        L_0x02be:
            r3 = 1
        L_0x02bf:
            r7.zzV = r3
            r7.zzN = r2
            r7.zzQ = r10
            goto L_0x02ce
        L_0x02c6:
            java.lang.String r0 = "Unexpected lacing value: 2"
            r1 = 0
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r1)
            throw r0
        L_0x02ce:
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x02ff
        L_0x02d2:
            int r0 = r7.zzQ
            int r1 = r7.zzR
            if (r0 >= r1) goto L_0x02fc
            int[] r1 = r7.zzS
            r0 = r1[r0]
            int r5 = r7.zzp(r8, r12, r0, r10)
            long r0 = r7.zzO
            int r2 = r7.zzQ
            int r3 = r12.zze
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.zzV
            r6 = 0
            r0 = r21
            r1 = r12
            r0.zzu(r1, r2, r4, r5, r6)
            int r0 = r7.zzQ
            r1 = 1
            int r0 = r0 + r1
            r7.zzQ = r0
            goto L_0x02d2
        L_0x02fc:
            r7.zzN = r10
            return
        L_0x02ff:
            r1 = 1
        L_0x0300:
            int r0 = r7.zzQ
            int r2 = r7.zzR
            if (r0 >= r2) goto L_0x0316
            int[] r2 = r7.zzS
            r3 = r2[r0]
            int r3 = r7.zzp(r8, r12, r3, r1)
            r2[r0] = r3
            int r0 = r7.zzQ
            int r0 = r0 + r1
            r7.zzQ = r0
            goto L_0x0300
        L_0x0316:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahm.zzh(int, int, com.google.android.gms.internal.ads.zzaco):void");
    }

    public zzahm(zzakd zzakd, int i) {
        this(new zzahh(), 0, zzakd);
    }

    /* access modifiers changed from: protected */
    public final void zzk(int i, double d) throws zzbc {
        if (i == 181) {
            zzt(i);
            this.zzB.zzQ = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    zzt(i);
                    this.zzB.zzD = (float) d;
                    return;
                case 21970:
                    zzt(i);
                    this.zzB.zzE = (float) d;
                    return;
                case 21971:
                    zzt(i);
                    this.zzB.zzF = (float) d;
                    return;
                case 21972:
                    zzt(i);
                    this.zzB.zzG = (float) d;
                    return;
                case 21973:
                    zzt(i);
                    this.zzB.zzH = (float) d;
                    return;
                case 21974:
                    zzt(i);
                    this.zzB.zzI = (float) d;
                    return;
                case 21975:
                    zzt(i);
                    this.zzB.zzJ = (float) d;
                    return;
                case 21976:
                    zzt(i);
                    this.zzB.zzK = (float) d;
                    return;
                case 21977:
                    zzt(i);
                    this.zzB.zzL = (float) d;
                    return;
                case 21978:
                    zzt(i);
                    this.zzB.zzM = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            zzt(i);
                            this.zzB.zzs = (float) d;
                            return;
                        case 30324:
                            zzt(i);
                            this.zzB.zzt = (float) d;
                            return;
                        case 30325:
                            zzt(i);
                            this.zzB.zzu = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzz = (long) d;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzl(int i, long j) throws zzbc {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        zzt(i);
                        this.zzB.zzd = (int) j;
                        return;
                    case 136:
                        if (j == 1) {
                            z = true;
                        }
                        zzt(i);
                        this.zzB.zzV = z;
                        return;
                    case 155:
                        this.zzP = zzr(j);
                        return;
                    case 159:
                        zzt(i);
                        this.zzB.zzO = (int) j;
                        return;
                    case 176:
                        zzt(i);
                        this.zzB.zzl = (int) j;
                        return;
                    case 179:
                        zzs(i);
                        this.zzJ.zzc(zzr(j));
                        return;
                    case 186:
                        zzt(i);
                        this.zzB.zzm = (int) j;
                        return;
                    case 215:
                        zzt(i);
                        this.zzB.zzc = (int) j;
                        return;
                    case 231:
                        this.zzI = zzr(j);
                        return;
                    case 238:
                        this.zzW = (int) j;
                        return;
                    case 241:
                        if (!this.zzL) {
                            zzs(i);
                            this.zzK.zzc(j);
                            this.zzL = true;
                            return;
                        }
                        return;
                    case 251:
                        this.zzX = true;
                        return;
                    case 16871:
                        zzt(i);
                        this.zzB.zzY = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw zzbc.zza("ContentCompAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw zzbc.zza("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw zzbc.zza("EBMLReadVersion " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw zzbc.zza("ContentEncAlgo " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw zzbc.zza("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.zzE = j + this.zzx;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        zzt(i);
                        if (i2 == 0) {
                            this.zzB.zzw = 0;
                            return;
                        } else if (i2 == 1) {
                            this.zzB.zzw = 2;
                            return;
                        } else if (i2 == 3) {
                            this.zzB.zzw = 1;
                            return;
                        } else if (i2 == 15) {
                            this.zzB.zzw = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        zzt(i);
                        this.zzB.zzo = (int) j;
                        return;
                    case 21682:
                        zzt(i);
                        this.zzB.zzq = (int) j;
                        return;
                    case 21690:
                        zzt(i);
                        this.zzB.zzp = (int) j;
                        return;
                    case 21930:
                        if (j == 1) {
                            z = true;
                        }
                        zzt(i);
                        this.zzB.zzU = z;
                        return;
                    case 21938:
                        zzt(i);
                        zzahk zzahk = this.zzB;
                        zzahk.zzx = true;
                        zzahk.zzn = (int) j;
                        return;
                    case 21998:
                        zzt(i);
                        this.zzB.zzf = (int) j;
                        return;
                    case 22186:
                        zzt(i);
                        this.zzB.zzR = j;
                        return;
                    case 22203:
                        zzt(i);
                        this.zzB.zzS = j;
                        return;
                    case 25188:
                        zzt(i);
                        this.zzB.zzP = (int) j;
                        return;
                    case 30114:
                        this.zzY = j;
                        return;
                    case 30321:
                        int i3 = (int) j;
                        zzt(i);
                        if (i3 == 0) {
                            this.zzB.zzr = 0;
                            return;
                        } else if (i3 == 1) {
                            this.zzB.zzr = 1;
                            return;
                        } else if (i3 == 2) {
                            this.zzB.zzr = 2;
                            return;
                        } else if (i3 == 3) {
                            this.zzB.zzr = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        zzt(i);
                        this.zzB.zze = (int) j;
                        return;
                    case 2807729:
                        this.zzy = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i4 = (int) j;
                                zzt(i);
                                if (i4 == 1) {
                                    this.zzB.zzA = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.zzB.zzA = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                zzt(i);
                                int zzb2 = zzk.zzb((int) j);
                                if (zzb2 != -1) {
                                    this.zzB.zzz = zzb2;
                                    return;
                                }
                                return;
                            case 21947:
                                zzt(i);
                                this.zzB.zzx = true;
                                int zza2 = zzk.zza((int) j);
                                if (zza2 != -1) {
                                    this.zzB.zzy = zza2;
                                    return;
                                }
                                return;
                            case 21948:
                                zzt(i);
                                this.zzB.zzB = (int) j;
                                return;
                            case 21949:
                                zzt(i);
                                this.zzB.zzC = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw zzbc.zza("ContentEncodingScope " + j + " not supported", (Throwable) null);
            }
        } else if (j != 0) {
            throw zzbc.zza("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
    }
}
