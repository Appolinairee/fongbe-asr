package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdnn implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;
    private final zzhfj zzj;

    public zzdnn(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9, zzhfj zzhfj10, zzhfj zzhfj11) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj7;
        this.zzg = zzhfj8;
        this.zzh = zzhfj9;
        this.zzi = zzhfj10;
        this.zzj = zzhfj11;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchs) this.zzd).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zza zza4 = ((zzcjo) this.zze).zza();
        zza zza5 = zza4;
        zzcfk zza6 = zzckg.zza();
        zzcfk zzcfk = zza6;
        return new zzdni(zza2, (Executor) this.zzb.zzb(), (zzava) this.zzc.zzb(), zza3, zza4, zza6, (zzebk) this.zzf.zzb(), (zzfja) this.zzg.zzb(), (zzdrw) this.zzh.zzb(), (zzebv) this.zzi.zzb(), (zzfcn) this.zzj.zzb());
    }
}
