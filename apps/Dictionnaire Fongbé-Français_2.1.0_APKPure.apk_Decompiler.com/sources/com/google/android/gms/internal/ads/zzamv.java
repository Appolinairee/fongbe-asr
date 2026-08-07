package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzamv implements zzamj {
    private final zzdy zza;
    private final zzadf zzb;
    private final String zzc;
    private final int zzd;
    private zzadt zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzamv() {
        throw null;
    }

    public zzamv(String str, int i) {
        this.zzg = 0;
        zzdy zzdy = new zzdy(4);
        this.zza = zzdy;
        zzdy.zzN()[0] = -1;
        this.zzb = new zzadf();
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    public final void zza(zzdy zzdy) {
        zzcw.zzb(this.zze);
        while (zzdy.zzb() > 0) {
            int i = this.zzg;
            boolean z = true;
            if (i == 0) {
                byte[] zzN = zzdy.zzN();
                int zzd2 = zzdy.zzd();
                int zze2 = zzdy.zze();
                while (true) {
                    if (zzd2 >= zze2) {
                        zzdy.zzL(zze2);
                        break;
                    }
                    int i2 = zzd2 + 1;
                    byte b = zzN[zzd2];
                    boolean z2 = (b & 255) == 255;
                    boolean z3 = this.zzj && (b & 224) == 224;
                    this.zzj = z2;
                    if (z3) {
                        zzdy.zzL(i2);
                        this.zzj = false;
                        this.zza.zzN()[1] = zzN[zzd2];
                        this.zzh = 2;
                        this.zzg = 1;
                        break;
                    }
                    zzd2 = i2;
                }
            } else if (i != 1) {
                int min = Math.min(zzdy.zzb(), this.zzl - this.zzh);
                this.zze.zzr(zzdy, min);
                int i3 = this.zzh + min;
                this.zzh = i3;
                if (i3 >= this.zzl) {
                    if (this.zzm == -9223372036854775807L) {
                        z = false;
                    }
                    zzcw.zzf(z);
                    this.zze.zzt(this.zzm, 1, this.zzl, 0, (zzads) null);
                    this.zzm += this.zzk;
                    this.zzh = 0;
                    this.zzg = 0;
                }
            } else {
                int min2 = Math.min(zzdy.zzb(), 4 - this.zzh);
                zzdy.zzH(this.zza.zzN(), this.zzh, min2);
                int i4 = this.zzh + min2;
                this.zzh = i4;
                if (i4 >= 4) {
                    this.zza.zzL(0);
                    if (!this.zzb.zza(this.zza.zzg())) {
                        this.zzh = 0;
                        this.zzg = 1;
                    } else {
                        zzadf zzadf = this.zzb;
                        this.zzl = zzadf.zzc;
                        if (!this.zzi) {
                            this.zzk = (((long) zzadf.zzg) * 1000000) / ((long) zzadf.zzd);
                            zzz zzz = new zzz();
                            zzz.zzM(this.zzf);
                            zzz.zzaa(this.zzb.zzb);
                            zzz.zzR(4096);
                            zzz.zzz(this.zzb.zze);
                            zzz.zzab(this.zzb.zzd);
                            zzz.zzQ(this.zzc);
                            zzz.zzY(this.zzd);
                            this.zze.zzm(zzz.zzag());
                            this.zzi = true;
                        }
                        this.zza.zzL(0);
                        this.zze.zzr(this.zza, 4);
                        this.zzg = 2;
                    }
                }
            }
        }
    }

    public final void zzb(zzacq zzacq, zzanx zzanx) {
        zzanx.zzc();
        this.zzf = zzanx.zzb();
        this.zze = zzacq.zzw(zzanx.zza(), 1);
    }

    public final void zzc(boolean z) {
    }

    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
    }
}
