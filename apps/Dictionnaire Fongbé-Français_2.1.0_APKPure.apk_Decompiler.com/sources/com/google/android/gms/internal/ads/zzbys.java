package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbys extends zzaya implements zzbyu {
    zzbys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, iObjectWrapper2);
        zza.writeString(str);
        zzayc.zzf(zza, iObjectWrapper3);
        Parcel zzcZ = zzcZ(11, zza);
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    public final void zzf(IObjectWrapper iObjectWrapper, zzbyy zzbyy, zzbyr zzbyr) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzd(zza, zzbyy);
        zzayc.zzf(zza, zzbyr);
        zzda(1, zza);
    }

    public final void zzg(zzbuc zzbuc) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbuc);
        zzda(7, zza);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtt zzbtt) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbtt);
        zzda(10, zza);
    }

    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbtt zzbtt) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbtt);
        zzda(9, zza);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(8, zza);
    }

    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(2, zza);
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtt zzbtt) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbtt);
        zzda(6, zza);
    }

    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbtt zzbtt) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbtt);
        zzda(5, zza);
    }
}
