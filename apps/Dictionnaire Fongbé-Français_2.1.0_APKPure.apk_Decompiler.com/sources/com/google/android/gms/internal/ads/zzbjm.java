package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbjm implements zzbjp {
    zzbjm() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        if (map.keySet().contains("start")) {
            zzcex.zzN().zzm();
        } else if (map.keySet().contains("stop")) {
            zzcex.zzN().zzn();
        } else if (map.keySet().contains("cancel")) {
            zzcex.zzN().zzl();
        }
    }
}
