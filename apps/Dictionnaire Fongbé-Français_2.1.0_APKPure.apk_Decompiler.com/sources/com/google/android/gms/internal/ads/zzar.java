package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzar {
    public final String zza;
    public final zzam zzb;
    public final zzal zzc;
    public final zzav zzd;
    public final zzah zze;
    public final zzao zzf;

    static {
        new zzaf().zzc();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ zzar(String str, zzai zzai, zzam zzam, zzal zzal, zzav zzav, zzao zzao, zzaq zzaq) {
        this.zza = str;
        this.zzb = zzam;
        this.zzc = zzal;
        this.zzd = zzav;
        this.zze = zzai;
        this.zzf = zzao;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzar)) {
            return false;
        }
        zzar zzar = (zzar) obj;
        return Objects.equals(this.zza, zzar.zza) && this.zze.equals(zzar.zze) && Objects.equals(this.zzb, zzar.zzb) && Objects.equals(this.zzc, zzar.zzc) && Objects.equals(this.zzd, zzar.zzd) && Objects.equals(this.zzf, zzar.zzf);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        zzam zzam = this.zzb;
        return (((((((hashCode + (zzam != null ? zzam.hashCode() : 0)) * 31) + this.zzc.hashCode()) * 31) + this.zze.hashCode()) * 31) + this.zzd.hashCode()) * 31;
    }
}
