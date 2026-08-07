package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeth implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzeth(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
        this.zzc = zzhfj4;
    }

    /* renamed from: zza */
    public final zzetf zzb() {
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchs) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        String zza4 = ((zzchj) this.zzc).zzb();
        String str = zza4;
        return new zzetf(zzc2, zza2, zza3, zza4);
    }
}
