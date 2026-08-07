package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzau;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcuk implements zzfuc {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ VersionInfoParcel zzb;
    public final /* synthetic */ zzfcj zzc;

    public /* synthetic */ zzcuk(Context context, VersionInfoParcel versionInfoParcel, zzfcj zzfcj) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfcj;
    }

    public final Object apply(Object obj) {
        zzfbo zzfbo = (zzfbo) obj;
        zzau zzau = new zzau(this.zza);
        zzau.zzp(zzfbo.zzB);
        zzau.zzq(zzfbo.zzC.toString());
        zzau.zzo(this.zzb.afmaVersion);
        zzau.zzn(this.zzc.zzf);
        return zzau;
    }
}
