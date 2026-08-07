package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfbn {
    private final Clock zza;
    private final zzdrw zzb;
    private final Object zzc = new Object();
    private volatile long zzd = 0;
    private volatile int zze = 1;

    public zzfbn(Clock clock, zzdrw zzdrw) {
        this.zza = clock;
        this.zzb = zzdrw;
    }

    private final void zze() {
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzc) {
            if (this.zze == 3) {
                if (this.zzd + ((Long) zzbe.zzc().zza(zzbcl.zzfP)).longValue() <= currentTimeMillis) {
                    this.zze = 1;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzf(int r5, int r6) {
        /*
            r4 = this;
            r4.zze()
            java.lang.Object r0 = r4.zzc
            com.google.android.gms.common.util.Clock r1 = r4.zza
            long r1 = r1.currentTimeMillis()
            monitor-enter(r0)
            int r3 = r4.zze     // Catch:{ all -> 0x001d }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            r4.zze = r6     // Catch:{ all -> 0x001d }
            int r5 = r4.zze     // Catch:{ all -> 0x001d }
            r6 = 3
            if (r5 != r6) goto L_0x001b
            r4.zzd = r1     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbn.zzf(int, int):void");
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z) {
        String str;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmS)).booleanValue()) {
            zzdrv zza2 = this.zzb.zza();
            zza2.zzb("action", "mbs_state");
            if (true != z) {
                str = "0";
            } else {
                str = "1";
            }
            zza2.zzb("mbs_state", str);
            zza2.zzg();
        }
        if (z) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 3;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 2;
        }
        return z;
    }
}
