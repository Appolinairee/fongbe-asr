package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzado implements zzacn {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzacq zzf;
    private zzadt zzg;

    public zzado(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    public final int zzb(zzaco zzaco, zzadj zzadj) throws IOException {
        int i = this.zze;
        if (i == 1) {
            zzadt zzadt = this.zzg;
            zzadt.getClass();
            zzadt zzadt2 = zzadt;
            int zzf2 = zzadt.zzf(zzaco, 1024, true);
            if (zzf2 == -1) {
                this.zze = 2;
                this.zzg.zzt(0, 1, this.zzd, 0, (zzads) null);
                this.zzd = 0;
            } else {
                this.zzd += zzf2;
            }
            return 0;
        } else if (i == 2) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zzf = zzacq;
        zzadt zzw = zzacq.zzw(1024, 4);
        this.zzg = zzw;
        zzz zzz = new zzz();
        zzz.zzaa(this.zzc);
        zzw.zzm(zzz.zzag());
        this.zzf.zzD();
        this.zzf.zzO(new zzadp(-9223372036854775807L));
        this.zze = 1;
    }

    public final void zzf(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        zzcw.zzf((this.zza == -1 || this.zzb == -1) ? false : true);
        zzdy zzdy = new zzdy(this.zzb);
        ((zzacc) zzaco).zzm(zzdy.zzN(), 0, this.zzb, false);
        return zzdy.zzq() == this.zza;
    }
}
