package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaci implements zzadt {
    private final byte[] zza = new byte[4096];

    public final /* synthetic */ int zzf(zzl zzl, int i, boolean z) {
        return zzadr.zza(this, zzl, i, z);
    }

    public final int zzg(zzl zzl, int i, boolean z, int i2) throws IOException {
        int zza2 = zzl.zza(this.zza, 0, Math.min(4096, i));
        if (zza2 != -1) {
            return zza2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final /* synthetic */ void zzl(long j) {
    }

    public final void zzm(zzab zzab) {
    }

    public final /* synthetic */ void zzr(zzdy zzdy, int i) {
        zzadr.zzb(this, zzdy, i);
    }

    public final void zzs(zzdy zzdy, int i, int i2) {
        zzdy.zzM(i);
    }

    public final void zzt(long j, int i, int i2, int i3, zzads zzads) {
    }
}
