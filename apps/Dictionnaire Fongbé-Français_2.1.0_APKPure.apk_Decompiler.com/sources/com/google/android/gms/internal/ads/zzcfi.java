package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcfi implements zzgbn {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzava zzb;
    public final /* synthetic */ VersionInfoParcel zzc;
    public final /* synthetic */ zza zzd;
    public final /* synthetic */ zzebv zze;
    public final /* synthetic */ zzfcn zzf;
    public final /* synthetic */ String zzg;

    public /* synthetic */ zzcfi(Context context, zzava zzava, VersionInfoParcel versionInfoParcel, zza zza2, zzebv zzebv, zzfcn zzfcn, String str) {
        this.zza = context;
        this.zzb = zzava;
        this.zzc = versionInfoParcel;
        this.zzd = zza2;
        this.zze = zzebv;
        this.zzf = zzfcn;
        this.zzg = str;
    }

    public final ListenableFuture zza() {
        zzv.zzA();
        Context context = this.zza;
        zzcgr zza2 = zzcgr.zza();
        zzava zzava = this.zzb;
        zzebv zzebv = this.zze;
        zza zza3 = this.zzd;
        zzcex zza4 = zzcfk.zza(context, zza2, "", false, false, zzava, (zzbds) null, this.zzc, (zzbda) null, (zzn) null, zza3, zzbbj.zza(), (zzfbo) null, (zzfbr) null, zzebv, this.zzf);
        zzcaa zza5 = zzcaa.zza(zza4);
        zza4.zzN().zzC(new zzcfh(zza5));
        zza4.loadUrl(this.zzg);
        return zza5;
    }
}
