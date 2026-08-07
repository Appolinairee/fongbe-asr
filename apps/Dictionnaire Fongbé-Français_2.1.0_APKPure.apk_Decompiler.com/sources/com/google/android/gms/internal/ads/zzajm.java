package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzajm {
    private final zzajn zza = new zzajn();
    private final zzdy zzb = new zzdy(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzajm() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzajn zzajn = this.zza;
            if (i5 >= zzajn.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzajn.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzdy zza() {
        return this.zzb;
    }

    public final zzajn zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzI(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzdy zzdy = this.zzb;
        if (zzdy.zzN().length != 65025) {
            zzdy.zzJ(Arrays.copyOf(zzdy.zzN(), Math.max(65025, zzdy.zze())), this.zzb.zze());
        }
    }

    public final boolean zze(zzaco zzaco) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzI(0);
        }
        while (true) {
            boolean z = true;
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzaco, -1) || !this.zza.zzb(zzaco, true)) {
                    return false;
                }
                zzajn zzajn = this.zza;
                int i2 = zzajn.zzd;
                if ((zzajn.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzacr.zze(zzaco, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzdy zzdy = this.zzb;
                zzdy.zzF(zzdy.zze() + zzf);
                zzdy zzdy2 = this.zzb;
                if (!zzacr.zzd(zzaco, zzdy2.zzN(), zzdy2.zze(), zzf)) {
                    return false;
                }
                zzdy zzdy3 = this.zzb;
                zzdy3.zzK(zzdy3.zze() + zzf);
                if (this.zza.zzf[i3 - 1] == 255) {
                    z = false;
                }
                this.zze = z;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
        return false;
    }
}
