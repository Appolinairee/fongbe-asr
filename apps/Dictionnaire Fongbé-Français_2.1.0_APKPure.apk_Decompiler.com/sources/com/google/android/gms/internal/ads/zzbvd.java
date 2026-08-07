package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbvd extends zzaya implements IInterface {
    zzbvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(zzbb zzbb) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbb);
        zzda(2, zza);
    }

    public final void zzf(String str, zzbuu zzbuu) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayc.zzd(zza, zzbuu);
        zzda(1, zza);
    }
}
