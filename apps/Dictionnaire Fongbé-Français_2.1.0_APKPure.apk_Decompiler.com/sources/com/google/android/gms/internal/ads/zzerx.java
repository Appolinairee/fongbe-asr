package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzerx implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzerx(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
        this.zzc = zzhfj4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        zzfcj zza2 = ((zzcvk) this.zza).zza();
        zzfcj zzfcj = zza2;
        zzg zza3 = ((zzchb) this.zzc).zzb();
        zzg zzg = zza3;
        return new zzerv(zzc2, zza2, (PackageInfo) this.zzb.zzb(), zza3);
    }
}
