package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbax extends zzaya implements IInterface {
    zzbax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbav zzbav) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbav);
        Parcel zzcZ = zzcZ(3, zza);
        long readLong = zzcZ.readLong();
        zzcZ.recycle();
        return readLong;
    }

    public final zzbas zzf(zzbav zzbav) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbav);
        Parcel zzcZ = zzcZ(1, zza);
        zzbas zzbas = (zzbas) zzayc.zza(zzcZ, zzbas.CREATOR);
        zzcZ.recycle();
        return zzbas;
    }

    public final zzbas zzg(zzbav zzbav) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbav);
        Parcel zzcZ = zzcZ(2, zza);
        zzbas zzbas = (zzbas) zzayc.zza(zzcZ, zzbas.CREATOR);
        zzcZ.recycle();
        return zzbas;
    }
}
