package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbgv extends zzaya implements zzbgx {
    zzbgv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzbgn zzbgn) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbgn);
        zzda(1, zza);
    }
}
