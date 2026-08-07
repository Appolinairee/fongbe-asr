package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdm {
    public final Object zza;
    private zzv zzb = new zzv();
    private boolean zzc;
    private boolean zzd;

    public zzdm(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdm) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzdk zzdk) {
        if (!this.zzd) {
            if (i != -1) {
                this.zzb.zza(i);
            }
            this.zzc = true;
            zzdk.zza(this.zza);
        }
    }

    public final void zzb(zzdl zzdl) {
        if (!this.zzd && this.zzc) {
            zzx zzb2 = this.zzb.zzb();
            this.zzb = new zzv();
            this.zzc = false;
            zzdl.zza(this.zza, zzb2);
        }
    }

    public final void zzc(zzdl zzdl) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdl.zza(this.zza, this.zzb.zzb());
        }
    }
}
