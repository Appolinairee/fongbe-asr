package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzbn extends zzayb implements zzbo {
    public zzbn() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc();
        } else if (i != 2) {
            return false;
        } else {
            zzayc.zzc(parcel);
            zzb((zze) zzayc.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
