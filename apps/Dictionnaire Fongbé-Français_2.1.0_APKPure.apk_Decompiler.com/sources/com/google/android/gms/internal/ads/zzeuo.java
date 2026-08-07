package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeuo implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzeuo(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj4;
        this.zzd = zzhfj5;
        this.zze = zzhfj6;
        this.zzf = zzhfj7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzg zza2 = ((zzchb) this.zza).zzb();
        zzg zzg = zza2;
        Context zza3 = ((zzche) this.zzb).zza();
        Context context = zza3;
        zzgcs zzc2 = zzffh.zzc();
        zzgcs zzgcs = zzc2;
        zzecu zza4 = ((zzecv) this.zzd).zzb();
        zzecu zzecu = zza4;
        zzfcj zza5 = ((zzcvk) this.zze).zza();
        zzfcj zzfcj = zza5;
        VersionInfoParcel zza6 = ((zzchs) this.zzf).zza();
        VersionInfoParcel versionInfoParcel = zza6;
        return new zzeul(zza2, zza3, zzc2, (ScheduledExecutorService) this.zzc.zzb(), zza4, zza5, zza6);
    }
}
