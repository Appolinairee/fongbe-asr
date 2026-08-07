package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzefx implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzefx(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchs) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        return new zzefw((Context) this.zza.zzb(), (zzdgq) this.zzb.zzb(), zza2);
    }
}
