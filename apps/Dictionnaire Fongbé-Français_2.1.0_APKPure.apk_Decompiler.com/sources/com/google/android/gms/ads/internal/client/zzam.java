package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzam extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzs zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbpe zzd;
    final /* synthetic */ zzba zze;

    zzam(zzba zzba, Context context, zzs zzs, String str, zzbpe zzbpe) {
        this.zza = context;
        this.zzb = zzs;
        this.zzc = str;
        this.zzd = zzbpe;
        this.zze = zzba;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "banner");
        return new zzfk();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcp) throws RemoteException {
        return zzcp.zzd(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 244410000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return this.zze.zza.zza(this.zza, this.zzb, this.zzc, this.zzd, 1);
    }
}
