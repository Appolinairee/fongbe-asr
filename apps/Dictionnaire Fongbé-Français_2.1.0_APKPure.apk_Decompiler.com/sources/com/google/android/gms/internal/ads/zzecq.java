package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzecq implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzecq(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchs) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzfbo zza4 = ((zzcrq) this.zzc).zza();
        zzfbo zzfbo = zza4;
        return new zzecp(zza2, zza3, zza4, (zzcex) this.zzd.zzb(), (zzdrw) this.zze.zzb());
    }
}
