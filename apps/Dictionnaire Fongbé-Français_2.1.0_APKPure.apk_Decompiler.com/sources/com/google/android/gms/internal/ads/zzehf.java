package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzehf extends zzbqz {
    private final zzecz zza;

    /* synthetic */ zzehf(zzehh zzehh, zzecz zzecz, zzehg zzehg) {
        this.zza = zzecz;
    }

    public final void zze(String str) throws RemoteException {
        ((zzees) this.zza.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzees) this.zza.zzc).zzh(zze);
    }

    public final void zzg() throws RemoteException {
        ((zzees) this.zza.zzc).zzo();
    }
}
