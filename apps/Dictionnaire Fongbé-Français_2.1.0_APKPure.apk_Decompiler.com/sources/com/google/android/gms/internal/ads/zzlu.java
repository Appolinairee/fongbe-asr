package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzlu {
    public final long zza;
    public final zzbq zzb;
    public final int zzc;
    public final zzug zzd;
    public final long zze;
    public final zzbq zzf;
    public final int zzg;
    public final zzug zzh;
    public final long zzi;
    public final long zzj;

    public zzlu(long j, zzbq zzbq, int i, zzug zzug, long j2, zzbq zzbq2, int i2, zzug zzug2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzbq;
        this.zzc = i;
        this.zzd = zzug;
        this.zze = j2;
        this.zzf = zzbq2;
        this.zzg = i2;
        this.zzh = zzug2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzlu zzlu = (zzlu) obj;
            return this.zza == zzlu.zza && this.zzc == zzlu.zzc && this.zze == zzlu.zze && this.zzg == zzlu.zzg && this.zzi == zzlu.zzi && this.zzj == zzlu.zzj && zzfuk.zza(this.zzb, zzlu.zzb) && zzfuk.zza(this.zzd, zzlu.zzd) && zzfuk.zza(this.zzf, zzlu.zzf) && zzfuk.zza(this.zzh, zzlu.zzh);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
