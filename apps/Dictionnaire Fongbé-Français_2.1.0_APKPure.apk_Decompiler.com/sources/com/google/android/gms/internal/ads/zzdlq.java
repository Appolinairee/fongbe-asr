package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdlq implements zzher {
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
    private final zzhfj zzk;
    private final zzhfj zzl;
    private final zzhfj zzm;
    private final zzhfj zzn;
    private final zzhfj zzo;
    private final zzhfj zzp;

    public zzdlq(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9, zzhfj zzhfj10, zzhfj zzhfj11, zzhfj zzhfj12, zzhfj zzhfj13, zzhfj zzhfj14, zzhfj zzhfj15, zzhfj zzhfj16, zzhfj zzhfj17) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj5;
        this.zzf = zzhfj6;
        this.zzg = zzhfj8;
        this.zzh = zzhfj9;
        this.zzi = zzhfj10;
        this.zzj = zzhfj11;
        this.zzk = zzhfj12;
        this.zzl = zzhfj13;
        this.zzm = zzhfj14;
        this.zzn = zzhfj15;
        this.zzo = zzhfj16;
        this.zzp = zzhfj17;
    }

    /* renamed from: zza */
    public final zzdlp zzb() {
        VersionInfoParcel zza2 = ((zzchs) this.zzd).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        VersionInfoParcel versionInfoParcel2 = zza2;
        zza zza3 = ((zzcjo) this.zze).zza();
        zza zza4 = zza3;
        zza zza5 = zza3;
        zzfcj zza6 = ((zzcvk) this.zzg).zza();
        zzfcj zzfcj = zza6;
        zzfcj zzfcj2 = zza6;
        return new zzdlp((Context) this.zza.zzb(), (zzdkt) this.zzb.zzb(), (zzava) this.zzc.zzb(), versionInfoParcel, zza4, (zzbbj) this.zzf.zzb(), zzffh.zzc(), zzfcj, (zzdmh) this.zzh.zzb(), (zzdow) this.zzi.zzb(), (ScheduledExecutorService) this.zzj.zzb(), (zzdrw) this.zzk.zzb(), (zzfja) this.zzl.zzb(), (zzebk) this.zzm.zzb(), (zzdnr) this.zzn.zzb(), (zzebv) this.zzo.zzb(), (zzfcn) this.zzp.zzb());
    }
}
