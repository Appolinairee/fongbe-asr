package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzcu extends zzaya implements zzcw {
    zzcu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public final zzbpe getAdapterCreator() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        zzbpe zzf = zzbpd.zzf(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzf;
    }

    public final zzfb getLiteSdkVersion() throws RemoteException {
        Parcel zzcZ = zzcZ(1, zza());
        zzfb zzfb = (zzfb) zzayc.zza(zzcZ, zzfb.CREATOR);
        zzcZ.recycle();
        return zzfb;
    }
}
