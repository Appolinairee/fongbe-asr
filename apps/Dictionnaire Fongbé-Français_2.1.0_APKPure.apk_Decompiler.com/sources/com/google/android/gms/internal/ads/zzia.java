package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzia implements zzkk {
    private final zzls zza;
    private final zzhz zzb;
    private zzlj zzc;
    private zzkk zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzia(zzhz zzhz, zzcx zzcx) {
        this.zzb = zzhz;
        this.zza = new zzls(zzcx);
    }

    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        zzkk zzkk = this.zzd;
        zzkk.getClass();
        zzkk zzkk2 = zzkk;
        return zzkk.zza();
    }

    public final long zzb(boolean z) {
        zzlj zzlj = this.zzc;
        if (zzlj == null || zzlj.zzW() || ((z && this.zzc.zzcT() != 2) || (!this.zzc.zzX() && (z || this.zzc.zzQ())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzkk zzkk = this.zzd;
            zzkk.getClass();
            zzkk zzkk2 = zzkk;
            long zza2 = zzkk.zza();
            if (this.zze) {
                if (zza2 < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza2);
            zzbe zzc2 = zzkk.zzc();
            if (!zzc2.equals(this.zza.zzc())) {
                this.zza.zzg(zzc2);
                this.zzb.zza(zzc2);
            }
        }
        return zza();
    }

    public final zzbe zzc() {
        zzkk zzkk = this.zzd;
        return zzkk != null ? zzkk.zzc() : this.zza.zzc();
    }

    public final void zzd(zzlj zzlj) {
        if (zzlj == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzlj zzlj) throws zzib {
        zzkk zzkk;
        zzkk zzl = zzlj.zzl();
        if (zzl != null && zzl != (zzkk = this.zzd)) {
            if (zzkk == null) {
                this.zzd = zzl;
                this.zzc = zzlj;
                zzl.zzg(this.zza.zzc());
                return;
            }
            throw zzib.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    public final void zzg(zzbe zzbe) {
        zzkk zzkk = this.zzd;
        if (zzkk != null) {
            zzkk.zzg(zzbe);
            zzbe = this.zzd.zzc();
        }
        this.zza.zzg(zzbe);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzkk zzkk = this.zzd;
        zzkk.getClass();
        zzkk zzkk2 = zzkk;
        return zzkk.zzj();
    }
}
