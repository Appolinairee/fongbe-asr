package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbab extends zzaya implements zzbad {
    zzbab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final zzby zze() throws RemoteException {
        throw null;
    }

    public final zzdy zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        zzdy zzb = zzdx.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final void zzg(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(6, zza);
    }

    public final void zzh(zzdr zzdr) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzdr);
        zzda(7, zza);
    }

    public final void zzi(IObjectWrapper iObjectWrapper, zzbak zzbak) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbak);
        zzda(4, zza);
    }
}
