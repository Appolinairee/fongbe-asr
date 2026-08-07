package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzafb implements zzacn {
    private final zzdy zza = new zzdy(6);
    private zzacq zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf = -1;
    private zzagv zzg;
    private zzaco zzh;
    private zzafe zzi;
    private zzaiv zzj;

    private final int zza(zzaco zzaco) throws IOException {
        this.zza.zzI(2);
        ((zzacc) zzaco).zzm(this.zza.zzN(), 0, 2, false);
        return this.zza.zzq();
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzaco r24, com.google.android.gms.internal.ads.zzadj r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.zzc
            r4 = 4
            r5 = -1
            r7 = 2
            r8 = 1
            r9 = 0
            if (r3 == 0) goto L_0x01bb
            if (r3 == r8) goto L_0x019f
            r10 = -1
            if (r3 == r7) goto L_0x00e2
            r5 = 5
            if (r3 == r4) goto L_0x004f
            if (r3 == r5) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            com.google.android.gms.internal.ads.zzafe r3 = r0.zzi
            if (r3 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzaco r3 = r0.zzh
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzafe r3 = new com.google.android.gms.internal.ads.zzafe
            long r4 = r0.zzf
            r3.<init>(r1, r4)
            r0.zzi = r3
        L_0x0037:
            com.google.android.gms.internal.ads.zzaiv r1 = r0.zzj
            r1.getClass()
            r3 = r1
            com.google.android.gms.internal.ads.zzaiv r3 = (com.google.android.gms.internal.ads.zzaiv) r3
            com.google.android.gms.internal.ads.zzafe r3 = r0.zzi
            int r1 = r1.zzb(r3, r2)
            if (r1 != r8) goto L_0x004e
            long r3 = r2.zza
            long r5 = r0.zzf
            long r3 = r3 + r5
            r2.zza = r3
        L_0x004e:
            return r1
        L_0x004f:
            long r6 = r24.zzf()
            long r10 = r0.zzf
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00df
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            byte[] r2 = r2.zzN()
            boolean r2 = r1.zzm(r2, r9, r8, r8)
            if (r2 != 0) goto L_0x0069
            r23.zzg()
            goto L_0x00de
        L_0x0069:
            r24.zzj()
            com.google.android.gms.internal.ads.zzaiv r2 = r0.zzj
            if (r2 != 0) goto L_0x007b
            com.google.android.gms.internal.ads.zzaiv r2 = new com.google.android.gms.internal.ads.zzaiv
            com.google.android.gms.internal.ads.zzakd r3 = com.google.android.gms.internal.ads.zzakd.zza
            r6 = 8
            r2.<init>(r3, r6)
            r0.zzj = r2
        L_0x007b:
            com.google.android.gms.internal.ads.zzafe r2 = new com.google.android.gms.internal.ads.zzafe
            long r6 = r0.zzf
            r2.<init>(r1, r6)
            r0.zzi = r2
            com.google.android.gms.internal.ads.zzaiv r1 = r0.zzj
            boolean r1 = r1.zzi(r2)
            if (r1 == 0) goto L_0x00db
            com.google.android.gms.internal.ads.zzaiv r1 = r0.zzj
            com.google.android.gms.internal.ads.zzafg r2 = new com.google.android.gms.internal.ads.zzafg
            long r6 = r0.zzf
            com.google.android.gms.internal.ads.zzacq r3 = r0.zzb
            r3.getClass()
            r10 = r3
            com.google.android.gms.internal.ads.zzacq r10 = (com.google.android.gms.internal.ads.zzacq) r10
            r2.<init>(r6, r3)
            r1.zze(r2)
            com.google.android.gms.internal.ads.zzagv r1 = r0.zzg
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzagv r2 = (com.google.android.gms.internal.ads.zzagv) r2
            com.google.android.gms.internal.ads.zzacq r2 = r0.zzb
            r2.getClass()
            r3 = r2
            com.google.android.gms.internal.ads.zzacq r3 = (com.google.android.gms.internal.ads.zzacq) r3
            r3 = 1024(0x400, float:1.435E-42)
            com.google.android.gms.internal.ads.zzadt r2 = r2.zzw(r3, r4)
            com.google.android.gms.internal.ads.zzz r3 = new com.google.android.gms.internal.ads.zzz
            r3.<init>()
            java.lang.String r4 = "image/jpeg"
            r3.zzC(r4)
            com.google.android.gms.internal.ads.zzay r4 = new com.google.android.gms.internal.ads.zzay
            com.google.android.gms.internal.ads.zzax[] r6 = new com.google.android.gms.internal.ads.zzax[r8]
            r6[r9] = r1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.<init>(r7, r6)
            r3.zzT(r4)
            com.google.android.gms.internal.ads.zzab r1 = r3.zzag()
            r2.zzm(r1)
            r0.zzc = r5
            goto L_0x00de
        L_0x00db:
            r23.zzg()
        L_0x00de:
            return r9
        L_0x00df:
            r2.zza = r10
            return r8
        L_0x00e2:
            int r2 = r0.zzd
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0196
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            int r3 = r0.zze
            r2.<init>((int) r3)
            byte[] r3 = r2.zzN()
            int r4 = r0.zze
            r1.zzi(r3, r9, r4)
            com.google.android.gms.internal.ads.zzagv r3 = r0.zzg
            if (r3 != 0) goto L_0x019b
            java.lang.String r3 = r2.zzy(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x019b
            java.lang.String r2 = r2.zzy(r9)
            if (r2 == 0) goto L_0x019b
            long r3 = r24.zzd()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x011a
        L_0x0117:
            r1 = 0
            goto L_0x018d
        L_0x011a:
            com.google.android.gms.internal.ads.zzafd r2 = com.google.android.gms.internal.ads.zzafh.zza(r2)
            if (r2 != 0) goto L_0x0121
            goto L_0x0117
        L_0x0121:
            java.util.List r8 = r2.zzb
            int r8 = r8.size()
            if (r8 >= r7) goto L_0x012a
            goto L_0x0117
        L_0x012a:
            java.util.List r7 = r2.zzb
            int r7 = r7.size()
            int r7 = r7 + r10
            r11 = r5
            r13 = r11
            r17 = r13
            r19 = r17
            r8 = 0
        L_0x0138:
            if (r7 < 0) goto L_0x0172
            java.util.List r10 = r2.zzb
            java.lang.Object r10 = r10.get(r7)
            com.google.android.gms.internal.ads.zzafc r10 = (com.google.android.gms.internal.ads.zzafc) r10
            java.lang.String r15 = r10.zza
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r15)
            r1 = r1 | r8
            if (r7 != 0) goto L_0x0153
            long r9 = r10.zzc
            long r3 = r3 - r9
            r8 = 0
            goto L_0x0157
        L_0x0153:
            long r8 = r10.zzb
            long r8 = r3 - r8
        L_0x0157:
            r21 = r3
            r3 = r8
            r8 = r21
            if (r1 == 0) goto L_0x0167
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0167
            long r19 = r8 - r3
            r17 = r3
            r1 = 0
        L_0x0167:
            if (r7 != 0) goto L_0x016a
            r13 = r8
        L_0x016a:
            if (r7 != 0) goto L_0x016d
            r11 = r3
        L_0x016d:
            int r7 = r7 + -1
            r8 = r1
            r9 = 0
            goto L_0x0138
        L_0x0172:
            int r1 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0117
            int r1 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0117
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0117
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0183
            goto L_0x0117
        L_0x0183:
            long r1 = r2.zza
            com.google.android.gms.internal.ads.zzagv r3 = new com.google.android.gms.internal.ads.zzagv
            r10 = r3
            r15 = r1
            r10.<init>(r11, r13, r15, r17, r19)
            r1 = r3
        L_0x018d:
            r0.zzg = r1
            if (r1 == 0) goto L_0x019b
            long r1 = r1.zzd
            r0.zzf = r1
            goto L_0x019b
        L_0x0196:
            int r2 = r0.zze
            r1.zzk(r2)
        L_0x019b:
            r2 = 0
            r0.zzc = r2
            return r2
        L_0x019f:
            r2 = 0
            com.google.android.gms.internal.ads.zzdy r3 = r0.zza
            r3.zzI(r7)
            com.google.android.gms.internal.ads.zzdy r3 = r0.zza
            byte[] r3 = r3.zzN()
            r1.zzi(r3, r2, r7)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zza
            int r1 = r1.zzq()
            int r1 = r1 + -2
            r0.zze = r1
            r0.zzc = r7
            return r2
        L_0x01bb:
            r2 = 0
            com.google.android.gms.internal.ads.zzdy r3 = r0.zza
            r3.zzI(r7)
            com.google.android.gms.internal.ads.zzdy r3 = r0.zza
            byte[] r3 = r3.zzN()
            r1.zzi(r3, r2, r7)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zza
            int r1 = r1.zzq()
            r0.zzd = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01e4
            long r1 = r0.zzf
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x01e0
            r0.zzc = r4
            goto L_0x01f5
        L_0x01e0:
            r23.zzg()
            goto L_0x01f5
        L_0x01e4:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01ee
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01f5
        L_0x01ee:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01f5
            r0.zzc = r8
        L_0x01f5:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafb.zzb(com.google.android.gms.internal.ads.zzaco, com.google.android.gms.internal.ads.zzadj):int");
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zzb = zzacq;
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        if (zza(zzaco) != 65496) {
            return false;
        }
        int zza2 = zza(zzaco);
        this.zzd = zza2;
        if (zza2 == 65504) {
            this.zza.zzI(2);
            zzacc zzacc = (zzacc) zzaco;
            zzacc.zzm(this.zza.zzN(), 0, 2, false);
            zzacc.zzl(this.zza.zzq() - 2, false);
            zza2 = zza(zzaco);
            this.zzd = zza2;
        }
        if (zza2 == 65505) {
            zzacc zzacc2 = (zzacc) zzaco;
            zzacc2.zzl(2, false);
            this.zza.zzI(6);
            zzacc2.zzm(this.zza.zzN(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzf(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaiv zzaiv = this.zzj;
            zzaiv.getClass();
            zzaiv zzaiv2 = zzaiv;
            zzaiv.zzf(j, j2);
        }
    }

    private final void zzg() {
        zzacq zzacq = this.zzb;
        zzacq.getClass();
        zzacq zzacq2 = zzacq;
        zzacq.zzD();
        this.zzb.zzO(new zzadl(-9223372036854775807L, 0));
        this.zzc = 6;
    }
}
