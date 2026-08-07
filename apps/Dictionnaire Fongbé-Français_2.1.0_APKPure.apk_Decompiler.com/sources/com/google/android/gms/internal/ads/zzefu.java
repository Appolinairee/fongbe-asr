package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzefu extends zzbqw {
    final /* synthetic */ zzefw zza;
    private final zzecz zzb;

    /* synthetic */ zzefu(zzefw zzefw, zzecz zzecz, zzefv zzefv) {
        this.zza = zzefw;
        this.zzb = zzecz;
    }

    public final void zze(String str) throws RemoteException {
        ((zzees) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzees) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(zzbpt zzbpt) throws RemoteException {
        this.zza.zzc = zzbpt;
        ((zzees) this.zzb.zzc).zzo();
    }
}
