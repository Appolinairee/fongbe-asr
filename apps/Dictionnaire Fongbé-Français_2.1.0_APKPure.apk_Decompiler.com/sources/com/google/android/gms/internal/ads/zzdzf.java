package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdzf implements zzgcd {
    final /* synthetic */ zzbuu zza;
    final /* synthetic */ zzbvd zzb;

    zzdzf(zzdzl zzdzl, zzbvd zzbvd, zzbuu zzbuu) {
        this.zzb = zzbvd;
        this.zza = zzbuu;
    }

    public final void zza(Throwable th) {
        try {
            this.zzb.zze(zzbb.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zzf((String) obj, this.zza);
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }
}
