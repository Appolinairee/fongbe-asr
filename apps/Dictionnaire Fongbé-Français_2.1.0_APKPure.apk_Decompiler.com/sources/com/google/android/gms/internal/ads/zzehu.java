package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzehu implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;

    public zzehu(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9, zzhfj zzhfj10) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj6;
        this.zzg = zzhfj8;
        this.zzh = zzhfj9;
        this.zzi = zzhfj10;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchs) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        zzfcj zza3 = ((zzcvk) this.zzc).zza();
        zzfcj zzfcj = zza3;
        zzbjs zzbjs = new zzbjs();
        zzbjs zzbjs2 = zzbjs;
        return new zzeht((Context) this.zza.zzb(), zza2, zza3, (Executor) this.zzd.zzb(), (zzdof) this.zze.zzb(), (zzdow) this.zzf.zzb(), zzbjs, (zzebv) this.zzg.zzb(), (zzdrq) this.zzh.zzb(), (zzdrw) this.zzi.zzb());
    }
}
