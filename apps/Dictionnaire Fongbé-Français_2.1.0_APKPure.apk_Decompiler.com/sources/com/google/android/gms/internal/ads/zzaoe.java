package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaoe implements zzacn {
    private zzacq zza;
    private zzadt zzb;
    private int zzc = 0;
    private long zzd = -1;
    private zzaoc zze;
    private int zzf = -1;
    private long zzg = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ec, code lost:
        if (r1 != 65534) goto L_0x00ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(com.google.android.gms.internal.ads.zzaco r19, com.google.android.gms.internal.ads.zzadj r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.gms.internal.ads.zzadt r2 = r0.zzb
            com.google.android.gms.internal.ads.zzcw.zzb(r2)
            int r2 = com.google.android.gms.internal.ads.zzei.zza
            int r2 = r0.zzc
            r3 = -1
            r4 = 4
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0157
            r7 = 2
            r8 = -1
            if (r2 == r5) goto L_0x0124
            r10 = 3
            if (r2 == r7) goto L_0x00a5
            if (r2 == r10) goto L_0x003f
            long r10 = r0.zzg
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzcw.zzf(r5)
            long r4 = r0.zzg
            long r7 = r19.zzf()
            long r4 = r4 - r7
            com.google.android.gms.internal.ads.zzaoc r2 = r0.zze
            r2.getClass()
            r7 = r2
            com.google.android.gms.internal.ads.zzaoc r7 = (com.google.android.gms.internal.ads.zzaoc) r7
            boolean r1 = r2.zzc(r1, r4)
            if (r1 == 0) goto L_0x003e
            return r3
        L_0x003e:
            return r6
        L_0x003f:
            android.util.Pair r2 = com.google.android.gms.internal.ads.zzaoh.zza(r19)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = r3.intValue()
            r0.zzf = r3
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r10 = r0.zzd
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0065
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0065
            r2 = r10
        L_0x0065:
            int r5 = r0.zzf
            long r10 = (long) r5
            long r10 = r10 + r2
            r0.zzg = r10
            long r1 = r19.zzd()
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0095
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0095
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Data exceeds input length: "
            r3.<init>(r5)
            r3.append(r10)
            java.lang.String r5 = ", "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "WavExtractor"
            com.google.android.gms.internal.ads.zzdo.zzf(r5, r3)
            r0.zzg = r1
            r10 = r1
        L_0x0095:
            com.google.android.gms.internal.ads.zzaoc r1 = r0.zze
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzaoc r2 = (com.google.android.gms.internal.ads.zzaoc) r2
            int r2 = r0.zzf
            r1.zza(r2, r10)
            r0.zzc = r4
            return r6
        L_0x00a5:
            com.google.android.gms.internal.ads.zzaof r15 = com.google.android.gms.internal.ads.zzaoh.zzb(r19)
            int r1 = r15.zza
            r2 = 17
            if (r1 != r2) goto L_0x00bb
            com.google.android.gms.internal.ads.zzaob r1 = new com.google.android.gms.internal.ads.zzaob
            com.google.android.gms.internal.ads.zzacq r2 = r0.zza
            com.google.android.gms.internal.ads.zzadt r3 = r0.zzb
            r1.<init>(r2, r3, r15)
            r0.zze = r1
            goto L_0x010e
        L_0x00bb:
            r2 = 6
            if (r1 != r2) goto L_0x00cf
            com.google.android.gms.internal.ads.zzaod r1 = new com.google.android.gms.internal.ads.zzaod
            com.google.android.gms.internal.ads.zzacq r13 = r0.zza
            com.google.android.gms.internal.ads.zzadt r14 = r0.zzb
            java.lang.String r16 = "audio/g711-alaw"
            r17 = -1
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zze = r1
            goto L_0x010e
        L_0x00cf:
            r2 = 7
            if (r1 != r2) goto L_0x00e3
            com.google.android.gms.internal.ads.zzaod r1 = new com.google.android.gms.internal.ads.zzaod
            com.google.android.gms.internal.ads.zzacq r13 = r0.zza
            com.google.android.gms.internal.ads.zzadt r14 = r0.zzb
            java.lang.String r16 = "audio/g711-mlaw"
            r17 = -1
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zze = r1
            goto L_0x010e
        L_0x00e3:
            int r2 = r15.zze
            if (r1 == r5) goto L_0x00f8
            if (r1 == r10) goto L_0x00f1
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r3) goto L_0x00f8
        L_0x00ee:
            r17 = 0
            goto L_0x00fe
        L_0x00f1:
            r3 = 32
            if (r2 != r3) goto L_0x00ee
            r17 = 4
            goto L_0x00fe
        L_0x00f8:
            int r4 = com.google.android.gms.internal.ads.zzei.zzn(r2)
            r17 = r4
        L_0x00fe:
            if (r17 == 0) goto L_0x0111
            com.google.android.gms.internal.ads.zzaod r1 = new com.google.android.gms.internal.ads.zzaod
            com.google.android.gms.internal.ads.zzacq r13 = r0.zza
            com.google.android.gms.internal.ads.zzadt r14 = r0.zzb
            java.lang.String r16 = "audio/raw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zze = r1
        L_0x010e:
            r0.zzc = r10
            return r6
        L_0x0111:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported WAV format type: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zzc(r1)
            throw r1
        L_0x0124:
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            r3 = 8
            r2.<init>((int) r3)
            com.google.android.gms.internal.ads.zzaog r4 = com.google.android.gms.internal.ads.zzaog.zza(r1, r2)
            int r5 = r4.zza
            r10 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r10) goto L_0x013a
            r19.zzj()
            goto L_0x0152
        L_0x013a:
            r1.zzg(r3)
            r2.zzL(r6)
            byte[] r5 = r2.zzN()
            r1.zzh(r5, r6, r3)
            long r8 = r2.zzr()
            long r4 = r4.zzb
            int r2 = (int) r4
            int r2 = r2 + r3
            r1.zzk(r2)
        L_0x0152:
            r0.zzd = r8
            r0.zzc = r7
            return r6
        L_0x0157:
            long r7 = r19.zzf()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0163
            r2 = 1
            goto L_0x0164
        L_0x0163:
            r2 = 0
        L_0x0164:
            com.google.android.gms.internal.ads.zzcw.zzf(r2)
            int r2 = r0.zzf
            if (r2 == r3) goto L_0x0171
            r1.zzk(r2)
            r0.zzc = r4
            goto L_0x0186
        L_0x0171:
            boolean r2 = com.google.android.gms.internal.ads.zzaoh.zzc(r19)
            if (r2 == 0) goto L_0x0187
            long r2 = r19.zze()
            long r7 = r19.zzf()
            long r2 = r2 - r7
            int r3 = (int) r2
            r1.zzk(r3)
            r0.zzc = r5
        L_0x0186:
            return r6
        L_0x0187:
            java.lang.String r1 = "Unsupported or unrecognized wav file type."
            r2 = 0
            com.google.android.gms.internal.ads.zzbc r1 = com.google.android.gms.internal.ads.zzbc.zza(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoe.zzb(com.google.android.gms.internal.ads.zzaco, com.google.android.gms.internal.ads.zzadj):int");
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zza = zzacq;
        this.zzb = zzacq.zzw(0, 1);
        zzacq.zzD();
    }

    public final void zzf(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzaoc zzaoc = this.zze;
        if (zzaoc != null) {
            zzaoc.zzb(j2);
        }
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        return zzaoh.zzc(zzaco);
    }
}
