package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzduy implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;

    public zzduy(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9, zzhfj zzhfj10) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj6;
        this.zzg = zzhfj7;
        this.zzh = zzhfj10;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zzd).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchs) this.zze).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzdvc zzdvc = new zzdvc();
        zzdvc zzdvc2 = zzdvc;
        zzdvc zzdvc3 = new zzdvc();
        zzdvc zzdvc4 = zzdvc3;
        String zza4 = ((zzchj) this.zzh).zzb();
        String str = zza4;
        zzduv zzduv = new zzduv((zzdvg) this.zza.zzb(), (zzdvx) this.zzb.zzb(), (zzduh) this.zzc.zzb(), zza2, zza3, (zzduq) this.zzf.zzb(), (zzdvs) this.zzg.zzb(), zzdvc, zzdvc3, zza4);
        zzduv zzduv2 = zzduv;
        return zzduv;
    }
}
