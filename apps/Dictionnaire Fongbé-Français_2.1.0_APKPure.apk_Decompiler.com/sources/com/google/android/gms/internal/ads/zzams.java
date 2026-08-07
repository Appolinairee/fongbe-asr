package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzams implements zzamj {
    private final zzann zza;
    private String zzb;
    private zzadt zzc;
    private zzamr zzd;
    private boolean zze;
    private final boolean[] zzf = new boolean[3];
    private final zzanb zzg = new zzanb(32, 128);
    private final zzanb zzh = new zzanb(33, 128);
    private final zzanb zzi = new zzanb(34, 128);
    private final zzanb zzj = new zzanb(39, 128);
    private final zzanb zzk = new zzanb(40, 128);
    private long zzl;
    private long zzm = -9223372036854775807L;
    private final zzdy zzn = new zzdy();

    public zzams(zzann zzann) {
        this.zza = zzann;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzdy r29) {
        /*
            r28 = this;
            r0 = r28
            com.google.android.gms.internal.ads.zzadt r1 = r0.zzc
            com.google.android.gms.internal.ads.zzcw.zzb(r1)
            int r1 = com.google.android.gms.internal.ads.zzei.zza
        L_0x0009:
            int r1 = r29.zzb()
            if (r1 <= 0) goto L_0x01e7
            int r1 = r29.zzd()
            int r2 = r29.zze()
            byte[] r3 = r29.zzN()
            long r4 = r0.zzl
            int r6 = r29.zzb()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzl = r4
            com.google.android.gms.internal.ads.zzadt r4 = r0.zzc
            int r5 = r29.zzb()
            r6 = r29
            r4.zzr(r6, r5)
        L_0x0030:
            if (r1 >= r2) goto L_0x0009
            boolean[] r4 = r0.zzf
            int r4 = com.google.android.gms.internal.ads.zzfk.zza(r3, r1, r2, r4)
            if (r4 == r2) goto L_0x01e4
            int r5 = r4 + 3
            byte r7 = r3[r5]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            int r8 = r4 - r1
            if (r8 <= 0) goto L_0x0047
            r0.zzf(r3, r1, r4)
        L_0x0047:
            int r12 = r2 - r4
            long r9 = r0.zzl
            long r13 = (long) r12
            long r10 = r9 - r13
            if (r8 >= 0) goto L_0x0052
            int r4 = -r8
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            long r8 = r0.zzm
            com.google.android.gms.internal.ads.zzamr r13 = r0.zzd
            boolean r14 = r0.zze
            r13.zzb(r10, r12, r14)
            boolean r13 = r0.zze
            if (r13 != 0) goto L_0x0155
            com.google.android.gms.internal.ads.zzanb r13 = r0.zzg
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzanb r13 = r0.zzh
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzanb r13 = r0.zzi
            r13.zzd(r4)
            com.google.android.gms.internal.ads.zzanb r13 = r0.zzg
            boolean r15 = r13.zze()
            if (r15 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.zzanb r15 = r0.zzh
            boolean r16 = r15.zze()
            if (r16 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.zzanb r14 = r0.zzi
            boolean r17 = r14.zze()
            if (r17 == 0) goto L_0x0155
            java.lang.String r1 = r0.zzb
            r18 = r5
            int r5 = r13.zzb
            int r6 = r15.zzb
            int r6 = r6 + r5
            r19 = r2
            int r2 = r14.zzb
            int r6 = r6 + r2
            byte[] r2 = new byte[r6]
            byte[] r6 = r13.zza
            r20 = r3
            r3 = 0
            java.lang.System.arraycopy(r6, r3, r2, r3, r5)
            byte[] r5 = r15.zza
            int r6 = r13.zzb
            r17 = r12
            int r12 = r15.zzb
            java.lang.System.arraycopy(r5, r3, r2, r6, r12)
            byte[] r5 = r14.zza
            int r6 = r13.zzb
            int r12 = r15.zzb
            int r6 = r6 + r12
            int r12 = r14.zzb
            java.lang.System.arraycopy(r5, r3, r2, r6, r12)
            byte[] r5 = r15.zza
            int r6 = r15.zzb
            r12 = 3
            r13 = 0
            com.google.android.gms.internal.ads.zzfe r5 = com.google.android.gms.internal.ads.zzfk.zzc(r5, r12, r6, r13)
            com.google.android.gms.internal.ads.zzez r6 = r5.zza
            if (r6 == 0) goto L_0x00e0
            int r12 = r6.zzf
            int[] r13 = r6.zze
            int r14 = r6.zzd
            int r15 = r6.zzc
            boolean r3 = r6.zzb
            int r6 = r6.zza
            r21 = r6
            r22 = r3
            r23 = r15
            r24 = r14
            r25 = r13
            r26 = r12
            java.lang.String r13 = com.google.android.gms.internal.ads.zzcy.zzd(r21, r22, r23, r24, r25, r26)
        L_0x00e0:
            com.google.android.gms.internal.ads.zzz r3 = new com.google.android.gms.internal.ads.zzz
            r3.<init>()
            r3.zzM(r1)
            java.lang.String r1 = "video/hevc"
            r3.zzaa(r1)
            r3.zzA(r13)
            int r1 = r5.zzd
            r3.zzaf(r1)
            int r1 = r5.zze
            r3.zzK(r1)
            com.google.android.gms.internal.ads.zzi r1 = new com.google.android.gms.internal.ads.zzi
            r1.<init>()
            int r6 = r5.zzh
            r1.zzc(r6)
            int r6 = r5.zzi
            r1.zzb(r6)
            int r6 = r5.zzj
            r1.zzd(r6)
            int r6 = r5.zzb
            int r6 = r6 + 8
            r1.zzf(r6)
            int r6 = r5.zzc
            int r6 = r6 + 8
            r1.zza(r6)
            com.google.android.gms.internal.ads.zzk r1 = r1.zzg()
            r3.zzB(r1)
            float r1 = r5.zzf
            r3.zzW(r1)
            int r1 = r5.zzg
            r3.zzS(r1)
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r3.zzN(r1)
            com.google.android.gms.internal.ads.zzab r1 = r3.zzag()
            com.google.android.gms.internal.ads.zzadt r2 = r0.zzc
            r2.zzm(r1)
            int r2 = r1.zzq
            r3 = -1
            if (r2 == r3) goto L_0x0145
            r27 = 1
            goto L_0x0147
        L_0x0145:
            r27 = 0
        L_0x0147:
            com.google.android.gms.internal.ads.zzfun.zzl(r27)
            com.google.android.gms.internal.ads.zzann r2 = r0.zza
            int r1 = r1.zzq
            r2.zze(r1)
            r1 = 1
            r0.zze = r1
            goto L_0x015d
        L_0x0155:
            r19 = r2
            r20 = r3
            r18 = r5
            r17 = r12
        L_0x015d:
            com.google.android.gms.internal.ads.zzanb r1 = r0.zzj
            boolean r1 = r1.zzd(r4)
            r2 = 5
            if (r1 == 0) goto L_0x0185
            com.google.android.gms.internal.ads.zzanb r1 = r0.zzj
            byte[] r3 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzfk.zzb(r3, r1)
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzn
            com.google.android.gms.internal.ads.zzanb r5 = r0.zzj
            byte[] r5 = r5.zza
            r3.zzJ(r5, r1)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zzn
            r1.zzM(r2)
            com.google.android.gms.internal.ads.zzann r1 = r0.zza
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzn
            r1.zza(r8, r3)
        L_0x0185:
            com.google.android.gms.internal.ads.zzanb r1 = r0.zzk
            boolean r1 = r1.zzd(r4)
            if (r1 == 0) goto L_0x01ac
            com.google.android.gms.internal.ads.zzanb r1 = r0.zzk
            byte[] r3 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzfk.zzb(r3, r1)
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzn
            com.google.android.gms.internal.ads.zzanb r4 = r0.zzk
            byte[] r4 = r4.zza
            r3.zzJ(r4, r1)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zzn
            r1.zzM(r2)
            com.google.android.gms.internal.ads.zzann r1 = r0.zza
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzn
            r1.zza(r8, r2)
        L_0x01ac:
            r1 = 1
            int r1 = r7 >> 1
            long r14 = r0.zzm
            com.google.android.gms.internal.ads.zzamr r9 = r0.zzd
            boolean r2 = r0.zze
            r12 = r17
            r13 = r1
            r16 = r2
            r9.zze(r10, r12, r13, r14, r16)
            boolean r2 = r0.zze
            if (r2 != 0) goto L_0x01d0
            com.google.android.gms.internal.ads.zzanb r2 = r0.zzg
            r2.zzc(r1)
            com.google.android.gms.internal.ads.zzanb r2 = r0.zzh
            r2.zzc(r1)
            com.google.android.gms.internal.ads.zzanb r2 = r0.zzi
            r2.zzc(r1)
        L_0x01d0:
            com.google.android.gms.internal.ads.zzanb r2 = r0.zzj
            r2.zzc(r1)
            com.google.android.gms.internal.ads.zzanb r2 = r0.zzk
            r2.zzc(r1)
            r6 = r29
            r1 = r18
            r2 = r19
            r3 = r20
            goto L_0x0030
        L_0x01e4:
            r0.zzf(r3, r1, r2)
        L_0x01e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzams.zza(com.google.android.gms.internal.ads.zzdy):void");
    }

    public final void zzb(zzacq zzacq, zzanx zzanx) {
        zzanx.zzc();
        this.zzb = zzanx.zzb();
        zzadt zzw = zzacq.zzw(zzanx.zza(), 2);
        this.zzc = zzw;
        this.zzd = new zzamr(zzw);
        this.zza.zzb(zzacq, zzanx);
    }

    public final void zzc(boolean z) {
        zzcw.zzb(this.zzc);
        int i = zzei.zza;
        if (z) {
            this.zza.zzc();
            this.zzd.zza(this.zzl);
        }
    }

    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    public final void zze() {
        this.zzl = 0;
        this.zzm = -9223372036854775807L;
        zzfk.zzh(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzc();
        zzamr zzamr = this.zzd;
        if (zzamr != null) {
            zzamr.zzd();
        }
    }
}
