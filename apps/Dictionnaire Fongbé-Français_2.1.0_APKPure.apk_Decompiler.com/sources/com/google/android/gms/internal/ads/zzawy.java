package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzawy extends zzaxr {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzawy(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2, Map map, View view, Context context) {
        super(zzawd, "SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", zzasc, i, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzc(int i) {
        Map map = this.zzh;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzh.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r10 = this;
            r0 = 1
            long r1 = r10.zzc(r0)
            r3 = 2
            long r4 = r10.zzc(r3)
            long[] r6 = new long[r3]
            r7 = 0
            r6[r7] = r1
            r6[r0] = r4
            android.content.Context r1 = r10.zzj
            if (r1 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzawd r1 = r10.zza
            android.content.Context r1 = r1.zzb()
        L_0x001b:
            java.lang.reflect.Method r2 = r10.zze
            android.view.View r4 = r10.zzi
            r5 = 3
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r7] = r6
            r8[r0] = r1
            r8[r3] = r4
            r1 = 0
            java.lang.Object r1 = r2.invoke(r1, r8)
            long[] r1 = (long[]) r1
            r6 = r1[r7]
            java.util.Map r2 = r10.zzh
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r8 = r1[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2.put(r4, r0)
            r8 = r1[r3]
            java.util.Map r0 = r10.zzh
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = r1[r5]
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0.put(r2, r1)
            com.google.android.gms.internal.ads.zzasc r0 = r10.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzasc r1 = r10.zzd     // Catch:{ all -> 0x0060 }
            r1.zzv(r6)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzasc r1 = r10.zzd     // Catch:{ all -> 0x0060 }
            r1.zzu(r8)     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawy.zza():void");
    }
}
