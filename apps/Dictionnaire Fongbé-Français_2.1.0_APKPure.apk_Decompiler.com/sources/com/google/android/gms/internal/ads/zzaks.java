package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaks {
    private final zzdy zza = new zzdy();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static /* bridge */ /* synthetic */ void zzb(zzaks zzaks, zzdy zzdy, int i) {
        int zzo;
        if (i >= 4) {
            zzdy.zzM(3);
            int i2 = i - 4;
            if ((zzdy.zzm() & 128) != 0) {
                if (i2 >= 7 && (zzo = zzdy.zzo()) >= 4) {
                    zzaks.zzh = zzdy.zzq();
                    zzaks.zzi = zzdy.zzq();
                    zzaks.zza.zzI(zzo - 4);
                    i2 = i - 11;
                } else {
                    return;
                }
            }
            zzdy zzdy2 = zzaks.zza;
            int zzd2 = zzdy2.zzd();
            int zze2 = zzdy2.zze();
            if (zzd2 < zze2 && i2 > 0) {
                int min = Math.min(i2, zze2 - zzd2);
                zzdy.zzH(zzdy2.zzN(), zzd2, min);
                zzaks.zza.zzL(zzd2 + min);
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzc(zzaks zzaks, zzdy zzdy, int i) {
        if (i >= 19) {
            zzaks.zzd = zzdy.zzq();
            zzaks.zze = zzdy.zzq();
            zzdy.zzM(11);
            zzaks.zzf = zzdy.zzq();
            zzaks.zzg = zzdy.zzq();
        }
    }

    static /* bridge */ /* synthetic */ void zzd(zzaks zzaks, zzdy zzdy, int i) {
        zzaks zzaks2 = zzaks;
        if (i % 5 == 2) {
            zzdy.zzM(2);
            int i2 = 0;
            Arrays.fill(zzaks2.zzb, 0);
            int i3 = i / 5;
            int i4 = 0;
            while (i4 < i3) {
                int zzm = zzdy.zzm();
                int zzm2 = zzdy.zzm();
                int zzm3 = zzdy.zzm();
                int zzm4 = zzdy.zzm();
                int zzm5 = zzdy.zzm();
                double d = (double) zzm2;
                double d2 = (double) (zzm3 - 128);
                int i5 = i4;
                double d3 = (double) (zzm4 - 128);
                zzaks2.zzb[zzm] = Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)) | (zzm5 << 24) | (Math.max(i2, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
                i4 = i5 + 1;
                i2 = 0;
            }
            zzaks2.zzc = true;
        }
    }

    public final zzco zza() {
        int i;
        int i2;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzdy zzdy = this.zza;
        if (zzdy.zze() == 0 || zzdy.zzd() != zzdy.zze() || !this.zzc) {
            return null;
        }
        zzdy.zzL(0);
        int i3 = this.zzh * this.zzi;
        int[] iArr = new int[i3];
        int i4 = 0;
        while (i4 < i3) {
            int zzm = this.zza.zzm();
            if (zzm != 0) {
                i2 = i4 + 1;
                iArr[i4] = this.zzb[zzm];
            } else {
                int zzm2 = this.zza.zzm();
                if (zzm2 != 0) {
                    int i5 = zzm2 & 63;
                    if ((zzm2 & 64) != 0) {
                        i5 = (i5 << 8) | this.zza.zzm();
                    }
                    if ((zzm2 & 128) == 0) {
                        i = this.zzb[0];
                    } else {
                        i = this.zzb[this.zza.zzm()];
                    }
                    i2 = i5 + i4;
                    Arrays.fill(iArr, i4, i2, i);
                }
            }
            i4 = i2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcm zzcm = new zzcm();
        zzcm.zzc(createBitmap);
        zzcm.zzh(((float) this.zzf) / ((float) this.zzd));
        zzcm.zzi(0);
        zzcm.zze(((float) this.zzg) / ((float) this.zze), 0);
        zzcm.zzf(0);
        zzcm.zzk(((float) this.zzh) / ((float) this.zzd));
        zzcm.zzd(((float) this.zzi) / ((float) this.zze));
        return zzcm.zzp();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzI(0);
        this.zzc = false;
    }
}
