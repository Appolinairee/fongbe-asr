package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzajn {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzdy zzg = new zzdy(255);

    zzajn() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzaco zzaco, boolean z) throws IOException {
        zza();
        this.zzg.zzI(27);
        if (zzacr.zzc(zzaco, this.zzg.zzN(), 0, 27, z) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() == 0) {
                this.zza = this.zzg.zzm();
                this.zzb = this.zzg.zzr();
                this.zzg.zzs();
                this.zzg.zzs();
                this.zzg.zzs();
                int zzm = this.zzg.zzm();
                this.zzc = zzm;
                this.zzd = zzm + 27;
                this.zzg.zzI(zzm);
                if (zzacr.zzc(zzaco, this.zzg.zzN(), 0, this.zzc, z)) {
                    for (int i = 0; i < this.zzc; i++) {
                        this.zzf[i] = this.zzg.zzm();
                        this.zze += this.zzf[i];
                    }
                    return true;
                }
            } else if (z) {
                return false;
            } else {
                throw zzbc.zzc("unsupported bit stream revision");
            }
        }
        return false;
    }

    public final boolean zzc(zzaco zzaco, long j) throws IOException {
        int i;
        zzcw.zzd(zzaco.zzf() == zzaco.zze());
        this.zzg.zzI(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if ((i == 0 || zzaco.zzf() + 4 < j) && zzacr.zzc(zzaco, this.zzg.zzN(), 0, 4, true)) {
                this.zzg.zzL(0);
                if (this.zzg.zzu() == 1332176723) {
                    zzaco.zzj();
                    return true;
                }
                zzaco.zzk(1);
            }
        }
        do {
            if ((i != 0 && zzaco.zzf() >= j) || zzaco.zzc(1) == -1) {
                return false;
            }
            break;
        } while (zzaco.zzc(1) == -1);
        return false;
    }
}
