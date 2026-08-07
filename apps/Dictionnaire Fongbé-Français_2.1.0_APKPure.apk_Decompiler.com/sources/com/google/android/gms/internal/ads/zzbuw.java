package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbuw extends zzaya implements zzbuy {
    zzbuw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void zze(zzbvk zzbvk, zzbvc zzbvc) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbvk);
        zzayc.zzf(zza, zzbvc);
        zzda(6, zza);
    }

    public final void zzf(zzbvk zzbvk, zzbvc zzbvc) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbvk);
        zzayc.zzf(zza, zzbvc);
        zzda(5, zza);
    }

    public final void zzg(zzbvk zzbvk, zzbvc zzbvc) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbvk);
        zzayc.zzf(zza, zzbvc);
        zzda(4, zza);
    }

    public final void zzh(String str, zzbvc zzbvc) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayc.zzf(zza, zzbvc);
        zzda(7, zza);
    }

    public final void zzi(zzbuu zzbuu, zzbvd zzbvd) throws RemoteException {
        throw null;
    }
}
