package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzble extends zzayb implements zzblf {
    public zzble() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzayc.zzc(parcel);
        zzb((ParcelFileDescriptor) zzayc.zza(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
