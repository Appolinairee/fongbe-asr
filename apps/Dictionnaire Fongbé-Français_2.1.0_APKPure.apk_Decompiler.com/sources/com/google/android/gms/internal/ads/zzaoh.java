package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaoh {
    public static Pair zza(zzaco zzaco) throws IOException {
        zzaco.zzj();
        zzaog zzd = zzd(1684108385, zzaco, new zzdy(8));
        zzaco.zzk(8);
        return Pair.create(Long.valueOf(zzaco.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaof zzb(zzaco zzaco) throws IOException {
        byte[] bArr;
        zzaco zzaco2 = zzaco;
        zzdy zzdy = new zzdy(16);
        zzaog zzd = zzd(1718449184, zzaco2, zzdy);
        zzcw.zzf(zzd.zzb >= 16);
        zzaco2.zzh(zzdy.zzN(), 0, 16);
        zzdy.zzL(0);
        int zzk = zzdy.zzk();
        int zzk2 = zzdy.zzk();
        int zzj = zzdy.zzj();
        int zzj2 = zzdy.zzj();
        int zzk3 = zzdy.zzk();
        int zzk4 = zzdy.zzk();
        int i = ((int) zzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzaco2.zzh(bArr, 0, i);
        } else {
            bArr = zzei.zzf;
        }
        byte[] bArr2 = bArr;
        zzaco2.zzk((int) (zzaco.zze() - zzaco.zzf()));
        return new zzaof(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr2);
    }

    public static boolean zzc(zzaco zzaco) throws IOException {
        zzdy zzdy = new zzdy(8);
        int i = zzaog.zza(zzaco, zzdy).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzaco.zzh(zzdy.zzN(), 0, 4);
        zzdy.zzL(0);
        int zzg = zzdy.zzg();
        if (zzg == 1463899717) {
            return true;
        }
        zzdo.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
        return false;
    }

    private static zzaog zzd(int i, zzaco zzaco, zzdy zzdy) throws IOException {
        zzaog zza = zzaog.zza(zzaco, zzdy);
        while (true) {
            int i2 = zza.zza;
            if (i2 == i) {
                return zza;
            }
            zzdo.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = zza.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 <= 2147483647L) {
                zzaco.zzk((int) j2);
                zza = zzaog.zza(zzaco, zzdy);
            } else {
                int i3 = zza.zza;
                throw zzbc.zzc("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
        }
    }
}
