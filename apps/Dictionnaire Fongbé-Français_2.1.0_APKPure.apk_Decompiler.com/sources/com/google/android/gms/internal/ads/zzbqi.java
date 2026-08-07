package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbqi extends zzbpj {
    private final Adapter zza;
    private final zzbwh zzb;

    zzbqi(Adapter adapter, zzbwh zzbwh) {
        this.zza = adapter;
        this.zzb = zzbwh;
    }

    public final void zze() throws RemoteException {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzf() throws RemoteException {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzg(int i) throws RemoteException {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    public final void zzh(zze zze) throws RemoteException {
    }

    public final void zzi(int i, String str) throws RemoteException {
    }

    public final void zzj(int i) throws RemoteException {
    }

    public final void zzk(zze zze) {
    }

    public final void zzl(String str) {
    }

    public final void zzm() throws RemoteException {
    }

    public final void zzn() throws RemoteException {
    }

    public final void zzo() throws RemoteException {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzp() throws RemoteException {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzq(String str, String str2) throws RemoteException {
    }

    public final void zzr(zzbgq zzbgq, String str) throws RemoteException {
    }

    public final void zzs(zzbwi zzbwi) throws RemoteException {
    }

    public final void zzt(zzbwm zzbwm) throws RemoteException {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzm(ObjectWrapper.wrap(this.zza), new zzbwi(zzbwm.zzf(), zzbwm.zze()));
        }
    }

    public final void zzu() throws RemoteException {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    public final void zzv() throws RemoteException {
    }

    public final void zzw() throws RemoteException {
    }

    public final void zzx() throws RemoteException {
    }

    public final void zzy() throws RemoteException {
        zzbwh zzbwh = this.zzb;
        if (zzbwh != null) {
            zzbwh.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
