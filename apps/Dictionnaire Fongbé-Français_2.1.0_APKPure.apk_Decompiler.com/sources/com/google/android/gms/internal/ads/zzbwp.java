package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public interface zzbwp extends IInterface {
    Bundle zzb() throws RemoteException;

    zzdy zzc() throws RemoteException;

    zzbwm zzd() throws RemoteException;

    String zze() throws RemoteException;

    void zzf(zzm zzm, zzbww zzbww) throws RemoteException;

    void zzg(zzm zzm, zzbww zzbww) throws RemoteException;

    void zzh(boolean z) throws RemoteException;

    void zzi(zzdo zzdo) throws RemoteException;

    void zzj(zzdr zzdr) throws RemoteException;

    void zzk(zzbws zzbws) throws RemoteException;

    void zzl(zzbxd zzbxd) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    boolean zzo() throws RemoteException;

    void zzp(zzbwx zzbwx) throws RemoteException;
}
