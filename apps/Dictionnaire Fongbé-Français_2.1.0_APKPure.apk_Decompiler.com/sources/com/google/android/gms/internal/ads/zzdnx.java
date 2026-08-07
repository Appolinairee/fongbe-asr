package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdnx implements zzbkg {
    private final zzcxa zza;
    private final zzbwi zzb;
    private final String zzc;
    private final String zzd;

    public zzdnx(zzcxa zzcxa, zzfbo zzfbo) {
        this.zza = zzcxa;
        this.zzb = zzfbo.zzl;
        this.zzc = zzfbo.zzj;
        this.zzd = zzfbo.zzk;
    }

    @ParametersAreNonnullByDefault
    public final void zza(zzbwi zzbwi) {
        int i;
        String str;
        zzbwi zzbwi2 = this.zzb;
        if (zzbwi2 != null) {
            zzbwi = zzbwi2;
        }
        if (zzbwi != null) {
            str = zzbwi.zza;
            i = zzbwi.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbvt(str, i), this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zza.zze();
    }

    public final void zzc() {
        this.zza.zzf();
    }
}
