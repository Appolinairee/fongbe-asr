package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaob implements zzaoc {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzacq zzc;
    private final zzadt zzd;
    private final zzaof zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzdy zzh;
    private final int zzi;
    private final zzab zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaob(zzacq zzacq, zzadt zzadt, zzaof zzaof) throws zzbc {
        this.zzc = zzacq;
        this.zzd = zzadt;
        this.zze = zzaof;
        int max = Math.max(1, zzaof.zzc / 10);
        this.zzi = max;
        zzdy zzdy = new zzdy(zzaof.zzf);
        zzdy.zzk();
        int zzk2 = zzdy.zzk();
        this.zzf = zzk2;
        int i = zzaof.zzb;
        int i2 = (((zzaof.zzd - (i * 4)) * 8) / (zzaof.zze * i)) + 1;
        if (zzk2 == i2) {
            int i3 = zzei.zza;
            int i4 = ((max + zzk2) - 1) / zzk2;
            this.zzg = new byte[(zzaof.zzd * i4)];
            this.zzh = new zzdy(i4 * (zzk2 + zzk2) * i);
            int i5 = ((zzaof.zzc * zzaof.zzd) * 8) / zzk2;
            zzz zzz = new zzz();
            zzz.zzaa("audio/raw");
            zzz.zzy(i5);
            zzz.zzV(i5);
            zzz.zzR((max + max) * i);
            zzz.zzz(zzaof.zzb);
            zzz.zzab(zzaof.zzc);
            zzz.zzU(2);
            this.zzj = zzz.zzag();
            return;
        }
        throw zzbc.zza("Expected frames per block: " + i2 + "; got: " + zzk2, (Throwable) null);
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long zzu = this.zzl + zzei.zzu(this.zzn, 1000000, (long) this.zze.zzc, RoundingMode.DOWN);
        int zze2 = zze(i);
        this.zzd.zzt(zzu, 1, zze2, this.zzm - zze2, (zzads) null);
        this.zzn += (long) i;
        this.zzm -= zze2;
    }

    public final void zza(int i, long j) {
        this.zzc.zzO(new zzaoi(this.zze, this.zzf, (long) i, j));
        this.zzd.zzm(this.zzj);
    }

    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0045 A[EDGE_INSN: B:38:0x0045->B:10:0x0045 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0026  */
    public final boolean zzc(com.google.android.gms.internal.ads.zzaco r21, long r22) throws java.io.IOException {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r3 = r0.zzm
            int r3 = r0.zzd(r3)
            int r4 = r0.zzi
            int r4 = r4 - r3
            int r3 = com.google.android.gms.internal.ads.zzei.zza
            int r3 = r0.zzf
            int r4 = r4 + r3
            r5 = -1
            int r4 = r4 + r5
            int r4 = r4 / r3
            com.google.android.gms.internal.ads.zzaof r3 = r0.zze
            int r3 = r3.zzd
            int r4 = r4 * r3
            r6 = 0
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0023
        L_0x0021:
            r6 = 1
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            if (r6 != 0) goto L_0x0045
            int r7 = r0.zzk
            if (r7 >= r4) goto L_0x0045
            int r7 = r4 - r7
            long r9 = (long) r7
            long r9 = java.lang.Math.min(r9, r1)
            int r7 = (int) r9
            byte[] r9 = r0.zzg
            int r10 = r0.zzk
            r11 = r21
            int r7 = r11.zza(r9, r10, r7)
            if (r7 != r5) goto L_0x003f
            goto L_0x0021
        L_0x003f:
            int r9 = r0.zzk
            int r9 = r9 + r7
            r0.zzk = r9
            goto L_0x0024
        L_0x0045:
            int r1 = r0.zzk
            com.google.android.gms.internal.ads.zzaof r2 = r0.zze
            int r2 = r2.zzd
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x014f
            byte[] r2 = r0.zzg
            com.google.android.gms.internal.ads.zzdy r4 = r0.zzh
            r5 = 0
        L_0x0053:
            if (r5 >= r1) goto L_0x011a
            r7 = 0
        L_0x0056:
            com.google.android.gms.internal.ads.zzaof r9 = r0.zze
            int r10 = r9.zzb
            if (r7 >= r10) goto L_0x0112
            byte[] r11 = r4.zzN()
            int r9 = r9.zzd
            int r12 = r5 * r9
            int r9 = r9 / r10
            int r9 = r9 + -4
            int r13 = r7 * 4
            int r12 = r12 + r13
            int r13 = r12 + 1
            byte r13 = r2[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            byte r14 = r2[r12]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r12 + 2
            byte r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r3 = 88
            int r15 = java.lang.Math.min(r15, r3)
            int[] r16 = zzb
            r16 = r16[r15]
            int r3 = r0.zzf
            int r3 = r3 * r5
            int r3 = r3 * r10
            int r3 = r3 + r7
            int r13 = r13 << 8
            r13 = r13 | r14
            short r13 = (short) r13
            r14 = r13 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r3
            byte r14 = (byte) r14
            r11[r3] = r14
            int r14 = r3 + 1
            int r8 = r13 >> 8
            byte r8 = (byte) r8
            r11[r14] = r8
            r8 = 0
        L_0x009d:
            int r14 = r9 + r9
            if (r8 >= r14) goto L_0x010a
            int r14 = r10 * 4
            int r14 = r14 + r12
            int r18 = r8 / 8
            int r19 = r8 / 2
            int r19 = r19 % 4
            int r18 = r18 * r10
            int r18 = r18 * 4
            int r14 = r14 + r18
            int r14 = r14 + r19
            byte r14 = r2[r14]
            r18 = r2
            r2 = r14 & 255(0xff, float:3.57E-43)
            int r19 = r8 % 2
            if (r19 != 0) goto L_0x00bf
            r2 = r14 & 15
            goto L_0x00c1
        L_0x00bf:
            int r2 = r2 >> 4
        L_0x00c1:
            r14 = r2 & 7
            int r14 = r14 + r14
            r17 = 1
            int r14 = r14 + 1
            int r14 = r14 * r16
            r16 = r2 & 8
            int r14 = r14 >> 3
            if (r16 == 0) goto L_0x00d1
            int r14 = -r14
        L_0x00d1:
            int r13 = r13 + r14
            r14 = 32767(0x7fff, float:4.5916E-41)
            int r13 = java.lang.Math.min(r13, r14)
            r14 = -32768(0xffffffffffff8000, float:NaN)
            int r13 = java.lang.Math.max(r14, r13)
            int r14 = r10 + r10
            int r3 = r3 + r14
            r14 = r13 & 255(0xff, float:3.57E-43)
            byte r14 = (byte) r14
            r11[r3] = r14
            int r14 = r3 + 1
            r22 = r3
            int r3 = r13 >> 8
            byte r3 = (byte) r3
            r11[r14] = r3
            int[] r3 = zza
            r2 = r3[r2]
            int r15 = r15 + r2
            r2 = 88
            int r3 = java.lang.Math.min(r15, r2)
            r14 = 0
            int r15 = java.lang.Math.max(r14, r3)
            int[] r3 = zzb
            r16 = r3[r15]
            int r8 = r8 + 1
            r3 = r22
            r2 = r18
            goto L_0x009d
        L_0x010a:
            r18 = r2
            r17 = 1
            int r7 = r7 + 1
            goto L_0x0056
        L_0x0112:
            r18 = r2
            r17 = 1
            int r5 = r5 + 1
            goto L_0x0053
        L_0x011a:
            int r2 = r0.zzf
            int r2 = r2 * r1
            int r2 = r0.zze(r2)
            r3 = 0
            r4.zzL(r3)
            r4.zzK(r2)
            int r2 = r0.zzk
            com.google.android.gms.internal.ads.zzaof r3 = r0.zze
            int r3 = r3.zzd
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.zzk = r2
            com.google.android.gms.internal.ads.zzdy r1 = r0.zzh
            com.google.android.gms.internal.ads.zzadt r2 = r0.zzd
            int r3 = r1.zze()
            r2.zzr(r1, r3)
            int r1 = r0.zzm
            int r1 = r1 + r3
            r0.zzm = r1
            int r1 = r0.zzd(r1)
            int r2 = r0.zzi
            if (r1 < r2) goto L_0x014f
            r0.zzf(r2)
        L_0x014f:
            if (r6 == 0) goto L_0x015c
            int r1 = r0.zzm
            int r1 = r0.zzd(r1)
            if (r1 <= 0) goto L_0x015c
            r0.zzf(r1)
        L_0x015c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaob.zzc(com.google.android.gms.internal.ads.zzaco, long):boolean");
    }
}
