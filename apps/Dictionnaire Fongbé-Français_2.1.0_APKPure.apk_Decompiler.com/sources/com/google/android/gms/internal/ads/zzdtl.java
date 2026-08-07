package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdtl extends zzbwv {
    final /* synthetic */ zzdtn zza;

    zzdtl(zzdtn zzdtn) {
        this.zza = zzdtn;
    }

    public final void zze(int i) throws RemoteException {
        zzdtn zzdtn = this.zza;
        zzdtn.zzb.zzm(zzdtn.zza, i);
    }

    public final void zzf(zze zze) throws RemoteException {
        zzdtn zzdtn = this.zza;
        zzdtn.zzb.zzm(zzdtn.zza, zze.zza);
    }

    public final void zzg() throws RemoteException {
        zzdtn zzdtn = this.zza;
        zzdtn.zzb.zzp(zzdtn.zza);
    }
}
