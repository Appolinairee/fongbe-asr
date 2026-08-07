package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzbvb extends zzayb implements zzbvc {
    public zzbvb() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzayc.zzc(parcel);
            zzf((ParcelFileDescriptor) zzayc.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i == 2) {
            zzayc.zzc(parcel);
            zze((zzbb) zzayc.zza(parcel, zzbb.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            zzayc.zzc(parcel);
            zzg((ParcelFileDescriptor) zzayc.zza(parcel, ParcelFileDescriptor.CREATOR), (zzbvk) zzayc.zza(parcel, zzbvk.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
