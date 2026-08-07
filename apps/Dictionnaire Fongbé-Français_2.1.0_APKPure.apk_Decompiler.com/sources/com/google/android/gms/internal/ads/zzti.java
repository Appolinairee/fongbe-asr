package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzti implements zzuz {
    private final zzacs zza;
    private zzacn zzb;
    private zzaco zzc;

    public zzti(zzacs zzacs) {
        this.zza = zzacs;
    }

    public final int zza(zzadj zzadj) throws IOException {
        zzacn zzacn = this.zzb;
        zzacn.getClass();
        zzacn zzacn2 = zzacn;
        zzaco zzaco = this.zzc;
        zzaco.getClass();
        zzaco zzaco2 = zzaco;
        return zzacn.zzb(zzaco, zzadj);
    }

    public final long zzb() {
        zzaco zzaco = this.zzc;
        if (zzaco != null) {
            return zzaco.zzf();
        }
        return -1;
    }

    public final void zzc() {
        zzacn zzacn = this.zzb;
        if (zzacn != null && (zzacn instanceof zzahs)) {
            ((zzahs) zzacn).zza();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r0.zzf() != r11) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        if (r0.zzf() != r11) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.gms.internal.ads.zzl r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzacq r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzacc r6 = new com.google.android.gms.internal.ads.zzacc
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzacn r8 = r7.zzb
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.android.gms.internal.ads.zzacs r8 = r7.zza
            com.google.android.gms.internal.ads.zzacn[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzfxk r13 = com.google.android.gms.internal.ads.zzfxn.zzi(r10)
            r14 = 0
            r0 = 1
            if (r10 != r0) goto L_0x0024
            r8 = r8[r14]
            r7.zzb = r8
            goto L_0x008a
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 >= r10) goto L_0x0086
            r2 = r8[r1]
            boolean r3 = r2.zzi(r6)     // Catch:{ EOFException -> 0x006c, all -> 0x0057 }
            if (r3 == 0) goto L_0x0043
            r7.zzb = r2     // Catch:{ EOFException -> 0x006c, all -> 0x0057 }
            if (r2 != 0) goto L_0x003b
            long r1 = r6.zzf()
            int r10 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x003c
        L_0x003b:
            r14 = 1
        L_0x003c:
            com.google.android.gms.internal.ads.zzcw.zzf(r14)
            r6.zzj()
            goto L_0x0086
        L_0x0043:
            java.util.List r2 = r2.zzd()     // Catch:{ EOFException -> 0x006c, all -> 0x0057 }
            r13.zzh(r2)     // Catch:{ EOFException -> 0x006c, all -> 0x0057 }
            com.google.android.gms.internal.ads.zzacn r2 = r7.zzb
            if (r2 != 0) goto L_0x007c
            long r2 = r6.zzf()
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x007a
            goto L_0x007c
        L_0x0057:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzacn r9 = r7.zzb
            if (r9 != 0) goto L_0x0064
            long r9 = r6.zzf()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0065
        L_0x0064:
            r14 = 1
        L_0x0065:
            com.google.android.gms.internal.ads.zzcw.zzf(r14)
            r6.zzj()
            throw r8
        L_0x006c:
            com.google.android.gms.internal.ads.zzacn r2 = r7.zzb
            if (r2 != 0) goto L_0x007c
            long r2 = r6.zzf()
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r2 = 0
            goto L_0x007d
        L_0x007c:
            r2 = 1
        L_0x007d:
            com.google.android.gms.internal.ads.zzcw.zzf(r2)
            r6.zzj()
            int r1 = r1 + 1
            goto L_0x0025
        L_0x0086:
            com.google.android.gms.internal.ads.zzacn r10 = r7.zzb
            if (r10 == 0) goto L_0x0090
        L_0x008a:
            com.google.android.gms.internal.ads.zzacn r8 = r7.zzb
            r8.zze(r15)
            return
        L_0x0090:
            com.google.android.gms.internal.ads.zzwk r10 = new com.google.android.gms.internal.ads.zzwk
            java.lang.String r11 = ", "
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.ads.zzfxn r8 = com.google.android.gms.internal.ads.zzfxn.zzm(r8)
            com.google.android.gms.internal.ads.zzth r12 = new com.google.android.gms.internal.ads.zzth
            r12.<init>()
            java.util.List r8 = com.google.android.gms.internal.ads.zzfyd.zzb(r8, r12)
            java.util.Iterator r8 = r8.iterator()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            com.google.android.gms.internal.ads.zzfuf.zzc(r12, r8, r11)
            java.lang.String r8 = r12.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r11 = r9
            android.net.Uri r11 = (android.net.Uri) r11
            com.google.android.gms.internal.ads.zzfxn r11 = r13.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzti.zzd(com.google.android.gms.internal.ads.zzl, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzacq):void");
    }

    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    public final void zzf(long j, long j2) {
        zzacn zzacn = this.zzb;
        zzacn.getClass();
        zzacn zzacn2 = zzacn;
        zzacn.zzf(j, j2);
    }
}
