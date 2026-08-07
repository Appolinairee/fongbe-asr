package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzblg extends zzaya implements IInterface {
    zzblg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbla zzbla, zzblf zzblf) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbla);
        zzayc.zzf(zza, zzblf);
        zzdb(2, zza);
    }
}
