package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzanz {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzdy zzdy, int i, int i2) {
        zzdy.zzL(i);
        if (zzdy.zzb() < 5) {
            return -9223372036854775807L;
        }
        int zzg = zzdy.zzg();
        if ((8388608 & zzg) != 0 || ((zzg >> 8) & 8191) != i2 || (zzg & 32) == 0 || zzdy.zzm() < 7 || zzdy.zzb() < 7 || (zzdy.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzdy.zzH(bArr, 0, 6);
        long j = ((long) bArr[3]) & 255;
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }
}
