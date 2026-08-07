package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzdw extends zzaya implements zzdy {
    zzdw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public final Bundle zze() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        Bundle bundle = (Bundle) zzayc.zza(zzcZ, Bundle.CREATOR);
        zzcZ.recycle();
        return bundle;
    }

    public final zzw zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(4, zza());
        zzw zzw = (zzw) zzayc.zza(zzcZ, zzw.CREATOR);
        zzcZ.recycle();
        return zzw;
    }

    public final String zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzh() throws RemoteException {
        Parcel zzcZ = zzcZ(6, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final String zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final List zzj() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList<zzw> createTypedArrayList = zzcZ.createTypedArrayList(zzw.CREATOR);
        zzcZ.recycle();
        return createTypedArrayList;
    }
}
