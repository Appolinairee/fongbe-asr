package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbrb extends zzaya implements zzbrd {
    zzbrb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final zzeb zze() throws RemoteException {
        Parcel zzcZ = zzcZ(5, zza());
        zzeb zzb = zzea.zzb(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzb;
    }

    public final zzbrs zzf() throws RemoteException {
        Parcel zzcZ = zzcZ(2, zza());
        zzbrs zzbrs = (zzbrs) zzayc.zza(zzcZ, zzbrs.CREATOR);
        zzcZ.recycle();
        return zzbrs;
    }

    public final zzbrs zzg() throws RemoteException {
        Parcel zzcZ = zzcZ(3, zza());
        zzbrs zzbrs = (zzbrs) zzayc.zza(zzcZ, zzbrs.CREATOR);
        zzcZ.recycle();
        return zzbrs;
    }

    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzs zzs, zzbrg zzbrg) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzayc.zzd(zza, bundle);
        zzayc.zzd(zza, bundle2);
        zzayc.zzd(zza, zzs);
        zzayc.zzf(zza, zzbrg);
        zzda(1, zza);
    }

    public final void zzi(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqo zzbqo, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbqo);
        zzayc.zzf(zza, zzbpk);
        zzda(23, zza);
    }

    public final void zzj(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqr zzbqr, zzbpk zzbpk, zzs zzs) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbqr);
        zzayc.zzf(zza, zzbpk);
        zzayc.zzd(zza, zzs);
        zzda(13, zza);
    }

    public final void zzk(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqr zzbqr, zzbpk zzbpk, zzs zzs) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbqr);
        zzayc.zzf(zza, zzbpk);
        zzayc.zzd(zza, zzs);
        zzda(21, zza);
    }

    public final void zzl(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqu zzbqu, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbqu);
        zzayc.zzf(zza, zzbpk);
        zzda(14, zza);
    }

    public final void zzm(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqx zzbqx, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbqx);
        zzayc.zzf(zza, zzbpk);
        zzda(18, zza);
    }

    public final void zzn(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqx zzbqx, zzbpk zzbpk, zzbfl zzbfl) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbqx);
        zzayc.zzf(zza, zzbpk);
        zzayc.zzd(zza, zzbfl);
        zzda(22, zza);
    }

    public final void zzo(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbra zzbra, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbra);
        zzayc.zzf(zza, zzbpk);
        zzda(20, zza);
    }

    public final void zzp(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbra zzbra, zzbpk zzbpk) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzayc.zzd(zza, zzm);
        zzayc.zzf(zza, iObjectWrapper);
        zzayc.zzf(zza, zzbra);
        zzayc.zzf(zza, zzbpk);
        zzda(16, zza);
    }

    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(19, zza);
    }

    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(24, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(15, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }

    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzayc.zzf(zza, iObjectWrapper);
        Parcel zzcZ = zzcZ(17, zza);
        boolean zzg = zzayc.zzg(zzcZ);
        zzcZ.recycle();
        return zzg;
    }
}
