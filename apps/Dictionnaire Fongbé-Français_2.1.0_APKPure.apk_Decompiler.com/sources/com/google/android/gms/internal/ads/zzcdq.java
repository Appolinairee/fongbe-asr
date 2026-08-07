package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcdq implements zzkg {
    private final zzyk zza = new zzyk(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcdq() {
    }

    /* access modifiers changed from: package-private */
    public final void zza(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final long zzb(zzog zzog) {
        return 0;
    }

    public final void zzc(zzog zzog) {
        zza(false);
    }

    public final void zzd(zzog zzog) {
        zza(true);
    }

    public final void zze(zzog zzog) {
        zza(true);
    }

    public final void zzf(zzkf zzkf, zzwj zzwj, zzxv[] zzxvArr) {
        int i;
        this.zzf = 0;
        for (zzxv zzxv : zzxvArr) {
            if (zzxv != null) {
                int i2 = this.zzf;
                int i3 = zzxv.zzg().zzc;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (!(i3 == 3 || i3 == 5 || i3 == 6)) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    public final boolean zzg(zzog zzog) {
        return false;
    }

    public final boolean zzh(zzkf zzkf) {
        long j = zzkf.zzb;
        boolean z = true;
        char c = j > this.zzc ? 0 : j < this.zzb ? (char) 2 : 1;
        int zza2 = this.zza.zza();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zza2 >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    public final /* synthetic */ boolean zzi(zzbq zzbq, zzug zzug, long j) {
        zzdo.zzf("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    public final boolean zzj(zzkf zzkf) {
        long j = zzkf.zzd ? this.zze : this.zzd;
        return j <= 0 || zzkf.zzb >= j;
    }

    public final zzyk zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zze = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzo(int i) {
        this.zzb = ((long) i) * 1000;
    }
}
