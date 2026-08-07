package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbq;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdge implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzdge(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj6;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        zzcex zza3 = ((zzdfp) this.zzb).zza();
        zzcex zzcex = zza3;
        zzfbo zza4 = ((zzcrq) this.zzc).zza();
        zzfbo zzfbo = zza4;
        VersionInfoParcel zza5 = ((zzchs) this.zzd).zza();
        VersionInfoParcel versionInfoParcel = zza5;
        return new zzdgd(zza2, zza3, zza4, zza5, (zzbbq.zza.C0000zza) this.zze.zzb(), (zzecp) this.zzf.zzb());
    }
}
