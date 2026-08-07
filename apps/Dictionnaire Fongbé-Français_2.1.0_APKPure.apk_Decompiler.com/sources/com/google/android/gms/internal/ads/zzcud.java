package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcud implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzcud(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6) {
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
        zzfcj zza3 = ((zzcvk) this.zzb).zza();
        zzfcj zzfcj = zza3;
        VersionInfoParcel zza4 = ((zzchs) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza4;
        zzg zza5 = ((zzchb) this.zzd).zzb();
        zzg zzg = zza5;
        return new zzcuc(zza2, zza3, zza4, zza5, (zzdua) this.zze.zzb(), (zzfhk) this.zzf.zzb());
    }
}
