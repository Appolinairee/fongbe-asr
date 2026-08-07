package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzts {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzfx zzc;

    public zzts(zzacs zzacs, zzakd zzakd) {
    }

    public final void zza(zzfx zzfx) {
        if (zzfx != this.zzc) {
            this.zzc = zzfx;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
