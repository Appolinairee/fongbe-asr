package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzamw implements zzamj {
    private final zzdy zza = new zzdy(new byte[15], 2);
    private final zzdx zzb = new zzdx();
    private final zzdy zzc = new zzdy();
    private int zzd = 0;
    private String zze;
    private zzadt zzf;
    private double zzg = -9.223372036854776E18d;
    private double zzh = -9.223372036854776E18d;
    private boolean zzi;
    private boolean zzj = true;
    private int zzk;
    private int zzl;
    private boolean zzm = true;
    private int zzn;
    private int zzo;
    private final zzamx zzp = new zzamx();
    private int zzq = -2147483647;
    private int zzr = -1;
    private int zzs;
    private long zzt = -1;
    private boolean zzu;

    private static final void zzf(zzdy zzdy, zzdy zzdy2, boolean z) {
        int zzd2 = zzdy.zzd();
        int min = Math.min(zzdy.zzb(), zzdy2.zzb());
        zzdy.zzH(zzdy2.zzN(), zzdy2.zzd(), min);
        zzdy2.zzM(min);
        if (z) {
            zzdy.zzL(zzd2);
        }
    }

    public final void zza(zzdy zzdy) throws zzbc {
        int i;
        zzcw.zzb(this.zzf);
        while (zzdy.zzb() > 0) {
            int i2 = this.zzd;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.zzk;
                if ((i4 & 2) == 0) {
                    zzdy.zzL(zzdy.zze());
                } else {
                    if ((i4 & 4) == 0) {
                        while (true) {
                            if (zzdy.zzb() <= 0) {
                                break;
                            }
                            int i5 = this.zzl << 8;
                            this.zzl = i5;
                            int zzm2 = i5 | zzdy.zzm();
                            this.zzl = zzm2;
                            if ((zzm2 & ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                                zzdy.zzL(zzdy.zzd() - 3);
                                this.zzl = 0;
                                break;
                            }
                        }
                    }
                    this.zzd = 1;
                }
            } else if (i2 != 1) {
                int i6 = this.zzp.zza;
                if (i6 == 1 || i6 == 17) {
                    zzf(zzdy, this.zzc, true);
                }
                int min = Math.min(zzdy.zzb(), this.zzp.zzc - this.zzn);
                this.zzf.zzr(zzdy, min);
                int i7 = this.zzn + min;
                this.zzn = i7;
                zzamx zzamx = this.zzp;
                if (i7 == zzamx.zzc) {
                    int i8 = zzamx.zza;
                    if (i8 == 1) {
                        byte[] zzN = this.zzc.zzN();
                        zzamy zza2 = zzana.zza(new zzdx(zzN, zzN.length));
                        this.zzq = zza2.zzb;
                        this.zzr = zza2.zzc;
                        long j = this.zzt;
                        long j2 = this.zzp.zzb;
                        if (j != j2) {
                            this.zzt = j2;
                            int i9 = zza2.zza;
                            String str = "mhm1";
                            if (i9 != -1) {
                                str = str.concat(String.valueOf(String.format(".%02X", new Object[]{Integer.valueOf(i9)})));
                            }
                            byte[] bArr = zza2.zzd;
                            zzfxn zzfxn = null;
                            if (bArr != null && bArr.length > 0) {
                                zzfxn = zzfxn.zzp(zzei.zzf, bArr);
                            }
                            zzz zzz = new zzz();
                            zzz.zzM(this.zze);
                            zzz.zzaa("audio/mhm1");
                            zzz.zzab(this.zzq);
                            zzz.zzA(str);
                            zzz.zzN(zzfxn);
                            this.zzf.zzm(zzz.zzag());
                        }
                        this.zzu = true;
                    } else if (i8 == 17) {
                        byte[] zzN2 = this.zzc.zzN();
                        zzdx zzdx = new zzdx(zzN2, zzN2.length);
                        if (zzdx.zzp()) {
                            zzdx.zzn(2);
                            i3 = zzdx.zzd(13);
                        }
                        this.zzs = i3;
                    } else if (i8 == 2) {
                        if (this.zzu) {
                            this.zzj = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i10 = this.zzr - this.zzs;
                        double d = (double) this.zzq;
                        long round = Math.round(this.zzg);
                        if (this.zzi) {
                            this.zzi = false;
                            this.zzg = this.zzh;
                        } else {
                            this.zzg += (((double) i10) * 1000000.0d) / d;
                        }
                        this.zzf.zzt(round, i, this.zzo, 0, (zzads) null);
                        this.zzu = false;
                        this.zzs = 0;
                        this.zzo = 0;
                    }
                    this.zzd = 1;
                }
            } else {
                zzf(zzdy, this.zza, false);
                zzdy zzdy2 = this.zza;
                if (zzdy2.zzb() == 0) {
                    zzdx zzdx2 = this.zzb;
                    int zze2 = zzdy2.zze();
                    zzdx2.zzk(zzdy2.zzN(), zze2);
                    if (zzana.zzb(this.zzb, this.zzp)) {
                        this.zzn = 0;
                        this.zzo += this.zzp.zzc + zze2;
                        this.zza.zzL(0);
                        zzadt zzadt = this.zzf;
                        zzdy zzdy3 = this.zza;
                        zzadt.zzr(zzdy3, zzdy3.zze());
                        this.zza.zzI(2);
                        this.zzc.zzI(this.zzp.zzc);
                        this.zzm = true;
                        this.zzd = 2;
                    } else {
                        zzdy zzdy4 = this.zza;
                        if (zzdy4.zze() < 15) {
                            zzdy4.zzK(zzdy4.zze() + 1);
                        }
                    }
                }
                this.zzm = false;
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
        this.zzk = i;
        if (!this.zzj && (this.zzo != 0 || !this.zzm)) {
            this.zzi = true;
        }
        if (j != -9223372036854775807L) {
            double d = (double) j;
            if (this.zzi) {
                this.zzh = d;
            } else {
                this.zzg = d;
            }
        }
    }

    public final void zze() {
        this.zzd = 0;
        this.zzl = 0;
        this.zza.zzI(2);
        this.zzn = 0;
        this.zzo = 0;
        this.zzq = -2147483647;
        this.zzr = -1;
        this.zzs = 0;
        this.zzt = -1;
        this.zzu = false;
        this.zzi = false;
        this.zzm = true;
        this.zzj = true;
        this.zzg = -9.223372036854776E18d;
        this.zzh = -9.223372036854776E18d;
    }
}
