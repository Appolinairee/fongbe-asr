package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzcd extends zzaya implements zzcf {
    zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    public final void zze(zzft zzft) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzft);
        zzda(1, zza);
    }

    public final void zzf(zzft zzft) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzft);
        zzda(2, zza);
    }
}
