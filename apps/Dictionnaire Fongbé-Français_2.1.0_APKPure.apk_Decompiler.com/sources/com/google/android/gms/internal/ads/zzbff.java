package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbff extends zzaya implements IInterface {
    zzbff(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbuo zzbuo) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbuo);
        zzda(1, zza);
    }
}
