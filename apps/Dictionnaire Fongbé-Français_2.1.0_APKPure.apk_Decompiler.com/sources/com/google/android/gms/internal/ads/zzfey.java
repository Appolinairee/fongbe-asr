package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfey {
    private final zzfer zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfey(zzfdw zzfdw, zzfeq zzfeq, zzfer zzfer) {
        this.zza = zzfer;
        this.zzb = zzgch.zzf(zzgch.zzn(zzfeq.zza(zzfer), new zzfew(this, zzfeq, zzfdw, zzfer), zzfer.zzb()), Exception.class, new zzfex(this, zzfeq), zzfer.zzb());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfer r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzd     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x002f
            boolean r0 = r1.zzc     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000a
            goto L_0x002f
        L_0x000a:
            com.google.android.gms.internal.ads.zzfer r0 = r1.zza     // Catch:{ all -> 0x0032 }
            com.google.android.gms.internal.ads.zzfeg r0 = r0.zza()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzfeg r0 = r2.zza()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x002f
            com.google.android.gms.internal.ads.zzfer r0 = r1.zza     // Catch:{ all -> 0x0032 }
            com.google.android.gms.internal.ads.zzfeg r0 = r0.zza()     // Catch:{ all -> 0x0032 }
            com.google.android.gms.internal.ads.zzfeg r2 = r2.zza()     // Catch:{ all -> 0x0032 }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x002f
            r2 = 1
            r1.zzc = r2     // Catch:{ all -> 0x0032 }
            com.google.common.util.concurrent.ListenableFuture r2 = r1.zzb     // Catch:{ all -> 0x0032 }
            monitor-exit(r1)
            return r2
        L_0x002f:
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x0032:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0032 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfey.zza(com.google.android.gms.internal.ads.zzfer):com.google.common.util.concurrent.ListenableFuture");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(zzfeq zzfeq, zzfdw zzfdw, zzfer zzfer, zzfef zzfef) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfeq.zzb(zzfef);
            if (!this.zzc) {
                zzfdw.zzd(zzfer.zza(), zzfef);
                ListenableFuture zzh = zzgch.zzh((Object) null);
                return zzh;
            }
            ListenableFuture zzh2 = zzgch.zzh(new zzfep(zzfef, zzfer));
            return zzh2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(zzfeq zzfeq, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzgcd zzgcd) {
        zzgch.zzr(zzgch.zzn(this.zzb, new zzfev(), this.zza.zzb()), zzgcd, this.zza.zzb());
    }
}
