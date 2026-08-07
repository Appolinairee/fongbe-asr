package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzesn implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzesn(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj;
        this.zzb = zzhfj3;
        this.zzc = zzhfj4;
    }

    /* renamed from: zza */
    public final zzesl zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        zzfcj zza3 = ((zzcvk) this.zzb).zza();
        zzfcj zzfcj = zza3;
        VersionInfoParcel zza4 = ((zzchs) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza4;
        return new zzesl(zza2, zzc2, zza3, zza4);
    }
}
