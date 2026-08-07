package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcur implements zzcxh, zzcwo {
    private final zzfbo zza;

    public zzcur(Context context, zzfbo zzfbo, zzbtj zzbtj) {
        this.zza = zzfbo;
    }

    public final void zzdh(Context context) {
    }

    public final void zzdj(Context context) {
    }

    public final void zzdk(Context context) {
    }

    public final void zzs() {
        zzbtk zzbtk = this.zza.zzad;
        if (zzbtk != null && zzbtk.zza) {
            ArrayList arrayList = new ArrayList();
            if (!this.zza.zzad.zzb.isEmpty()) {
                arrayList.add(this.zza.zzad.zzb);
            }
        }
    }
}
