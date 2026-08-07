package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbg extends zzaya implements zzbi {
    zzbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    public final void zzb() throws RemoteException {
        zzda(1, zza());
    }
}
