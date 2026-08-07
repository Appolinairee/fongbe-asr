package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaoj implements zzacn {
    private final zzdy zza = new zzdy(4);
    private final zzado zzb = new zzado(-1, -1, "image/webp");

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
        this.zza.zzI(4);
        zzacc zzacc = (zzacc) zzaco;
        zzacc.zzm(this.zza.zzN(), 0, 4, false);
        if (this.zza.zzu() == 1380533830) {
            zzacc.zzl(4, false);
            this.zza.zzI(4);
            zzacc.zzm(this.zza.zzN(), 0, 4, false);
            if (this.zza.zzu() == 1464156752) {
                return true;
            }
        }
        return false;
    }
}
