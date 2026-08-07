package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbwq extends zzaya implements zzbws {
    zzbwq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void zze() throws RemoteException {
        zzda(7, zza());
    }

    public final void zzf() throws RemoteException {
        zzda(6, zza());
    }

    public final void zzg() throws RemoteException {
        zzda(2, zza());
    }

    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(4, zza);
    }

    public final void zzi(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zze);
        zzda(5, zza);
    }

    public final void zzj() throws RemoteException {
        zzda(1, zza());
    }

    public final void zzk(zzbwm zzbwm) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbwm);
        zzda(3, zza);
    }
}
