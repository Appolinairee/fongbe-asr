package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbva extends zzaya implements zzbvc {
    zzbva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final void zze(zzbb zzbb) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzbb);
        zzda(2, zza);
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, parcelFileDescriptor);
        zzda(1, zza);
    }

    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvk zzbvk) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, parcelFileDescriptor);
        zzayc.zzd(zza, zzbvk);
        zzda(3, zza);
    }
}
