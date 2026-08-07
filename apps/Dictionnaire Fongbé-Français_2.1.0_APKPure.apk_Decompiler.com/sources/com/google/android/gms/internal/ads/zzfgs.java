package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfgs implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzfgs(zzfgr zzfgr, zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchs) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzbog zza4 = new zzbnx().zza(zza2, zza3, (zzfhk) this.zzc.zzb());
        zzhez.zzb(zza4);
        zzbog zzbog = zza4;
        return zza4;
    }
}
