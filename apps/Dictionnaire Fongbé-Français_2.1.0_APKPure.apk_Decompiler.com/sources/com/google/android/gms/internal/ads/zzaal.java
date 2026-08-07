package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaal {
    private final zzaak zza;
    private final zzaap zzb;
    private boolean zzc;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzf;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private boolean zzi;
    private float zzj = 1.0f;
    private zzcx zzk = zzcx.zza;

    public zzaal(Context context, zzaak zzaak, long j) {
        this.zza = zzaak;
        this.zzb = new zzaap(context);
    }

    private final void zzq(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r6 > 100000) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (r3 >= r25) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (r0.zzc != false) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(long r19, long r21, long r23, long r25, boolean r27, com.google.android.gms.internal.ads.zzaaj r28) throws com.google.android.gms.internal.ads.zzib {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            r5 = r28
            com.google.android.gms.internal.ads.zzaaj.zzg(r28)
            long r6 = r0.zze
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0018
            r0.zze = r3
        L_0x0018:
            long r6 = r0.zzg
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.zzaap r6 = r0.zzb
            r6.zzd(r1)
            r0.zzg = r1
        L_0x0025:
            long r1 = r1 - r3
            float r6 = r0.zzj
            double r6 = (double) r6
            boolean r10 = r0.zzc
            double r1 = (double) r1
            double r1 = r1 / r6
            long r1 = (long) r1
            if (r10 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.zzcx r6 = r0.zzk
            long r6 = r6.zzb()
            long r6 = com.google.android.gms.internal.ads.zzei.zzs(r6)
            long r6 = r6 - r23
            long r1 = r1 - r6
        L_0x003d:
            r5.zza = r1
            long r1 = r28.zza
            long r6 = r0.zzh
            r10 = -30000(0xffffffffffff8ad0, double:NaN)
            r12 = 3
            r13 = 2
            r14 = 0
            r15 = 1
            int r16 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r16 == 0) goto L_0x0055
            boolean r6 = r0.zzi
            if (r6 != 0) goto L_0x0055
            goto L_0x008c
        L_0x0055:
            int r6 = r0.zzd
            if (r6 == 0) goto L_0x0087
            if (r6 == r15) goto L_0x008b
            if (r6 == r13) goto L_0x0082
            if (r6 != r12) goto L_0x007c
            com.google.android.gms.internal.ads.zzcx r6 = r0.zzk
            long r6 = r6.zzb()
            long r6 = com.google.android.gms.internal.ads.zzei.zzs(r6)
            long r12 = r0.zzf
            long r6 = r6 - r12
            boolean r12 = r0.zzc
            if (r12 == 0) goto L_0x008c
            int r12 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x008c
            r1 = 100000(0x186a0, double:4.94066E-319)
            int r12 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x008c
            goto L_0x008b
        L_0x007c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0082:
            int r1 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r1 < 0) goto L_0x008c
            goto L_0x008b
        L_0x0087:
            boolean r1 = r0.zzc
            if (r1 == 0) goto L_0x008c
        L_0x008b:
            return r14
        L_0x008c:
            boolean r1 = r0.zzc
            r2 = 5
            if (r1 == 0) goto L_0x00fc
            long r6 = r0.zze
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0098
            goto L_0x00fc
        L_0x0098:
            com.google.android.gms.internal.ads.zzcx r1 = r0.zzk
            long r6 = r1.zzc()
            com.google.android.gms.internal.ads.zzaap r1 = r0.zzb
            long r12 = r28.zza
            r16 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r16
            long r12 = r12 + r6
            long r12 = r1.zza(r12)
            r5.zzb = r12
            long r12 = r28.zzb
            long r12 = r12 - r6
            long r12 = r12 / r16
            r5.zza = r12
            long r6 = r0.zzh
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x00c5
            boolean r1 = r0.zzi
            if (r1 != 0) goto L_0x00c5
            r14 = 1
        L_0x00c5:
            com.google.android.gms.internal.ads.zzaak r1 = r0.zza
            long r6 = r28.zza
            r8 = -500000(0xfffffffffff85ee0, double:NaN)
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x00df
            if (r27 != 0) goto L_0x00df
            com.google.android.gms.internal.ads.zzzp r1 = (com.google.android.gms.internal.ads.zzzp) r1
            boolean r1 = r1.zzaT(r3, r14)
            if (r1 != 0) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r1 = 4
            return r1
        L_0x00df:
            long r3 = r28.zza
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ef
            if (r27 != 0) goto L_0x00ef
            if (r14 == 0) goto L_0x00ed
            r1 = 3
            return r1
        L_0x00ed:
            r1 = 2
            return r1
        L_0x00ef:
            long r3 = r28.zza
            r5 = 50000(0xc350, double:2.47033E-319)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00fb
            return r2
        L_0x00fb:
            return r15
        L_0x00fc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaal.zza(long, long, long, long, boolean, com.google.android.gms.internal.ads.zzaaj):int");
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z) {
        this.zzd = z ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzei.zzs(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzq(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzj(int i) {
        this.zzb.zzj(i);
    }

    public final void zzk(zzcx zzcx) {
        this.zzk = zzcx;
    }

    public final void zzl(float f) {
        this.zzb.zzc(f);
    }

    public final void zzm(Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(float f) {
        zzcw.zzd(f > 0.0f);
        if (f != this.zzj) {
            this.zzj = f;
            this.zzb.zze(f);
        }
    }

    public final boolean zzo(boolean z) {
        boolean z2 = true;
        if (!z || this.zzd != 3) {
            if (this.zzh == -9223372036854775807L) {
                return false;
            }
            if (this.zzk.zzb() >= this.zzh) {
                z2 = false;
            }
            return z2;
        }
        this.zzh = -9223372036854775807L;
        return z2;
    }

    public final boolean zzp() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzei.zzs(this.zzk.zzb());
        return i != 3;
    }
}
