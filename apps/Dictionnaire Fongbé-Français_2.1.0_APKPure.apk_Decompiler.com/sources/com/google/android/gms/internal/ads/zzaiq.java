package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaiq implements zzacn {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzab zzb;
    private long zzA;
    private zzaip zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private zzacq zzH;
    private zzadt[] zzI;
    private zzadt[] zzJ;
    private boolean zzK;
    private final zzakd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzdy zzg;
    private final zzdy zzh;
    private final zzdy zzi;
    private final byte[] zzj;
    private final zzdy zzk;
    private final zzafl zzl;
    private final zzdy zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfo zzp;
    private zzfxn zzq;
    private int zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private zzdy zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    static {
        zzz zzz2 = new zzz();
        zzz2.zzaa("application/x-emsg");
        zzb = zzz2.zzag();
    }

    @Deprecated
    public zzaiq() {
        this(zzakd.zza, 32, (zzef) null, (zzajb) null, zzfxn.zzn(), (zzadt) null);
    }

    private static int zzg(int i) throws zzbc {
        if (i >= 0) {
            return i;
        }
        throw zzbc.zza("Unexpected negative value: " + i, (Throwable) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzu zzh(java.util.List r18) {
        /*
            int r0 = r18.size()
            r1 = 0
            r3 = 0
            r4 = 0
        L_0x0007:
            if (r3 >= r0) goto L_0x012b
            r5 = r18
            java.lang.Object r6 = r5.get(r3)
            com.google.android.gms.internal.ads.zzeo r6 = (com.google.android.gms.internal.ads.zzeo) r6
            int r7 = r6.zzd
            r8 = 1886614376(0x70737368, float:3.013775E29)
            if (r7 != r8) goto L_0x0124
            if (r4 != 0) goto L_0x001f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001f:
            com.google.android.gms.internal.ads.zzdy r6 = r6.zza
            byte[] r6 = r6.zzN()
            com.google.android.gms.internal.ads.zzdy r7 = new com.google.android.gms.internal.ads.zzdy
            r7.<init>((byte[]) r6)
            int r9 = r7.zze()
            r10 = 32
            if (r9 >= r10) goto L_0x0039
        L_0x0032:
            r16 = r3
            r17 = r4
        L_0x0036:
            r2 = 0
            goto L_0x0104
        L_0x0039:
            r7.zzL(r1)
            int r9 = r7.zzb()
            int r10 = r7.zzg()
            java.lang.String r11 = "PsshAtomUtil"
            if (r10 == r9) goto L_0x0062
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Advertised atom size ("
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r8 = ") does not match buffer size: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r11, r7)
            goto L_0x0032
        L_0x0062:
            int r9 = r7.zzg()
            if (r9 == r8) goto L_0x007a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Atom type is not pssh: "
            r7.<init>(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r11, r7)
            goto L_0x0032
        L_0x007a:
            int r8 = r7.zzg()
            int r8 = com.google.android.gms.internal.ads.zzaik.zza(r8)
            r9 = 1
            if (r8 <= r9) goto L_0x0097
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Unsupported pssh version: "
            r7.<init>(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r11, r7)
            goto L_0x0032
        L_0x0097:
            java.util.UUID r10 = new java.util.UUID
            long r12 = r7.zzt()
            long r14 = r7.zzt()
            r10.<init>(r12, r14)
            if (r8 != r9) goto L_0x00d0
            int r9 = r7.zzp()
            java.util.UUID[] r12 = new java.util.UUID[r9]
            r13 = 0
        L_0x00ad:
            if (r13 >= r9) goto L_0x00cb
            java.util.UUID r14 = new java.util.UUID
            r16 = r3
            long r2 = r7.zzt()
            r17 = r4
            long r4 = r7.zzt()
            r14.<init>(r2, r4)
            r12[r13] = r14
            int r13 = r13 + 1
            r5 = r18
            r3 = r16
            r4 = r17
            goto L_0x00ad
        L_0x00cb:
            r16 = r3
            r17 = r4
            goto L_0x00d5
        L_0x00d0:
            r16 = r3
            r17 = r4
            r12 = 0
        L_0x00d5:
            int r2 = r7.zzp()
            int r3 = r7.zzb()
            if (r2 == r3) goto L_0x00fa
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Atom data size ("
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ") does not match the bytes left: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r11, r2)
            goto L_0x0036
        L_0x00fa:
            byte[] r3 = new byte[r2]
            r7.zzH(r3, r1, r2)
            com.google.android.gms.internal.ads.zzaix r2 = new com.google.android.gms.internal.ads.zzaix
            r2.<init>(r10, r8, r3, r12)
        L_0x0104:
            if (r2 != 0) goto L_0x0108
            r2 = 0
            goto L_0x010a
        L_0x0108:
            java.util.UUID r2 = r2.zza
        L_0x010a:
            if (r2 != 0) goto L_0x0116
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r3 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzdo.zzf(r2, r3)
            r4 = r17
            goto L_0x0126
        L_0x0116:
            com.google.android.gms.internal.ads.zzt r3 = new com.google.android.gms.internal.ads.zzt
            java.lang.String r4 = "video/mp4"
            r5 = 0
            r3.<init>(r2, r5, r4, r6)
            r4 = r17
            r4.add(r3)
            goto L_0x0127
        L_0x0124:
            r16 = r3
        L_0x0126:
            r5 = 0
        L_0x0127:
            int r3 = r16 + 1
            goto L_0x0007
        L_0x012b:
            r5 = 0
            if (r4 != 0) goto L_0x012f
            return r5
        L_0x012f:
            com.google.android.gms.internal.ads.zzu r0 = new com.google.android.gms.internal.ads.zzu
            r0.<init>((java.util.List) r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiq.zzh(java.util.List):com.google.android.gms.internal.ads.zzu");
    }

    private final void zzj() {
        this.zzr = 0;
        this.zzu = 0;
    }

    private static void zzk(zzdy zzdy, int i, zzajd zzajd) throws zzbc {
        zzdy.zzL(i + 8);
        int zzg2 = zzdy.zzg();
        int i2 = zzaik.zza;
        if ((zzg2 & 1) == 0) {
            boolean z = (zzg2 & 2) != 0;
            int zzp2 = zzdy.zzp();
            if (zzp2 == 0) {
                Arrays.fill(zzajd.zzl, 0, zzajd.zze, false);
                return;
            }
            int i3 = zzajd.zze;
            if (zzp2 == i3) {
                Arrays.fill(zzajd.zzl, 0, zzp2, z);
                zzajd.zza(zzdy.zzb());
                zzdy zzdy2 = zzajd.zzn;
                zzdy.zzH(zzdy2.zzN(), 0, zzdy2.zze());
                zzajd.zzn.zzL(0);
                zzajd.zzo = false;
                return;
            }
            throw zzbc.zza("Senc sample count " + zzp2 + " is different from fragment sample count" + i3, (Throwable) null);
        }
        throw zzbc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0340, code lost:
        if ((com.google.android.gms.internal.ads.zzei.zzu(r34, 1000000, r5.zzd, java.math.RoundingMode.DOWN) + com.google.android.gms.internal.ads.zzei.zzu(r5.zzj[0], 1000000, r5.zzc, java.math.RoundingMode.DOWN)) < r5.zze) goto L_0x0356;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzl(long r52) throws com.google.android.gms.internal.ads.zzbc {
        /*
            r51 = this;
            r0 = r51
        L_0x0002:
            java.util.ArrayDeque r1 = r0.zzn
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0744
            java.util.ArrayDeque r1 = r0.zzn
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzen r1 = (com.google.android.gms.internal.ads.zzen) r1
            long r1 = r1.zza
            int r3 = (r1 > r52 ? 1 : (r1 == r52 ? 0 : -1))
            if (r3 != 0) goto L_0x0744
            java.util.ArrayDeque r1 = r0.zzn
            java.lang.Object r1 = r1.pop()
            r2 = r1
            com.google.android.gms.internal.ads.zzen r2 = (com.google.android.gms.internal.ads.zzen) r2
            int r1 = r2.zzd
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r6 = 12
            r8 = 8
            if (r1 != r3) goto L_0x014e
            java.util.List r1 = r2.zzb
            com.google.android.gms.internal.ads.zzu r1 = zzh(r1)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            com.google.android.gms.internal.ads.zzen r3 = r2.zza(r3)
            r3.getClass()
            r9 = r3
            com.google.android.gms.internal.ads.zzen r9 = (com.google.android.gms.internal.ads.zzen) r9
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.util.List r9 = r3.zzb
            int r9 = r9.size()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 0
        L_0x0050:
            if (r13 >= r9) goto L_0x00bb
            java.util.List r14 = r3.zzb
            java.lang.Object r14 = r14.get(r13)
            com.google.android.gms.internal.ads.zzeo r14 = (com.google.android.gms.internal.ads.zzeo) r14
            int r15 = r14.zzd
            r11 = 1953654136(0x74726578, float:7.6818474E31)
            if (r15 != r11) goto L_0x0099
            com.google.android.gms.internal.ads.zzdy r11 = r14.zza
            r11.zzL(r6)
            int r14 = r11.zzg()
            int r15 = r11.zzg()
            int r15 = r15 + -1
            int r6 = r11.zzg()
            int r10 = r11.zzg()
            int r11 = r11.zzg()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            com.google.android.gms.internal.ads.zzail r7 = new com.google.android.gms.internal.ads.zzail
            r7.<init>(r15, r6, r10, r11)
            android.util.Pair r6 = android.util.Pair.create(r14, r7)
            java.lang.Object r7 = r6.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.second
            com.google.android.gms.internal.ads.zzail r6 = (com.google.android.gms.internal.ads.zzail) r6
            r12.put(r7, r6)
            goto L_0x00b6
        L_0x0099:
            r6 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r15 != r6) goto L_0x00b6
            com.google.android.gms.internal.ads.zzdy r4 = r14.zza
            r4.zzL(r8)
            int r5 = r4.zzg()
            int r5 = com.google.android.gms.internal.ads.zzaik.zza(r5)
            if (r5 != 0) goto L_0x00b2
            long r4 = r4.zzu()
            goto L_0x00b6
        L_0x00b2:
            long r4 = r4.zzw()
        L_0x00b6:
            int r13 = r13 + 1
            r6 = 12
            goto L_0x0050
        L_0x00bb:
            com.google.android.gms.internal.ads.zzadb r3 = new com.google.android.gms.internal.ads.zzadb
            r3.<init>()
            int r6 = r0.zzd
            r7 = 16
            r6 = r6 & r7
            if (r6 == 0) goto L_0x00c9
            r7 = 1
            goto L_0x00ca
        L_0x00c9:
            r7 = 0
        L_0x00ca:
            com.google.android.gms.internal.ads.zzaim r9 = new com.google.android.gms.internal.ads.zzaim
            r9.<init>(r0)
            r8 = 0
            r6 = r1
            java.util.List r1 = com.google.android.gms.internal.ads.zzaik.zzf(r2, r3, r4, r6, r7, r8, r9)
            int r2 = r1.size()
            android.util.SparseArray r3 = r0.zzf
            int r3 = r3.size()
            if (r3 != 0) goto L_0x011f
            r11 = 0
        L_0x00e2:
            if (r11 >= r2) goto L_0x0118
            java.lang.Object r3 = r1.get(r11)
            com.google.android.gms.internal.ads.zzaje r3 = (com.google.android.gms.internal.ads.zzaje) r3
            com.google.android.gms.internal.ads.zzajb r4 = r3.zza
            com.google.android.gms.internal.ads.zzacq r5 = r0.zzH
            int r6 = r4.zzb
            com.google.android.gms.internal.ads.zzadt r5 = r5.zzw(r11, r6)
            long r6 = r4.zze
            r5.zzl(r6)
            int r6 = r4.zza
            com.google.android.gms.internal.ads.zzaip r7 = new com.google.android.gms.internal.ads.zzaip
            com.google.android.gms.internal.ads.zzail r6 = zzm(r12, r6)
            r7.<init>(r5, r3, r6)
            android.util.SparseArray r3 = r0.zzf
            int r5 = r4.zza
            r3.put(r5, r7)
            long r5 = r0.zzz
            long r3 = r4.zze
            long r3 = java.lang.Math.max(r5, r3)
            r0.zzz = r3
            int r11 = r11 + 1
            goto L_0x00e2
        L_0x0118:
            com.google.android.gms.internal.ads.zzacq r1 = r0.zzH
            r1.zzD()
            goto L_0x0002
        L_0x011f:
            android.util.SparseArray r3 = r0.zzf
            int r3 = r3.size()
            if (r3 != r2) goto L_0x0129
            r10 = 1
            goto L_0x012a
        L_0x0129:
            r10 = 0
        L_0x012a:
            com.google.android.gms.internal.ads.zzcw.zzf(r10)
            r11 = 0
        L_0x012e:
            if (r11 >= r2) goto L_0x0002
            java.lang.Object r3 = r1.get(r11)
            com.google.android.gms.internal.ads.zzaje r3 = (com.google.android.gms.internal.ads.zzaje) r3
            com.google.android.gms.internal.ads.zzajb r4 = r3.zza
            android.util.SparseArray r5 = r0.zzf
            int r6 = r4.zza
            java.lang.Object r5 = r5.get(r6)
            com.google.android.gms.internal.ads.zzaip r5 = (com.google.android.gms.internal.ads.zzaip) r5
            int r4 = r4.zza
            com.google.android.gms.internal.ads.zzail r4 = zzm(r12, r4)
            r5.zzh(r3, r4)
            int r11 = r11 + 1
            goto L_0x012e
        L_0x014e:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 != r3) goto L_0x072c
            android.util.SparseArray r1 = r0.zzf
            int r3 = r0.zzd
            byte[] r6 = r0.zzj
            java.util.List r7 = r2.zzc
            int r7 = r7.size()
            r9 = 0
        L_0x0160:
            if (r9 >= r7) goto L_0x0694
            java.util.List r11 = r2.zzc
            java.lang.Object r11 = r11.get(r9)
            com.google.android.gms.internal.ads.zzen r11 = (com.google.android.gms.internal.ads.zzen) r11
            int r12 = r11.zzd
            r13 = 1953653094(0x74726166, float:7.6813435E31)
            if (r12 != r13) goto L_0x0670
            r12 = 1952868452(0x74666864, float:7.301914E31)
            com.google.android.gms.internal.ads.zzeo r12 = r11.zzb(r12)
            r12.getClass()
            r13 = r12
            com.google.android.gms.internal.ads.zzeo r13 = (com.google.android.gms.internal.ads.zzeo) r13
            com.google.android.gms.internal.ads.zzdy r12 = r12.zza
            r12.zzL(r8)
            int r13 = r12.zzg()
            int r14 = com.google.android.gms.internal.ads.zzaik.zza
            int r14 = r12.zzg()
            java.lang.Object r14 = r1.get(r14)
            com.google.android.gms.internal.ads.zzaip r14 = (com.google.android.gms.internal.ads.zzaip) r14
            if (r14 != 0) goto L_0x0197
            r14 = 0
            goto L_0x01e0
        L_0x0197:
            r15 = r13 & 1
            if (r15 == 0) goto L_0x01a5
            long r4 = r12.zzw()
            com.google.android.gms.internal.ads.zzajd r15 = r14.zzb
            r15.zzb = r4
            r15.zzc = r4
        L_0x01a5:
            com.google.android.gms.internal.ads.zzail r4 = r14.zze
            r5 = r13 & 2
            if (r5 == 0) goto L_0x01b2
            int r5 = r12.zzg()
            int r5 = r5 + -1
            goto L_0x01b4
        L_0x01b2:
            int r5 = r4.zza
        L_0x01b4:
            r15 = r13 & 8
            if (r15 == 0) goto L_0x01bd
            int r15 = r12.zzg()
            goto L_0x01bf
        L_0x01bd:
            int r15 = r4.zzb
        L_0x01bf:
            r18 = r13 & 16
            if (r18 == 0) goto L_0x01ca
            int r18 = r12.zzg()
            r10 = r18
            goto L_0x01cc
        L_0x01ca:
            int r10 = r4.zzc
        L_0x01cc:
            r13 = r13 & 32
            if (r13 == 0) goto L_0x01d5
            int r4 = r12.zzg()
            goto L_0x01d7
        L_0x01d5:
            int r4 = r4.zzd
        L_0x01d7:
            com.google.android.gms.internal.ads.zzajd r12 = r14.zzb
            com.google.android.gms.internal.ads.zzail r13 = new com.google.android.gms.internal.ads.zzail
            r13.<init>(r5, r15, r10, r4)
            r12.zza = r13
        L_0x01e0:
            if (r14 != 0) goto L_0x01e4
            goto L_0x0670
        L_0x01e4:
            com.google.android.gms.internal.ads.zzajd r4 = r14.zzb
            long r12 = r4.zzp
            boolean r5 = r4.zzq
            r14.zzi()
            r10 = 1
            r14.zzl = true
            r15 = 1952867444(0x74666474, float:7.3014264E31)
            com.google.android.gms.internal.ads.zzeo r15 = r11.zzb(r15)
            if (r15 == 0) goto L_0x021b
            r17 = r3 & 2
            if (r17 != 0) goto L_0x021b
            com.google.android.gms.internal.ads.zzdy r5 = r15.zza
            r5.zzL(r8)
            int r12 = r5.zzg()
            int r12 = com.google.android.gms.internal.ads.zzaik.zza(r12)
            if (r12 != r10) goto L_0x0212
            long r12 = r5.zzw()
            goto L_0x0216
        L_0x0212:
            long r12 = r5.zzu()
        L_0x0216:
            r4.zzp = r12
            r4.zzq = r10
            goto L_0x021f
        L_0x021b:
            r4.zzp = r12
            r4.zzq = r5
        L_0x021f:
            java.util.List r5 = r11.zzb
            int r10 = r5.size()
            r12 = 0
            r13 = 0
            r15 = 0
        L_0x0228:
            r8 = 1953658222(0x7472756e, float:7.683823E31)
            if (r12 >= r10) goto L_0x0254
            java.lang.Object r19 = r5.get(r12)
            r20 = r1
            r1 = r19
            com.google.android.gms.internal.ads.zzeo r1 = (com.google.android.gms.internal.ads.zzeo) r1
            r19 = r7
            int r7 = r1.zzd
            if (r7 != r8) goto L_0x024d
            com.google.android.gms.internal.ads.zzdy r1 = r1.zza
            r7 = 12
            r1.zzL(r7)
            int r1 = r1.zzp()
            if (r1 <= 0) goto L_0x024d
            int r15 = r15 + r1
            int r13 = r13 + 1
        L_0x024d:
            int r12 = r12 + 1
            r7 = r19
            r1 = r20
            goto L_0x0228
        L_0x0254:
            r20 = r1
            r19 = r7
            r1 = 0
            r14.zzh = r1
            r14.zzg = r1
            r14.zzf = r1
            com.google.android.gms.internal.ads.zzajd r1 = r14.zzb
            r1.zzd = r13
            r1.zze = r15
            int[] r7 = r1.zzg
            int r7 = r7.length
            if (r7 >= r13) goto L_0x0272
            long[] r7 = new long[r13]
            r1.zzf = r7
            int[] r7 = new int[r13]
            r1.zzg = r7
        L_0x0272:
            int[] r7 = r1.zzh
            int r7 = r7.length
            if (r7 >= r15) goto L_0x028b
            int r15 = r15 * 125
            int r15 = r15 / 100
            int[] r7 = new int[r15]
            r1.zzh = r7
            long[] r7 = new long[r15]
            r1.zzi = r7
            boolean[] r7 = new boolean[r15]
            r1.zzj = r7
            boolean[] r7 = new boolean[r15]
            r1.zzl = r7
        L_0x028b:
            r1 = 0
            r7 = 0
            r12 = 0
        L_0x028e:
            r21 = 0
            if (r1 >= r10) goto L_0x0449
            java.lang.Object r15 = r5.get(r1)
            com.google.android.gms.internal.ads.zzeo r15 = (com.google.android.gms.internal.ads.zzeo) r15
            int r13 = r15.zzd
            if (r13 != r8) goto L_0x041c
            int r13 = r7 + 1
            com.google.android.gms.internal.ads.zzdy r15 = r15.zza
            r8 = 8
            r15.zzL(r8)
            int r8 = r15.zzg()
            r24 = r5
            com.google.android.gms.internal.ads.zzaje r5 = r14.zzd
            com.google.android.gms.internal.ads.zzajb r5 = r5.zza
            r25 = r10
            com.google.android.gms.internal.ads.zzajd r10 = r14.zzb
            r26 = r13
            com.google.android.gms.internal.ads.zzail r13 = r10.zza
            int r27 = com.google.android.gms.internal.ads.zzei.zza
            r27 = r13
            com.google.android.gms.internal.ads.zzail r27 = (com.google.android.gms.internal.ads.zzail) r27
            int[] r0 = r10.zzg
            int r27 = r15.zzp()
            r0[r7] = r27
            long[] r0 = r10.zzf
            r28 = r1
            r27 = r2
            long r1 = r10.zzb
            r0[r7] = r1
            r29 = r8 & 1
            if (r29 == 0) goto L_0x02e2
            r29 = r9
            int r9 = r15.zzg()
            r30 = r11
            r31 = r12
            long r11 = (long) r9
            long r1 = r1 + r11
            r0[r7] = r1
            goto L_0x02e8
        L_0x02e2:
            r29 = r9
            r30 = r11
            r31 = r12
        L_0x02e8:
            r0 = r8 & 4
            if (r0 == 0) goto L_0x02ee
            r0 = 1
            goto L_0x02ef
        L_0x02ee:
            r0 = 0
        L_0x02ef:
            int r1 = r13.zzd
            if (r0 == 0) goto L_0x02f7
            int r1 = r15.zzg()
        L_0x02f7:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r9 = r8 & 512(0x200, float:7.175E-43)
            r11 = r8 & 1024(0x400, float:1.435E-42)
            r8 = r8 & 2048(0x800, float:2.87E-42)
            long[] r12 = r5.zzi
            if (r12 == 0) goto L_0x034f
            r32 = r1
            int r1 = r12.length
            r33 = r6
            r6 = 1
            if (r1 != r6) goto L_0x034b
            long[] r1 = r5.zzj
            if (r1 != 0) goto L_0x0310
            goto L_0x034b
        L_0x0310:
            r1 = 0
            r34 = r12[r1]
            int r1 = (r34 > r21 ? 1 : (r34 == r21 ? 0 : -1))
            if (r1 != 0) goto L_0x031b
            r6 = r0
            r41 = r11
            goto L_0x0343
        L_0x031b:
            r6 = r0
            long r0 = r5.zzd
            java.math.RoundingMode r40 = java.math.RoundingMode.DOWN
            r36 = 1000000(0xf4240, double:4.940656E-318)
            r38 = r0
            long r0 = com.google.android.gms.internal.ads.zzei.zzu(r34, r36, r38, r40)
            long[] r12 = r5.zzj
            r16 = 0
            r34 = r12[r16]
            r41 = r11
            long r11 = r5.zzc
            java.math.RoundingMode r40 = java.math.RoundingMode.DOWN
            r38 = r11
            long r11 = com.google.android.gms.internal.ads.zzei.zzu(r34, r36, r38, r40)
            long r0 = r0 + r11
            long r11 = r5.zze
            int r34 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r34 >= 0) goto L_0x0343
            goto L_0x0356
        L_0x0343:
            long[] r0 = r5.zzj
            long[] r0 = (long[]) r0
            r1 = 0
            r21 = r0[r1]
            goto L_0x0356
        L_0x034b:
            r6 = r0
            r41 = r11
            goto L_0x0356
        L_0x034f:
            r32 = r1
            r33 = r6
            r41 = r11
            r6 = r0
        L_0x0356:
            int[] r0 = r10.zzh
            long[] r1 = r10.zzi
            boolean[] r11 = r10.zzj
            int r12 = r5.zzb
            r34 = r4
            r4 = 2
            if (r12 != r4) goto L_0x0369
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0369
            r4 = 1
            goto L_0x036a
        L_0x0369:
            r4 = 0
        L_0x036a:
            int[] r12 = r10.zzg
            r7 = r12[r7]
            int r12 = r31 + r7
            r35 = r3
            r23 = r4
            long r3 = r5.zzc
            r5 = r0
            r36 = r1
            long r0 = r10.zzp
            r7 = r31
        L_0x037d:
            if (r7 >= r12) goto L_0x0415
            if (r2 == 0) goto L_0x038a
            int r31 = r15.zzg()
            r37 = r2
            r2 = r31
            goto L_0x038e
        L_0x038a:
            r37 = r2
            int r2 = r13.zzb
        L_0x038e:
            zzg(r2)
            if (r9 == 0) goto L_0x039a
            int r31 = r15.zzg()
            r38 = r9
            goto L_0x03a0
        L_0x039a:
            r38 = r9
            int r9 = r13.zzc
            r31 = r9
        L_0x03a0:
            zzg(r31)
            if (r41 == 0) goto L_0x03aa
            int r9 = r15.zzg()
            goto L_0x03b5
        L_0x03aa:
            if (r7 != 0) goto L_0x03b3
            if (r6 == 0) goto L_0x03b2
            r9 = r32
            r7 = 0
            goto L_0x03b5
        L_0x03b2:
            r7 = 0
        L_0x03b3:
            int r9 = r13.zzd
        L_0x03b5:
            if (r8 == 0) goto L_0x03c6
            int r39 = r15.zzg()
            r49 = r12
            r40 = r13
            r50 = r39
            r39 = r6
            r6 = r50
            goto L_0x03cd
        L_0x03c6:
            r39 = r6
            r49 = r12
            r40 = r13
            r6 = 0
        L_0x03cd:
            long r12 = (long) r6
            long r12 = r12 + r0
            long r42 = r12 - r21
            r44 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r48 = java.math.RoundingMode.DOWN
            r46 = r3
            long r12 = com.google.android.gms.internal.ads.zzei.zzu(r42, r44, r46, r48)
            r36[r7] = r12
            boolean r6 = r10.zzq
            if (r6 != 0) goto L_0x03ec
            com.google.android.gms.internal.ads.zzaje r6 = r14.zzd
            r42 = r3
            long r3 = r6.zzh
            long r12 = r12 + r3
            r36[r7] = r12
            goto L_0x03ee
        L_0x03ec:
            r42 = r3
        L_0x03ee:
            r5[r7] = r31
            r3 = 16
            int r4 = r9 >> 16
            r3 = 1
            r4 = r4 & r3
            if (r4 != 0) goto L_0x0401
            if (r23 == 0) goto L_0x03ff
            if (r7 != 0) goto L_0x0401
            r4 = 1
            r7 = 0
            goto L_0x0402
        L_0x03ff:
            r4 = 1
            goto L_0x0402
        L_0x0401:
            r4 = 0
        L_0x0402:
            r11[r7] = r4
            long r12 = (long) r2
            long r0 = r0 + r12
            int r7 = r7 + r3
            r2 = r37
            r9 = r38
            r6 = r39
            r13 = r40
            r3 = r42
            r12 = r49
            goto L_0x037d
        L_0x0415:
            r49 = r12
            r10.zzp = r0
            r7 = r26
            goto L_0x0430
        L_0x041c:
            r28 = r1
            r27 = r2
            r35 = r3
            r34 = r4
            r24 = r5
            r33 = r6
            r29 = r9
            r25 = r10
            r30 = r11
            r31 = r12
        L_0x0430:
            int r1 = r28 + 1
            r0 = r51
            r5 = r24
            r10 = r25
            r2 = r27
            r9 = r29
            r11 = r30
            r6 = r33
            r4 = r34
            r3 = r35
            r8 = 1953658222(0x7472756e, float:7.683823E31)
            goto L_0x028e
        L_0x0449:
            r27 = r2
            r35 = r3
            r34 = r4
            r33 = r6
            r29 = r9
            r30 = r11
            com.google.android.gms.internal.ads.zzaje r0 = r14.zzd
            com.google.android.gms.internal.ads.zzajb r0 = r0.zza
            r1 = r34
            com.google.android.gms.internal.ads.zzail r2 = r1.zza
            r2.getClass()
            r3 = r2
            com.google.android.gms.internal.ads.zzail r3 = (com.google.android.gms.internal.ads.zzail) r3
            int r2 = r2.zza
            com.google.android.gms.internal.ads.zzajc r0 = r0.zzb(r2)
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            r11 = r30
            com.google.android.gms.internal.ads.zzeo r2 = r11.zzb(r2)
            if (r2 == 0) goto L_0x04e9
            r0.getClass()
            r3 = r0
            com.google.android.gms.internal.ads.zzajc r3 = (com.google.android.gms.internal.ads.zzajc) r3
            int r3 = r0.zzd
            com.google.android.gms.internal.ads.zzdy r2 = r2.zza
            r4 = 8
            r2.zzL(r4)
            int r5 = r2.zzg()
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x048e
            r2.zzM(r4)
        L_0x048e:
            int r4 = r2.zzm()
            int r5 = r2.zzp()
            int r6 = r1.zze
            if (r5 > r6) goto L_0x04cd
            if (r4 != 0) goto L_0x04b3
            boolean[] r4 = r1.zzl
            r6 = 0
            r7 = 0
        L_0x04a0:
            if (r6 >= r5) goto L_0x04b1
            int r8 = r2.zzm()
            int r7 = r7 + r8
            if (r8 <= r3) goto L_0x04ab
            r8 = 1
            goto L_0x04ac
        L_0x04ab:
            r8 = 0
        L_0x04ac:
            r4[r6] = r8
            int r6 = r6 + 1
            goto L_0x04a0
        L_0x04b1:
            r4 = 0
            goto L_0x04c0
        L_0x04b3:
            if (r4 <= r3) goto L_0x04b7
            r2 = 1
            goto L_0x04b8
        L_0x04b7:
            r2 = 0
        L_0x04b8:
            int r7 = r4 * r5
            boolean[] r3 = r1.zzl
            r4 = 0
            java.util.Arrays.fill(r3, r4, r5, r2)
        L_0x04c0:
            boolean[] r2 = r1.zzl
            int r3 = r1.zze
            java.util.Arrays.fill(r2, r5, r3, r4)
            if (r7 <= 0) goto L_0x04e9
            r1.zza(r7)
            goto L_0x04e9
        L_0x04cd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Saiz sample count "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = " is greater than fragment sample count"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r1)
            throw r0
        L_0x04e9:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            com.google.android.gms.internal.ads.zzeo r2 = r11.zzb(r2)
            if (r2 == 0) goto L_0x0534
            com.google.android.gms.internal.ads.zzdy r2 = r2.zza
            r3 = 8
            r2.zzL(r3)
            int r4 = r2.zzg()
            r5 = r4 & 1
            r6 = 1
            if (r5 != r6) goto L_0x0505
            r2.zzM(r3)
        L_0x0505:
            int r3 = r2.zzp()
            if (r3 != r6) goto L_0x0520
            int r3 = com.google.android.gms.internal.ads.zzaik.zza(r4)
            long r4 = r1.zzc
            if (r3 != 0) goto L_0x0518
            long r2 = r2.zzu()
            goto L_0x051c
        L_0x0518:
            long r2 = r2.zzw()
        L_0x051c:
            long r4 = r4 + r2
            r1.zzc = r4
            goto L_0x0534
        L_0x0520:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zza(r0, r2)
            throw r0
        L_0x0534:
            r2 = 0
            r3 = 1936027235(0x73656e63, float:1.8177412E31)
            com.google.android.gms.internal.ads.zzeo r3 = r11.zzb(r3)
            if (r3 == 0) goto L_0x0544
            com.google.android.gms.internal.ads.zzdy r3 = r3.zza
            r4 = 0
            zzk(r3, r4, r1)
        L_0x0544:
            if (r0 == 0) goto L_0x054a
            java.lang.String r0 = r0.zzb
            r5 = r0
            goto L_0x054b
        L_0x054a:
            r5 = r2
        L_0x054b:
            r0 = r2
            r3 = r0
            r4 = 0
        L_0x054e:
            java.util.List r6 = r11.zzb
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x058b
            java.util.List r6 = r11.zzb
            java.lang.Object r6 = r6.get(r4)
            com.google.android.gms.internal.ads.zzeo r6 = (com.google.android.gms.internal.ads.zzeo) r6
            com.google.android.gms.internal.ads.zzdy r7 = r6.zza
            int r6 = r6.zzd
            r8 = 1935828848(0x73626770, float:1.7937577E31)
            r9 = 1936025959(0x73656967, float:1.817587E31)
            if (r6 != r8) goto L_0x0577
            r12 = 12
            r7.zzL(r12)
            int r6 = r7.zzg()
            if (r6 != r9) goto L_0x0588
            r0 = r7
            goto L_0x0588
        L_0x0577:
            r12 = 12
            r8 = 1936158820(0x73677064, float:1.8336489E31)
            if (r6 != r8) goto L_0x0588
            r7.zzL(r12)
            int r6 = r7.zzg()
            if (r6 != r9) goto L_0x0588
            r3 = r7
        L_0x0588:
            int r4 = r4 + 1
            goto L_0x054e
        L_0x058b:
            r12 = 12
            if (r0 == 0) goto L_0x0628
            if (r3 != 0) goto L_0x0593
            goto L_0x0628
        L_0x0593:
            r4 = 8
            r0.zzL(r4)
            int r6 = r0.zzg()
            int r6 = com.google.android.gms.internal.ads.zzaik.zza(r6)
            r7 = 4
            r0.zzM(r7)
            r8 = 1
            if (r6 != r8) goto L_0x05aa
            r0.zzM(r7)
        L_0x05aa:
            int r0 = r0.zzg()
            if (r0 != r8) goto L_0x0621
            r3.zzL(r4)
            int r0 = r3.zzg()
            int r0 = com.google.android.gms.internal.ads.zzaik.zza(r0)
            r3.zzM(r7)
            if (r0 != r8) goto L_0x05d0
            long r8 = r3.zzu()
            int r0 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r0 == 0) goto L_0x05c9
            goto L_0x05d6
        L_0x05c9:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zzc(r0)
            throw r0
        L_0x05d0:
            r4 = 2
            if (r0 < r4) goto L_0x05d6
            r3.zzM(r7)
        L_0x05d6:
            long r8 = r3.zzu()
            r13 = 1
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x061a
            r0 = 1
            r3.zzM(r0)
            int r4 = r3.zzm()
            r6 = r4 & 240(0xf0, float:3.36E-43)
            int r8 = r6 >> 4
            r9 = r4 & 15
            int r4 = r3.zzm()
            if (r4 != r0) goto L_0x0629
            int r6 = r3.zzm()
            r4 = 16
            byte[] r7 = new byte[r4]
            r10 = 0
            r3.zzH(r7, r10, r4)
            if (r6 != 0) goto L_0x060d
            int r2 = r3.zzm()
            byte[] r4 = new byte[r2]
            r3.zzH(r4, r10, r2)
            r10 = r4
            goto L_0x060e
        L_0x060d:
            r10 = r2
        L_0x060e:
            r1.zzk = r0
            com.google.android.gms.internal.ads.zzajc r2 = new com.google.android.gms.internal.ads.zzajc
            r4 = 1
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.zzm = r2
            goto L_0x0629
        L_0x061a:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zzc(r0)
            throw r0
        L_0x0621:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            com.google.android.gms.internal.ads.zzbc r0 = com.google.android.gms.internal.ads.zzbc.zzc(r0)
            throw r0
        L_0x0628:
            r0 = 1
        L_0x0629:
            java.util.List r2 = r11.zzb
            int r2 = r2.size()
            r3 = 0
        L_0x0630:
            if (r3 >= r2) goto L_0x0668
            java.util.List r4 = r11.zzb
            java.lang.Object r4 = r4.get(r3)
            com.google.android.gms.internal.ads.zzeo r4 = (com.google.android.gms.internal.ads.zzeo) r4
            int r5 = r4.zzd
            r6 = 1970628964(0x75756964, float:3.1109627E32)
            if (r5 != r6) goto L_0x065c
            com.google.android.gms.internal.ads.zzdy r4 = r4.zza
            r5 = 8
            r4.zzL(r5)
            r7 = r33
            r6 = 0
            r8 = 16
            r4.zzH(r7, r6, r8)
            byte[] r9 = zza
            boolean r9 = java.util.Arrays.equals(r7, r9)
            if (r9 == 0) goto L_0x0663
            zzk(r4, r8, r1)
            goto L_0x0663
        L_0x065c:
            r7 = r33
            r5 = 8
            r6 = 0
            r8 = 16
        L_0x0663:
            int r3 = r3 + 1
            r33 = r7
            goto L_0x0630
        L_0x0668:
            r7 = r33
            r5 = 8
            r6 = 0
            r8 = 16
            goto L_0x0683
        L_0x0670:
            r20 = r1
            r27 = r2
            r35 = r3
            r19 = r7
            r29 = r9
            r0 = 1
            r5 = 8
            r8 = 16
            r12 = 12
            r7 = r6
            r6 = 0
        L_0x0683:
            int r9 = r29 + 1
            r0 = r51
            r6 = r7
            r7 = r19
            r1 = r20
            r2 = r27
            r3 = r35
            r8 = 8
            goto L_0x0160
        L_0x0694:
            r1 = r2
            r2 = 0
            r6 = 0
            java.util.List r0 = r1.zzb
            com.google.android.gms.internal.ads.zzu r0 = zzh(r0)
            r3 = r51
            if (r0 == 0) goto L_0x06e8
            android.util.SparseArray r1 = r3.zzf
            int r1 = r1.size()
            r4 = 0
        L_0x06a8:
            if (r4 >= r1) goto L_0x06e8
            android.util.SparseArray r5 = r3.zzf
            java.lang.Object r5 = r5.valueAt(r4)
            com.google.android.gms.internal.ads.zzaip r5 = (com.google.android.gms.internal.ads.zzaip) r5
            com.google.android.gms.internal.ads.zzaje r7 = r5.zzd
            com.google.android.gms.internal.ads.zzajb r7 = r7.zza
            com.google.android.gms.internal.ads.zzajd r8 = r5.zzb
            com.google.android.gms.internal.ads.zzail r8 = r8.zza
            int r9 = com.google.android.gms.internal.ads.zzei.zza
            r9 = r8
            com.google.android.gms.internal.ads.zzail r9 = (com.google.android.gms.internal.ads.zzail) r9
            int r8 = r8.zza
            com.google.android.gms.internal.ads.zzajc r7 = r7.zzb(r8)
            if (r7 == 0) goto L_0x06ca
            java.lang.String r7 = r7.zzb
            goto L_0x06cb
        L_0x06ca:
            r7 = r2
        L_0x06cb:
            com.google.android.gms.internal.ads.zzu r7 = r0.zzb(r7)
            com.google.android.gms.internal.ads.zzaje r8 = r5.zzd
            com.google.android.gms.internal.ads.zzajb r8 = r8.zza
            com.google.android.gms.internal.ads.zzab r8 = r8.zzg
            com.google.android.gms.internal.ads.zzz r8 = r8.zzb()
            r8.zzF(r7)
            com.google.android.gms.internal.ads.zzab r7 = r8.zzag()
            com.google.android.gms.internal.ads.zzadt r5 = r5.zza
            r5.zzm(r7)
            int r4 = r4 + 1
            goto L_0x06a8
        L_0x06e8:
            long r0 = r3.zzy
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0741
            android.util.SparseArray r0 = r3.zzf
            int r0 = r0.size()
            r11 = 0
        L_0x06fa:
            if (r11 >= r0) goto L_0x0724
            android.util.SparseArray r1 = r3.zzf
            java.lang.Object r1 = r1.valueAt(r11)
            com.google.android.gms.internal.ads.zzaip r1 = (com.google.android.gms.internal.ads.zzaip) r1
            long r4 = r3.zzy
            int r2 = r1.zzf
        L_0x0708:
            com.google.android.gms.internal.ads.zzajd r6 = r1.zzb
            int r7 = r6.zze
            if (r2 >= r7) goto L_0x0721
            long[] r7 = r6.zzi
            r8 = r7[r2]
            int r7 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0721
            boolean[] r6 = r6.zzj
            boolean r6 = r6[r2]
            if (r6 == 0) goto L_0x071e
            r1.zzi = r2
        L_0x071e:
            int r2 = r2 + 1
            goto L_0x0708
        L_0x0721:
            int r11 = r11 + 1
            goto L_0x06fa
        L_0x0724:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.zzy = r1
            goto L_0x0741
        L_0x072c:
            r3 = r0
            r1 = r2
            java.util.ArrayDeque r0 = r3.zzn
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0741
            java.util.ArrayDeque r0 = r3.zzn
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzen r0 = (com.google.android.gms.internal.ads.zzen) r0
            r0.zzc(r1)
        L_0x0741:
            r0 = r3
            goto L_0x0002
        L_0x0744:
            r3 = r0
            r51.zzj()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiq.zzl(long):void");
    }

    private static final zzail zzm(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzail) sparseArray.valueAt(0);
        }
        zzail zzail = (zzail) sparseArray.get(i);
        zzail.getClass();
        zzail zzail2 = zzail;
        return zzail;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(long j, zzdy zzdy) {
        zzabz.zza(j, zzdy, this.zzJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: com.google.android.gms.internal.ads.zzaip} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzaco r38, com.google.android.gms.internal.ads.zzadj r39) throws java.io.IOException {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
        L_0x0004:
            int r2 = r0.zzr
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r6 = 2
            r7 = 8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x0576
            java.lang.String r11 = "FragmentedMp4Extractor"
            if (r2 == r9) goto L_0x032c
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = 3
            if (r2 == r6) goto L_0x02ce
            com.google.android.gms.internal.ads.zzaip r2 = r0.zzB
            if (r2 != 0) goto L_0x0095
            android.util.SparseArray r2 = r0.zzf
            int r14 = r2.size()
            r15 = r3
            r3 = r8
            r4 = 0
        L_0x002d:
            if (r4 >= r14) goto L_0x0063
            java.lang.Object r17 = r2.valueAt(r4)
            r5 = r17
            com.google.android.gms.internal.ads.zzaip r5 = (com.google.android.gms.internal.ads.zzaip) r5
            boolean r17 = r5.zzl
            if (r17 != 0) goto L_0x0045
            int r6 = r5.zzf
            com.google.android.gms.internal.ads.zzaje r12 = r5.zzd
            int r12 = r12.zzb
            if (r6 == r12) goto L_0x005f
        L_0x0045:
            boolean r6 = r5.zzl
            if (r6 == 0) goto L_0x0054
            int r6 = r5.zzh
            com.google.android.gms.internal.ads.zzajd r12 = r5.zzb
            int r12 = r12.zzd
            if (r6 != r12) goto L_0x0054
            goto L_0x005f
        L_0x0054:
            long r19 = r5.zzd()
            int r6 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r6 >= 0) goto L_0x005f
            r3 = r5
            r15 = r19
        L_0x005f:
            int r4 = r4 + 1
            r6 = 2
            goto L_0x002d
        L_0x0063:
            if (r3 != 0) goto L_0x007d
            long r2 = r0.zzw
            long r4 = r38.zzf()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x0076
            r1.zzk(r3)
            r37.zzj()
            goto L_0x0004
        L_0x0076:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r8)
            throw r1
        L_0x007d:
            long r4 = r3.zzd()
            long r14 = r38.zzf()
            long r4 = r4 - r14
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x008f
            java.lang.String r2 = "Ignoring negative offset to sample data."
            com.google.android.gms.internal.ads.zzdo.zzf(r11, r2)
            r2 = 0
        L_0x008f:
            r1.zzk(r2)
            r0.zzB = r3
            r2 = r3
        L_0x0095:
            int r3 = r0.zzr
            r4 = 6
            if (r3 != r13) goto L_0x0129
            int r3 = r2.zzb()
            r0.zzC = r3
            r0.zzF = r9
            int r5 = r2.zzf
            int r6 = r2.zzi
            if (r5 >= r6) goto L_0x00db
            r1.zzk(r3)
            com.google.android.gms.internal.ads.zzajc r1 = r2.zzf()
            if (r1 != 0) goto L_0x00b2
            goto L_0x00d0
        L_0x00b2:
            com.google.android.gms.internal.ads.zzajd r3 = r2.zzb
            com.google.android.gms.internal.ads.zzdy r3 = r3.zzn
            int r1 = r1.zzd
            if (r1 == 0) goto L_0x00bd
            r3.zzM(r1)
        L_0x00bd:
            com.google.android.gms.internal.ads.zzajd r1 = r2.zzb
            int r5 = r2.zzf
            boolean r1 = r1.zzb(r5)
            if (r1 == 0) goto L_0x00d0
            int r1 = r3.zzq()
            int r1 = r1 * 6
            r3.zzM(r1)
        L_0x00d0:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto L_0x00d8
            r0.zzB = r8
        L_0x00d8:
            r1 = 3
            goto L_0x02ca
        L_0x00db:
            com.google.android.gms.internal.ads.zzaje r5 = r2.zzd
            com.google.android.gms.internal.ads.zzajb r5 = r5.zza
            int r5 = r5.zzh
            if (r5 != r9) goto L_0x00ea
            int r3 = r3 + -8
            r0.zzC = r3
            r1.zzk(r7)
        L_0x00ea:
            com.google.android.gms.internal.ads.zzaje r3 = r2.zzd
            com.google.android.gms.internal.ads.zzajb r3 = r3.zza
            com.google.android.gms.internal.ads.zzab r3 = r3.zzg
            java.lang.String r5 = "audio/ac4"
            java.lang.String r3 = r3.zzo
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0117
            int r3 = r0.zzC
            r5 = 7
            int r3 = r2.zzc(r3, r5)
            r0.zzD = r3
            int r3 = r0.zzC
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzk
            com.google.android.gms.internal.ads.zzabq.zzb(r3, r6)
            com.google.android.gms.internal.ads.zzadt r3 = r2.zza
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzk
            r3.zzr(r6, r5)
            int r3 = r0.zzD
            int r3 = r3 + r5
            r0.zzD = r3
            goto L_0x011f
        L_0x0117:
            int r3 = r0.zzC
            int r3 = r2.zzc(r3, r10)
            r0.zzD = r3
        L_0x011f:
            int r5 = r0.zzC
            int r5 = r5 + r3
            r0.zzC = r5
            r3 = 4
            r0.zzr = r3
            r0.zzE = r10
        L_0x0129:
            com.google.android.gms.internal.ads.zzaje r3 = r2.zzd
            com.google.android.gms.internal.ads.zzajb r3 = r3.zza
            com.google.android.gms.internal.ads.zzadt r5 = r2.zza
            long r6 = r2.zze()
            int r11 = r3.zzk
            if (r11 != 0) goto L_0x0148
        L_0x0137:
            int r3 = r0.zzD
            int r4 = r0.zzC
            if (r3 >= r4) goto L_0x0269
            int r4 = r4 - r3
            int r3 = r5.zzf(r1, r4, r10)
            int r4 = r0.zzD
            int r4 = r4 + r3
            r0.zzD = r4
            goto L_0x0137
        L_0x0148:
            com.google.android.gms.internal.ads.zzdy r12 = r0.zzh
            byte[] r12 = r12.zzN()
            r12[r10] = r10
            r12[r9] = r10
            r14 = 2
            r12[r14] = r10
            int r14 = r11 + 1
            r15 = 4
            int r11 = 4 - r11
        L_0x015a:
            int r15 = r0.zzD
            int r13 = r0.zzC
            if (r15 >= r13) goto L_0x0269
            int r13 = r0.zzE
            java.lang.String r15 = "video/hevc"
            if (r13 != 0) goto L_0x01e9
            r1.zzi(r12, r11, r14)
            com.google.android.gms.internal.ads.zzdy r13 = r0.zzh
            r13.zzL(r10)
            com.google.android.gms.internal.ads.zzdy r13 = r0.zzh
            int r13 = r13.zzg()
            if (r13 <= 0) goto L_0x01e1
            int r13 = r13 + -1
            r0.zzE = r13
            com.google.android.gms.internal.ads.zzdy r13 = r0.zzg
            r13.zzL(r10)
            com.google.android.gms.internal.ads.zzdy r13 = r0.zzg
            r10 = 4
            r5.zzr(r13, r10)
            com.google.android.gms.internal.ads.zzdy r13 = r0.zzh
            r5.zzr(r13, r9)
            com.google.android.gms.internal.ads.zzadt[] r13 = r0.zzJ
            int r13 = r13.length
            java.lang.String r8 = "video/avc"
            if (r13 <= 0) goto L_0x01b4
            com.google.android.gms.internal.ads.zzab r13 = r3.zzg
            byte r17 = r12[r10]
            byte[] r10 = com.google.android.gms.internal.ads.zzfk.zza
            java.lang.String r10 = r13.zzo
            boolean r13 = r8.equals(r10)
            if (r13 == 0) goto L_0x01a6
            r13 = r17 & 31
            if (r13 == r4) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            r10 = 1
            goto L_0x01b5
        L_0x01a6:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L_0x01b4
            r10 = r17 & 126(0x7e, float:1.77E-43)
            int r10 = r10 >> r9
            r13 = 39
            if (r10 != r13) goto L_0x01b4
            goto L_0x01a4
        L_0x01b4:
            r10 = 0
        L_0x01b5:
            r0.zzG = r10
            int r10 = r0.zzD
            int r10 = r10 + 5
            r0.zzD = r10
            int r10 = r0.zzC
            int r10 = r10 + r11
            r0.zzC = r10
            boolean r10 = r0.zzF
            if (r10 != 0) goto L_0x0264
            com.google.android.gms.internal.ads.zzaje r10 = r2.zzd
            com.google.android.gms.internal.ads.zzajb r10 = r10.zza
            com.google.android.gms.internal.ads.zzab r10 = r10.zzg
            java.lang.String r10 = r10.zzo
            boolean r8 = java.util.Objects.equals(r10, r8)
            if (r8 == 0) goto L_0x0264
            r8 = 4
            byte r10 = r12[r8]
            boolean r8 = com.google.android.gms.internal.ads.zzfk.zzi(r10)
            if (r8 == 0) goto L_0x0264
            r0.zzF = r9
            goto L_0x0264
        L_0x01e1:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        L_0x01e9:
            boolean r8 = r0.zzG
            if (r8 == 0) goto L_0x0254
            com.google.android.gms.internal.ads.zzdy r8 = r0.zzi
            r8.zzI(r13)
            com.google.android.gms.internal.ads.zzdy r8 = r0.zzi
            byte[] r8 = r8.zzN()
            int r10 = r0.zzE
            r13 = 0
            r1.zzi(r8, r13, r10)
            com.google.android.gms.internal.ads.zzdy r8 = r0.zzi
            int r10 = r0.zzE
            r5.zzr(r8, r10)
            int r8 = r0.zzE
            com.google.android.gms.internal.ads.zzdy r10 = r0.zzi
            byte[] r13 = r10.zzN()
            int r10 = r10.zze()
            int r10 = com.google.android.gms.internal.ads.zzfk.zzb(r13, r10)
            com.google.android.gms.internal.ads.zzdy r13 = r0.zzi
            com.google.android.gms.internal.ads.zzab r4 = r3.zzg
            java.lang.String r4 = r4.zzo
            boolean r4 = r15.equals(r4)
            r13.zzL(r4)
            com.google.android.gms.internal.ads.zzdy r4 = r0.zzi
            r4.zzK(r10)
            com.google.android.gms.internal.ads.zzab r4 = r3.zzg
            int r4 = r4.zzq
            r10 = -1
            if (r4 == r10) goto L_0x023f
            com.google.android.gms.internal.ads.zzfo r10 = r0.zzp
            int r10 = r10.zza()
            if (r4 == r10) goto L_0x023f
            com.google.android.gms.internal.ads.zzfo r4 = r0.zzp
            com.google.android.gms.internal.ads.zzab r10 = r3.zzg
            int r10 = r10.zzq
            r4.zzd(r10)
        L_0x023f:
            com.google.android.gms.internal.ads.zzfo r4 = r0.zzp
            com.google.android.gms.internal.ads.zzdy r10 = r0.zzi
            r4.zzb(r6, r10)
            int r4 = r2.zza()
            r4 = r4 & 5
            if (r4 == 0) goto L_0x0259
            com.google.android.gms.internal.ads.zzfo r4 = r0.zzp
            r4.zzc()
            goto L_0x0259
        L_0x0254:
            r4 = 0
            int r8 = r5.zzf(r1, r13, r4)
        L_0x0259:
            int r4 = r0.zzD
            int r4 = r4 + r8
            r0.zzD = r4
            int r4 = r0.zzE
            int r4 = r4 - r8
            r0.zzE = r4
            r4 = 6
        L_0x0264:
            r8 = 0
            r10 = 0
            r13 = 3
            goto L_0x015a
        L_0x0269:
            int r22 = r2.zza()
            com.google.android.gms.internal.ads.zzajc r1 = r2.zzf()
            if (r1 == 0) goto L_0x0278
            com.google.android.gms.internal.ads.zzads r1 = r1.zzc
            r25 = r1
            goto L_0x027a
        L_0x0278:
            r25 = 0
        L_0x027a:
            int r1 = r0.zzC
            r24 = 0
            r19 = r5
            r20 = r6
            r23 = r1
            r19.zzt(r20, r22, r23, r24, r25)
        L_0x0287:
            java.util.ArrayDeque r1 = r0.zzo
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x02bf
            java.util.ArrayDeque r1 = r0.zzo
            java.lang.Object r1 = r1.removeFirst()
            com.google.android.gms.internal.ads.zzaio r1 = (com.google.android.gms.internal.ads.zzaio) r1
            int r3 = r0.zzx
            int r4 = r1.zzc
            int r3 = r3 - r4
            r0.zzx = r3
            long r3 = r1.zza
            boolean r5 = r1.zzb
            if (r5 == 0) goto L_0x02a5
            long r3 = r3 + r6
        L_0x02a5:
            com.google.android.gms.internal.ads.zzadt[] r5 = r0.zzI
            int r15 = r5.length
            r14 = 0
        L_0x02a9:
            if (r14 >= r15) goto L_0x0287
            r8 = r5[r14]
            int r12 = r1.zzc
            int r13 = r0.zzx
            r17 = 0
            r11 = 1
            r9 = r3
            r18 = r14
            r14 = r17
            r8.zzt(r9, r11, r12, r13, r14)
            int r14 = r18 + 1
            goto L_0x02a9
        L_0x02bf:
            boolean r1 = r2.zzk()
            if (r1 != 0) goto L_0x00d8
            r1 = 0
            r0.zzB = r1
            goto L_0x00d8
        L_0x02ca:
            r0.zzr = r1
            r1 = 0
            return r1
        L_0x02ce:
            android.util.SparseArray r2 = r0.zzf
            int r2 = r2.size()
            r5 = 0
            r6 = 0
        L_0x02d6:
            if (r5 >= r2) goto L_0x02f9
            android.util.SparseArray r7 = r0.zzf
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.zzaip r7 = (com.google.android.gms.internal.ads.zzaip) r7
            com.google.android.gms.internal.ads.zzajd r7 = r7.zzb
            boolean r8 = r7.zzo
            if (r8 == 0) goto L_0x02f6
            long r7 = r7.zzc
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x02f6
            android.util.SparseArray r3 = r0.zzf
            java.lang.Object r3 = r3.valueAt(r5)
            com.google.android.gms.internal.ads.zzaip r3 = (com.google.android.gms.internal.ads.zzaip) r3
            r6 = r3
            r3 = r7
        L_0x02f6:
            int r5 = r5 + 1
            goto L_0x02d6
        L_0x02f9:
            if (r6 != 0) goto L_0x0300
            r2 = 3
            r0.zzr = r2
            goto L_0x0004
        L_0x0300:
            long r7 = r38.zzf()
            long r3 = r3 - r7
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0324
            r1.zzk(r2)
            com.google.android.gms.internal.ads.zzajd r2 = r6.zzb
            com.google.android.gms.internal.ads.zzdy r3 = r2.zzn
            byte[] r4 = r3.zzN()
            int r3 = r3.zze()
            r5 = 0
            r1.zzi(r4, r5, r3)
            com.google.android.gms.internal.ads.zzdy r3 = r2.zzn
            r3.zzL(r5)
            r2.zzo = r5
            goto L_0x0004
        L_0x0324:
            java.lang.String r1 = "Offset to encryption data was negative."
            r2 = 0
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        L_0x032c:
            long r5 = r0.zzt
            int r2 = (int) r5
            int r5 = r0.zzu
            int r2 = r2 - r5
            com.google.android.gms.internal.ads.zzdy r5 = r0.zzv
            if (r5 == 0) goto L_0x056a
            byte[] r6 = r5.zzN()
            r1.zzi(r6, r7, r2)
            com.google.android.gms.internal.ads.zzeo r2 = new com.google.android.gms.internal.ads.zzeo
            int r6 = r0.zzs
            r2.<init>(r6, r5)
            long r5 = r38.zzf()
            java.util.ArrayDeque r8 = r0.zzn
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x035d
            java.util.ArrayDeque r3 = r0.zzn
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzen r3 = (com.google.android.gms.internal.ads.zzen) r3
            r3.zzd(r2)
            goto L_0x056d
        L_0x035d:
            int r8 = r2.zzd
            if (r8 != r4) goto L_0x0431
            com.google.android.gms.internal.ads.zzdy r2 = r2.zza
            r2.zzL(r7)
            int r3 = r2.zzg()
            int r3 = com.google.android.gms.internal.ads.zzaik.zza(r3)
            r4 = 4
            r2.zzM(r4)
            long r7 = r2.zzu()
            if (r3 != 0) goto L_0x0381
            long r3 = r2.zzu()
            long r10 = r2.zzu()
            goto L_0x0389
        L_0x0381:
            long r3 = r2.zzw()
            long r10 = r2.zzw()
        L_0x0389:
            long r5 = r5 + r10
            r12 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r16 = java.math.RoundingMode.DOWN
            r10 = r3
            r14 = r7
            long r19 = com.google.android.gms.internal.ads.zzei.zzu(r10, r12, r14, r16)
            r10 = 2
            r2.zzM(r10)
            int r14 = r2.zzq()
            int[] r15 = new int[r14]
            long[] r12 = new long[r14]
            long[] r13 = new long[r14]
            long[] r10 = new long[r14]
            r16 = r19
            r11 = 0
        L_0x03a8:
            if (r11 >= r14) goto L_0x0408
            int r21 = r2.zzg()
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r21 & r22
            if (r22 != 0) goto L_0x0400
            long r22 = r2.zzu()
            r24 = 2147483647(0x7fffffff, float:NaN)
            r21 = r21 & r24
            r15[r11] = r21
            r12[r11] = r5
            r10[r11] = r16
            long r3 = r3 + r22
            r16 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r21 = java.math.RoundingMode.DOWN
            r9 = r10
            r26 = r11
            r10 = r3
            r23 = r3
            r3 = r12
            r4 = r13
            r12 = r16
            r17 = r14
            r28 = r15
            r14 = r7
            r16 = r21
            long r10 = com.google.android.gms.internal.ads.zzei.zzu(r10, r12, r14, r16)
            r12 = r9[r26]
            long r12 = r10 - r12
            r4[r26] = r12
            r12 = 4
            r2.zzM(r12)
            r13 = r28
            r14 = r13[r26]
            long r14 = (long) r14
            long r5 = r5 + r14
            int r14 = r26 + 1
            r12 = r3
            r15 = r13
            r13 = r4
            r3 = r23
            r35 = r10
            r10 = r9
            r11 = r14
            r14 = r17
            r9 = 1
            r16 = r35
            goto L_0x03a8
        L_0x0400:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        L_0x0408:
            r9 = r10
            r3 = r12
            r4 = r13
            r13 = r15
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            com.google.android.gms.internal.ads.zzaca r5 = new com.google.android.gms.internal.ads.zzaca
            r5.<init>(r13, r3, r4, r9)
            android.util.Pair r2 = android.util.Pair.create(r2, r5)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r0.zzA = r3
            com.google.android.gms.internal.ads.zzacq r3 = r0.zzH
            java.lang.Object r2 = r2.second
            com.google.android.gms.internal.ads.zzadm r2 = (com.google.android.gms.internal.ads.zzadm) r2
            r3.zzO(r2)
            r2 = 1
            r0.zzK = r2
            goto L_0x056d
        L_0x0431:
            if (r8 != r3) goto L_0x056d
            com.google.android.gms.internal.ads.zzdy r2 = r2.zza
            com.google.android.gms.internal.ads.zzadt[] r3 = r0.zzI
            int r3 = r3.length
            if (r3 == 0) goto L_0x056d
            r2.zzL(r7)
            int r3 = r2.zzg()
            int r3 = com.google.android.gms.internal.ads.zzaik.zza(r3)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x04a5
            r6 = 1
            if (r3 == r6) goto L_0x0462
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Skipping unsupported emsg version: "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.zzdo.zzf(r11, r2)
            goto L_0x056d
        L_0x0462:
            long r6 = r2.zzu()
            long r12 = r2.zzw()
            r14 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r18 = java.math.RoundingMode.DOWN
            r16 = r6
            long r8 = com.google.android.gms.internal.ads.zzei.zzu(r12, r14, r16, r18)
            long r12 = r2.zzu()
            r14 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r18 = java.math.RoundingMode.DOWN
            long r6 = com.google.android.gms.internal.ads.zzei.zzu(r12, r14, r16, r18)
            long r10 = r2.zzu()
            r3 = 0
            java.lang.String r12 = r2.zzy(r3)
            r12.getClass()
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = r2.zzy(r3)
            r13.getClass()
            r14 = r13
            java.lang.String r14 = (java.lang.String) r14
            r30 = r6
            r32 = r10
            r28 = r12
            r29 = r13
            r13 = r8
            r8 = r4
            goto L_0x04f1
        L_0x04a5:
            r3 = 0
            java.lang.String r12 = r2.zzy(r3)
            r12.getClass()
            r6 = r12
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r13 = r2.zzy(r3)
            r13.getClass()
            r3 = r13
            java.lang.String r3 = (java.lang.String) r3
            long r6 = r2.zzu()
            long r14 = r2.zzu()
            r16 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r20 = java.math.RoundingMode.DOWN
            r18 = r6
            long r8 = com.google.android.gms.internal.ads.zzei.zzu(r14, r16, r18, r20)
            long r10 = r0.zzA
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x04d5
            long r10 = r10 + r8
            goto L_0x04d6
        L_0x04d5:
            r10 = r4
        L_0x04d6:
            long r14 = r2.zzu()
            r16 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r20 = java.math.RoundingMode.DOWN
            r18 = r6
            long r6 = com.google.android.gms.internal.ads.zzei.zzu(r14, r16, r18, r20)
            long r14 = r2.zzu()
            r30 = r6
            r28 = r12
            r29 = r13
            r32 = r14
            r13 = r10
        L_0x04f1:
            int r3 = r2.zzb()
            byte[] r3 = new byte[r3]
            int r6 = r2.zzb()
            r7 = 0
            r2.zzH(r3, r7, r6)
            com.google.android.gms.internal.ads.zzafk r2 = new com.google.android.gms.internal.ads.zzafk
            r27 = r2
            r34 = r3
            r27.<init>(r28, r29, r30, r32, r34)
            com.google.android.gms.internal.ads.zzafl r3 = r0.zzl
            com.google.android.gms.internal.ads.zzdy r6 = new com.google.android.gms.internal.ads.zzdy
            byte[] r2 = r3.zza(r2)
            r6.<init>((byte[]) r2)
            int r2 = r6.zzb()
            com.google.android.gms.internal.ads.zzadt[] r3 = r0.zzI
            int r7 = r3.length
            r10 = 0
        L_0x051b:
            if (r10 >= r7) goto L_0x0529
            r11 = r3[r10]
            r12 = 0
            r6.zzL(r12)
            r11.zzr(r6, r2)
            int r10 = r10 + 1
            goto L_0x051b
        L_0x0529:
            int r3 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x053e
            java.util.ArrayDeque r3 = r0.zzo
            com.google.android.gms.internal.ads.zzaio r4 = new com.google.android.gms.internal.ads.zzaio
            r5 = 1
            r4.<init>(r8, r5, r2)
            r3.addLast(r4)
            int r3 = r0.zzx
            int r3 = r3 + r2
            r0.zzx = r3
            goto L_0x056d
        L_0x053e:
            java.util.ArrayDeque r3 = r0.zzo
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0557
            java.util.ArrayDeque r3 = r0.zzo
            com.google.android.gms.internal.ads.zzaio r4 = new com.google.android.gms.internal.ads.zzaio
            r5 = 0
            r4.<init>(r13, r5, r2)
            r3.addLast(r4)
            int r3 = r0.zzx
            int r3 = r3 + r2
            r0.zzx = r3
            goto L_0x056d
        L_0x0557:
            com.google.android.gms.internal.ads.zzadt[] r3 = r0.zzI
            int r4 = r3.length
            r5 = 0
        L_0x055b:
            if (r5 >= r4) goto L_0x056d
            r6 = r3[r5]
            r11 = 0
            r12 = 0
            r9 = 1
            r7 = r13
            r10 = r2
            r6.zzt(r7, r9, r10, r11, r12)
            int r5 = r5 + 1
            goto L_0x055b
        L_0x056a:
            r1.zzk(r2)
        L_0x056d:
            long r2 = r38.zzf()
            r0.zzl(r2)
            goto L_0x0004
        L_0x0576:
            int r2 = r0.zzu
            if (r2 != 0) goto L_0x05a6
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzm
            byte[] r2 = r2.zzN()
            r5 = 1
            r6 = 0
            boolean r2 = r1.zzn(r2, r6, r7, r5)
            if (r2 != 0) goto L_0x058f
            com.google.android.gms.internal.ads.zzfo r1 = r0.zzp
            r1.zzc()
            r1 = -1
            return r1
        L_0x058f:
            r0.zzu = r7
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzm
            r2.zzL(r6)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzm
            long r5 = r2.zzu()
            r0.zzt = r5
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzm
            int r2 = r2.zzg()
            r0.zzs = r2
        L_0x05a6:
            long r5 = r0.zzt
            r8 = 1
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x05c5
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzm
            byte[] r2 = r2.zzN()
            r1.zzi(r2, r7, r7)
            int r2 = r0.zzu
            int r2 = r2 + r7
            r0.zzu = r2
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzm
            long r5 = r2.zzw()
            r0.zzt = r5
            goto L_0x05f8
        L_0x05c5:
            r8 = 0
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x05f8
            long r5 = r38.zzd()
            r8 = -1
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x05e9
            java.util.ArrayDeque r2 = r0.zzn
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x05e8
            java.util.ArrayDeque r2 = r0.zzn
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.zzen r2 = (com.google.android.gms.internal.ads.zzen) r2
            long r5 = r2.zza
            goto L_0x05e9
        L_0x05e8:
            r5 = r8
        L_0x05e9:
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x05f8
            long r8 = r38.zzf()
            long r5 = r5 - r8
            int r2 = r0.zzu
            long r8 = (long) r2
            long r5 = r5 + r8
            r0.zzt = r5
        L_0x05f8:
            long r5 = r0.zzt
            int r2 = r0.zzu
            long r8 = (long) r2
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x077b
            long r5 = r38.zzf()
            long r5 = r5 - r8
            int r2 = r0.zzs
            r8 = 1835295092(0x6d646174, float:4.4175247E27)
            r9 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r9) goto L_0x0612
            if (r2 != r8) goto L_0x0625
        L_0x0612:
            boolean r2 = r0.zzK
            if (r2 != 0) goto L_0x0625
            com.google.android.gms.internal.ads.zzacq r2 = r0.zzH
            com.google.android.gms.internal.ads.zzadl r10 = new com.google.android.gms.internal.ads.zzadl
            long r11 = r0.zzz
            r10.<init>(r11, r5)
            r2.zzO(r10)
            r2 = 1
            r0.zzK = r2
        L_0x0625:
            int r2 = r0.zzs
            if (r2 != r9) goto L_0x0643
            android.util.SparseArray r2 = r0.zzf
            int r2 = r2.size()
            r13 = 0
        L_0x0630:
            if (r13 >= r2) goto L_0x0643
            android.util.SparseArray r10 = r0.zzf
            java.lang.Object r10 = r10.valueAt(r13)
            com.google.android.gms.internal.ads.zzaip r10 = (com.google.android.gms.internal.ads.zzaip) r10
            com.google.android.gms.internal.ads.zzajd r10 = r10.zzb
            r10.zzc = r5
            r10.zzb = r5
            int r13 = r13 + 1
            goto L_0x0630
        L_0x0643:
            int r2 = r0.zzs
            if (r2 != r8) goto L_0x0654
            r8 = 0
            r0.zzB = r8
            long r2 = r0.zzt
            long r5 = r5 + r2
            r0.zzw = r5
            r2 = 2
            r0.zzr = r2
            goto L_0x0004
        L_0x0654:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x0754
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x0754
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x0754
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x0754
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x0754
            if (r2 == r9) goto L_0x0754
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x0754
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x0754
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x0680
            goto L_0x0754
        L_0x0680:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r5) goto L_0x071f
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x071f
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x071f
            if (r2 == r4) goto L_0x071f
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x071f
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x071f
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x071f
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x071f
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x071f
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x071f
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x071f
            if (r2 != r3) goto L_0x070a
            goto L_0x071f
        L_0x070a:
            long r2 = r0.zzt
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0718
            r2 = 0
            r0.zzv = r2
            r2 = 1
            r0.zzr = r2
            goto L_0x0004
        L_0x0718:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zzc(r1)
            throw r1
        L_0x071f:
            int r2 = r0.zzu
            if (r2 != r7) goto L_0x074d
            long r2 = r0.zzt
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0746
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            long r3 = r0.zzt
            int r4 = (int) r3
            r2.<init>((int) r4)
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzm
            byte[] r3 = r3.zzN()
            byte[] r4 = r2.zzN()
            r5 = 0
            java.lang.System.arraycopy(r3, r5, r4, r5, r7)
            r0.zzv = r2
            r2 = 1
            r0.zzr = r2
            goto L_0x0004
        L_0x0746:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zzc(r1)
            throw r1
        L_0x074d:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zzc(r1)
            throw r1
        L_0x0754:
            long r3 = r38.zzf()
            long r5 = r0.zzt
            long r3 = r3 + r5
            java.util.ArrayDeque r5 = r0.zzn
            com.google.android.gms.internal.ads.zzen r6 = new com.google.android.gms.internal.ads.zzen
            r7 = -8
            long r3 = r3 + r7
            r6.<init>(r2, r3)
            r5.push(r6)
            long r5 = r0.zzt
            int r2 = r0.zzu
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0776
            r0.zzl(r3)
            goto L_0x0004
        L_0x0776:
            r37.zzj()
            goto L_0x0004
        L_0x077b:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiq.zzb(com.google.android.gms.internal.ads.zzaco, com.google.android.gms.internal.ads.zzadj):int");
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return this.zzq;
    }

    public final void zze(zzacq zzacq) {
        int i;
        if ((this.zzd & 32) == 0) {
            zzacq = new zzakg(zzacq, this.zzc);
        }
        this.zzH = zzacq;
        zzj();
        zzadt[] zzadtArr = new zzadt[2];
        this.zzI = zzadtArr;
        int i2 = 100;
        int i3 = 0;
        if ((this.zzd & 4) != 0) {
            zzadtArr[0] = this.zzH.zzw(100, 5);
            i = 1;
            i2 = TypedValues.TYPE_TARGET;
        } else {
            i = 0;
        }
        zzadt[] zzadtArr2 = (zzadt[]) zzei.zzN(this.zzI, i);
        this.zzI = zzadtArr2;
        for (zzadt zzm2 : zzadtArr2) {
            zzm2.zzm(zzb);
        }
        this.zzJ = new zzadt[this.zze.size()];
        while (i3 < this.zzJ.length) {
            zzadt zzw2 = this.zzH.zzw(i2, 3);
            zzw2.zzm((zzab) this.zze.get(i3));
            this.zzJ[i3] = zzw2;
            i3++;
            i2++;
        }
    }

    public final void zzf(long j, long j2) {
        int size = this.zzf.size();
        for (int i = 0; i < size; i++) {
            ((zzaip) this.zzf.valueAt(i)).zzi();
        }
        this.zzo.clear();
        this.zzx = 0;
        this.zzp.zzc();
        this.zzy = j2;
        this.zzn.clear();
        zzj();
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        zzadq zza2 = zzaja.zza(zzaco);
        this.zzq = zza2 != null ? zzfxn.zzo(zza2) : zzfxn.zzn();
        return zza2 == null;
    }

    public zzaiq(zzakd zzakd, int i, zzef zzef, zzajb zzajb, List list, zzadt zzadt) {
        this.zzc = zzakd;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzafl();
        this.zzm = new zzdy(16);
        this.zzg = new zzdy(zzfk.zza);
        this.zzh = new zzdy(5);
        this.zzi = new zzdy();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzdy(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzq = zzfxn.zzn();
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzH = zzacq.zza;
        this.zzI = new zzadt[0];
        this.zzJ = new zzadt[0];
        this.zzp = new zzfo(new zzain(this));
    }
}
