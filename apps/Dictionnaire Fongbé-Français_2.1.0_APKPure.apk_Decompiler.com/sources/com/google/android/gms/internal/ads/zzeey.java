package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeey implements zzdgc {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfbo zzd;
    private final zzcex zze;
    private final zzfcj zzf;
    private final zzbjs zzg;
    private final boolean zzh;
    private final zzebv zzi;
    private final zzdrw zzj;

    zzeey(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfbo zzfbo, zzcex zzcex, zzfcj zzfcj, boolean z, zzbjs zzbjs, zzebv zzebv, zzdrw zzdrw) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfbo;
        this.zze = zzcex;
        this.zzf = zzfcj;
        this.zzg = zzbjs;
        this.zzh = z;
        this.zzi = zzebv;
        this.zzj = zzdrw;
    }

    public final void zza(boolean z, Context context, zzcwg zzcwg) {
        zzder zzder = (zzder) zzgch.zzq(this.zzc);
        this.zze.zzaq(true);
        boolean zze2 = this.zzh ? this.zzg.zze(false) : false;
        zzv.zzq();
        zzl zzl = new zzl(zze2, zzs.zzJ(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzO, false);
        if (zzcwg != null) {
            zzcwg.zzf();
        }
        zzv.zzj();
        zzdfr zzh2 = zzder.zzh();
        zzcex zzcex = this.zze;
        zzfbo zzfbo = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i = zzfbo.zzQ;
        String str = zzfbo.zzB;
        zzfbt zzfbt = zzfbo.zzs;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, zzh2, (zzac) null, zzcex, i, versionInfoParcel, str, zzl, zzfbt.zzb, zzfbt.zza, this.zzf.zzf, zzcwg, zzfbo.zzb() ? this.zzi : null, this.zze.zzr());
        zzn.zza(context, adOverlayInfoParcel, true, this.zzj);
    }
}
