package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcfg implements zzfvf {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcgr zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzava zzf;
    public final /* synthetic */ zzbds zzg;
    public final /* synthetic */ VersionInfoParcel zzh;
    public final /* synthetic */ zzn zzi;
    public final /* synthetic */ zza zzj;
    public final /* synthetic */ zzbbj zzk;
    public final /* synthetic */ zzfbo zzl;
    public final /* synthetic */ zzfbr zzm;
    public final /* synthetic */ zzfcn zzn;
    public final /* synthetic */ zzebv zzo;

    public /* synthetic */ zzcfg(Context context, zzcgr zzcgr, String str, boolean z, boolean z2, zzava zzava, zzbds zzbds, VersionInfoParcel versionInfoParcel, zzbda zzbda, zzn zzn2, zza zza2, zzbbj zzbbj, zzfbo zzfbo, zzfbr zzfbr, zzfcn zzfcn, zzebv zzebv) {
        this.zza = context;
        this.zzb = zzcgr;
        this.zzc = str;
        this.zzd = z;
        this.zze = z2;
        this.zzf = zzava;
        this.zzg = zzbds;
        this.zzh = versionInfoParcel;
        this.zzi = zzn2;
        this.zzj = zza2;
        this.zzk = zzbbj;
        this.zzl = zzfbo;
        this.zzm = zzfbr;
        this.zzn = zzfcn;
        this.zzo = zzebv;
    }

    public final Object zza() {
        zzcgr zzcgr = this.zzb;
        String str = this.zzc;
        boolean z = this.zzd;
        zzbbj zzbbj = this.zzk;
        boolean z2 = this.zze;
        zzava zzava = this.zzf;
        zzfbo zzfbo = this.zzl;
        zzbds zzbds = this.zzg;
        zzn zzn2 = this.zzi;
        zzfbr zzfbr = this.zzm;
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzh;
        zza zza2 = this.zzj;
        zzfcn zzfcn = this.zzn;
        zzebv zzebv = this.zzo;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = zzcfw.zza;
            zzcfw zzcfw = r2;
            zzebv zzebv2 = zzebv;
            zzfbr zzfbr2 = zzfbr;
            zza zza3 = zza2;
            zzfbo zzfbo2 = zzfbo;
            zzcfw zzcfw2 = new zzcfw(new zzcgq(context), zzcgr, str, z, z2, zzava, zzbds, versionInfoParcel, (zzbda) null, zzn2, zza3, zzbbj, zzfbo2, zzfbr2, zzfcn);
            zzcfp zzcfp = new zzcfp(zzcfw2);
            zzcfp.setWebViewClient(zzv.zzr().zzc(zzcfp, zzbbj, z2, zzebv2));
            zzcfp.setWebChromeClient(new zzcew(zzcfp));
            return zzcfp;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
