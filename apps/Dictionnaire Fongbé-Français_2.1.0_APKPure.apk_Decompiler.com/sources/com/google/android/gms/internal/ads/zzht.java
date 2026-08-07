package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzht {
    public final String zza;
    public final zzab zzb;
    public final zzab zzc;
    public final int zzd;
    public final int zze;

    public zzht(String str, zzab zzab, zzab zzab2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        zzcw.zzd(z);
        zzcw.zzc(str);
        this.zza = str;
        zzab zzab3 = zzab;
        this.zzb = zzab;
        zzab2.getClass();
        zzab zzab4 = zzab2;
        this.zzc = zzab2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzht zzht = (zzht) obj;
            return this.zzd == zzht.zzd && this.zze == zzht.zze && this.zza.equals(zzht.zza) && this.zzb.equals(zzht.zzb) && this.zzc.equals(zzht.zzc);
        }
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
