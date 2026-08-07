package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbde extends zzaya implements zzbdg {
    zzbde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void zze(zzbdd zzbdd) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbdd);
        zzda(1, zza);
    }
}
