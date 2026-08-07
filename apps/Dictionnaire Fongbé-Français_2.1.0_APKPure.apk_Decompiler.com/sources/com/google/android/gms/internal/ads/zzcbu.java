package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcbu implements Runnable {
    private final zzcbg zza;
    private boolean zzb = false;

    zzcbu(zzcbg zzcbg) {
        this.zza = zzcbg;
    }

    private final void zzc() {
        zzs.zza.removeCallbacks(this);
        zzs.zza.postDelayed(this, 250);
    }

    public final void run() {
        if (!this.zzb) {
            this.zza.zzt();
            zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
