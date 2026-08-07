package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdmk implements Runnable {
    public final /* synthetic */ zzdmm zza;

    public /* synthetic */ zzdmk(zzdmm zzdmm) {
        this.zza = zzdmm;
    }

    public final void run() {
        try {
            this.zza.zzd();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
