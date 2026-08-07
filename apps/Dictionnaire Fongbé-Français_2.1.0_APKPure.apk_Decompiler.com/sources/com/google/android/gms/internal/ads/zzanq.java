package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzanq {
    private final zzef zza = new zzef(0);
    private final zzdy zzb = new zzdy();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    zzanq(int i) {
    }

    private final int zze(zzaco zzaco) {
        byte[] bArr = zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzaco.zzj();
        return 0;
    }

    public final int zza(zzaco zzaco, zzadj zzadj, int i) throws IOException {
        if (i <= 0) {
            zze(zzaco);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzaco.zzd();
            int min = (int) Math.min(112800, zzd2);
            long j2 = zzd2 - ((long) min);
            if (zzaco.zzf() != j2) {
                zzadj.zza = j2;
            } else {
                this.zzb.zzI(min);
                zzaco.zzj();
                zzaco.zzh(this.zzb.zzN(), 0, min);
                zzdy zzdy = this.zzb;
                int zzd3 = zzdy.zzd();
                int zze2 = zzdy.zze();
                int i2 = zze2 - 188;
                while (true) {
                    if (i2 < zzd3) {
                        break;
                    }
                    byte[] zzN = zzdy.zzN();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < zzd3 || i5 >= zze2 || zzN[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long zzb2 = zzanz.zzb(zzdy, i2, i);
                                if (zzb2 != -9223372036854775807L) {
                                    j = zzb2;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
        } else if (this.zzg == -9223372036854775807L) {
            zze(zzaco);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(112800, zzaco.zzd());
            if (zzaco.zzf() != 0) {
                zzadj.zza = 0;
            } else {
                this.zzb.zzI(min2);
                zzaco.zzj();
                zzaco.zzh(this.zzb.zzN(), 0, min2);
                zzdy zzdy2 = this.zzb;
                int zzd4 = zzdy2.zzd();
                int zze3 = zzdy2.zze();
                while (true) {
                    if (zzd4 >= zze3) {
                        break;
                    }
                    if (zzdy2.zzN()[zzd4] == 71) {
                        long zzb3 = zzanz.zzb(zzdy2, zzd4, i);
                        if (zzb3 != -9223372036854775807L) {
                            j = zzb3;
                            break;
                        }
                    }
                    zzd4++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
        } else {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzaco);
                return 0;
            }
            zzef zzef = this.zza;
            this.zzh = zzef.zzc(this.zzg) - zzef.zzb(j3);
            zze(zzaco);
            return 0;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzef zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
