package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfek {
    private final HashMap zza = new HashMap();

    public final zzfej zza(zzfea zzfea, Context context, zzfds zzfds, zzfeq zzfeq) {
        zzfej zzfej = (zzfej) this.zza.get(zzfea);
        if (zzfej != null) {
            return zzfej;
        }
        zzfdx zzfdx = new zzfdx(zzfed.zza(zzfea, context));
        zzfej zzfej2 = new zzfej(zzfdx, new zzfes(zzfdx, zzfds, zzfeq));
        this.zza.put(zzfea, zzfej2);
        return zzfej2;
    }
}
