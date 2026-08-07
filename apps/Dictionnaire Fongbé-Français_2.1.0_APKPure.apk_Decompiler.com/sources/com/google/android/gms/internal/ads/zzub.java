package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzub extends zzwl {
    private final boolean zzb;
    private final zzbp zzc;
    private final zzbo zzd;
    private zztz zze;
    private zzty zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzub(zzui zzui, boolean z) {
        super(zzui);
        boolean z2;
        if (z) {
            zzui.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzbp();
        this.zzd = new zzbo();
        zzui.zzM();
        this.zze = zztz.zzq(zzui.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zze == null || !obj.equals(zztz.zzc)) ? obj : this.zze.zze;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final boolean zzL(long j) {
        zzty zzty = this.zzf;
        int zza = this.zze.zza(zzty.zza.zza);
        if (zza == -1) {
            return false;
        }
        zztz zztz = this.zze;
        zzbo zzbo = this.zzd;
        zztz.zzd(zza, zzbo, false);
        long j2 = zzbo.zzd;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        zzty.zzs(j);
        return true;
    }

    public final zzbq zzC() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final zzug zzD(zzug zzug) {
        Object zzs = this.zze.zze;
        Object obj = zzug.zza;
        if (zzs != null && this.zze.zze.equals(obj)) {
            obj = zztz.zzc;
        }
        return zzug.zza(obj);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzE(com.google.android.gms.internal.ads.zzbq r15) {
        /*
            r14 = this;
            boolean r0 = r14.zzh
            r1 = 0
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zztz r0 = r14.zze
            com.google.android.gms.internal.ads.zztz r15 = r0.zzp(r15)
            r14.zze = r15
            com.google.android.gms.internal.ads.zzty r15 = r14.zzf
            if (r15 == 0) goto L_0x009e
            long r2 = r15.zzn()
            r14.zzL(r2)
            goto L_0x009e
        L_0x001a:
            boolean r0 = r15.zzo()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r14.zzi
            if (r0 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zztz r0 = r14.zze
            com.google.android.gms.internal.ads.zztz r15 = r0.zzp(r15)
            goto L_0x0033
        L_0x002b:
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbp.zza
            java.lang.Object r2 = com.google.android.gms.internal.ads.zztz.zzc
            com.google.android.gms.internal.ads.zztz r15 = com.google.android.gms.internal.ads.zztz.zzr(r15, r0, r2)
        L_0x0033:
            r14.zze = r15
            goto L_0x009e
        L_0x0036:
            com.google.android.gms.internal.ads.zzbp r0 = r14.zzc
            r2 = 0
            r3 = 0
            r15.zze(r2, r0, r3)
            com.google.android.gms.internal.ads.zzbp r0 = r14.zzc
            java.lang.Object r0 = r0.zzb
            com.google.android.gms.internal.ads.zzty r5 = r14.zzf
            if (r5 == 0) goto L_0x0062
            long r6 = r5.zzq()
            com.google.android.gms.internal.ads.zztz r8 = r14.zze
            com.google.android.gms.internal.ads.zzbo r9 = r14.zzd
            com.google.android.gms.internal.ads.zzug r5 = r5.zza
            java.lang.Object r5 = r5.zza
            r8.zzn(r5, r9)
            com.google.android.gms.internal.ads.zztz r5 = r14.zze
            com.google.android.gms.internal.ads.zzbp r8 = r14.zzc
            r5.zze(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0062
            r12 = r6
            goto L_0x0063
        L_0x0062:
            r12 = r3
        L_0x0063:
            com.google.android.gms.internal.ads.zzbp r9 = r14.zzc
            com.google.android.gms.internal.ads.zzbo r10 = r14.zzd
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.zzl(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.zzi
            if (r2 == 0) goto L_0x0082
            com.google.android.gms.internal.ads.zztz r0 = r14.zze
            com.google.android.gms.internal.ads.zztz r15 = r0.zzp(r15)
            goto L_0x0086
        L_0x0082:
            com.google.android.gms.internal.ads.zztz r15 = com.google.android.gms.internal.ads.zztz.zzr(r15, r0, r3)
        L_0x0086:
            r14.zze = r15
            com.google.android.gms.internal.ads.zzty r15 = r14.zzf
            if (r15 == 0) goto L_0x009e
            boolean r0 = r14.zzL(r4)
            if (r0 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzug r15 = r15.zza
            java.lang.Object r0 = r15.zza
            java.lang.Object r0 = r14.zzK(r0)
            com.google.android.gms.internal.ads.zzug r1 = r15.zza(r0)
        L_0x009e:
            r15 = 1
            r14.zzi = r15
            r14.zzh = r15
            com.google.android.gms.internal.ads.zztz r15 = r14.zze
            r14.zzo(r15)
            if (r1 == 0) goto L_0x00b5
            com.google.android.gms.internal.ads.zzty r15 = r14.zzf
            r15.getClass()
            r0 = r15
            com.google.android.gms.internal.ads.zzty r0 = (com.google.android.gms.internal.ads.zzty) r0
            r15.zzr(r1)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzub.zzE(com.google.android.gms.internal.ads.zzbq):void");
    }

    public final void zzF() {
        if (!this.zzb) {
            this.zzg = true;
            zzB((Object) null, this.zza);
        }
    }

    public final void zzG(zzue zzue) {
        ((zzty) zzue).zzt();
        if (zzue == this.zzf) {
            this.zzf = null;
        }
    }

    /* renamed from: zzH */
    public final zzty zzI(zzug zzug, zzyk zzyk, long j) {
        zzty zzty = new zzty(zzug, zzyk, j);
        zzty.zzu(this.zza);
        if (this.zzh) {
            zzty.zzr(zzug.zza(zzK(zzug.zza)));
        } else {
            this.zzf = zzty;
            if (!this.zzg) {
                this.zzg = true;
                zzB((Object) null, this.zza);
            }
        }
        return zzty;
    }

    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    public final void zzt(zzar zzar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwh(this.zze.zzb, zzar));
        } else {
            this.zze = zztz.zzq(zzar);
        }
        this.zza.zzt(zzar);
    }

    public final void zzz() {
    }
}
