package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public interface zzbvc extends IInterface {
    void zze(zzbb zzbb) throws RemoteException;

    @Deprecated
    void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvk zzbvk) throws RemoteException;
}
