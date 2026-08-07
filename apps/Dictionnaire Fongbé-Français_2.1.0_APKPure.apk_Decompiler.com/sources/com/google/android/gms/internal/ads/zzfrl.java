package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfrl extends zzaya implements zzfrn {
    zzfrl(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    public final void zze(Bundle bundle, zzfrp zzfrp) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, bundle);
        zzayc.zzf(zza, zzfrp);
        zzdb(2, zza);
    }

    public final void zzf(String str, Bundle bundle, zzfrp zzfrp) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzayc.zzd(zza, bundle);
        zzayc.zzf(zza, zzfrp);
        zzdb(1, zza);
    }

    public final void zzg(Bundle bundle, zzfrp zzfrp) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, bundle);
        zzayc.zzf(zza, zzfrp);
        zzdb(3, zza);
    }
}
