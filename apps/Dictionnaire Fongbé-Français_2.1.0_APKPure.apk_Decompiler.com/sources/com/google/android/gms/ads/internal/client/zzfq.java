package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbww;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzbxd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzfq extends zzbwo {
    private static void zzr(zzbww zzbww) {
        zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzf.zza.post(new zzfp(zzbww));
    }

    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    public final zzdy zzc() {
        return null;
    }

    public final zzbwm zzd() {
        return null;
    }

    public final String zze() throws RemoteException {
        return "";
    }

    public final void zzf(zzm zzm, zzbww zzbww) throws RemoteException {
        zzr(zzbww);
    }

    public final void zzg(zzm zzm, zzbww zzbww) throws RemoteException {
        zzr(zzbww);
    }

    public final void zzh(boolean z) {
    }

    public final void zzi(zzdo zzdo) throws RemoteException {
    }

    public final void zzj(zzdr zzdr) {
    }

    public final void zzk(zzbws zzbws) throws RemoteException {
    }

    public final void zzl(zzbxd zzbxd) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    public final boolean zzo() throws RemoteException {
        return false;
    }

    public final void zzp(zzbwx zzbwx) throws RemoteException {
    }
}
