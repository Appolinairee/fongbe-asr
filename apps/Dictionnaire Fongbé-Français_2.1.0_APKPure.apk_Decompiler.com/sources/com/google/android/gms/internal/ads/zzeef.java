package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeef extends zzbqq {
    final /* synthetic */ zzeeh zza;
    private final zzecz zzb;

    /* synthetic */ zzeef(zzeeh zzeeh, zzecz zzecz, zzeeg zzeeg) {
        this.zza = zzeeh;
        this.zzb = zzecz;
    }

    public final void zze(String str) throws RemoteException {
        ((zzees) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzees) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzees) this.zzb.zzc).zzo();
    }

    public final void zzh(zzbpn zzbpn) throws RemoteException {
        this.zza.zzd = zzbpn;
        ((zzees) this.zzb.zzc).zzo();
    }
}
