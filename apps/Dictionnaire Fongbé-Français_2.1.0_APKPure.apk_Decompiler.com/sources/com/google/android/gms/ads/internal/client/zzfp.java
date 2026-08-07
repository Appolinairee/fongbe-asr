package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbww;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final /* synthetic */ class zzfp implements Runnable {
    public final /* synthetic */ zzbww zza;

    public /* synthetic */ zzfp(zzbww zzbww) {
        this.zza = zzbww;
    }

    public final void run() {
        zzbww zzbww = this.zza;
        if (zzbww != null) {
            try {
                zzbww.zze(1);
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
