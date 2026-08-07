package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzamf implements zzamj {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzdx zzc = new zzdx(new byte[7], 7);
    private final zzdy zzd = new zzdy(Arrays.copyOf(zza, 10));
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzadt zzh;
    private zzadt zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzadt zzv;
    private long zzw;

    public zzamf(boolean z, String str, int i) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzadt zzadt, long j, int i, int i2) {
        this.zzj = 4;
        this.zzk = i;
        this.zzv = zzadt;
        this.zzw = j;
        this.zzt = i2;
    }

    private final boolean zzk(zzdy zzdy, byte[] bArr, int i) {
        int min = Math.min(zzdy.zzb(), i - this.zzk);
        zzdy.zzH(bArr, this.zzk, min);
        int i2 = this.zzk + min;
        this.zzk = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | 65280);
    }

    private static final boolean zzm(zzdy zzdy, byte[] bArr, int i) {
        if (zzdy.zzb() < i) {
            return false;
        }
        zzdy.zzH(bArr, 0, i);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzdy r18) throws com.google.android.gms.internal.ads.zzbc {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            com.google.android.gms.internal.ads.zzadt r0 = r6.zzh
            r0.getClass()
            int r0 = com.google.android.gms.internal.ads.zzei.zza
        L_0x000b:
            int r0 = r18.zzb()
            if (r0 <= 0) goto L_0x02d3
            int r0 = r6.zzj
            r1 = 13
            r2 = 7
            r3 = 4
            r4 = 3
            r5 = -1
            r8 = 0
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L_0x019f
            if (r0 == r10) goto L_0x0164
            r5 = 10
            if (r0 == r9) goto L_0x0136
            if (r0 == r4) goto L_0x0067
            int r0 = r18.zzb()
            int r1 = r6.zzt
            int r2 = r6.zzk
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)
            com.google.android.gms.internal.ads.zzadt r1 = r6.zzv
            r1.zzr(r7, r0)
            int r1 = r6.zzk
            int r1 = r1 + r0
            r6.zzk = r1
            int r0 = r6.zzt
            if (r1 != r0) goto L_0x000b
            long r0 = r6.zzu
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x004d
            r8 = 1
        L_0x004d:
            com.google.android.gms.internal.ads.zzcw.zzf(r8)
            com.google.android.gms.internal.ads.zzadt r9 = r6.zzv
            long r10 = r6.zzu
            int r13 = r6.zzt
            r14 = 0
            r15 = 0
            r12 = 1
            r9.zzt(r10, r12, r13, r14, r15)
            long r0 = r6.zzu
            long r2 = r6.zzw
            long r0 = r0 + r2
            r6.zzu = r0
            r17.zzh()
            goto L_0x000b
        L_0x0067:
            boolean r0 = r6.zzm
            r11 = 5
            if (r10 == r0) goto L_0x006e
            r0 = 5
            goto L_0x006f
        L_0x006e:
            r0 = 7
        L_0x006f:
            com.google.android.gms.internal.ads.zzdx r12 = r6.zzc
            byte[] r12 = r12.zza
            boolean r0 = r6.zzk(r7, r12, r0)
            if (r0 == 0) goto L_0x000b
            com.google.android.gms.internal.ads.zzdx r0 = r6.zzc
            r0.zzl(r8)
            boolean r0 = r6.zzr
            if (r0 != 0) goto L_0x010f
            com.google.android.gms.internal.ads.zzdx r0 = r6.zzc
            int r0 = r0.zzd(r9)
            int r0 = r0 + r10
            if (r0 == r9) goto L_0x00a3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r12 = "Detected audio object type: "
            r5.<init>(r12)
            r5.append(r0)
            java.lang.String r0 = ", but assuming AAC LC."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "AdtsReader"
            com.google.android.gms.internal.ads.zzdo.zzf(r5, r0)
        L_0x00a3:
            com.google.android.gms.internal.ads.zzdx r0 = r6.zzc
            r0.zzn(r11)
            com.google.android.gms.internal.ads.zzdx r0 = r6.zzc
            int r0 = r0.zzd(r4)
            int r5 = r6.zzp
            int r11 = com.google.android.gms.internal.ads.zzabk.zza
            int r11 = r5 >> 1
            r11 = r11 & r2
            r11 = r11 | 16
            byte r11 = (byte) r11
            int r2 = r5 << 7
            int r0 = r0 << r4
            r2 = r2 & 128(0x80, float:1.794E-43)
            r0 = r0 & 120(0x78, float:1.68E-43)
            r0 = r0 | r2
            byte r0 = (byte) r0
            byte[] r2 = new byte[r9]
            r2[r8] = r11
            r2[r10] = r0
            com.google.android.gms.internal.ads.zzabi r0 = com.google.android.gms.internal.ads.zzabk.zza(r2)
            com.google.android.gms.internal.ads.zzz r4 = new com.google.android.gms.internal.ads.zzz
            r4.<init>()
            java.lang.String r5 = r6.zzg
            r4.zzM(r5)
            java.lang.String r5 = "audio/mp4a-latm"
            r4.zzaa(r5)
            java.lang.String r5 = r0.zzc
            r4.zzA(r5)
            int r5 = r0.zzb
            r4.zzz(r5)
            int r0 = r0.zza
            r4.zzab(r0)
            java.util.List r0 = java.util.Collections.singletonList(r2)
            r4.zzN(r0)
            java.lang.String r0 = r6.zze
            r4.zzQ(r0)
            int r0 = r6.zzf
            r4.zzY(r0)
            com.google.android.gms.internal.ads.zzab r0 = r4.zzag()
            int r2 = r0.zzE
            long r4 = (long) r2
            r8 = 1024000000(0x3d090000, double:5.059232213E-315)
            long r8 = r8 / r4
            r6.zzs = r8
            com.google.android.gms.internal.ads.zzadt r2 = r6.zzh
            r2.zzm(r0)
            r6.zzr = r10
            goto L_0x0114
        L_0x010f:
            com.google.android.gms.internal.ads.zzdx r0 = r6.zzc
            r0.zzn(r5)
        L_0x0114:
            com.google.android.gms.internal.ads.zzdx r0 = r6.zzc
            r0.zzn(r3)
            com.google.android.gms.internal.ads.zzdx r0 = r6.zzc
            int r0 = r0.zzd(r1)
            int r1 = r0 + -7
            boolean r2 = r6.zzm
            if (r2 == 0) goto L_0x0129
            int r0 = r0 + -9
            r5 = r0
            goto L_0x012a
        L_0x0129:
            r5 = r1
        L_0x012a:
            com.google.android.gms.internal.ads.zzadt r1 = r6.zzh
            long r2 = r6.zzs
            r4 = 0
            r0 = r17
            r0.zzj(r1, r2, r4, r5)
            goto L_0x000b
        L_0x0136:
            com.google.android.gms.internal.ads.zzdy r0 = r6.zzd
            byte[] r0 = r0.zzN()
            boolean r0 = r6.zzk(r7, r0, r5)
            if (r0 == 0) goto L_0x000b
            com.google.android.gms.internal.ads.zzadt r0 = r6.zzi
            com.google.android.gms.internal.ads.zzdy r1 = r6.zzd
            r0.zzr(r1, r5)
            com.google.android.gms.internal.ads.zzdy r0 = r6.zzd
            r1 = 6
            r0.zzL(r1)
            com.google.android.gms.internal.ads.zzadt r1 = r6.zzi
            com.google.android.gms.internal.ads.zzdy r0 = r6.zzd
            int r0 = r0.zzl()
            r4 = 10
            int r5 = r0 + 10
            r2 = 0
            r0 = r17
            r0.zzj(r1, r2, r4, r5)
            goto L_0x000b
        L_0x0164:
            int r0 = r18.zzb()
            if (r0 == 0) goto L_0x000b
            com.google.android.gms.internal.ads.zzdx r0 = r6.zzc
            byte[] r1 = r0.zza
            byte[] r2 = r18.zzN()
            int r4 = r18.zzd()
            byte r2 = r2[r4]
            r1[r8] = r2
            r0.zzl(r9)
            com.google.android.gms.internal.ads.zzdx r0 = r6.zzc
            int r0 = r0.zzd(r3)
            int r1 = r6.zzp
            if (r1 == r5) goto L_0x018e
            if (r0 == r1) goto L_0x018e
            r17.zzg()
            goto L_0x000b
        L_0x018e:
            boolean r1 = r6.zzn
            if (r1 != 0) goto L_0x019a
            r6.zzn = r10
            int r1 = r6.zzq
            r6.zzo = r1
            r6.zzp = r0
        L_0x019a:
            r17.zzi()
            goto L_0x000b
        L_0x019f:
            byte[] r0 = r18.zzN()
            int r11 = r18.zzd()
            int r12 = r18.zze()
        L_0x01ab:
            if (r11 >= r12) goto L_0x02ce
            int r13 = r11 + 1
            byte r14 = r0[r11]
            r15 = r14 & 255(0xff, float:3.57E-43)
            int r8 = r6.zzl
            r4 = 512(0x200, float:7.175E-43)
            if (r8 != r4) goto L_0x027f
            byte r8 = (byte) r15
            boolean r8 = zzl(r5, r8)
            if (r8 == 0) goto L_0x027f
            boolean r8 = r6.zzn
            if (r8 != 0) goto L_0x025d
            int r8 = r11 + -1
            r7.zzL(r11)
            com.google.android.gms.internal.ads.zzdx r4 = r6.zzc
            byte[] r4 = r4.zza
            boolean r4 = zzm(r7, r4, r10)
            if (r4 != 0) goto L_0x01d5
            goto L_0x027f
        L_0x01d5:
            com.google.android.gms.internal.ads.zzdx r4 = r6.zzc
            r4.zzl(r3)
            com.google.android.gms.internal.ads.zzdx r4 = r6.zzc
            int r4 = r4.zzd(r10)
            int r2 = r6.zzo
            if (r2 == r5) goto L_0x01e6
            if (r4 != r2) goto L_0x027f
        L_0x01e6:
            int r2 = r6.zzp
            if (r2 == r5) goto L_0x0209
            com.google.android.gms.internal.ads.zzdx r2 = r6.zzc
            byte[] r2 = r2.zza
            boolean r2 = zzm(r7, r2, r10)
            if (r2 != 0) goto L_0x01f5
            goto L_0x025d
        L_0x01f5:
            com.google.android.gms.internal.ads.zzdx r2 = r6.zzc
            r2.zzl(r9)
            com.google.android.gms.internal.ads.zzdx r2 = r6.zzc
            int r2 = r2.zzd(r3)
            int r9 = r6.zzp
            if (r2 != r9) goto L_0x027f
            int r2 = r11 + 1
            r7.zzL(r2)
        L_0x0209:
            com.google.android.gms.internal.ads.zzdx r2 = r6.zzc
            byte[] r2 = r2.zza
            boolean r2 = zzm(r7, r2, r3)
            if (r2 == 0) goto L_0x025d
            com.google.android.gms.internal.ads.zzdx r2 = r6.zzc
            r9 = 14
            r2.zzl(r9)
            com.google.android.gms.internal.ads.zzdx r2 = r6.zzc
            int r2 = r2.zzd(r1)
            r9 = 7
            if (r2 < r9) goto L_0x0280
            byte[] r16 = r18.zzN()
            int r1 = r18.zze()
            int r8 = r8 + r2
            if (r8 >= r1) goto L_0x025d
            byte r2 = r16[r8]
            if (r2 != r5) goto L_0x0245
            int r8 = r8 + 1
            if (r8 == r1) goto L_0x025d
            byte r1 = r16[r8]
            boolean r2 = zzl(r5, r1)
            if (r2 == 0) goto L_0x0280
            r1 = r1 & 8
            r2 = 3
            int r1 = r1 >> r2
            if (r1 != r4) goto L_0x0280
            goto L_0x025d
        L_0x0245:
            r4 = 73
            if (r2 != r4) goto L_0x0280
            int r2 = r8 + 1
            if (r2 == r1) goto L_0x025d
            byte r2 = r16[r2]
            r4 = 68
            if (r2 != r4) goto L_0x0280
            int r8 = r8 + 2
            if (r8 == r1) goto L_0x025d
            byte r1 = r16[r8]
            r2 = 51
            if (r1 != r2) goto L_0x0280
        L_0x025d:
            r0 = r14 & 8
            r1 = 3
            int r0 = r0 >> r1
            r6.zzq = r0
            r0 = r14 & 1
            r0 = r0 ^ r10
            if (r10 == r0) goto L_0x026a
            r0 = 0
            goto L_0x026b
        L_0x026a:
            r0 = 1
        L_0x026b:
            r6.zzm = r0
            boolean r0 = r6.zzn
            if (r0 != 0) goto L_0x0277
            r6.zzj = r10
            r0 = 0
            r6.zzk = r0
            goto L_0x027a
        L_0x0277:
            r17.zzi()
        L_0x027a:
            r7.zzL(r13)
            goto L_0x000b
        L_0x027f:
            r9 = 7
        L_0x0280:
            int r1 = r6.zzl
            r2 = r1 | r15
            r4 = 329(0x149, float:4.61E-43)
            if (r2 == r4) goto L_0x02be
            r4 = 511(0x1ff, float:7.16E-43)
            if (r2 == r4) goto L_0x02b8
            r4 = 836(0x344, float:1.171E-42)
            if (r2 == r4) goto L_0x02b2
            r4 = 1075(0x433, float:1.506E-42)
            if (r2 == r4) goto L_0x029f
            r2 = 256(0x100, float:3.59E-43)
            if (r1 == r2) goto L_0x029b
            r6.zzl = r2
            goto L_0x02c6
        L_0x029b:
            r1 = 2
            r2 = 3
            r4 = 0
            goto L_0x02c5
        L_0x029f:
            r1 = 2
            r6.zzj = r1
            r2 = 3
            r6.zzk = r2
            r4 = 0
            r6.zzt = r4
            com.google.android.gms.internal.ads.zzdy r0 = r6.zzd
            r0.zzL(r4)
            r7.zzL(r13)
            goto L_0x000b
        L_0x02b2:
            r1 = 2
            r2 = 3
            r4 = 0
            r8 = 1024(0x400, float:1.435E-42)
            goto L_0x02c3
        L_0x02b8:
            r1 = 2
            r2 = 3
            r4 = 0
            r8 = 512(0x200, float:7.175E-43)
            goto L_0x02c3
        L_0x02be:
            r1 = 2
            r2 = 3
            r4 = 0
            r8 = 768(0x300, float:1.076E-42)
        L_0x02c3:
            r6.zzl = r8
        L_0x02c5:
            r11 = r13
        L_0x02c6:
            r1 = 13
            r2 = 7
            r4 = 3
            r8 = 0
            r9 = 2
            goto L_0x01ab
        L_0x02ce:
            r7.zzL(r11)
            goto L_0x000b
        L_0x02d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamf.zza(com.google.android.gms.internal.ads.zzdy):void");
    }

    public final void zzb(zzacq zzacq, zzanx zzanx) {
        zzanx.zzc();
        this.zzg = zzanx.zzb();
        zzadt zzw2 = zzacq.zzw(zzanx.zza(), 1);
        this.zzh = zzw2;
        this.zzv = zzw2;
        if (this.zzb) {
            zzanx.zzc();
            zzadt zzw3 = zzacq.zzw(zzanx.zza(), 5);
            this.zzi = zzw3;
            zzz zzz = new zzz();
            zzz.zzM(zzanx.zzb());
            zzz.zzaa("application/id3");
            zzw3.zzm(zzz.zzag());
            return;
        }
        this.zzi = new zzaci();
    }

    public final void zzc(boolean z) {
    }

    public final void zzd(long j, int i) {
        this.zzu = j;
    }

    public final void zze() {
        this.zzu = -9223372036854775807L;
        zzg();
    }
}
