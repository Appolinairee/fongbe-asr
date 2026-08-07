package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
abstract class zzajt {
    private final zzajm zza = new zzajm();
    private zzadt zzb;
    private zzacq zzc;
    private zzajo zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzajq zzj = new zzajq();
    private long zzk;
    private boolean zzl;
    private boolean zzm;

    /* access modifiers changed from: protected */
    public abstract long zza(zzdy zzdy);

    /* access modifiers changed from: protected */
    public void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzajq();
            this.zzf = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1;
        this.zzg = 0;
    }

    /* access modifiers changed from: protected */
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean zzc(zzdy zzdy, long j, zzajq zzajq) throws IOException;

    /* access modifiers changed from: package-private */
    public final int zze(zzaco zzaco, zzadj zzadj) throws IOException {
        zzaco zzaco2 = zzaco;
        zzcw.zzb(this.zzb);
        int i = zzei.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzaco2)) {
                long zzf2 = zzaco.zzf();
                long j = this.zzf;
                this.zzk = zzf2 - j;
                if (zzc(this.zza.zza(), j, this.zzj)) {
                    this.zzf = zzaco.zzf();
                } else {
                    zzab zzab = this.zzj.zza;
                    this.zzi = zzab.zzE;
                    if (!this.zzm) {
                        this.zzb.zzm(zzab);
                        this.zzm = true;
                    }
                    zzajo zzajo = this.zzj.zzb;
                    if (zzajo != null) {
                        this.zzd = zzajo;
                    } else if (zzaco.zzd() == -1) {
                        this.zzd = new zzajr((zzajs) null);
                    } else {
                        zzajn zzb2 = this.zza.zzb();
                        this.zzd = new zzaji(this, this.zzf, zzaco.zzd(), (long) (zzb2.zzd + zzb2.zze), zzb2.zzb, (zzb2.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        } else if (i2 == 1) {
            zzaco2.zzk((int) this.zzf);
            this.zzh = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long zzd2 = this.zzd.zzd(zzaco2);
            if (zzd2 >= 0) {
                zzadj.zza = zzd2;
                return 1;
            }
            if (zzd2 < -1) {
                zzi(-(zzd2 + 2));
            }
            if (!this.zzl) {
                zzadm zze2 = this.zzd.zze();
                zzcw.zzb(zze2);
                zzadm zzadm = zze2;
                this.zzc.zzO(zze2);
                this.zzl = true;
            }
            if (this.zzk > 0 || this.zza.zze(zzaco2)) {
                this.zzk = 0;
                zzdy zza2 = this.zza.zza();
                long zza3 = zza(zza2);
                if (zza3 >= 0) {
                    long j2 = this.zzg;
                    if (j2 + zza3 >= this.zze) {
                        long zzf3 = zzf(j2);
                        this.zzb.zzr(zza2, zza2.zze());
                        this.zzb.zzt(zzf3, 1, zza2.zze(), 0, (zzads) null);
                        this.zze = -1;
                    }
                }
                this.zzg += zza3;
            } else {
                this.zzh = 3;
                return -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final long zzf(long j) {
        return (j * 1000000) / ((long) this.zzi);
    }

    /* access modifiers changed from: protected */
    public final long zzg(long j) {
        return (((long) this.zzi) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzacq zzacq, zzadt zzadt) {
        this.zzc = zzacq;
        this.zzb = zzadt;
        zzb(true);
    }

    /* access modifiers changed from: protected */
    public void zzi(long j) {
        this.zzg = j;
    }

    /* access modifiers changed from: package-private */
    public final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzajo zzajo = this.zzd;
            int i = zzei.zza;
            zzajo zzajo2 = zzajo;
            zzajo.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
