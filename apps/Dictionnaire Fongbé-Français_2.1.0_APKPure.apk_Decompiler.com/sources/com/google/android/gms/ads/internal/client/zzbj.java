package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbj extends zzaya implements zzbl {
    zzbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void zzc() throws RemoteException {
        zzda(6, zza());
    }

    public final void zzd() throws RemoteException {
        zzda(1, zza());
    }

    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(2, zza);
    }

    public final void zzf(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zze);
        zzda(8, zza);
    }

    public final void zzg() throws RemoteException {
        zzda(7, zza());
    }

    public final void zzh() throws RemoteException {
        zzda(3, zza());
    }

    public final void zzi() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzj() throws RemoteException {
        zzda(5, zza());
    }

    public final void zzk() throws RemoteException {
        zzda(9, zza());
    }
}
