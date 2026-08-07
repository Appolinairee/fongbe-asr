package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzami implements zzamj {
    private final List zza;
    private final zzadt[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzami(List list) {
        this.zza = list;
        this.zzb = new zzadt[list.size()];
    }

    private final boolean zzf(zzdy zzdy, int i) {
        if (zzdy.zzb() == 0) {
            return false;
        }
        if (zzdy.zzm() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    public final void zza(zzdy zzdy) {
        if (!this.zzc) {
            return;
        }
        if (this.zzd != 2 || zzf(zzdy, 32)) {
            if (this.zzd != 1 || zzf(zzdy, 0)) {
                int zzd2 = zzdy.zzd();
                int zzb2 = zzdy.zzb();
                zzadt[] zzadtArr = this.zzb;
                for (zzadt zzr : zzadtArr) {
                    zzdy.zzL(zzd2);
                    zzr.zzr(zzdy, zzb2);
                }
                this.zze += zzb2;
            }
        }
    }

    public final void zzb(zzacq zzacq, zzanx zzanx) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzanu zzanu = (zzanu) this.zza.get(i);
            zzanx.zzc();
            zzadt zzw = zzacq.zzw(zzanx.zza(), 3);
            zzz zzz = new zzz();
            zzz.zzM(zzanx.zzb());
            zzz.zzaa("application/dvbsubs");
            zzz.zzN(Collections.singletonList(zzanu.zzb));
            zzz.zzQ(zzanu.zza);
            zzw.zzm(zzz.zzag());
            this.zzb[i] = zzw;
        }
    }

    public final void zzc(boolean z) {
        if (this.zzc) {
            zzcw.zzf(this.zzf != -9223372036854775807L);
            zzadt[] zzadtArr = this.zzb;
            for (zzadt zzt : zzadtArr) {
                zzt.zzt(this.zzf, 1, this.zze, 0, (zzads) null);
            }
            this.zzc = false;
        }
    }

    public final void zzd(long j, int i) {
        if ((i & 4) != 0) {
            this.zzc = true;
            this.zzf = j;
            this.zze = 0;
            this.zzd = 2;
        }
    }

    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
