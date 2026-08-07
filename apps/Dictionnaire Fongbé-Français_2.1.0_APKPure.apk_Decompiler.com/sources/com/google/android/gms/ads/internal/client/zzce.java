package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzce extends zzayb implements zzcf {
    public zzce() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzayc.zzc(parcel);
            zze((zzft) zzayc.zza(parcel, zzft.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzayc.zzc(parcel);
            zzf((zzft) zzayc.zza(parcel, zzft.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
