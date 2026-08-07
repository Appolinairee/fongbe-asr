package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaji implements zzajo {
    private final zzajn zza;
    /* access modifiers changed from: private */
    public final long zzb;
    /* access modifiers changed from: private */
    public final long zzc;
    /* access modifiers changed from: private */
    public final zzajt zzd;
    private int zze;
    /* access modifiers changed from: private */
    public long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaji(zzajt zzajt, long j, long j2, long j3, long j4, boolean z) {
        zzcw.zzd(j >= 0 && j2 > j);
        this.zzd = zzajt;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzajn();
    }

    public final /* bridge */ /* synthetic */ zzadm zze() {
        if (this.zzf != 0) {
            return new zzajg(this, (zzajh) null);
        }
        return null;
    }

    public final void zzg(long j) {
        this.zzh = Math.max(0, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0;
        this.zzl = this.zzf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzd(com.google.android.gms.internal.ads.zzaco r23) throws java.io.IOException {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            int r2 = r0.zze
            r3 = 0
            r4 = 1
            r5 = 4
            r6 = -1
            if (r2 == 0) goto L_0x00e6
            if (r2 == r4) goto L_0x00f9
            r4 = 2
            r10 = 3
            if (r2 == r4) goto L_0x0016
            if (r2 == r10) goto L_0x00ae
            return r6
        L_0x0016:
            long r11 = r0.zzi
            long r13 = r0.zzj
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0021
        L_0x001e:
            r13 = r6
            goto L_0x00a6
        L_0x0021:
            long r11 = r23.zzf()
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            boolean r2 = r2.zzc(r1, r13)
            if (r2 != 0) goto L_0x003d
            long r13 = r0.zzi
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0035
            goto L_0x00a6
        L_0x0035:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x003d:
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            r2.zzb(r1, r3)
            r23.zzj()
            long r13 = r0.zzh
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            long r8 = r2.zzb
            long r13 = r13 - r8
            int r4 = r2.zzd
            int r2 = r2.zze
            int r4 = r4 + r2
            r15 = 0
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 < 0) goto L_0x005f
            r15 = 72000(0x11940, double:3.55727E-319)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x005f
            goto L_0x001e
        L_0x005f:
            if (r2 >= 0) goto L_0x0066
            r0.zzj = r11
            r0.zzl = r8
            goto L_0x0070
        L_0x0066:
            long r11 = (long) r4
            long r15 = r23.zzf()
            long r11 = r11 + r15
            r0.zzi = r11
            r0.zzk = r8
        L_0x0070:
            long r8 = r0.zzj
            long r11 = r0.zzi
            long r15 = r8 - r11
            r17 = 100000(0x186a0, double:4.94066E-319)
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0081
            r0.zzj = r11
            r13 = r11
            goto L_0x00a6
        L_0x0081:
            long r3 = (long) r4
            if (r2 > 0) goto L_0x0087
            r18 = 2
            goto L_0x0089
        L_0x0087:
            r18 = 1
        L_0x0089:
            long r20 = r23.zzf()
            long r3 = r3 * r18
            long r20 = r20 - r3
            long r13 = r13 * r15
            long r2 = r0.zzl
            r15 = r11
            long r10 = r0.zzk
            long r2 = r2 - r10
            long r13 = r13 / r2
            long r2 = r20 + r13
            long r8 = r8 + r6
            long r2 = java.lang.Math.min(r2, r8)
            r8 = r15
            long r13 = java.lang.Math.max(r8, r2)
        L_0x00a6:
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00ab
            return r13
        L_0x00ab:
            r2 = 3
            r0.zze = r2
        L_0x00ae:
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            r2.zzc(r1, r6)
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            r3 = 0
            r2.zzb(r1, r3)
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            long r3 = r2.zzb
            long r8 = r0.zzh
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00cf
            r23.zzj()
            r0.zze = r5
            long r1 = r0.zzk
            r8 = 2
            long r1 = r1 + r8
            long r1 = -r1
            return r1
        L_0x00cf:
            r8 = 2
            int r3 = r2.zzd
            int r2 = r2.zze
            int r3 = r3 + r2
            r1.zzk(r3)
            long r2 = r23.zzf()
            r0.zzi = r2
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            long r2 = r2.zzb
            r0.zzk = r2
            goto L_0x00ae
        L_0x00e6:
            long r2 = r23.zzf()
            r0.zzg = r2
            r0.zze = r4
            long r8 = r0.zzc
            r10 = -65307(0xffffffffffff00e5, double:NaN)
            long r8 = r8 + r10
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x00f9
            return r8
        L_0x00f9:
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            r2.zza()
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            boolean r2 = r2.zzc(r1, r6)
            if (r2 == 0) goto L_0x0153
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            r3 = 0
            r2.zzb(r1, r3)
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            int r3 = r2.zzd
            int r2 = r2.zze
            int r3 = r3 + r2
            r1.zzk(r3)
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            long r2 = r2.zzb
        L_0x011a:
            com.google.android.gms.internal.ads.zzajn r8 = r0.zza
            int r9 = r8.zza
            r9 = r9 & r5
            if (r9 == r5) goto L_0x014c
            boolean r8 = r8.zzc(r1, r6)
            if (r8 == 0) goto L_0x014c
            long r8 = r23.zzf()
            long r10 = r0.zzc
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x014c
            com.google.android.gms.internal.ads.zzajn r8 = r0.zza
            boolean r8 = r8.zzb(r1, r4)
            if (r8 == 0) goto L_0x014c
            com.google.android.gms.internal.ads.zzajn r8 = r0.zza
            int r9 = r8.zzd
            int r8 = r8.zze
            int r9 = r9 + r8
            boolean r8 = com.google.android.gms.internal.ads.zzacr.zze(r1, r9)
            if (r8 != 0) goto L_0x0147
            goto L_0x014c
        L_0x0147:
            com.google.android.gms.internal.ads.zzajn r2 = r0.zza
            long r2 = r2.zzb
            goto L_0x011a
        L_0x014c:
            r0.zzf = r2
            r0.zze = r5
            long r1 = r0.zzg
            return r1
        L_0x0153:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaji.zzd(com.google.android.gms.internal.ads.zzaco):long");
    }
}
