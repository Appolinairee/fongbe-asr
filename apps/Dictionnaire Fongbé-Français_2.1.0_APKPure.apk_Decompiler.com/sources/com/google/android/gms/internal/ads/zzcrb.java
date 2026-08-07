package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcrb implements zzcrc {
    private final Map zza;

    zzcrb(Map map) {
        this.zza = map;
    }

    public final zzecw zza(int i, String str) {
        return (zzecw) this.zza.get(str);
    }
}
