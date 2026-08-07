package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaog {
    public final int zza;
    public final long zzb;

    private zzaog(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzaog zza(zzaco zzaco, zzdy zzdy) throws IOException {
        zzaco.zzh(zzdy.zzN(), 0, 8);
        zzdy.zzL(0);
        return new zzaog(zzdy.zzg(), zzdy.zzs());
    }
}
