package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeaq implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzeaq(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
    }

    /* renamed from: zza */
    public final zzeao zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        zzcuw zza3 = ((zzcux) this.zzb).zzb();
        zzcuw zzcuw = zza3;
        zzeac zza4 = ((zzead) this.zzd).zzb();
        zzeac zzeac = zza4;
        zzg zza5 = ((zzchb) this.zze).zzb();
        zzg zzg = zza5;
        return new zzeao(zza2, zza3, (zzeag) this.zzc.zzb(), zza4, zza5);
    }
}
