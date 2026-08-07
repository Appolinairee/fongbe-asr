package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbp extends zzaya implements zzbr {
    zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String zze() throws RemoteException {
        throw null;
    }

    public final String zzf() throws RemoteException {
        throw null;
    }

    public final void zzg(zzm zzm) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzm);
        zzda(1, zza);
    }

    public final void zzh(zzm zzm, int i) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzm);
        zza.writeInt(i);
        zzda(5, zza);
    }

    public final boolean zzi() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
