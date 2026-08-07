package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcsm implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzcsm(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbzq zza2 = ((zzchv) this.zzb).zzb();
        zzbzq zzbzq = zza2;
        zzfcj zza3 = ((zzcvk) this.zzc).zza();
        zzfcj zzfcj = zza3;
        zzbzf zzc2 = zza2.zzc((Clock) this.zza.zzb(), zza3.zzf);
        zzbzf zzbzf = zzc2;
        return zzc2;
    }
}
