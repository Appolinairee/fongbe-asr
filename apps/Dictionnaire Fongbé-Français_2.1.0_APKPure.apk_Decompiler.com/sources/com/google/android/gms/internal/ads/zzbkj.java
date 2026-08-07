package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbkj implements zzbjp {
    private final zzduv zza;

    public zzbkj(zzduv zzduv) {
        Preconditions.checkNotNull(zzduv, "The Inspector Manager must not be null");
        this.zza = zzduv;
    }

    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzi((String) map.get("extras"), j);
        }
    }
}
