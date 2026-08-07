package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdub implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;

    public zzdub(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9, zzhfj zzhfj10) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj5;
        this.zze = zzhfj6;
        this.zzf = zzhfj7;
        this.zzg = zzhfj8;
        this.zzh = zzhfj9;
        this.zzi = zzhfj10;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zzb).zza();
        Context context = zza2;
        WeakReference zza3 = ((zzchf) this.zzc).zza();
        WeakReference weakReference = zza3;
        VersionInfoParcel zza4 = ((zzchs) this.zzg).zza();
        VersionInfoParcel versionInfoParcel = zza4;
        zzdcr zza5 = ((zzdcs) this.zzh).zzb();
        zzdcr zzdcr = zza5;
        return new zzdua((Executor) this.zza.zzb(), zza2, zza3, zzffh.zzc(), (zzdpm) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzdsh) this.zzf.zzb(), zza4, zza5, (zzfhk) this.zzi.zzb());
    }
}
