package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbsv extends zzaya implements zzbsx {
    zzbsv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, intent);
        zzda(1, zza);
    }

    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeStringArray(strArr);
        zza.writeIntArray(iArr);
        zzayc.zzf(zza, iObjectWrapper);
        zzda(5, zza);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzda(4, zza);
    }

    public final void zzh() throws RemoteException {
        zzda(3, zza());
    }

    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzj(IObjectWrapper iObjectWrapper, zza zza) throws RemoteException {
        Parcel zza2 = zza();
        zzayc.zzf(zza2, iObjectWrapper);
        zzayc.zzd(zza2, zza);
        zzda(6, zza2);
    }
}
