package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzame implements zzacn {
    private final zzamf zza;
    private final zzdy zzb;
    private final zzdy zzc;
    private final zzdx zzd;
    private zzacq zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzame() {
        throw null;
    }

    public zzame(int i) {
        this.zza = new zzamf(true, (String) null, 0);
        this.zzb = new zzdy(2048);
        this.zzg = -1;
        zzdy zzdy = new zzdy(10);
        this.zzc = zzdy;
        byte[] zzN = zzdy.zzN();
        this.zzd = new zzdx(zzN, zzN.length);
    }

    public final int zzb(zzaco zzaco, zzadj zzadj) throws IOException {
        zzcw.zzb(this.zze);
        int zza2 = zzaco.zza(this.zzb.zzN(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzO(new zzadl(-9223372036854775807L, 0));
            this.zzi = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(zza2);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zze = zzacq;
        this.zza.zzb(zzacq, new zzanx(Integer.MIN_VALUE, 0, 1));
        zzacq.zzD();
    }

    public final void zzf(long j, long j2) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j2;
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        zzacc zzacc;
        int i = 0;
        while (true) {
            zzacc = (zzacc) zzaco;
            zzacc.zzm(this.zzc.zzN(), 0, 10, false);
            this.zzc.zzL(0);
            if (this.zzc.zzo() != 4801587) {
                break;
            }
            this.zzc.zzM(3);
            int zzl = this.zzc.zzl();
            i += zzl + 10;
            zzacc.zzl(zzl, false);
        }
        zzaco.zzj();
        zzacc.zzl(i, false);
        if (this.zzg == -1) {
            this.zzg = (long) i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzacc.zzm(this.zzc.zzN(), 0, 2, false);
            this.zzc.zzL(0);
            if (!zzamf.zzf(this.zzc.zzq())) {
                i2++;
                zzaco.zzj();
                zzacc.zzl(i2, false);
            } else {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzacc.zzm(this.zzc.zzN(), 0, 4, false);
                this.zzd.zzl(14);
                int zzd2 = this.zzd.zzd(13);
                if (zzd2 <= 6) {
                    i2++;
                    zzaco.zzj();
                    zzacc.zzl(i2, false);
                } else {
                    zzacc.zzl(zzd2 - 6, false);
                    i4 += zzd2;
                }
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }
}
