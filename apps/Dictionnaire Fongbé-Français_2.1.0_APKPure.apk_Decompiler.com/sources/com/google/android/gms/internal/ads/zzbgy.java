package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbgy extends zzaya implements zzbha {
    zzbgy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zze(zzbgq zzbgq, String str) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbgq);
        zza.writeString(str);
        zzda(1, zza);
    }
}
