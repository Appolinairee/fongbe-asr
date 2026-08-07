package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzls implements zzkk {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbe zzd = zzbe.zza;

    public zzls(zzcx zzcx) {
    }

    public final long zza() {
        long j;
        long j2 = this.zzb;
        if (!this.zza) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzbe zzbe = this.zzd;
        if (zzbe.zzb == 1.0f) {
            j = zzei.zzs(elapsedRealtime);
        } else {
            j = zzbe.zza(elapsedRealtime);
        }
        return j2 + j;
    }

    public final void zzb(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final zzbe zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (!this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
            this.zza = true;
        }
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    public final void zzg(zzbe zzbe) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbe;
    }

    public final /* synthetic */ boolean zzj() {
        return false;
    }
}
