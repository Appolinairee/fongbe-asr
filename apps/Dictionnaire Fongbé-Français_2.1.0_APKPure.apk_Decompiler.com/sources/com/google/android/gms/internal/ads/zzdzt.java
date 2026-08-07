package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdzt {
    private final zzbve zza;

    zzdzt(zzbve zzbve) {
        this.zza = zzbve;
    }

    public final void zza() {
        ListenableFuture zza2 = this.zza.zza();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhC)).booleanValue()) {
            zzbzz.zzb(zza2, "persistFlags");
        } else {
            zzbzz.zza(zza2, "persistFlags");
        }
    }
}
