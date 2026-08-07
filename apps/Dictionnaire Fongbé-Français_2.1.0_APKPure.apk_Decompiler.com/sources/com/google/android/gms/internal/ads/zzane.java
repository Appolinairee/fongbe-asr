package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzane implements zzabx {
    private final zzef zza;
    private final zzdy zzb = new zzdy();

    /* synthetic */ zzane(zzef zzef, zzanf zzanf) {
        this.zza = zzef;
    }

    public final zzabw zza(zzaco zzaco, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzaco.zzf();
        int min = (int) Math.min(20000, zzaco.zzd() - zzf);
        this.zzb.zzI(min);
        zzaco.zzh(this.zzb.zzN(), 0, min);
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            zzdy zzdy = this.zzb;
            if (zzdy.zzb() < 4) {
                return j3 != -9223372036854775807L ? zzabw.zzf(j3, zzf + ((long) i)) : zzabw.zza;
            }
            if (zzang.zzh(zzdy.zzN(), zzdy.zzd()) != 442) {
                zzdy.zzM(1);
            } else {
                zzdy.zzM(4);
                long zzc = zzanh.zzc(zzdy);
                if (zzc != -9223372036854775807L) {
                    long zzb2 = this.zza.zzb(zzc);
                    if (zzb2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzabw.zzd(zzb2, zzf);
                        }
                        j2 = (long) i2;
                    } else if (100000 + zzb2 > j) {
                        j2 = (long) zzdy.zzd();
                        break;
                    } else {
                        i2 = zzdy.zzd();
                        j3 = zzb2;
                    }
                }
                int zze = zzdy.zze();
                if (zzdy.zzb() >= 10) {
                    zzdy.zzM(9);
                    int zzm = zzdy.zzm() & 7;
                    if (zzdy.zzb() >= zzm) {
                        zzdy.zzM(zzm);
                        if (zzdy.zzb() >= 4) {
                            if (zzang.zzh(zzdy.zzN(), zzdy.zzd()) == 443) {
                                zzdy.zzM(4);
                                int zzq = zzdy.zzq();
                                if (zzdy.zzb() < zzq) {
                                    zzdy.zzL(zze);
                                } else {
                                    zzdy.zzM(zzq);
                                }
                            }
                            while (true) {
                                if (zzdy.zzb() < 4 || (zzh = zzang.zzh(zzdy.zzN(), zzdy.zzd())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzdy.zzM(4);
                                if (zzdy.zzb() < 2) {
                                    zzdy.zzL(zze);
                                    break;
                                }
                                zzdy.zzL(Math.min(zzdy.zze(), zzdy.zzd() + zzdy.zzq()));
                            }
                        } else {
                            zzdy.zzL(zze);
                        }
                    } else {
                        zzdy.zzL(zze);
                    }
                } else {
                    zzdy.zzL(zze);
                }
                i = zzdy.zzd();
            }
        }
        return zzabw.zze(zzf + j2);
    }

    public final void zzb() {
        byte[] bArr = zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
