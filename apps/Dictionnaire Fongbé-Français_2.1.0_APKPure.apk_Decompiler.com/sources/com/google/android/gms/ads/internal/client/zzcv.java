package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbpe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzcv extends zzayb implements zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcw asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof zzcw ? (zzcw) queryLocalInterface : new zzcu(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzfb liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzayc.zze(parcel2, liteSdkVersion);
        } else if (i != 2) {
            return false;
        } else {
            zzbpe adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzayc.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
