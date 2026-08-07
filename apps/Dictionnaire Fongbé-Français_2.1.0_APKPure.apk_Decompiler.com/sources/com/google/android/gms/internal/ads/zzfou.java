package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfou extends zzaya implements IInterface {
    zzfou(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfos zze(zzfoq zzfoq) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzfoq);
        Parcel zzcZ = zzcZ(1, zza);
        zzfos zzfos = (zzfos) zzayc.zza(zzcZ, zzfos.CREATOR);
        zzcZ.recycle();
        return zzfos;
    }

    public final zzfpb zzf(zzfoz zzfoz) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzfoz);
        Parcel zzcZ = zzcZ(3, zza);
        zzfpb zzfpb = (zzfpb) zzayc.zza(zzcZ, zzfpb.CREATOR);
        zzcZ.recycle();
        return zzfpb;
    }

    public final void zzg(zzfon zzfon) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzfon);
        zzda(2, zza);
    }
}
