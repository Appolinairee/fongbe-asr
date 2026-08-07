package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaes implements zzacn {
    private final byte[] zza;
    private final zzdy zzb;
    private final zzact zzc;
    private zzacq zzd;
    private zzadt zze;
    private int zzf;
    private zzay zzg;
    private zzacy zzh;
    private int zzi;
    private int zzj;
    private zzaer zzk;
    private int zzl;
    private long zzm;

    public zzaes() {
        throw null;
    }

    public zzaes(int i) {
        this.zza = new byte[42];
        this.zzb = new zzdy(new byte[32768], 0);
        this.zzc = new zzact();
        this.zzf = 0;
    }

    private final long zza(zzdy zzdy, boolean z) {
        boolean z2;
        this.zzh.getClass();
        int zzd2 = zzdy.zzd();
        while (zzd2 <= zzdy.zze() - 16) {
            zzdy.zzL(zzd2);
            if (zzacu.zzc(zzdy, this.zzh, this.zzj, this.zzc)) {
                zzdy.zzL(zzd2);
                return this.zzc.zza;
            }
            zzd2++;
        }
        if (z) {
            while (zzd2 <= zzdy.zze() - this.zzi) {
                zzdy.zzL(zzd2);
                try {
                    z2 = zzacu.zzc(zzdy, this.zzh, this.zzj, this.zzc);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (zzdy.zzd() <= zzdy.zze() && z2) {
                    zzdy.zzL(zzd2);
                    return this.zzc.zza;
                }
                zzd2++;
            }
            zzdy.zzL(zzdy.zze());
            return -1;
        }
        zzdy.zzL(zzd2);
        return -1;
    }

    private final void zzg() {
        zzacy zzacy = this.zzh;
        int i = zzei.zza;
        zzacy zzacy2 = zzacy;
        long j = (this.zzm * 1000000) / ((long) zzacy.zze);
        zzadt zzadt = this.zze;
        zzadt zzadt2 = zzadt;
        zzadt.zzt(j, 1, this.zzl, 0, (zzads) null);
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zzd = zzacq;
        this.zze = zzacq.zzw(0, 1);
        zzacq.zzD();
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        zzacv.zza(zzaco, false);
        zzdy zzdy = new zzdy(4);
        ((zzacc) zzaco).zzm(zzdy.zzN(), 0, 4, false);
        if (zzdy.zzu() == 1716281667) {
            return true;
        }
        return false;
    }

    public final void zzf(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzaer zzaer = this.zzk;
            if (zzaer != null) {
                zzaer.zzd(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.zzm = j3;
        this.zzl = 0;
        this.zzb.zzI(0);
    }

    public final int zzb(zzaco zzaco, zzadj zzadj) throws IOException {
        boolean zzp;
        zzadm zzadm;
        zzaco zzaco2 = zzaco;
        int i = this.zzf;
        boolean z = true;
        if (i == 0) {
            zzaco.zzj();
            long zze2 = zzaco.zze();
            zzay zza2 = zzacv.zza(zzaco2, true);
            zzaco2.zzk((int) (zzaco.zze() - zze2));
            this.zzg = zza2;
            this.zzf = 1;
            return 0;
        } else if (i == 1) {
            zzaco2.zzh(this.zza, 0, 42);
            zzaco.zzj();
            this.zzf = 2;
            return 0;
        } else if (i == 2) {
            zzdy zzdy = new zzdy(4);
            zzaco2.zzi(zzdy.zzN(), 0, 4);
            if (zzdy.zzu() == 1716281667) {
                this.zzf = 3;
                return 0;
            }
            throw zzbc.zza("Failed to read FLAC stream marker.", (Throwable) null);
        } else if (i == 3) {
            zzacy zzacy = this.zzh;
            do {
                zzaco.zzj();
                zzdx zzdx = new zzdx(new byte[4], 4);
                zzaco2.zzh(zzdx.zza, 0, 4);
                zzp = zzdx.zzp();
                int zzd2 = zzdx.zzd(7);
                int zzd3 = zzdx.zzd(24) + 4;
                if (zzd2 == 0) {
                    byte[] bArr = new byte[38];
                    zzaco2.zzi(bArr, 0, 38);
                    zzacy = new zzacy(bArr, 4);
                } else if (zzacy == null) {
                    throw new IllegalArgumentException();
                } else if (zzd2 == 3) {
                    zzdy zzdy2 = new zzdy(zzd3);
                    zzaco2.zzi(zzdy2.zzN(), 0, zzd3);
                    zzacy = zzacy.zzf(zzacv.zzb(zzdy2));
                } else if (zzd2 == 4) {
                    zzdy zzdy3 = new zzdy(zzd3);
                    zzaco2.zzi(zzdy3.zzN(), 0, zzd3);
                    zzdy3.zzM(4);
                    zzacy = zzacy.zzg(Arrays.asList(zzadz.zzc(zzdy3, false, false).zza));
                } else if (zzd2 == 6) {
                    zzdy zzdy4 = new zzdy(zzd3);
                    zzaco2.zzi(zzdy4.zzN(), 0, zzd3);
                    zzdy4.zzM(4);
                    zzacy = zzacy.zze(zzfxn.zzo(zzafn.zzb(zzdy4)));
                } else {
                    zzaco2.zzk(zzd3);
                }
                int i2 = zzei.zza;
                zzacy zzacy2 = zzacy;
                this.zzh = zzacy;
            } while (!zzp);
            zzacy.getClass();
            this.zzi = Math.max(zzacy.zzc, 6);
            zzadt zzadt = this.zze;
            zzadt zzadt2 = zzadt;
            zzadt.zzm(this.zzh.zzc(this.zza, this.zzg));
            this.zzf = 4;
            return 0;
        } else if (i != 4) {
            this.zze.getClass();
            zzacy zzacy3 = this.zzh;
            zzacy3.getClass();
            zzaer zzaer = this.zzk;
            if (zzaer != null && zzaer.zze()) {
                return zzaer.zza(zzaco2, zzadj);
            }
            if (this.zzm == -1) {
                this.zzm = zzacu.zzb(zzaco2, zzacy3);
                return 0;
            }
            zzdy zzdy5 = this.zzb;
            int zze3 = zzdy5.zze();
            if (zze3 < 32768) {
                int zza3 = zzaco2.zza(zzdy5.zzN(), zze3, 32768 - zze3);
                if (zza3 != -1) {
                    z = false;
                }
                if (!z) {
                    this.zzb.zzK(zze3 + zza3);
                } else if (this.zzb.zzb() == 0) {
                    zzg();
                    return -1;
                }
            } else {
                z = false;
            }
            zzdy zzdy6 = this.zzb;
            int zzd4 = zzdy6.zzd();
            int i3 = this.zzl;
            int i4 = this.zzi;
            if (i3 < i4) {
                zzdy6.zzM(Math.min(i4 - i3, zzdy6.zzb()));
            }
            long zza4 = zza(this.zzb, z);
            zzdy zzdy7 = this.zzb;
            int zzd5 = zzdy7.zzd() - zzd4;
            zzdy7.zzL(zzd4);
            this.zze.zzr(this.zzb, zzd5);
            this.zzl += zzd5;
            if (zza4 != -1) {
                zzg();
                this.zzl = 0;
                this.zzm = zza4;
            }
            zzdy zzdy8 = this.zzb;
            if (zzdy8.zzb() >= 16) {
                return 0;
            }
            int zzb2 = zzdy8.zzb();
            System.arraycopy(zzdy8.zzN(), zzdy8.zzd(), zzdy8.zzN(), 0, zzb2);
            this.zzb.zzL(0);
            this.zzb.zzK(zzb2);
            return 0;
        } else {
            zzaco.zzj();
            zzdy zzdy9 = new zzdy(2);
            zzaco2.zzh(zzdy9.zzN(), 0, 2);
            int zzq = zzdy9.zzq();
            if ((zzq >> 2) == 16382) {
                zzaco.zzj();
                this.zzj = zzq;
                zzacq zzacq = this.zzd;
                int i5 = zzei.zza;
                zzacq zzacq2 = zzacq;
                long zzf2 = zzaco.zzf();
                long zzd6 = zzaco.zzd();
                zzacy zzacy4 = this.zzh;
                zzacy4.getClass();
                if (zzacy4.zzk != null) {
                    zzadm = new zzacw(zzacy4, zzf2);
                } else if (zzd6 == -1 || zzacy4.zzj <= 0) {
                    zzadm = new zzadl(zzacy4.zza(), 0);
                } else {
                    zzaer zzaer2 = new zzaer(zzacy4, this.zzj, zzf2, zzd6);
                    this.zzk = zzaer2;
                    zzadm = zzaer2.zzb();
                }
                zzacq.zzO(zzadm);
                this.zzf = 5;
                return 0;
            }
            zzaco.zzj();
            throw zzbc.zza("First frame does not start with sync code.", (Throwable) null);
        }
    }
}
