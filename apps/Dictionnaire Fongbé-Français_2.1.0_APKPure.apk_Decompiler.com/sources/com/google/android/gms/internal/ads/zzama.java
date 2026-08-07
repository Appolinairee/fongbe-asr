package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzama implements zzacn {
    private final zzamb zza = new zzamb((String) null, 0);
    private final zzdy zzb = new zzdy(2786);
    private boolean zzc;

    public final int zzb(zzaco zzaco, zzadj zzadj) throws IOException {
        int zza2 = zzaco.zza(this.zzb.zzN(), 0, 2786);
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

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        r9.zzj();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
        if ((r4 - r3) >= 8192) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzdy r0 = new com.google.android.gms.internal.ads.zzdy
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.zzN()
            r5 = r9
            com.google.android.gms.internal.ads.zzacc r5 = (com.google.android.gms.internal.ads.zzacc) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzL(r2)
            int r4 = r0.zzo()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L_0x0062
            r9.zzj()
            r5.zzl(r3, r2)
            r4 = r3
        L_0x0026:
            r1 = 0
        L_0x0027:
            byte[] r6 = r0.zzN()
            r7 = 6
            r5.zzm(r6, r2, r7, r2)
            r0.zzL(r2)
            int r6 = r0.zzq()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L_0x004a
            r9.zzj()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x0049
            r5.zzl(r4, r2)
            goto L_0x0026
        L_0x0049:
            return r2
        L_0x004a:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0050
            return r6
        L_0x0050:
            byte[] r6 = r0.zzN()
            int r6 = com.google.android.gms.internal.ads.zzabn.zzb(r6)
            r7 = -1
            if (r6 != r7) goto L_0x005c
            return r2
        L_0x005c:
            int r6 = r6 + -6
            r5.zzl(r6, r2)
            goto L_0x0027
        L_0x0062:
            r4 = 3
            r0.zzM(r4)
            int r4 = r0.zzl()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzama.zzi(com.google.android.gms.internal.ads.zzaco):boolean");
    }
}
