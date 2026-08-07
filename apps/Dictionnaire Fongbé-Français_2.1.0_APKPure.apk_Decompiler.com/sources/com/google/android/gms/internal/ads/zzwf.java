package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzwf implements zzvy {
    private final zzvy zza;
    private final long zzb;

    public zzwf(zzvy zzvy, long j) {
        this.zza = zzvy;
        this.zzb = j;
    }

    public final int zza(zzke zzke, zzhh zzhh, int i) {
        int zza2 = this.zza.zza(zzke, zzhh, i);
        if (zza2 != -4) {
            return zza2;
        }
        zzhh.zze += this.zzb;
        return -4;
    }

    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzvy zzc() {
        return this.zza;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return this.zza.zze();
    }
}
