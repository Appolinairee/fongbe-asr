package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzut implements zzxv {
    private final zzxv zza;
    private final zzbr zzb;

    public zzut(zzxv zzxv, zzbr zzbr) {
        this.zza = zzxv;
        this.zzb = zzbr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzut)) {
            return false;
        }
        zzut zzut = (zzut) obj;
        return this.zza.equals(zzut.zza) && this.zzb.equals(zzut.zzb);
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + 527) * 31) + this.zza.hashCode();
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final int zzc(int i) {
        return this.zza.zzc(i);
    }

    public final int zzd() {
        return this.zza.zzd();
    }

    public final zzab zze(int i) {
        return this.zzb.zzb(this.zza.zza(i));
    }

    public final zzab zzf() {
        return this.zzb.zzb(this.zza.zzb());
    }

    public final zzbr zzg() {
        return this.zzb;
    }
}
