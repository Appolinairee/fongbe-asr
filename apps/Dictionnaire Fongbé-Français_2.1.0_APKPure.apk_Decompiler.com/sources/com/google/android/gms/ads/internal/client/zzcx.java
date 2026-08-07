package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbpe;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzcx extends zzaya implements zzcz {
    zzcx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final float zze() throws RemoteException {
        Parcel zzcZ = zzcZ(7, zza());
        float readFloat = zzcZ.readFloat();
        zzcZ.recycle();
        return readFloat;
    }

    public final String zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(9, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    public final List zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(13, zza());
        ArrayList<zzbln> createTypedArrayList = zzcZ.createTypedArrayList(zzbln.CREATOR);
        zzcZ.recycle();
        return createTypedArrayList;
    }

    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(10, zza);
    }

    public final void zzi() throws RemoteException {
        zzda(15, zza());
    }

    public final void zzj(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(17, zza);
    }

    public final void zzk() throws RemoteException {
        zzda(1, zza());
    }

    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString((String) null);
        zzayc.zzf(zza, iObjectWrapper);
        zzda(6, zza);
    }

    public final void zzm(zzdl zzdl) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzdl);
        zzda(16, zza);
    }

    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzda(5, zza);
    }

    public final void zzo(zzbpe zzbpe) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzbpe);
        zzda(11, zza);
    }

    public final void zzp(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = zzayc.zza;
        zza.writeInt(z ? 1 : 0);
        zzda(4, zza);
    }

    public final void zzq(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzda(2, zza);
    }

    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    public final void zzs(zzblu zzblu) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, zzblu);
        zzda(12, zza);
    }

    public final void zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(18, zza);
    }

    public final void zzu(zzfv zzfv) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzd(zza, zzfv);
        zzda(14, zza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel zzcZ = zzcZ(8, zza());
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
