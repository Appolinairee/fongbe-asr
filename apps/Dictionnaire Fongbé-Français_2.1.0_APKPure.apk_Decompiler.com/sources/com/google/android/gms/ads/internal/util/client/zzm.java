package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzm extends zzw {
    private final int zza;
    private final int zzb;
    private final boolean zzc;

    zzm(int i, int i2, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzw = (zzw) obj;
            return this.zza == zzw.zzb() && this.zzb == zzw.zza() && this.zzc == zzw.zzc();
        }
    }

    public final int hashCode() {
        return (true != this.zzc ? 1237 : 1231) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.zza + ", clickPrerequisite=" + this.zzb + ", notificationFlowEnabled=" + this.zzc + "}";
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc;
    }
}
