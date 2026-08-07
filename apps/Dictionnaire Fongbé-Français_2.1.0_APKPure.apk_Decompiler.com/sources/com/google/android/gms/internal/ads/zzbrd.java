package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public interface zzbrd extends IInterface {
    zzeb zze() throws RemoteException;

    zzbrs zzf() throws RemoteException;

    zzbrs zzg() throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzs zzs, zzbrg zzbrg) throws RemoteException;

    void zzi(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqo zzbqo, zzbpk zzbpk) throws RemoteException;

    void zzj(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqr zzbqr, zzbpk zzbpk, zzs zzs) throws RemoteException;

    void zzk(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqr zzbqr, zzbpk zzbpk, zzs zzs) throws RemoteException;

    void zzl(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqu zzbqu, zzbpk zzbpk) throws RemoteException;

    void zzm(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqx zzbqx, zzbpk zzbpk) throws RemoteException;

    void zzn(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbqx zzbqx, zzbpk zzbpk, zzbfl zzbfl) throws RemoteException;

    void zzo(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbra zzbra, zzbpk zzbpk) throws RemoteException;

    void zzp(String str, String str2, zzm zzm, IObjectWrapper iObjectWrapper, zzbra zzbra, zzbpk zzbpk) throws RemoteException;

    void zzq(String str) throws RemoteException;

    boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException;
}
