package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbai extends zzaya implements zzbak {
    zzbai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    public final void zzb() throws RemoteException {
        zzda(5, zza());
    }

    public final void zzc() throws RemoteException {
        zzda(2, zza());
    }

    public final void zzd(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zze);
        zzda(3, zza);
    }

    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzf() throws RemoteException {
        zzda(1, zza());
    }
}
