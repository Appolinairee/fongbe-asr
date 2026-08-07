package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzbyq extends zzayb implements zzbyr {
    public zzbyq() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzayc.zzc(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzayc.zzc(parcel);
            zzb(readString);
        } else if (i != 3) {
            return false;
        } else {
            zzayc.zzc(parcel);
            zzc(parcel.readString(), parcel.readString(), (Bundle) zzayc.zza(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
