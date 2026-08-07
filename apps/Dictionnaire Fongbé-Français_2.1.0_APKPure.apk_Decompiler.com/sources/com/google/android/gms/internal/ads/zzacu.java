package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzacu {
    public static int zza(zzdy zzdy, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzdy.zzm() + 1;
            case 7:
                return zzdy.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzaco zzaco, zzacy zzacy) throws IOException {
        zzaco.zzj();
        zzaco.zzg(1);
        byte[] bArr = new byte[1];
        zzaco.zzh(bArr, 0, 1);
        byte b = bArr[0] & 1;
        boolean z = 1 == b;
        zzaco.zzg(2);
        int i = 1 != b ? 6 : 7;
        zzdy zzdy = new zzdy(i);
        zzdy.zzK(zzacr.zza(zzaco, zzdy.zzN(), 0, i));
        zzaco.zzj();
        zzact zzact = new zzact();
        if (zzd(zzdy, zzacy, z, zzact)) {
            return zzact.zza;
        }
        throw zzbc.zza((String) null, (Throwable) null);
    }

    public static boolean zzc(zzdy zzdy, zzacy zzacy, int i, zzact zzact) {
        int zza;
        zzdy zzdy2 = zzdy;
        zzacy zzacy2 = zzacy;
        int zzd = zzdy.zzd();
        long zzu = zzdy.zzu();
        long j = zzu >>> 16;
        if (j != ((long) i)) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = zzu >> 12;
        long j3 = zzu >> 8;
        long j4 = zzu >> 4;
        long j5 = zzu >> 1;
        long j6 = zzu & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzacy2.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzacy2.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if ((i3 != 0 && i3 != zzacy2.zzi) || j6 == 1 || !zzd(zzdy2, zzacy2, z, zzact) || (zza = zza(zzdy2, (int) (j2 & 15))) == -1 || zza > zzacy2.zzb) {
            return false;
        }
        int i4 = zzacy2.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzacy2.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzdy.zzm() * 1000 != i4) {
                    return false;
                }
            } else if (i5 > 14) {
                return false;
            } else {
                int zzq = zzdy.zzq();
                if (i5 == 14) {
                    zzq *= 10;
                }
                if (zzq != i4) {
                    return false;
                }
            }
        }
        return zzdy.zzm() == zzei.zzg(zzdy.zzN(), zzd, zzdy.zzd() + -1, 0);
    }

    private static boolean zzd(zzdy zzdy, zzacy zzacy, boolean z, zzact zzact) {
        try {
            long zzx = zzdy.zzx();
            if (!z) {
                zzx *= (long) zzacy.zzb;
            }
            zzact.zza = zzx;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
