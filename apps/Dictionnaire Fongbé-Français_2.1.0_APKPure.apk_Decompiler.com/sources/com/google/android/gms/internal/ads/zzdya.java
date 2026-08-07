package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdya implements zzcyq {
    private final Context zza;
    private final zzbyi zzb;

    zzdya(Context context, zzbyi zzbyi) {
        this.zza = context;
        this.zzb = zzbyi;
    }

    public final void zzdl(zzbvk zzbvk) {
    }

    public final void zzdm(zzfca zzfca) {
        if (!TextUtils.isEmpty(zzfca.zzb.zzb.zze)) {
            this.zzb.zzm(this.zza, zzfca.zza.zza.zzd);
            this.zzb.zzi(this.zza, zzfca.zzb.zzb.zze);
        }
    }
}
