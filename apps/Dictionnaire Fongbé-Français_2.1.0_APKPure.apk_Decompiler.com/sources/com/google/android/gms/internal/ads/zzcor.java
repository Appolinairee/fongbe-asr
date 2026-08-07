package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcor implements zzcxh {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ VersionInfoParcel zzb;
    public final /* synthetic */ zzfbo zzc;
    public final /* synthetic */ zzfcj zzd;

    public /* synthetic */ zzcor(Context context, VersionInfoParcel versionInfoParcel, zzfbo zzfbo, zzfcj zzfcj) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfbo;
        this.zzd = zzfcj;
    }

    public final void zzs() {
        zzay zzt = zzv.zzt();
        Context context = this.zza;
        zzfcj zzfcj = this.zzd;
        zzt.zzn(context, this.zzb.afmaVersion, this.zzc.zzC.toString(), zzfcj.zzf);
    }
}
