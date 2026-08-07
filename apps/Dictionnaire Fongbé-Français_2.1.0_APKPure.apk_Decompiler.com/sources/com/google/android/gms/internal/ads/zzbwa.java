package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbwa extends zzaya implements zzbwc {
    zzbwa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void zze(zzbvw zzbvw) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbvw);
        zzda(5, zza);
    }

    public final void zzf() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzg(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(7, zza);
    }

    public final void zzh() throws RemoteException {
        zzda(6, zza());
    }

    public final void zzi() throws RemoteException {
        zzda(1, zza());
    }

    public final void zzj() throws RemoteException {
        zzda(2, zza());
    }

    public final void zzk() throws RemoteException {
        zzda(8, zza());
    }

    public final void zzl() throws RemoteException {
        zzda(3, zza());
    }
}
