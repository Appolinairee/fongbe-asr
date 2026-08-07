package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzamc implements zzacn {
    private final zzamd zza = new zzamd((String) null, 0);
    private final zzdy zzb = new zzdy(16384);
    private boolean zzc;

    public final int zzb(zzaco zzaco, zzadj zzadj) throws IOException {
        int zza2 = zzaco.zza(this.zzb.zzN(), 0, 16384);
        if (zza2 == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(zza2);
        if (!this.zzc) {
            this.zza.zzd(0, 4);
            this.zzc = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zza.zzb(zzacq, new zzanx(Integer.MIN_VALUE, 0, 1));
        zzacq.zzD();
        zzacq.zzO(new zzadl(-9223372036854775807L, 0));
    }

    public final void zzf(long j, long j2) {
        this.zzc = false;
        this.zza.zze();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        r16.zzj();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        if ((r4 - r3) >= 8192) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco r16) throws java.io.IOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.zzdy r0 = new com.google.android.gms.internal.ads.zzdy
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.zzN()
            r5 = r16
            com.google.android.gms.internal.ads.zzacc r5 = (com.google.android.gms.internal.ads.zzacc) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzL(r2)
            int r4 = r0.zzo()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x009a
            r16.zzj()
            r5.zzl(r3, r2)
            r4 = r3
        L_0x0028:
            r1 = 0
        L_0x0029:
            byte[] r6 = r0.zzN()
            r8 = 7
            r5.zzm(r6, r2, r8, r2)
            r0.zzL(r2)
            int r6 = r0.zzq()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L_0x0052
            if (r6 == r10) goto L_0x0052
            r16.zzj()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x0051
            r5.zzl(r4, r2)
            goto L_0x0028
        L_0x0051:
            return r2
        L_0x0052:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L_0x0058
            return r9
        L_0x0058:
            byte[] r9 = r0.zzN()
            int r12 = com.google.android.gms.internal.ads.zzabq.zza
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L_0x0064
            r12 = -1
            goto L_0x0091
        L_0x0064:
            r12 = 2
            byte r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r14 = r9[r7]
            int r12 = r12 << 8
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L_0x008b
            byte r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 5
            byte r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            int r12 = r12 << 8
            r14 = 6
            byte r9 = r9[r14]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r11 = r11 | r12
            r12 = r11 | r9
            goto L_0x008c
        L_0x008b:
            r8 = 4
        L_0x008c:
            if (r6 != r10) goto L_0x0090
            int r8 = r8 + 2
        L_0x0090:
            int r12 = r12 + r8
        L_0x0091:
            if (r12 != r13) goto L_0x0094
            return r2
        L_0x0094:
            int r12 = r12 + -7
            r5.zzl(r12, r2)
            goto L_0x0029
        L_0x009a:
            r0.zzM(r7)
            int r4 = r0.zzl()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamc.zzi(com.google.android.gms.internal.ads.zzaco):boolean");
    }
}
