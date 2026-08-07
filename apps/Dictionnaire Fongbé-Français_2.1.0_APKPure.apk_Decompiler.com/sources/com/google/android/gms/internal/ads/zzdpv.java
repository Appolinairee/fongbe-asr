package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbbq;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdpv implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzdpv(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzche) this.zza).zza();
        Context context = zza2;
        String zza3 = ((zzdws) this.zzb).zzb();
        String str = zza3;
        VersionInfoParcel zza4 = ((zzchs) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza4;
        zzbbq.zza.C0000zza zza5 = (zzbbq.zza.C0000zza) this.zzd.zzb();
        String str2 = (String) this.zze.zzb();
        zzbbj zzbbj = new zzbbj(new zzbbp(zza2));
        zzbbq.zzar.zza zzd2 = zzbbq.zzar.zzd();
        zzd2.zzg(zza4.buddyApkVersion);
        zzd2.zzi(zza4.clientJarVersion);
        zzd2.zzh(true != zza4.isClientJar ? 2 : 0);
        zzbbj.zzb(new zzdpu(zza5, zza3, (zzbbq.zzar) zzd2.zzbr(), str2));
        zzbbj zzbbj2 = zzbbj;
        return zzbbj;
    }
}
