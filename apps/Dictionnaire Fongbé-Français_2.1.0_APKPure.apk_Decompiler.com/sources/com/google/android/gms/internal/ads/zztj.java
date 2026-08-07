package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zztj implements zzvy {
    public final zzvy zza;
    final /* synthetic */ zztk zzb;
    private boolean zzc;

    public zztj(zztk zztk, zzvy zzvy) {
        this.zzb = zztk;
        this.zza = zzvy;
    }

    public final int zza(zzke zzke, zzhh zzhh, int i) {
        zztk zztk = this.zzb;
        if (zztk.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhh.zzc(4);
            return -4;
        }
        long zzb2 = zztk.zzb();
        int zza2 = this.zza.zza(zzke, zzhh, i);
        if (zza2 == -5) {
            zzab zzab = zzke.zza;
            zzab.getClass();
            zzab zzab2 = zzab;
            int i2 = zzab.zzG;
            int i3 = 0;
            if (i2 == 0) {
                if (zzab.zzH != 0) {
                    i2 = 0;
                }
                return -5;
            }
            if (this.zzb.zzb == Long.MIN_VALUE) {
                i3 = zzab.zzH;
            }
            zzz zzb3 = zzab.zzb();
            zzb3.zzG(i2);
            zzb3.zzH(i3);
            zzke.zza = zzb3.zzag();
            return -5;
        }
        long j = this.zzb.zzb;
        if (j == Long.MIN_VALUE || ((zza2 != -4 || zzhh.zze < j) && (zza2 != -3 || zzb2 != Long.MIN_VALUE || zzhh.zzd))) {
            return zza2;
        }
        zzhh.zzb();
        zzhh.zzc(4);
        this.zzc = true;
        return -4;
    }

    public final int zzb(long j) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j);
    }

    public final void zzc() {
        this.zzc = false;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
