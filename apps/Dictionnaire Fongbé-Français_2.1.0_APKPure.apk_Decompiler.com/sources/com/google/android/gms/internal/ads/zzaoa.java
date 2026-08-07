package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaoa {
    private final List zza;
    private final zzadt[] zzb;

    public zzaoa(List list) {
        this.zza = list;
        this.zzb = new zzadt[list.size()];
    }

    public final void zza(long j, zzdy zzdy) {
        if (zzdy.zzb() >= 9) {
            int zzg = zzdy.zzg();
            int zzg2 = zzdy.zzg();
            int zzm = zzdy.zzm();
            if (zzg == 434 && zzg2 == 1195456820 && zzm == 3) {
                zzabz.zzb(j, zzdy, this.zzb);
            }
        }
    }

    public final void zzb(zzacq zzacq, zzanx zzanx) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzanx.zzc();
            zzadt zzw = zzacq.zzw(zzanx.zza(), 3);
            zzab zzab = (zzab) this.zza.get(i);
            String str = zzab.zzo;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzcw.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzz zzz = new zzz();
            zzz.zzM(zzanx.zzb());
            zzz.zzaa(str);
            zzz.zzac(zzab.zze);
            zzz.zzQ(zzab.zzd);
            zzz.zzx(zzab.zzI);
            zzz.zzN(zzab.zzr);
            zzw.zzm(zzz.zzag());
            this.zzb[i] = zzw;
        }
    }
}
