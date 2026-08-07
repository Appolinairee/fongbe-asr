package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdxm implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;

    public zzdxm(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9, zzhfj zzhfj10, zzhfj zzhfj11) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj6;
        this.zzf = zzhfj7;
        this.zzg = zzhfj8;
        this.zzh = zzhfj11;
    }

    /* renamed from: zza */
    public final zzdxl zzb() {
        Context zza2 = ((zzche) this.zzb).zza();
        Context context = zza2;
        VersionInfoParcel zza3 = ((zzchs) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza3;
        zzfcj zza4 = ((zzcvk) this.zzd).zza();
        zzfcj zzfcj = zza4;
        zzbvs zza5 = zzcic.zza();
        zzbvs zzbvs = zza5;
        zzdzq zza6 = zzchz.zza();
        zzdzq zzdzq = zza6;
        return new zzdxl((zzcgx) this.zza.zzb(), zza2, zza3, zza4, zzffh.zzc(), (String) this.zze.zzb(), (zzfhh) this.zzf.zzb(), (zzdrq) this.zzg.zzb(), zza5, zza6, (ScheduledExecutorService) this.zzh.zzb());
    }
}
