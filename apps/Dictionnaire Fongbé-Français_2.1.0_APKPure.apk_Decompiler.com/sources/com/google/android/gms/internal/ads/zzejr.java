package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzejr extends zzbq {
    private final zzeky zza;

    public zzejr(Context context, zzcgx zzcgx, zzfch zzfch, zzdiq zzdiq, zzbl zzbl) {
        zzela zzela = new zzela(zzdiq, zzcgx.zzj());
        zzela.zze(zzbl);
        this.zza = new zzeky(new zzelk(zzcgx, context, zzela, zzfch), zzfch.zzL());
    }

    public final synchronized String zze() {
        return this.zza.zza();
    }

    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    public final void zzg(zzm zzm) throws RemoteException {
        this.zza.zzd(zzm, 1);
    }

    public final synchronized void zzh(zzm zzm, int i) throws RemoteException {
        this.zza.zzd(zzm, i);
    }

    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
