package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdow {
    private final Context zza;
    private final zzava zzb;
    private final zzbds zzc;
    private final VersionInfoParcel zzd;
    private final zza zze;
    private final zzbbj zzf;
    /* access modifiers changed from: private */
    public final zzcyl zzg;
    private final zzebv zzh;
    private final zzfcn zzi;

    public zzdow(zzcfk zzcfk, Context context, zzava zzava, zzbds zzbds, VersionInfoParcel versionInfoParcel, zza zza2, zzbbj zzbbj, zzcyl zzcyl, zzebv zzebv, zzfcn zzfcn) {
        this.zza = context;
        this.zzb = zzava;
        this.zzc = zzbds;
        this.zzd = versionInfoParcel;
        this.zze = zza2;
        this.zzf = zzbbj;
        this.zzg = zzcyl;
        this.zzh = zzebv;
        this.zzi = zzfcn;
    }

    public final zzcex zza(zzs zzs, zzfbo zzfbo, zzfbr zzfbr) throws zzcfj {
        zzcgr zzc2 = zzcgr.zzc(zzs);
        String str = zzs.zza;
        zzdol zzdol = new zzdol(this);
        zzebv zzebv = this.zzh;
        zzfcn zzfcn = this.zzi;
        zza zza2 = this.zze;
        zzbbj zzbbj = this.zzf;
        return zzcfk.zza(this.zza, zzc2, str, false, false, this.zzb, this.zzc, this.zzd, (zzbda) null, zzdol, zza2, zzbbj, zzfbo, zzfbr, zzebv, zzfcn);
    }
}
