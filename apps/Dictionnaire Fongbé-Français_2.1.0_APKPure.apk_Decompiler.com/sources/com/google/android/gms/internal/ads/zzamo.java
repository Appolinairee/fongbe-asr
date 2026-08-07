package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzamo implements zzamj {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaoa zzb;
    private final zzdy zzc;
    private final boolean[] zzd;
    private final zzamm zze;
    private final zzanb zzf;
    private zzamn zzg;
    private long zzh;
    private String zzi;
    private zzadt zzj;
    private boolean zzk;
    private long zzl;

    public zzamo() {
        this((zzaoa) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzdy r18) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.gms.internal.ads.zzamn r1 = r0.zzg
            com.google.android.gms.internal.ads.zzcw.zzb(r1)
            com.google.android.gms.internal.ads.zzadt r1 = r0.zzj
            com.google.android.gms.internal.ads.zzcw.zzb(r1)
            int r1 = r18.zzd()
            int r2 = r18.zze()
            byte[] r3 = r18.zzN()
            long r4 = r0.zzh
            int r6 = r18.zzb()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzh = r4
            com.google.android.gms.internal.ads.zzadt r4 = r0.zzj
            int r5 = r18.zzb()
            r6 = r18
            r4.zzr(r6, r5)
        L_0x002d:
            boolean[] r4 = r0.zzd
            int r4 = com.google.android.gms.internal.ads.zzfk.zza(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x004b
            boolean r4 = r0.zzk
            if (r4 != 0) goto L_0x003e
            com.google.android.gms.internal.ads.zzamm r4 = r0.zze
            r4.zza(r3, r1, r2)
        L_0x003e:
            com.google.android.gms.internal.ads.zzamn r4 = r0.zzg
            r4.zza(r3, r1, r2)
            com.google.android.gms.internal.ads.zzanb r4 = r0.zzf
            if (r4 == 0) goto L_0x004a
            r4.zza(r3, r1, r2)
        L_0x004a:
            return
        L_0x004b:
            byte[] r5 = r18.zzN()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.zzk
            if (r9 != 0) goto L_0x0183
            if (r8 <= 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzamm r9 = r0.zze
            r9.zza(r3, r1, r4)
        L_0x0062:
            if (r8 >= 0) goto L_0x0066
            int r9 = -r8
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            com.google.android.gms.internal.ads.zzamm r12 = r0.zze
            boolean r9 = r12.zzc(r5, r9)
            if (r9 == 0) goto L_0x0183
            com.google.android.gms.internal.ads.zzadt r9 = r0.zzj
            com.google.android.gms.internal.ads.zzamm r12 = r0.zze
            int r13 = r12.zzb
            java.lang.String r14 = r0.zzi
            r14.getClass()
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            byte[] r15 = r12.zzc
            int r12 = r12.zza
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.android.gms.internal.ads.zzdx r15 = new com.google.android.gms.internal.ads.zzdx
            int r10 = r12.length
            r15.<init>(r12, r10)
            r15.zzo(r13)
            r10 = 4
            r15.zzo(r10)
            r15.zzm()
            r13 = 8
            r15.zzn(r13)
            boolean r16 = r15.zzp()
            r11 = 3
            if (r16 == 0) goto L_0x00a7
            r15.zzn(r10)
            r15.zzn(r11)
        L_0x00a7:
            int r10 = r15.zzd(r10)
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r11 = "Invalid aspect ratio"
            java.lang.String r13 = "H263Reader"
            r6 = 15
            if (r10 != r6) goto L_0x00ca
            r6 = 8
            int r10 = r15.zzd(r6)
            int r6 = r15.zzd(r6)
            if (r6 != 0) goto L_0x00c5
            com.google.android.gms.internal.ads.zzdo.zzf(r13, r11)
            goto L_0x00d7
        L_0x00c5:
            float r10 = (float) r10
            float r6 = (float) r6
            float r16 = r10 / r6
            goto L_0x00d1
        L_0x00ca:
            r6 = 7
            if (r10 >= r6) goto L_0x00d4
            float[] r6 = zza
            r16 = r6[r10]
        L_0x00d1:
            r6 = r16
            goto L_0x00d9
        L_0x00d4:
            com.google.android.gms.internal.ads.zzdo.zzf(r13, r11)
        L_0x00d7:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x00d9:
            boolean r10 = r15.zzp()
            r11 = 2
            if (r10 == 0) goto L_0x0113
            r15.zzn(r11)
            r10 = 1
            r15.zzn(r10)
            boolean r10 = r15.zzp()
            if (r10 == 0) goto L_0x0113
            r10 = 15
            r15.zzn(r10)
            r15.zzm()
            r15.zzn(r10)
            r15.zzm()
            r15.zzn(r10)
            r15.zzm()
            r11 = 3
            r15.zzn(r11)
            r11 = 11
            r15.zzn(r11)
            r15.zzm()
            r15.zzn(r10)
            r15.zzm()
        L_0x0113:
            r10 = 2
            int r10 = r15.zzd(r10)
            if (r10 == 0) goto L_0x011f
            java.lang.String r10 = "Unhandled video object layer shape"
            com.google.android.gms.internal.ads.zzdo.zzf(r13, r10)
        L_0x011f:
            r15.zzm()
            r10 = 16
            int r10 = r15.zzd(r10)
            r15.zzm()
            boolean r11 = r15.zzp()
            if (r11 == 0) goto L_0x0146
            if (r10 != 0) goto L_0x0139
            java.lang.String r10 = "Invalid vop_increment_time_resolution"
            com.google.android.gms.internal.ads.zzdo.zzf(r13, r10)
            goto L_0x0146
        L_0x0139:
            int r10 = r10 + -1
            r11 = 0
        L_0x013c:
            if (r10 <= 0) goto L_0x0143
            int r10 = r10 >> 1
            int r11 = r11 + 1
            goto L_0x013c
        L_0x0143:
            r15.zzn(r11)
        L_0x0146:
            r15.zzm()
            r10 = 13
            int r11 = r15.zzd(r10)
            r15.zzm()
            int r10 = r15.zzd(r10)
            r15.zzm()
            r15.zzm()
            com.google.android.gms.internal.ads.zzz r13 = new com.google.android.gms.internal.ads.zzz
            r13.<init>()
            r13.zzM(r14)
            java.lang.String r14 = "video/mp4v-es"
            r13.zzaa(r14)
            r13.zzaf(r11)
            r13.zzK(r10)
            r13.zzW(r6)
            java.util.List r6 = java.util.Collections.singletonList(r12)
            r13.zzN(r6)
            com.google.android.gms.internal.ads.zzab r6 = r13.zzag()
            r9.zzm(r6)
            r6 = 1
            r0.zzk = r6
        L_0x0183:
            com.google.android.gms.internal.ads.zzamn r6 = r0.zzg
            r6.zza(r3, r1, r4)
            com.google.android.gms.internal.ads.zzanb r6 = r0.zzf
            if (r6 == 0) goto L_0x01d6
            if (r8 <= 0) goto L_0x0193
            r6.zza(r3, r1, r4)
            r10 = 0
            goto L_0x0194
        L_0x0193:
            int r10 = -r8
        L_0x0194:
            com.google.android.gms.internal.ads.zzanb r1 = r0.zzf
            boolean r1 = r1.zzd(r10)
            if (r1 == 0) goto L_0x01c0
            com.google.android.gms.internal.ads.zzanb r1 = r0.zzf
            byte[] r6 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzfk.zzb(r6, r1)
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzc
            int r8 = com.google.android.gms.internal.ads.zzei.zza
            com.google.android.gms.internal.ads.zzanb r8 = r0.zzf
            r9 = r6
            com.google.android.gms.internal.ads.zzdy r9 = (com.google.android.gms.internal.ads.zzdy) r9
            byte[] r8 = r8.zza
            r6.zzJ(r8, r1)
            com.google.android.gms.internal.ads.zzaoa r1 = r0.zzb
            r6 = r1
            com.google.android.gms.internal.ads.zzaoa r6 = (com.google.android.gms.internal.ads.zzaoa) r6
            long r8 = r0.zzl
            com.google.android.gms.internal.ads.zzdy r6 = r0.zzc
            r1.zza(r8, r6)
        L_0x01c0:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x01d6
            byte[] r5 = r18.zzN()
            int r6 = r4 + 2
            byte r5 = r5[r6]
            r6 = 1
            if (r5 != r6) goto L_0x01d4
            com.google.android.gms.internal.ads.zzanb r5 = r0.zzf
            r5.zzc(r1)
        L_0x01d4:
            r5 = 178(0xb2, float:2.5E-43)
        L_0x01d6:
            int r1 = r2 - r4
            long r8 = r0.zzh
            long r10 = (long) r1
            long r8 = r8 - r10
            com.google.android.gms.internal.ads.zzamn r4 = r0.zzg
            boolean r6 = r0.zzk
            r4.zzb(r8, r1, r6)
            com.google.android.gms.internal.ads.zzamn r1 = r0.zzg
            long r8 = r0.zzl
            r1.zzc(r5, r8)
            r6 = r18
            r1 = r7
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamo.zza(com.google.android.gms.internal.ads.zzdy):void");
    }

    public final void zzb(zzacq zzacq, zzanx zzanx) {
        zzanx.zzc();
        this.zzi = zzanx.zzb();
        zzadt zzw = zzacq.zzw(zzanx.zza(), 2);
        this.zzj = zzw;
        this.zzg = new zzamn(zzw);
        zzaoa zzaoa = this.zzb;
        if (zzaoa != null) {
            zzaoa.zzb(zzacq, zzanx);
        }
    }

    public final void zzc(boolean z) {
        zzcw.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    public final void zze() {
        zzfk.zzh(this.zzd);
        this.zze.zzb();
        zzamn zzamn = this.zzg;
        if (zzamn != null) {
            zzamn.zzd();
        }
        zzanb zzanb = this.zzf;
        if (zzanb != null) {
            zzanb.zzb();
        }
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
    }

    zzamo(zzaoa zzaoa) {
        zzdy zzdy;
        this.zzb = zzaoa;
        this.zzd = new boolean[4];
        this.zze = new zzamm(128);
        this.zzl = -9223372036854775807L;
        if (zzaoa != null) {
            this.zzf = new zzanb(178, 128);
            zzdy = new zzdy();
        } else {
            zzdy = null;
            this.zzf = null;
        }
        this.zzc = zzdy;
    }
}
