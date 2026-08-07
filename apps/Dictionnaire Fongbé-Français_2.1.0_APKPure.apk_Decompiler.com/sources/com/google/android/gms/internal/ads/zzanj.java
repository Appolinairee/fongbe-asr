package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzanj implements zzacn {
    private final zzef zza = new zzef(0);
    private final SparseArray zzb = new SparseArray();
    private final zzdy zzc = new zzdy(4096);
    private final zzanh zzd = new zzanh();
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private zzang zzi;
    private zzacq zzj;
    private boolean zzk;

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzaco r17, com.google.android.gms.internal.ads.zzadj r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            com.google.android.gms.internal.ads.zzacq r3 = r0.zzj
            com.google.android.gms.internal.ads.zzcw.zzb(r3)
            long r10 = r17.zzd()
            r12 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.zzanh r4 = r0.zzd
            boolean r5 = r4.zze()
            if (r5 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            int r1 = r4.zza(r1, r2)
            return r1
        L_0x0023:
            boolean r4 = r0.zzk
            r14 = 1
            if (r4 != 0) goto L_0x0064
            r0.zzk = r14
            com.google.android.gms.internal.ads.zzanh r4 = r0.zzd
            long r5 = r4.zzb()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.zzang r15 = new com.google.android.gms.internal.ads.zzang
            com.google.android.gms.internal.ads.zzef r5 = r4.zzd()
            long r6 = r4.zzb()
            r4 = r15
            r8 = r10
            r4.<init>(r5, r6, r8)
            r0.zzi = r15
            com.google.android.gms.internal.ads.zzacq r4 = r0.zzj
            com.google.android.gms.internal.ads.zzadm r5 = r15.zzb()
            r4.zzO(r5)
            goto L_0x0064
        L_0x0054:
            com.google.android.gms.internal.ads.zzacq r5 = r0.zzj
            com.google.android.gms.internal.ads.zzadl r6 = new com.google.android.gms.internal.ads.zzadl
            long r7 = r4.zzb()
            r14 = 0
            r6.<init>(r7, r14)
            r5.zzO(r6)
        L_0x0064:
            com.google.android.gms.internal.ads.zzang r5 = r0.zzi
            if (r5 == 0) goto L_0x0074
            boolean r6 = r5.zze()
            if (r6 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            int r1 = r5.zza(r1, r2)
            return r1
        L_0x0074:
            r17.zzj()
            if (r3 == 0) goto L_0x007f
            long r2 = r17.zze()
            long r10 = r10 - r2
            goto L_0x0080
        L_0x007f:
            r10 = r12
        L_0x0080:
            r2 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x008d
            r5 = 4
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            return r2
        L_0x008d:
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzc
            byte[] r3 = r3.zzN()
            r5 = 4
            r6 = 0
            r4 = 1
            boolean r3 = r1.zzm(r3, r6, r5, r4)
            if (r3 != 0) goto L_0x009d
            return r2
        L_0x009d:
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzc
            r3.zzL(r6)
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzc
            int r3 = r3.zzg()
            r5 = 441(0x1b9, float:6.18E-43)
            if (r3 != r5) goto L_0x00ad
            return r2
        L_0x00ad:
            r2 = 442(0x1ba, float:6.2E-43)
            if (r3 != r2) goto L_0x00d1
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            byte[] r2 = r2.zzN()
            r3 = 10
            r1.zzh(r2, r6, r3)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            r3 = 9
            r2.zzL(r3)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            int r2 = r2.zzm()
            r2 = r2 & 7
            int r2 = r2 + 14
            r1.zzk(r2)
            return r6
        L_0x00d1:
            r2 = 443(0x1bb, float:6.21E-43)
            r5 = 2
            r7 = 6
            if (r3 != r2) goto L_0x00f0
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            byte[] r2 = r2.zzN()
            r1.zzh(r2, r6, r5)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            r2.zzL(r6)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            int r2 = r2.zzq()
            int r2 = r2 + r7
            r1.zzk(r2)
            return r6
        L_0x00f0:
            int r2 = r3 >> 8
            r4 = 1
            if (r2 == r4) goto L_0x00f9
            r1.zzk(r4)
            return r6
        L_0x00f9:
            r2 = r3 & 255(0xff, float:3.57E-43)
            android.util.SparseArray r8 = r0.zzb
            java.lang.Object r8 = r8.get(r2)
            com.google.android.gms.internal.ads.zzani r8 = (com.google.android.gms.internal.ads.zzani) r8
            boolean r9 = r0.zze
            if (r9 != 0) goto L_0x0183
            if (r8 != 0) goto L_0x0163
            r9 = 189(0xbd, float:2.65E-43)
            r10 = 0
            if (r2 != r9) goto L_0x011e
            com.google.android.gms.internal.ads.zzamb r3 = new com.google.android.gms.internal.ads.zzamb
            r3.<init>(r10, r6)
            r4 = 1
            r0.zzf = r4
            long r9 = r17.zzf()
            r0.zzh = r9
        L_0x011c:
            r10 = r3
            goto L_0x0147
        L_0x011e:
            r4 = 1
            r9 = r3 & 224(0xe0, float:3.14E-43)
            r11 = 192(0xc0, float:2.69E-43)
            if (r9 != r11) goto L_0x0133
            com.google.android.gms.internal.ads.zzamv r3 = new com.google.android.gms.internal.ads.zzamv
            r3.<init>(r10, r6)
            r0.zzf = r4
            long r9 = r17.zzf()
            r0.zzh = r9
            goto L_0x011c
        L_0x0133:
            r3 = r3 & 240(0xf0, float:3.36E-43)
            r9 = 224(0xe0, float:3.14E-43)
            if (r3 != r9) goto L_0x0147
            com.google.android.gms.internal.ads.zzaml r3 = new com.google.android.gms.internal.ads.zzaml
            r3.<init>(r10)
            r0.zzg = r4
            long r9 = r17.zzf()
            r0.zzh = r9
            goto L_0x011c
        L_0x0147:
            if (r10 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.zzanx r3 = new com.google.android.gms.internal.ads.zzanx
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 256(0x100, float:3.59E-43)
            r3.<init>(r8, r2, r9)
            com.google.android.gms.internal.ads.zzacq r8 = r0.zzj
            r10.zzb(r8, r3)
            com.google.android.gms.internal.ads.zzef r3 = r0.zza
            com.google.android.gms.internal.ads.zzani r8 = new com.google.android.gms.internal.ads.zzani
            r8.<init>(r10, r3)
            android.util.SparseArray r3 = r0.zzb
            r3.put(r2, r8)
        L_0x0163:
            boolean r2 = r0.zzf
            r9 = 1048576(0x100000, double:5.180654E-318)
            if (r2 == 0) goto L_0x0173
            boolean r2 = r0.zzg
            if (r2 == 0) goto L_0x0173
            long r2 = r0.zzh
            r9 = 8192(0x2000, double:4.0474E-320)
            long r9 = r9 + r2
        L_0x0173:
            long r2 = r17.zzf()
            int r11 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0183
            r2 = 1
            r0.zze = r2
            com.google.android.gms.internal.ads.zzacq r2 = r0.zzj
            r2.zzD()
        L_0x0183:
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            byte[] r2 = r2.zzN()
            r1.zzh(r2, r6, r5)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            r2.zzL(r6)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zzc
            int r2 = r2.zzq()
            int r2 = r2 + r7
            if (r8 != 0) goto L_0x019e
            r1.zzk(r2)
            goto L_0x01bf
        L_0x019e:
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzc
            r3.zzI(r2)
            com.google.android.gms.internal.ads.zzdy r3 = r0.zzc
            byte[] r3 = r3.zzN()
            r1.zzi(r3, r6, r2)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zzc
            r1.zzL(r7)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zzc
            r8.zza(r1)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zzc
            int r2 = r1.zzc()
            r1.zzK(r2)
        L_0x01bf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanj.zzb(com.google.android.gms.internal.ads.zzaco, com.google.android.gms.internal.ads.zzadj):int");
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zzj = zzacq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r0 != r7) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034 A[LOOP:0: B:12:0x002c->B:14:0x0034, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzef r5 = r4.zza
            long r0 = r5.zzf()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0021
            long r0 = r5.zzd()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
        L_0x0021:
            r5.zzi(r7)
        L_0x0024:
            com.google.android.gms.internal.ads.zzang r5 = r4.zzi
            r6 = 0
            if (r5 == 0) goto L_0x002c
            r5.zzd(r7)
        L_0x002c:
            android.util.SparseArray r5 = r4.zzb
            int r5 = r5.size()
            if (r6 >= r5) goto L_0x0042
            android.util.SparseArray r5 = r4.zzb
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzani r5 = (com.google.android.gms.internal.ads.zzani) r5
            r5.zzb()
            int r6 = r6 + 1
            goto L_0x002c
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanj.zzf(long, long):void");
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        byte[] bArr = new byte[14];
        zzacc zzacc = (zzacc) zzaco;
        zzacc.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzacc.zzl(bArr[13] & 7, false);
        zzacc.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
