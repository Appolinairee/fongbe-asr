package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzav extends zzdk {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzay zzb;

    zzav(zzay zzay, Context context) {
        this.zza = context;
        this.zzb = zzay;
    }

    public final void zze(zze zze) {
        if (zze != null) {
            this.zzb.zzi(this.zza, zze.zzb, true, true);
        }
    }
}
