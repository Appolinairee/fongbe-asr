package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdtt implements Runnable {
    public final /* synthetic */ zzdua zza;
    public final /* synthetic */ zzblu zzb;

    public /* synthetic */ zzdtt(zzdua zzdua, zzblu zzblu) {
        this.zza = zzdua;
        this.zzb = zzblu;
    }

    public final void run() {
        zzdua zzdua = this.zza;
        try {
            this.zzb.zzb(zzdua.zzg());
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }
}
