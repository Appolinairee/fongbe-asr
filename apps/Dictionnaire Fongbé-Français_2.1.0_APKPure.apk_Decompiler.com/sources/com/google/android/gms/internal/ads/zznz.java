package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zznz {
    final /* synthetic */ zzoa zza;
    /* access modifiers changed from: private */
    public final String zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public zzug zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public boolean zzg;

    public zznz(zzoa zzoa, String str, int i, zzug zzug) {
        this.zza = zzoa;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzug == null ? -1 : zzug.zzd;
        if (zzug != null && zzug.zzb()) {
            this.zze = zzug;
        }
    }

    public final void zzg(int i, zzug zzug) {
        if (this.zzd == -1 && i == this.zzc && zzug != null) {
            zzoa zzoa = this.zza;
            long j = zzug.zzd;
            if (j >= zzoa.zzl()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, zzug zzug) {
        if (zzug == null) {
            return i == this.zzc;
        }
        zzug zzug2 = this.zze;
        return zzug2 == null ? !zzug.zzb() && zzug.zzd == this.zzd : zzug.zzd == zzug2.zzd && zzug.zzb == zzug2.zzb && zzug.zzc == zzug2.zzc;
    }

    public final boolean zzk(zzlu zzlu) {
        zzug zzug = zzlu.zzd;
        if (zzug == null) {
            return this.zzc != zzlu.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzug.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbq zzbq = zzlu.zzb;
        int zza2 = zzbq.zza(zzug.zza);
        int zza3 = zzbq.zza(this.zze.zza);
        zzug zzug2 = zzlu.zzd;
        if (zzug2.zzd < this.zze.zzd || zza2 < zza3) {
            return false;
        }
        if (zza2 > zza3) {
            return true;
        }
        if (zzug2.zzb()) {
            zzug zzug3 = zzlu.zzd;
            int i = zzug3.zzb;
            int i2 = zzug3.zzc;
            zzug zzug4 = this.zze;
            int i3 = zzug4.zzb;
            if (i <= i3) {
                return i == i3 && i2 > zzug4.zzc;
            }
            return true;
        }
        int i4 = zzlu.zzd.zze;
        return i4 == -1 || i4 > this.zze.zzb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.zzc()) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzl(com.google.android.gms.internal.ads.zzbq r7, com.google.android.gms.internal.ads.zzbq r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0013
            int r7 = r8.zzc()
            if (r0 >= r7) goto L_0x0011
            goto L_0x004a
        L_0x0011:
            r0 = -1
            goto L_0x004a
        L_0x0013:
            com.google.android.gms.internal.ads.zzoa r1 = r6.zza
            com.google.android.gms.internal.ads.zzbp r1 = r1.zzc
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zzoa r0 = r6.zza
            com.google.android.gms.internal.ads.zzbp r0 = r0.zzc
            int r0 = r0.zzn
        L_0x0026:
            com.google.android.gms.internal.ads.zzoa r1 = r6.zza
            com.google.android.gms.internal.ads.zzbp r1 = r1.zzc
            int r1 = r1.zzo
            if (r0 > r1) goto L_0x0011
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L_0x0047
            com.google.android.gms.internal.ads.zzoa r7 = r6.zza
            com.google.android.gms.internal.ads.zzbo r7 = r7.zzd
            com.google.android.gms.internal.ads.zzbo r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzc
            goto L_0x004a
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x004a:
            r6.zzc = r0
            if (r0 != r3) goto L_0x004f
            return r2
        L_0x004f:
            com.google.android.gms.internal.ads.zzug r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L_0x0055
            return r0
        L_0x0055:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L_0x005e
            return r0
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznz.zzl(com.google.android.gms.internal.ads.zzbq, com.google.android.gms.internal.ads.zzbq):boolean");
    }
}
