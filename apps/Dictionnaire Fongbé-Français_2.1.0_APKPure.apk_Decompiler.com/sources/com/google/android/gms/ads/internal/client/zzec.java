package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzec extends zzaya implements zzee {
    zzec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    public final void zzf(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(5, zza);
    }

    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    public final void zzh() throws RemoteException {
        zzda(2, zza());
    }

    public final void zzi() throws RemoteException {
        zzda(1, zza());
    }
}
