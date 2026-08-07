package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcux implements zzher {
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

    public zzcux(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9, zzhfj zzhfj10, zzhfj zzhfj11, zzhfj zzhfj12, zzhfj zzhfj13) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
        this.zzd = zzhfj4;
        this.zze = zzhfj6;
        this.zzf = zzhfj7;
        this.zzg = zzhfj8;
        this.zzh = zzhfj9;
        this.zzi = zzhfj10;
        this.zzj = zzhfj11;
        this.zzk = zzhfj12;
        this.zzl = zzhfj13;
    }

    /* renamed from: zza */
    public final zzcuw zzb() {
        VersionInfoParcel zza2 = ((zzchs) this.zzb).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        String zza3 = ((zzdws) this.zzd).zzb();
        String str = zza3;
        List zzc2 = zzepc.zzc();
        List list = zzc2;
        zzhel zza4 = zzheq.zza(zzhfc.zza(this.zzf));
        zzg zza5 = ((zzchb) this.zzg).zzb();
        zzg zzg2 = zza5;
        zzetu zza6 = ((zzetv) this.zzi).zzb();
        zzetu zzetu = zza6;
        zzfcj zza7 = ((zzcvk) this.zzj).zza();
        zzfcj zzfcj = zza7;
        return new zzcuw((zzfgn) this.zza.zzb(), zza2, (ApplicationInfo) this.zzc.zzb(), zza3, zzc2, (PackageInfo) this.zze.zzb(), zza4, zza5, (String) this.zzh.zzb(), zza6, zza7, (zzdbe) this.zzk.zzb(), ((Integer) this.zzl.zzb()).intValue());
    }
}
