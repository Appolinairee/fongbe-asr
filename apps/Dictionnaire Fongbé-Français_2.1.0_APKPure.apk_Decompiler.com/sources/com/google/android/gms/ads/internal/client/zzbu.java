package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public interface zzbu extends IInterface {
    zzbr zze() throws RemoteException;

    void zzf(zzbgu zzbgu) throws RemoteException;

    void zzg(zzbgx zzbgx) throws RemoteException;

    void zzh(String str, zzbhd zzbhd, zzbha zzbha) throws RemoteException;

    void zzi(zzbmi zzbmi) throws RemoteException;

    void zzj(zzbhh zzbhh, zzs zzs) throws RemoteException;

    void zzk(zzbhk zzbhk) throws RemoteException;

    void zzl(zzbl zzbl) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzblz zzblz) throws RemoteException;

    void zzo(zzbfl zzbfl) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcq zzcq) throws RemoteException;
}
