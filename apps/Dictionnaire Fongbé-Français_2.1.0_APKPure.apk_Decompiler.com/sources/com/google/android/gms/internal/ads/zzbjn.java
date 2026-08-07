package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbjn implements zzbjp {
    zzbjn() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        if (map.keySet().contains("start")) {
            zzcex.zzax(true);
        }
        if (map.keySet().contains("stop")) {
            zzcex.zzax(false);
        }
    }
}
