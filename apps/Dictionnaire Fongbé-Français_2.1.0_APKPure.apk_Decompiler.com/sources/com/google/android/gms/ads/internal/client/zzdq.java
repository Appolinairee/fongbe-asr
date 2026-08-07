package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzdq extends zzayb implements zzdr {
    public zzdq() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzdr ? (zzdr) queryLocalInterface : new zzdp(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzayc.zzc(parcel);
            zze((zzu) zzayc.zza(parcel, zzu.CREATOR));
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i3 = zzayc.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
