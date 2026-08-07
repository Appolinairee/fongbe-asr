package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzabz {
    public static void zza(long j, zzdy zzdy, zzadt[] zzadtArr) {
        int i;
        while (true) {
            boolean z = true;
            if (zzdy.zzb() > 1) {
                int zzc = zzc(zzdy);
                int zzc2 = zzc(zzdy);
                int zzd = zzdy.zzd() + zzc2;
                if (zzc2 == -1 || zzc2 > zzdy.zzb()) {
                    zzdo.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    zzd = zzdy.zze();
                } else if (zzc == 4 && zzc2 >= 8) {
                    int zzm = zzdy.zzm();
                    int zzq = zzdy.zzq();
                    if (zzq == 49) {
                        i = zzdy.zzg();
                        zzq = 49;
                    } else {
                        i = 0;
                    }
                    int zzm2 = zzdy.zzm();
                    if (zzq == 47) {
                        zzdy.zzM(1);
                        zzq = 47;
                    }
                    boolean z2 = zzm == 181 && (zzq == 49 || zzq == 47) && zzm2 == 3;
                    if (zzq == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        zzb(j, zzdy, zzadtArr);
                    }
                }
                zzdy.zzL(zzd);
            } else {
                return;
            }
        }
    }

    public static void zzb(long j, zzdy zzdy, zzadt[] zzadtArr) {
        zzdy zzdy2 = zzdy;
        zzadt[] zzadtArr2 = zzadtArr;
        int zzm = zzdy.zzm();
        if ((zzm & 64) != 0) {
            int i = zzm & 31;
            zzdy2.zzM(1);
            int zzd = zzdy.zzd();
            for (zzadt zzadt : zzadtArr2) {
                int i2 = i * 3;
                zzdy2.zzL(zzd);
                zzadt.zzr(zzdy2, i2);
                zzcw.zzf(j != -9223372036854775807L);
                zzadt.zzt(j, 1, i2, 0, (zzads) null);
            }
        }
    }

    private static int zzc(zzdy zzdy) {
        int i = 0;
        while (zzdy.zzb() != 0) {
            int zzm = zzdy.zzm();
            i += zzm;
            if (zzm != 255) {
                return i;
            }
        }
        return -1;
    }
}
