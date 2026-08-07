package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzamd implements zzamj {
    private final zzdx zza;
    private final zzdy zzb;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadt zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzab zzk;
    private int zzl;
    private long zzm;

    public zzamd() {
        throw null;
    }

    public zzamd(String str, int i) {
        zzdx zzdx = new zzdx(new byte[16], 16);
        this.zza = zzdx;
        this.zzb = new zzdy(zzdx.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    public final void zza(zzdy zzdy) {
        int zzm2;
        byte b;
        zzcw.zzb(this.zzf);
        while (zzdy.zzb() > 0) {
            int i = this.zzg;
            boolean z = true;
            if (i == 0) {
                while (true) {
                    if (zzdy.zzb() <= 0) {
                        break;
                    } else if (!this.zzi) {
                        this.zzi = zzdy.zzm() == 172;
                    } else {
                        zzm2 = zzdy.zzm();
                        this.zzi = zzm2 == 172;
                        b = SignedBytes.MAX_POWER_OF_TWO;
                        if (zzm2 == 64) {
                            break;
                        } else if (zzm2 == 65) {
                            zzm2 = 65;
                            break;
                        }
                    }
                }
                this.zzg = 1;
                zzdy zzdy2 = this.zzb;
                zzdy2.zzN()[0] = -84;
                if (zzm2 == 65) {
                    b = 65;
                }
                zzdy2.zzN()[1] = b;
                this.zzh = 2;
            } else if (i != 1) {
                int min = Math.min(zzdy.zzb(), this.zzl - this.zzh);
                this.zzf.zzr(zzdy, min);
                int i2 = this.zzh + min;
                this.zzh = i2;
                if (i2 == this.zzl) {
                    if (this.zzm == -9223372036854775807L) {
                        z = false;
                    }
                    zzcw.zzf(z);
                    this.zzf.zzt(this.zzm, 1, this.zzl, 0, (zzads) null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                }
            } else {
                byte[] zzN = this.zzb.zzN();
                int min2 = Math.min(zzdy.zzb(), 16 - this.zzh);
                zzdy.zzH(zzN, this.zzh, min2);
                int i3 = this.zzh + min2;
                this.zzh = i3;
                if (i3 == 16) {
                    this.zza.zzl(0);
                    zzabo zza2 = zzabq.zza(this.zza);
                    zzab zzab = this.zzk;
                    if (zzab == null || zzab.zzD != 2 || zza2.zza != zzab.zzE || !"audio/ac4".equals(zzab.zzo)) {
                        zzz zzz = new zzz();
                        zzz.zzM(this.zze);
                        zzz.zzaa("audio/ac4");
                        zzz.zzz(2);
                        zzz.zzab(zza2.zza);
                        zzz.zzQ(this.zzc);
                        zzz.zzY(this.zzd);
                        zzab zzag = zzz.zzag();
                        this.zzk = zzag;
                        this.zzf.zzm(zzag);
                    }
                    this.zzl = zza2.zzb;
                    this.zzj = (((long) zza2.zzc) * 1000000) / ((long) this.zzk.zzE);
                    this.zzb.zzL(0);
                    this.zzf.zzr(this.zzb, 16);
                    this.zzg = 2;
                }
            }
        }
    }

    public final void zzb(zzacq zzacq, zzanx zzanx) {
        zzanx.zzc();
        this.zze = zzanx.zzb();
        this.zzf = zzacq.zzw(zzanx.zza(), 1);
    }

    public final void zzc(boolean z) {
    }

    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
    }
}
