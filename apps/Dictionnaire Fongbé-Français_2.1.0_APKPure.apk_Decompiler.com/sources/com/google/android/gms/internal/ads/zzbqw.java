package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzbqw extends zzayb implements zzbqx {
    public zzbqw() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbpt zzb = zzbps.zzb(parcel.readStrongBinder());
            zzayc.zzc(parcel);
            zzg(zzb);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzayc.zzc(parcel);
            zze(readString);
        } else if (i != 3) {
            return false;
        } else {
            zzayc.zzc(parcel);
            zzf((zze) zzayc.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
