package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzacv {
    public static zzacx zzb(zzdy zzdy) {
        zzdy.zzM(1);
        int zzo = zzdy.zzo();
        long zzd = (long) zzdy.zzd();
        long j = (long) zzo;
        int i = zzo / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzt = zzdy.zzt();
            if (zzt == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzt;
            jArr2[i2] = zzdy.zzt();
            zzdy.zzM(2);
            i2++;
        }
        zzdy.zzM((int) ((zzd + j) - ((long) zzdy.zzd())));
        return new zzacx(jArr, jArr2);
    }

    public static zzay zza(zzaco zzaco, boolean z) throws IOException {
        zzay zza = new zzadd().zza(zzaco, z ? null : zzagg.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
