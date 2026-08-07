package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzanl implements zzany {
    private final zzank zza;
    private final zzdy zzb = new zzdy(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzanl(zzank zzank) {
        this.zza = zzank;
    }

    public final void zza(zzdy zzdy, int i) {
        int i2 = i & 1;
        int zzd2 = i2 != 0 ? zzdy.zzd() + zzdy.zzm() : -1;
        if (this.zzf) {
            if (i2 != 0) {
                this.zzf = false;
                zzdy.zzL(zzd2);
                this.zzd = 0;
            } else {
                return;
            }
        }
        while (zzdy.zzb() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzm = zzdy.zzm();
                    zzdy.zzL(zzdy.zzd() - 1);
                    if (zzm == 255) {
                    }
                }
                int min = Math.min(zzdy.zzb(), 3 - this.zzd);
                zzdy.zzH(this.zzb.zzN(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzL(0);
                    this.zzb.zzK(3);
                    this.zzb.zzM(1);
                    zzdy zzdy2 = this.zzb;
                    int zzm2 = zzdy2.zzm();
                    boolean z = (zzm2 & 128) != 0;
                    int zzm3 = zzdy2.zzm();
                    this.zze = z;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc2 = this.zzb.zzc();
                    int i5 = this.zzc;
                    if (zzc2 < i5) {
                        int zzc3 = this.zzb.zzc();
                        this.zzb.zzF(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i5, zzc3 + zzc3)));
                    }
                }
            } else {
                int min2 = Math.min(zzdy.zzb(), this.zzc - i3);
                zzdy.zzH(this.zzb.zzN(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzK(i7);
                    } else if (zzei.zzf(this.zzb.zzN(), 0, i7, -1) == 0) {
                        this.zzb.zzK(this.zzc - 4);
                    }
                    this.zzb.zzL(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
            this.zzf = true;
            return;
        }
    }

    public final void zzb(zzef zzef, zzacq zzacq, zzanx zzanx) {
        this.zza.zzb(zzef, zzacq, zzanx);
        this.zzf = true;
    }

    public final void zzc() {
        this.zzf = true;
    }
}
