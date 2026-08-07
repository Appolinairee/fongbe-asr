package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzadk {
    public final zzadn zza;
    public final zzadn zzb;

    public zzadk(zzadn zzadn, zzadn zzadn2) {
        zzadn zzadn3 = zzadn;
        this.zza = zzadn;
        zzadn zzadn4 = zzadn2;
        this.zzb = zzadn2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzadk zzadk = (zzadk) obj;
            return this.zza.equals(zzadk.zza) && this.zzb.equals(zzadk.zzb);
        }
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        zzadn zzadn = this.zza;
        zzadn zzadn2 = this.zzb;
        String obj = zzadn.toString();
        String concat = zzadn.equals(zzadn2) ? "" : ", ".concat(this.zzb.toString());
        return "[" + obj + concat + "]";
    }
}
