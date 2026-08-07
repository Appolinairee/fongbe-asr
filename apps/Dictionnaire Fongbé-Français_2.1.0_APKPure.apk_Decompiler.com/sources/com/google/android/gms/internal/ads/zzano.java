package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzano implements zzabx {
    private final zzef zza;
    private final zzdy zzb = new zzdy();
    private final int zzc;

    public zzano(int i, zzef zzef, int i2) {
        this.zzc = i;
        this.zza = zzef;
    }

    public final zzabw zza(zzaco zzaco, long j) throws IOException {
        int zza2;
        int i;
        long zzf = zzaco.zzf();
        int min = (int) Math.min(112800, zzaco.zzd() - zzf);
        this.zzb.zzI(min);
        zzaco.zzh(this.zzb.zzN(), 0, min);
        zzdy zzdy = this.zzb;
        int zze = zzdy.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzdy.zzb() >= 188 && (i = zza2 + 188) <= zze) {
            long zzb2 = zzanz.zzb(zzdy, (zza2 = zzanz.zza(zzdy.zzN(), zzdy.zzd(), zze)), this.zzc);
            if (zzb2 != -9223372036854775807L) {
                long zzb3 = this.zza.zzb(zzb2);
                if (zzb3 <= j) {
                    j4 = (long) zza2;
                    if (100000 + zzb3 <= j) {
                        j3 = zzb3;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return zzabw.zzd(zzb3, zzf);
                }
                return zzabw.zze(zzf + j4);
            }
            zzdy.zzL(i);
            j2 = (long) i;
        }
        return j3 != -9223372036854775807L ? zzabw.zzf(j3, zzf + j2) : zzabw.zza;
    }

    public final void zzb() {
        byte[] bArr = zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
