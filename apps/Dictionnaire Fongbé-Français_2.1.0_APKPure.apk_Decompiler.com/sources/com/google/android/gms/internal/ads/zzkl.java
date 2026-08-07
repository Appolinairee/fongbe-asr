package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzkl {
    public final zzue zza;
    public final Object zzb;
    public final zzvy[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzkm zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzlm[] zzj;
    private final zzyb zzk;
    private final zzla zzl;
    private zzkl zzm;
    private zzwj zzn = zzwj.zza;
    private zzyc zzo;
    private long zzp;

    public zzkl(zzlm[] zzlmArr, long j, zzyb zzyb, zzyk zzyk, zzla zzla, zzkm zzkm, zzyc zzyc, long j2) {
        this.zzj = zzlmArr;
        this.zzp = j;
        this.zzk = zzyb;
        this.zzl = zzla;
        this.zzb = zzkm.zza.zza;
        this.zzg = zzkm;
        this.zzo = zzyc;
        this.zzc = new zzvy[2];
        this.zzi = new boolean[2];
        zzug zzug = zzkm.zza;
        long j3 = zzkm.zzb;
        long j4 = zzkm.zzd;
        zzue zzp2 = zzla.zzp(zzug, zzyk, j3);
        this.zza = j4 != -9223372036854775807L ? new zztk(zzp2, true, 0, j4) : zzp2;
    }

    private final void zzu() {
        if (zzw()) {
            int i = 0;
            while (true) {
                zzyc zzyc = this.zzo;
                if (i < zzyc.zza) {
                    zzyc.zzb(i);
                    zzxv zzxv = this.zzo.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzv() {
        if (zzw()) {
            int i = 0;
            while (true) {
                zzyc zzyc = this.zzo;
                if (i < zzyc.zza) {
                    zzyc.zzb(i);
                    zzxv zzxv = this.zzo.zzc[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza(zzyc zzyc, long j, boolean z) {
        return zzb(zzyc, j, false, new boolean[2]);
    }

    public final long zzb(zzyc zzyc, long j, boolean z, boolean[] zArr) {
        zzyc zzyc2 = zzyc;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzyc2.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzyc.zza(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzlm[] zzlmArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzlmArr[i2].zzb();
            i2++;
        }
        zzu();
        this.zzo = zzyc2;
        zzv();
        long zzf2 = this.zza.zzf(zzyc2.zzc, this.zzi, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzlm[] zzlmArr2 = this.zzj;
            if (i3 >= 2) {
                break;
            }
            zzlmArr2[i3].zzb();
            i3++;
        }
        this.zzf = false;
        int i4 = 0;
        while (true) {
            zzvy[] zzvyArr = this.zzc;
            if (i4 >= 2) {
                return zzf2;
            }
            if (zzvyArr[i4] != null) {
                zzcw.zzf(zzyc.zzb(i4));
                this.zzj[i4].zzb();
                this.zzf = true;
            } else {
                zzcw.zzf(zzyc2.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long zzb2 = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb2 == Long.MIN_VALUE ? this.zzg.zze : zzb2;
    }

    public final long zzd() {
        if (!this.zze) {
            return 0;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzp;
    }

    public final long zzf() {
        return this.zzg.zzb + this.zzp;
    }

    public final zzkl zzg() {
        return this.zzm;
    }

    public final zzwj zzh() {
        return this.zzn;
    }

    public final zzyc zzi() {
        return this.zzo;
    }

    public final zzyc zzj(float f, zzbq zzbq, boolean z) throws zzib {
        zzyc zzo2 = this.zzk.zzo(this.zzj, this.zzn, this.zzg.zza, zzbq);
        for (int i = 0; i < zzo2.zza; i++) {
            boolean z2 = true;
            if (zzo2.zzb(i)) {
                if (zzo2.zzc[i] == null) {
                    this.zzj[i].zzb();
                    z2 = false;
                }
                zzcw.zzf(z2);
            } else {
                if (zzo2.zzc[i] != null) {
                    z2 = false;
                }
                zzcw.zzf(z2);
            }
        }
        for (zzxv zzxv : zzo2.zzc) {
        }
        return zzo2;
    }

    public final void zzk(zzkj zzkj) {
        zzcw.zzf(zzw());
        this.zza.zzo(zzkj);
    }

    public final void zzl(float f, zzbq zzbq, boolean z) throws zzib {
        this.zze = true;
        this.zzn = this.zza.zzh();
        zzyc zzj2 = zzj(f, zzbq, z);
        zzkm zzkm = this.zzg;
        long j = zzkm.zzb;
        long j2 = zzkm.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        long zza2 = zza(zzj2, j, false);
        long j3 = this.zzp;
        zzkm zzkm2 = this.zzg;
        this.zzp = j3 + (zzkm2.zzb - zza2);
        this.zzg = zzkm2.zzb(zza2);
    }

    public final void zzm(zzud zzud, long j) {
        this.zzd = true;
        this.zza.zzl(zzud, j);
    }

    public final void zzn(long j) {
        zzcw.zzf(zzw());
        if (this.zze) {
            this.zza.zzm(j - this.zzp);
        }
    }

    public final void zzo() {
        zzu();
        zzue zzue = this.zza;
        try {
            boolean z = zzue instanceof zztk;
            zzla zzla = this.zzl;
            if (z) {
                zzla.zzi(((zztk) zzue).zza);
            } else {
                zzla.zzi(zzue);
            }
        } catch (RuntimeException e) {
            zzdo.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzp(zzkl zzkl) {
        if (zzkl != this.zzm) {
            zzu();
            this.zzm = zzkl;
            zzv();
        }
    }

    public final void zzq(long j) {
        this.zzp = j;
    }

    public final void zzr() {
        zzue zzue = this.zza;
        if (zzue instanceof zztk) {
            long j = this.zzg.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zztk) zzue).zzn(0, j);
        }
    }

    public final boolean zzs() {
        if (this.zze) {
            return !this.zzf || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zzt() {
        if (this.zze) {
            return zzs() || zzc() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }
}
