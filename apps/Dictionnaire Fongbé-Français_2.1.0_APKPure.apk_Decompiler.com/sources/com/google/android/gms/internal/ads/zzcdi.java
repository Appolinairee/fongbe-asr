package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcdi extends zzcde {
    public zzcdi(zzcbs zzcbs) {
        super(zzcbs);
    }

    public final void zzf() {
    }

    public final boolean zzt(String str) {
        String zzf = zzf.zzf(str);
        zzcbs zzcbs = (zzcbs) this.zzc.get();
        if (!(zzcbs == null || zzf == null)) {
            zzcbs.zzt(zzf, this);
        }
        zzo.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
