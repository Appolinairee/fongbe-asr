package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaef implements zzacn {
    private final zzdy zza;
    private final zzaed zzb;
    private final boolean zzc;
    private final zzakd zzd;
    private int zze;
    private zzacq zzf;
    private zzaeg zzg;
    private long zzh;
    /* access modifiers changed from: private */
    public zzaei[] zzi;
    private long zzj;
    private zzaei zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaef() {
        this(1, zzakd.zza);
    }

    private final zzaei zzg(int i) {
        for (zzaei zzaei : this.zzi) {
            if (zzaei.zzf(i)) {
                return zzaei;
            }
        }
        return null;
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zze = 0;
        if (this.zzc) {
            zzacq = new zzakg(zzacq, this.zzd);
        }
        this.zzf = zzacq;
        this.zzj = -1;
    }

    public final void zzf(long j, long j2) {
        this.zzj = -1;
        this.zzk = null;
        int i = 0;
        for (zzaei zze2 : this.zzi) {
            zze2.zze(j);
        }
        if (j == 0) {
            if (this.zzi.length != 0) {
                i = 3;
            }
            this.zze = i;
            return;
        }
        this.zze = 6;
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        zzaco.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzM(4);
        if (this.zza.zzi() == 541677121) {
            return true;
        }
        return false;
    }

    public zzaef(int i, zzakd zzakd) {
        this.zzd = zzakd;
        this.zzc = 1 != (i ^ 1) ? false : true;
        this.zza = new zzdy(12);
        this.zzb = new zzaed((zzaee) null);
        this.zzf = new zzadh();
        this.zzi = new zzaei[0];
        this.zzm = -1;
        this.zzn = -1;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzaco r28, com.google.android.gms.internal.ads.zzadj r29) throws java.io.IOException {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            long r2 = r0.zzj
            r4 = 1
            r5 = 0
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x002b
            long r8 = r28.zzf()
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0025
            r10 = 262144(0x40000, double:1.295163E-318)
            long r10 = r10 + r8
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            long r2 = r2 - r8
            int r3 = (int) r2
            r1.zzk(r3)
            goto L_0x002b
        L_0x0025:
            r8 = r29
            r8.zza = r2
            r2 = 1
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r0.zzj = r6
            if (r2 == 0) goto L_0x0031
            return r4
        L_0x0031:
            int r2 = r0.zze
            r3 = 12
            r8 = 0
            if (r2 == 0) goto L_0x039e
            r9 = 1819436136(0x6c726468, float:1.1721368E27)
            r10 = 1414744396(0x5453494c, float:3.62987127E12)
            r11 = 2
            if (r2 == r4) goto L_0x0347
            r12 = 3
            if (r2 == r11) goto L_0x021f
            r9 = 6
            r11 = 1769369453(0x69766f6d, float:1.8620122E25)
            r13 = 4
            r16 = 8
            r14 = 16
            if (r2 == r12) goto L_0x0188
            r6 = 5
            r7 = 8
            if (r2 == r13) goto L_0x015d
            if (r2 == r6) goto L_0x00dd
            long r12 = r28.zzf()
            long r14 = r0.zzn
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0063
            r5 = -1
            goto L_0x00dc
        L_0x0063:
            com.google.android.gms.internal.ads.zzaei r2 = r0.zzk
            if (r2 == 0) goto L_0x0071
            boolean r1 = r2.zzg(r1)
            if (r1 != 0) goto L_0x006e
            goto L_0x00dc
        L_0x006e:
            r0.zzk = r8
            return r5
        L_0x0071:
            long r8 = r28.zzf()
            r12 = 1
            long r8 = r8 & r12
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x007f
            r1.zzk(r4)
        L_0x007f:
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            byte[] r2 = r2.zzN()
            r1.zzh(r2, r5, r3)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            r2.zzL(r5)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            int r2 = r2.zzi()
            if (r2 != r10) goto L_0x00ac
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            r2.zzL(r7)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            int r2 = r2.zzi()
            if (r2 != r11) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r3 = 8
        L_0x00a5:
            r1.zzk(r3)
            r28.zzj()
            goto L_0x00dc
        L_0x00ac:
            com.google.android.gms.internal.ads.zzdy r3 = r0.zza
            int r3 = r3.zzi()
            r4 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r2 != r4) goto L_0x00c2
            long r2 = (long) r3
            long r6 = r28.zzf()
            long r6 = r6 + r2
            long r6 = r6 + r16
            r0.zzj = r6
            goto L_0x00dc
        L_0x00c2:
            r1.zzk(r7)
            r28.zzj()
            com.google.android.gms.internal.ads.zzaei r2 = r0.zzg(r2)
            if (r2 != 0) goto L_0x00d7
            long r2 = (long) r3
            long r6 = r28.zzf()
            long r6 = r6 + r2
            r0.zzj = r6
            goto L_0x00dc
        L_0x00d7:
            r2.zzd(r3)
            r0.zzk = r2
        L_0x00dc:
            return r5
        L_0x00dd:
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            int r3 = r0.zzo
            r2.<init>((int) r3)
            byte[] r3 = r2.zzN()
            int r6 = r0.zzo
            r1.zzi(r3, r5, r6)
            int r1 = r2.zzb()
            if (r1 >= r14) goto L_0x00f6
            r18 = 0
            goto L_0x0112
        L_0x00f6:
            int r1 = r2.zzd()
            r2.zzM(r7)
            int r3 = r2.zzi()
            long r6 = (long) r3
            long r10 = r0.zzm
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x010b
            r18 = 0
            goto L_0x010f
        L_0x010b:
            long r10 = r10 + r16
            r18 = r10
        L_0x010f:
            r2.zzL(r1)
        L_0x0112:
            int r1 = r2.zzb()
            if (r1 < r14) goto L_0x013a
            int r1 = r2.zzi()
            int r3 = r2.zzi()
            int r6 = r2.zzi()
            long r6 = (long) r6
            long r6 = r6 + r18
            r2.zzi()
            com.google.android.gms.internal.ads.zzaei r1 = r0.zzg(r1)
            if (r1 == 0) goto L_0x0112
            r3 = r3 & r14
            if (r3 != r14) goto L_0x0135
            r3 = 1
            goto L_0x0136
        L_0x0135:
            r3 = 0
        L_0x0136:
            r1.zzb(r6, r3)
            goto L_0x0112
        L_0x013a:
            com.google.android.gms.internal.ads.zzaei[] r1 = r0.zzi
            int r2 = r1.length
            r3 = 0
        L_0x013e:
            if (r3 >= r2) goto L_0x0148
            r6 = r1[r3]
            r6.zzc()
            int r3 = r3 + 1
            goto L_0x013e
        L_0x0148:
            r0.zzp = r4
            com.google.android.gms.internal.ads.zzacq r1 = r0.zzf
            com.google.android.gms.internal.ads.zzaec r2 = new com.google.android.gms.internal.ads.zzaec
            long r3 = r0.zzh
            r2.<init>(r0, r3)
            r1.zzO(r2)
            r0.zze = r9
            long r1 = r0.zzm
            r0.zzj = r1
            return r5
        L_0x015d:
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            byte[] r2 = r2.zzN()
            r1.zzi(r2, r5, r7)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            r2.zzL(r5)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            int r3 = r2.zzi()
            int r2 = r2.zzi()
            r4 = 829973609(0x31786469, float:3.6145826E-9)
            if (r3 != r4) goto L_0x017f
            r0.zze = r6
            r0.zzo = r2
            goto L_0x0187
        L_0x017f:
            long r3 = r28.zzf()
            long r1 = (long) r2
            long r3 = r3 + r1
            r0.zzj = r3
        L_0x0187:
            return r5
        L_0x0188:
            long r13 = r0.zzm
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x019a
            long r6 = r28.zzf()
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x0197
            goto L_0x019a
        L_0x0197:
            r0.zzj = r13
            return r5
        L_0x019a:
            com.google.android.gms.internal.ads.zzdy r6 = r0.zza
            byte[] r6 = r6.zzN()
            r1.zzh(r6, r5, r3)
            r28.zzj()
            com.google.android.gms.internal.ads.zzdy r6 = r0.zza
            r6.zzL(r5)
            com.google.android.gms.internal.ads.zzaed r6 = r0.zzb
            com.google.android.gms.internal.ads.zzdy r7 = r0.zza
            r6.zza(r7)
            com.google.android.gms.internal.ads.zzdy r6 = r0.zza
            com.google.android.gms.internal.ads.zzaed r7 = r0.zzb
            int r6 = r6.zzi()
            int r7 = r7.zza
            r8 = 1179011410(0x46464952, float:12690.33)
            if (r7 != r8) goto L_0x01c5
            r1.zzk(r3)
            return r5
        L_0x01c5:
            if (r7 != r10) goto L_0x0210
            if (r6 == r11) goto L_0x01ca
            goto L_0x0210
        L_0x01ca:
            long r6 = r28.zzf()
            r0.zzm = r6
            com.google.android.gms.internal.ads.zzaed r3 = r0.zzb
            int r3 = r3.zzb
            long r10 = (long) r3
            long r6 = r6 + r10
            long r6 = r6 + r16
            r0.zzn = r6
            boolean r3 = r0.zzp
            if (r3 != 0) goto L_0x0204
            com.google.android.gms.internal.ads.zzaeg r3 = r0.zzg
            r3.getClass()
            r8 = r3
            com.google.android.gms.internal.ads.zzaeg r8 = (com.google.android.gms.internal.ads.zzaeg) r8
            int r3 = r3.zzb
            r2 = 16
            r3 = r3 & r2
            if (r3 == r2) goto L_0x01fe
            com.google.android.gms.internal.ads.zzacq r2 = r0.zzf
            com.google.android.gms.internal.ads.zzadl r3 = new com.google.android.gms.internal.ads.zzadl
            long r6 = r0.zzh
            r10 = 0
            r3.<init>(r6, r10)
            r2.zzO(r3)
            r0.zzp = r4
            goto L_0x0204
        L_0x01fe:
            r2 = 4
            r0.zze = r2
            r0.zzj = r6
            return r5
        L_0x0204:
            long r1 = r28.zzf()
            r3 = 12
            long r1 = r1 + r3
            r0.zzj = r1
            r0.zze = r9
            return r5
        L_0x0210:
            long r1 = r28.zzf()
            com.google.android.gms.internal.ads.zzaed r3 = r0.zzb
            int r3 = r3.zzb
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r16
            r0.zzj = r1
            return r5
        L_0x021f:
            int r2 = r0.zzl
            int r2 = r2 + -4
            com.google.android.gms.internal.ads.zzdy r3 = new com.google.android.gms.internal.ads.zzdy
            r3.<init>((int) r2)
            byte[] r6 = r3.zzN()
            r1.zzi(r6, r5, r2)
            com.google.android.gms.internal.ads.zzaej r1 = com.google.android.gms.internal.ads.zzaej.zzc(r9, r3)
            int r2 = r1.zza()
            if (r2 != r9) goto L_0x032f
            java.lang.Class<com.google.android.gms.internal.ads.zzaeg> r2 = com.google.android.gms.internal.ads.zzaeg.class
            com.google.android.gms.internal.ads.zzaeb r2 = r1.zzb(r2)
            com.google.android.gms.internal.ads.zzaeg r2 = (com.google.android.gms.internal.ads.zzaeg) r2
            if (r2 == 0) goto L_0x0327
            r0.zzg = r2
            int r3 = r2.zzc
            int r2 = r2.zza
            long r6 = (long) r3
            long r2 = (long) r2
            long r6 = r6 * r2
            r0.zzh = r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.internal.ads.zzfxn r1 = r1.zza
            int r3 = r1.size()
            r6 = 0
            r14 = 0
        L_0x025c:
            if (r6 >= r3) goto L_0x0314
            java.lang.Object r7 = r1.get(r6)
            com.google.android.gms.internal.ads.zzaeb r7 = (com.google.android.gms.internal.ads.zzaeb) r7
            int r9 = r7.zza()
            r10 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r9 != r10) goto L_0x030a
            com.google.android.gms.internal.ads.zzaej r7 = (com.google.android.gms.internal.ads.zzaej) r7
            int r9 = r14 + 1
            java.lang.Class<com.google.android.gms.internal.ads.zzaeh> r10 = com.google.android.gms.internal.ads.zzaeh.class
            com.google.android.gms.internal.ads.zzaeb r10 = r7.zzb(r10)
            com.google.android.gms.internal.ads.zzaeh r10 = (com.google.android.gms.internal.ads.zzaeh) r10
            java.lang.Class<com.google.android.gms.internal.ads.zzaek> r13 = com.google.android.gms.internal.ads.zzaek.class
            com.google.android.gms.internal.ads.zzaeb r13 = r7.zzb(r13)
            com.google.android.gms.internal.ads.zzaek r13 = (com.google.android.gms.internal.ads.zzaek) r13
            java.lang.String r15 = "AviExtractor"
            if (r10 != 0) goto L_0x028f
            java.lang.String r7 = "Missing Stream Header"
            com.google.android.gms.internal.ads.zzdo.zzf(r15, r7)
        L_0x028a:
            r28 = r6
            r11 = r8
            goto L_0x0303
        L_0x028f:
            if (r13 != 0) goto L_0x0297
            java.lang.String r7 = "Missing Stream Format"
            com.google.android.gms.internal.ads.zzdo.zzf(r15, r7)
            goto L_0x028a
        L_0x0297:
            int r15 = r10.zzd
            int r8 = r10.zzb
            int r12 = r10.zzc
            com.google.android.gms.internal.ads.zzab r13 = r13.zza
            r28 = r6
            long r5 = (long) r8
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r22 = r5 * r16
            long r5 = (long) r12
            java.math.RoundingMode r26 = java.math.RoundingMode.DOWN
            long r11 = (long) r15
            r20 = r11
            r24 = r5
            long r5 = com.google.android.gms.internal.ads.zzei.zzu(r20, r22, r24, r26)
            com.google.android.gms.internal.ads.zzz r11 = r13.zzb()
            r11.zzL(r14)
            int r12 = r10.zze
            if (r12 == 0) goto L_0x02c1
            r11.zzR(r12)
        L_0x02c1:
            java.lang.Class<com.google.android.gms.internal.ads.zzael> r12 = com.google.android.gms.internal.ads.zzael.class
            com.google.android.gms.internal.ads.zzaeb r7 = r7.zzb(r12)
            com.google.android.gms.internal.ads.zzael r7 = (com.google.android.gms.internal.ads.zzael) r7
            if (r7 == 0) goto L_0x02d0
            java.lang.String r7 = r7.zza
            r11.zzO(r7)
        L_0x02d0:
            java.lang.String r7 = r13.zzo
            int r7 = com.google.android.gms.internal.ads.zzbb.zzb(r7)
            if (r7 == r4) goto L_0x02df
            r8 = 2
            if (r7 != r8) goto L_0x02dd
            r15 = 2
            goto L_0x02e0
        L_0x02dd:
            r11 = 0
            goto L_0x0303
        L_0x02df:
            r15 = r7
        L_0x02e0:
            com.google.android.gms.internal.ads.zzacq r7 = r0.zzf
            com.google.android.gms.internal.ads.zzadt r7 = r7.zzw(r14, r15)
            com.google.android.gms.internal.ads.zzab r11 = r11.zzag()
            r7.zzm(r11)
            int r10 = r10.zzd
            com.google.android.gms.internal.ads.zzaei r11 = new com.google.android.gms.internal.ads.zzaei
            r13 = r11
            r16 = r5
            r18 = r10
            r19 = r7
            r13.<init>(r14, r15, r16, r18, r19)
            long r12 = r0.zzh
            long r5 = java.lang.Math.max(r12, r5)
            r0.zzh = r5
        L_0x0303:
            if (r11 == 0) goto L_0x0308
            r2.add(r11)
        L_0x0308:
            r14 = r9
            goto L_0x030c
        L_0x030a:
            r28 = r6
        L_0x030c:
            int r6 = r28 + 1
            r5 = 0
            r8 = 0
            r11 = 2
            r12 = 3
            goto L_0x025c
        L_0x0314:
            com.google.android.gms.internal.ads.zzaei[] r1 = new com.google.android.gms.internal.ads.zzaei[r5]
            java.lang.Object[] r1 = r2.toArray(r1)
            com.google.android.gms.internal.ads.zzaei[] r1 = (com.google.android.gms.internal.ads.zzaei[]) r1
            r0.zzi = r1
            com.google.android.gms.internal.ads.zzacq r1 = r0.zzf
            r1.zzD()
            r1 = 3
            r0.zze = r1
            return r5
        L_0x0327:
            java.lang.String r1 = "AviHeader not found"
            r2 = 0
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        L_0x032f:
            r2 = r8
            int r1 = r1.zza()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected header list type "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        L_0x0347:
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            byte[] r2 = r2.zzN()
            r4 = 0
            r1.zzi(r2, r4, r3)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zza
            r1.zzL(r4)
            com.google.android.gms.internal.ads.zzaed r1 = r0.zzb
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            r1.zza(r2)
            int r3 = r1.zza
            if (r3 != r10) goto L_0x038a
            int r2 = r2.zzi()
            r1.zzc = r2
            com.google.android.gms.internal.ads.zzaed r1 = r0.zzb
            int r2 = r1.zzc
            if (r2 != r9) goto L_0x0376
            int r1 = r1.zzb
            r0.zzl = r1
            r1 = 2
            r0.zze = r1
        L_0x0374:
            r1 = 0
            return r1
        L_0x0376:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "hdrl expected, found: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        L_0x038a:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "LIST expected, found: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        L_0x039e:
            r2 = r8
            boolean r5 = r27.zzi(r28)
            if (r5 == 0) goto L_0x03ab
            r1.zzk(r3)
            r0.zze = r4
            goto L_0x0374
        L_0x03ab:
            java.lang.String r1 = "AVI Header List not found"
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaef.zzb(com.google.android.gms.internal.ads.zzaco, com.google.android.gms.internal.ads.zzadj):int");
    }
}
