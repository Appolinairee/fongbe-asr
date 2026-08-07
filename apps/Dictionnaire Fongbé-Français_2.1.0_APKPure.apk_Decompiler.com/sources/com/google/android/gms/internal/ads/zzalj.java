package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzalj implements zzaka {
    private final zzalc zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzalj(zzalc zzalc, Map map, Map map2, Map map3) {
        this.zza = zzalc;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzalc.zzh();
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final long zzb(int i) {
        return this.zzb[i];
    }

    public final List zzc(long j) {
        return this.zza.zze(j, this.zzc, this.zzd, this.zze);
    }
}
