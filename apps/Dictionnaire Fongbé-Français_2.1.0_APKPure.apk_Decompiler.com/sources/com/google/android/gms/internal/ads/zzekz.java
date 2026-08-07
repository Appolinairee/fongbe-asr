package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzekz implements zzcvw {
    public final /* synthetic */ zzekn zza;
    public final /* synthetic */ zzbmi zzb;

    public /* synthetic */ zzekz(zzekn zzekn, zzbmi zzbmi) {
        this.zza = zzekn;
        this.zzb = zzbmi;
    }

    public final void zzdz(zze zze) {
        this.zza.zzdz(zze);
        zzbmi zzbmi = this.zzb;
        if (zzbmi != null) {
            try {
                zzbmi.zzf(zze);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        if (zzbmi != null) {
            try {
                zzbmi.zze(zze.zza);
            } catch (RemoteException e2) {
                zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
