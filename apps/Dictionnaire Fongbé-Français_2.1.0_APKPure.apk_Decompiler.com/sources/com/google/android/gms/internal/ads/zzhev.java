package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhev extends zzhen {
    static {
        zzhes.zza(Collections.emptyMap());
    }

    /* synthetic */ zzhev(Map map, zzhet zzhet) {
        super(map);
    }

    public static zzheu zzc(int i) {
        return new zzheu(i, (zzhet) null);
    }

    /* renamed from: zzd */
    public final Map zzb() {
        LinkedHashMap zzb = zzheo.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhfa) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
