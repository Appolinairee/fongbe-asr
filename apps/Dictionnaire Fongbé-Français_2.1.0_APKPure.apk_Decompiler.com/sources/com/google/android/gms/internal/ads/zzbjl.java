package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbjl implements zzbjp {
    zzbjl() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcex.zzde();
        } else if ("resume".equals(str)) {
            zzcex.zzdf();
        }
    }
}
