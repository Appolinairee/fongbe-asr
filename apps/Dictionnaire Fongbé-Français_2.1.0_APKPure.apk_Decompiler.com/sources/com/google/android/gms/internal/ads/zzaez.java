package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaez implements zzacn {
    private final zzdy zza = new zzdy(4);
    private final zzado zzb = new zzado(-1, -1, "image/heif");

    private final boolean zza(zzaco zzaco, int i) throws IOException {
        this.zza.zzI(4);
        ((zzacc) zzaco).zzm(this.zza.zzN(), 0, 4, false);
        if (this.zza.zzu() == ((long) i)) {
            return true;
        }
        return false;
    }

    public final int zzb(zzaco zzaco, zzadj zzadj) throws IOException {
        return this.zzb.zzb(zzaco, zzadj);
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zzb.zze(zzacq);
    }

    public final void zzf(long j, long j2) {
        this.zzb.zzf(j, j2);
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        ((zzacc) zzaco).zzl(4, false);
        if (!zza(zzaco, 1718909296) || !zza(zzaco, 1751476579)) {
            return false;
        }
        return true;
    }
}
