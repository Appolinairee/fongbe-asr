package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbhb extends zzaya implements zzbhd {
    zzbhb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zze(zzbgq zzbgq) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbgq);
        zzda(1, zza);
    }
}
