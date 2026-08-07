package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbhi extends zzaya implements zzbhk {
    zzbhi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zze(zzbht zzbht) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbht);
        zzda(1, zza);
    }
}
