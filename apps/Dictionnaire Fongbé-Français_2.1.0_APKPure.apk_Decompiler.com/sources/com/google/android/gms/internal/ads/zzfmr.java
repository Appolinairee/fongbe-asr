package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfmr implements Runnable {
    zzfmr() {
    }

    public final void run() {
        if (zzfmu.zzc != null) {
            zzfmu.zzc.post(zzfmu.zzd);
            zzfmu.zzc.postDelayed(zzfmu.zze, 200);
        }
    }
}
