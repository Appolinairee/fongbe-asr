package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public class zzgyn {
    protected volatile zzgzc zza;
    private volatile zzgwj zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgyn)) {
            return false;
        }
        zzgyn zzgyn = (zzgyn) obj;
        zzgzc zzgzc = this.zza;
        zzgzc zzgzc2 = zzgyn.zza;
        if (zzgzc == null && zzgzc2 == null) {
            return zzb().equals(zzgyn.zzb());
        }
        if (zzgzc != null && zzgzc2 != null) {
            return zzgzc.equals(zzgzc2);
        }
        if (zzgzc != null) {
            zzgyn.zzd(zzgzc.zzbt());
            return zzgzc.equals(zzgyn.zza);
        }
        zzd(zzgzc2.zzbt());
        return this.zza.equals(zzgzc2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzgwg) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaY();
        }
        return 0;
    }

    public final zzgwj zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                zzgwj zzgwj = this.zzb;
                return zzgwj;
            }
            if (this.zza == null) {
                this.zzb = zzgwj.zzb;
            } else {
                this.zzb = this.zza.zzaN();
            }
            zzgwj zzgwj2 = this.zzb;
            return zzgwj2;
        }
    }

    public final zzgzc zzc(zzgzc zzgzc) {
        zzgzc zzgzc2 = this.zza;
        this.zzb = null;
        this.zza = zzgzc;
        return zzgzc2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.gms.internal.ads.zzgzc r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzgzc r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzgzc r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x000c:
            r1.zza = r2     // Catch:{ zzgyg -> 0x0013 }
            com.google.android.gms.internal.ads.zzgwj r0 = com.google.android.gms.internal.ads.zzgwj.zzb     // Catch:{ zzgyg -> 0x0013 }
            r1.zzb = r0     // Catch:{ zzgyg -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.zzgwj r2 = com.google.android.gms.internal.ads.zzgwj.zzb     // Catch:{ all -> 0x001b }
            r1.zzb = r2     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgyn.zzd(com.google.android.gms.internal.ads.zzgzc):void");
    }
}
