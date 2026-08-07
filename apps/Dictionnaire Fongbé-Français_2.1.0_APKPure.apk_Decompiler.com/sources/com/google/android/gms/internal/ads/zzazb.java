package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzazb implements Runnable {
    final /* synthetic */ zzazc zza;

    zzazb(zzazc zzazc) {
        this.zza = zzazc;
    }

    public final void run() {
        synchronized (this.zza.zzc) {
            zzazc zzazc = this.zza;
            if (!zzazc.zzd || !zzazc.zze) {
                zzo.zze("App is still foreground");
            } else {
                zzazc.zzd = false;
                zzo.zze("App went background");
                for (zzazd zza2 : this.zza.zzf) {
                    try {
                        zza2.zza(false);
                    } catch (Exception e) {
                        zzo.zzh("", e);
                    }
                }
            }
        }
    }
}
