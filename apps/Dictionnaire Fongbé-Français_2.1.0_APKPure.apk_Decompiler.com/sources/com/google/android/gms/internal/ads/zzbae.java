package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbae extends zzaya implements zzbag {
    zzbae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public final void zzb(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzda(2, zza);
    }

    public final void zzc(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zze);
        zzda(3, zza);
    }

    public final void zzd(zzbad zzbad) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbad);
        zzda(1, zza);
    }
}
