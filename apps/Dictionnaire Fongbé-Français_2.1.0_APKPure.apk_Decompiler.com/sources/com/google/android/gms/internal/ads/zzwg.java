package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzwg implements zzue, zzud {
    private final zzue zza;
    private final long zzb;
    private zzud zzc;

    public zzwg(zzue zzue, long j) {
        this.zza = zzue;
        this.zzb = j;
    }

    public final long zza(long j, zzlp zzlp) {
        long j2 = this.zzb;
        return this.zza.zza(j - j2, zzlp) + j2;
    }

    public final long zzb() {
        long zzb2 = this.zza.zzb();
        if (zzb2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb2 + this.zzb;
    }

    public final long zzc() {
        long zzc2 = this.zza.zzc();
        if (zzc2 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc2 + this.zzb;
    }

    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    public final long zze(long j) {
        long j2 = this.zzb;
        return this.zza.zze(j - j2) + j2;
    }

    public final long zzf(zzxv[] zzxvArr, boolean[] zArr, zzvy[] zzvyArr, boolean[] zArr2, long j) {
        zzvy[] zzvyArr2 = zzvyArr;
        zzvy[] zzvyArr3 = new zzvy[zzvyArr2.length];
        int i = 0;
        while (true) {
            zzvy zzvy = null;
            if (i >= zzvyArr2.length) {
                break;
            }
            zzwf zzwf = (zzwf) zzvyArr2[i];
            if (zzwf != null) {
                zzvy = zzwf.zzc();
            }
            zzvyArr3[i] = zzvy;
            i++;
        }
        long zzf = this.zza.zzf(zzxvArr, zArr, zzvyArr3, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zzvyArr2.length; i2++) {
            zzvy zzvy2 = zzvyArr3[i2];
            if (zzvy2 == null) {
                zzvyArr2[i2] = null;
            } else {
                zzvy zzvy3 = zzvyArr2[i2];
                if (zzvy3 == null || ((zzwf) zzvy3).zzc() != zzvy2) {
                    zzvyArr2[i2] = new zzwf(zzvy2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    public final /* bridge */ /* synthetic */ void zzg(zzwa zzwa) {
        zzue zzue = (zzue) zzwa;
        zzud zzud = this.zzc;
        zzud.getClass();
        zzud zzud2 = zzud;
        zzud.zzg(this);
    }

    public final zzwj zzh() {
        return this.zza.zzh();
    }

    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    public final void zzl(zzud zzud, long j) {
        this.zzc = zzud;
        this.zza.zzl(this, j - this.zzb);
    }

    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final zzue zzn() {
        return this.zza;
    }

    public final boolean zzo(zzkj zzkj) {
        long j = zzkj.zza;
        long j2 = this.zzb;
        zzkh zza2 = zzkj.zza();
        zza2.zze(j - j2);
        return this.zza.zzo(zza2.zzg());
    }

    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final void zzi(zzue zzue) {
        zzud zzud = this.zzc;
        zzud.getClass();
        zzud zzud2 = zzud;
        zzud.zzi(this);
    }
}
