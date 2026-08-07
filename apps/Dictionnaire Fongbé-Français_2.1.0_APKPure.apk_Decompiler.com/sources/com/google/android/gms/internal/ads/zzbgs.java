package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbgs extends zzaya implements zzbgu {
    zzbgs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zze(zzbgl zzbgl) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbgl);
        zzda(1, zza);
    }
}
