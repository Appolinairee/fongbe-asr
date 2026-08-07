package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdpj {
    private final Map zza = new HashMap();

    zzdpj() {
    }

    @Nullable
    public final synchronized zzdpi zza(String str) {
        return (zzdpi) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbrs zzbrs;
        zzdpi zza2 = zza(str);
        if (zza2 == null || (zzbrs = zza2.zzb) == null) {
            return "";
        }
        return zzbrs.toString();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:6|7|8|(11:11|12|(2:15|16)|17|18|19|(3:21|(2:25|26)|23)|27|28|29|30)|10|(0)|17|18|19|(0)|27|28|29|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0020 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001c A[SYNTHETIC, Splitter:B:15:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzc(java.lang.String r6, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzfdh r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.zza     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.containsKey(r6)     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r5)
            return
        L_0x000b:
            com.google.android.gms.internal.ads.zzdpi r0 = new com.google.android.gms.internal.ads.zzdpi     // Catch:{ all -> 0x0046 }
            r1 = 0
            if (r7 != 0) goto L_0x0012
        L_0x0010:
            r2 = r1
            goto L_0x0019
        L_0x0012:
            com.google.android.gms.internal.ads.zzbrs r2 = r7.zze()     // Catch:{ zzfcq -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            goto L_0x0010
        L_0x0019:
            if (r7 != 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            com.google.android.gms.internal.ads.zzbrs r1 = r7.zzf()     // Catch:{ zzfcq -> 0x0020 }
        L_0x0020:
            com.google.android.gms.internal.ads.zzbcc r3 = com.google.android.gms.internal.ads.zzbcl.zzjk     // Catch:{ all -> 0x0046 }
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x0046 }
            java.lang.Object r3 = r4.zza(r3)     // Catch:{ all -> 0x0046 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0046 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0046 }
            r4 = 1
            if (r3 != 0) goto L_0x0034
            goto L_0x003c
        L_0x0034:
            r3 = 0
            if (r7 != 0) goto L_0x0039
        L_0x0037:
            r4 = 0
            goto L_0x003c
        L_0x0039:
            r7.zzC()     // Catch:{ zzfcq -> 0x0037 }
        L_0x003c:
            r0.<init>(r6, r2, r1, r4)     // Catch:{ all -> 0x0046 }
            java.util.Map r7 = r5.zza     // Catch:{ all -> 0x0046 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)
            return
        L_0x0046:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0046 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpj.zzc(java.lang.String, com.google.android.gms.internal.ads.zzfdh):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(String str, zzbrd zzbrd) {
        if (!this.zza.containsKey(str)) {
            try {
                this.zza.put(str, new zzdpi(str, zzbrd.zzf(), zzbrd.zzg(), true));
            } catch (Throwable unused) {
            }
        }
    }
}
