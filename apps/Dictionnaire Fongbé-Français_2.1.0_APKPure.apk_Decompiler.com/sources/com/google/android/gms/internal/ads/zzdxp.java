package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdxp implements zzgcd {
    final /* synthetic */ Context zza;

    zzdxp(Context context) {
        this.zza = context;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzbed.zzh.zze()).booleanValue() && (th instanceof zzba)) {
            zzbbv.zze(this.zza);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdyi zzdyi = (zzdyi) obj;
        if (((Boolean) zzbed.zzj.zze()).booleanValue()) {
            zzbbv.zze(this.zza);
        }
    }
}
