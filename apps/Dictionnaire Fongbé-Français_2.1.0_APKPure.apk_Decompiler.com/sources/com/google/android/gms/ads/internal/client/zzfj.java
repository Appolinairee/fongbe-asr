package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfj implements Runnable {
    final /* synthetic */ zzfk zza;

    zzfj(zzfk zzfk) {
        this.zza = zzfk;
    }

    public final void run() {
        zzfk zzfk = this.zza;
        if (zzfk.zza != null) {
            try {
                zzfk.zza.zze(1);
            } catch (RemoteException e) {
                zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
