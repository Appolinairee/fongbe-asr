package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdmq extends zzbgm {
    private final String zza;
    private final zzdia zzb;
    private final zzdif zzc;

    public zzdmq(String str, zzdia zzdia, zzdif zzdif) {
        this.zza = str;
        this.zzb = zzdia;
        this.zzc = zzdif;
    }

    public final Bundle zzb() throws RemoteException {
        return this.zzc.zzd();
    }

    public final zzeb zzc() throws RemoteException {
        return this.zzc.zzj();
    }

    public final zzbfp zzd() throws RemoteException {
        return this.zzc.zzl();
    }

    public final zzbfw zze() throws RemoteException {
        return this.zzc.zzo();
    }

    public final IObjectWrapper zzf() throws RemoteException {
        return this.zzc.zzv();
    }

    public final IObjectWrapper zzg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    public final String zzh() throws RemoteException {
        return this.zzc.zzx();
    }

    public final String zzi() throws RemoteException {
        return this.zzc.zzy();
    }

    public final String zzj() throws RemoteException {
        return this.zzc.zzz();
    }

    public final String zzk() throws RemoteException {
        return this.zzc.zzB();
    }

    public final String zzl() throws RemoteException {
        return this.zza;
    }

    public final List zzm() throws RemoteException {
        return this.zzc.zzG();
    }

    public final void zzn() throws RemoteException {
        this.zzb.zzb();
    }

    public final void zzo(Bundle bundle) throws RemoteException {
        this.zzb.zzG(bundle);
    }

    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzM(bundle);
    }

    public final boolean zzq(Bundle bundle) throws RemoteException {
        return this.zzb.zzZ(bundle);
    }
}
