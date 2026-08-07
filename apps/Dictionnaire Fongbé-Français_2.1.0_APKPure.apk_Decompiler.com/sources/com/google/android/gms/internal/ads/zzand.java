package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzand implements zzany {
    private final zzamj zza;
    private final zzdx zzb = new zzdx(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzef zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzand(zzamj zzamj) {
        this.zza = zzamj;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzdy zzdy, byte[] bArr, int i) {
        int min = Math.min(zzdy.zzb(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdy.zzM(min);
        } else {
            zzdy.zzH(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    public final void zza(zzdy zzdy, int i) throws zzbc {
        int i2;
        long j;
        int i3;
        zzdy zzdy2 = zzdy;
        zzcw.zzb(this.zze);
        int i4 = -1;
        int i5 = 2;
        boolean z = false;
        int i6 = 1;
        if ((i & 1) != 0) {
            int i7 = this.zzc;
            if (!(i7 == 0 || i7 == 1)) {
                if (i7 != 2) {
                    int i8 = this.zzj;
                    if (i8 != -1) {
                        zzdo.zzf("PesReader", "Unexpected start indicator: expected " + i8 + " more bytes");
                    }
                    this.zza.zzc(zzdy.zze() == 0);
                } else {
                    zzdo.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i9 = i;
        while (zzdy.zzb() > 0) {
            int i10 = this.zzc;
            if (i10 == 0) {
                zzdy2.zzM(zzdy.zzb());
            } else if (i10 != i6) {
                if (i10 != i5) {
                    int zzb2 = zzdy.zzb();
                    int i11 = this.zzj;
                    int i12 = i11 == i4 ? 0 : zzb2 - i11;
                    if (i12 > 0) {
                        zzb2 -= i12;
                        zzdy2.zzK(zzdy.zzd() + zzb2);
                    }
                    this.zza.zza(zzdy2);
                    int i13 = this.zzj;
                    if (i13 != i4) {
                        int i14 = i13 - zzb2;
                        this.zzj = i14;
                        if (i14 == 0) {
                            this.zza.zzc(z);
                            zze(i6);
                        }
                    }
                } else {
                    if (zzf(zzdy2, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzdy2, (byte[]) null, this.zzi)) {
                        this.zzb.zzl(z ? 1 : 0);
                        if (this.zzf) {
                            this.zzb.zzn(4);
                            long zzd2 = (long) this.zzb.zzd(3);
                            this.zzb.zzn(i6);
                            int zzd3 = this.zzb.zzd(15) << 15;
                            this.zzb.zzn(i6);
                            long zzd4 = (long) this.zzb.zzd(15);
                            this.zzb.zzn(i6);
                            if (this.zzh || !this.zzg) {
                                i3 = zzd3;
                            } else {
                                this.zzb.zzn(4);
                                this.zzb.zzn(i6);
                                this.zzb.zzn(i6);
                                long zzd5 = (long) this.zzb.zzd(15);
                                this.zzb.zzn(i6);
                                i3 = zzd3;
                                this.zze.zzb((((long) this.zzb.zzd(3)) << 30) | ((long) (this.zzb.zzd(15) << 15)) | zzd5);
                                this.zzh = true;
                            }
                            j = this.zze.zzb((zzd2 << 30) | ((long) i3) | zzd4);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i9 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j, i9);
                        zze(3);
                        i4 = -1;
                    }
                }
            } else if (zzf(zzdy2, this.zzb.zza, 9)) {
                this.zzb.zzl(0);
                int zzd6 = this.zzb.zzd(24);
                if (zzd6 != 1) {
                    zzdo.zzf("PesReader", "Unexpected start code prefix: " + zzd6);
                    i4 = -1;
                    this.zzj = -1;
                    i2 = 0;
                } else {
                    this.zzb.zzn(8);
                    zzdx zzdx = this.zzb;
                    int zzd7 = zzdx.zzd(16);
                    zzdx.zzn(5);
                    this.zzk = this.zzb.zzp();
                    this.zzb.zzn(2);
                    this.zzf = this.zzb.zzp();
                    this.zzg = this.zzb.zzp();
                    this.zzb.zzn(6);
                    int zzd8 = this.zzb.zzd(8);
                    this.zzi = zzd8;
                    if (zzd7 == 0) {
                        this.zzj = -1;
                    } else {
                        int i15 = (zzd7 - 3) - zzd8;
                        this.zzj = i15;
                        if (i15 < 0) {
                            zzdo.zzf("PesReader", "Found negative packet payload size: " + i15);
                            i4 = -1;
                            this.zzj = -1;
                            i2 = 2;
                        }
                    }
                    i4 = -1;
                    i2 = 2;
                }
                zze(i2);
            } else {
                i4 = -1;
            }
            i5 = 2;
            z = false;
            i6 = 1;
        }
    }

    public final void zzb(zzef zzef, zzacq zzacq, zzanx zzanx) {
        this.zze = zzef;
        this.zza.zzb(zzacq, zzanx);
    }

    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
