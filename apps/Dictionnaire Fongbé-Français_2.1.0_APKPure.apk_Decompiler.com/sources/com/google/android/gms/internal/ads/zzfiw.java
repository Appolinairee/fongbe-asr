package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfiw implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;

    public zzfiw(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj6;
        this.zzg = zzhfj7;
        this.zzh = zzhfj8;
        this.zzi = zzhfj9;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchs) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        String zza3 = ((zzcvh) this.zzc).zzb();
        String str = zza3;
        zzfcb zza4 = ((zzcvj) this.zzf).zza();
        zzfcb zzfcb = zza4;
        return new zzfiv((zzegq) this.zza.zzb(), zza2, zza3, (String) this.zzd.zzb(), (Context) this.zze.zzb(), zza4, (zzfcc) this.zzg.zzb(), (Clock) this.zzh.zzb(), (zzava) this.zzi.zzb());
    }
}
