package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzamb implements zzamj {
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

    public zzamb() {
        throw null;
    }

    public zzamb(String str, int i) {
        zzdx zzdx = new zzdx(new byte[128], 128);
        this.zza = zzdx;
        this.zzb = new zzdy(zzdx.zza);
        this.zzg = 0;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    public final void zza(zzdy zzdy) {
        zzcw.zzb(this.zzf);
        while (zzdy.zzb() > 0) {
            int i = this.zzg;
            boolean z = true;
            if (i == 0) {
                while (true) {
                    if (zzdy.zzb() <= 0) {
                        break;
                    } else if (!this.zzi) {
                        this.zzi = zzdy.zzm() == 11;
                    } else {
                        int zzm2 = zzdy.zzm();
                        if (zzm2 == 119) {
                            this.zzi = false;
                            this.zzg = 1;
                            zzdy zzdy2 = this.zzb;
                            zzdy2.zzN()[0] = Ascii.VT;
                            zzdy2.zzN()[1] = 119;
                            this.zzh = 2;
                            break;
                        }
                        this.zzi = zzm2 == 11;
                    }
                }
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
                int min2 = Math.min(zzdy.zzb(), 128 - this.zzh);
                zzdy.zzH(zzN, this.zzh, min2);
                int i3 = this.zzh + min2;
                this.zzh = i3;
                if (i3 == 128) {
                    this.zza.zzl(0);
                    zzabl zze2 = zzabn.zze(this.zza);
                    zzab zzab = this.zzk;
                    if (zzab == null || zze2.zzc != zzab.zzD || zze2.zzb != zzab.zzE || !Objects.equals(zze2.zza, zzab.zzo)) {
                        zzz zzz = new zzz();
                        zzz.zzM(this.zze);
                        zzz.zzaa(zze2.zza);
                        zzz.zzz(zze2.zzc);
                        zzz.zzab(zze2.zzb);
                        zzz.zzQ(this.zzc);
                        zzz.zzY(this.zzd);
                        zzz.zzV(zze2.zzf);
                        if ("audio/ac3".equals(zze2.zza)) {
                            zzz.zzy(zze2.zzf);
                        }
                        zzab zzag = zzz.zzag();
                        this.zzk = zzag;
                        this.zzf.zzm(zzag);
                    }
                    this.zzl = zze2.zzd;
                    this.zzj = (((long) zze2.zze) * 1000000) / ((long) this.zzk.zzE);
                    this.zzb.zzL(0);
                    this.zzf.zzr(this.zzb, 128);
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
