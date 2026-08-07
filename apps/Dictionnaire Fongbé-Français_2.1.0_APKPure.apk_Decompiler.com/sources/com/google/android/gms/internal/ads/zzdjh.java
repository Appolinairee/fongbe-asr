package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzac;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdjh {
    private final zzdrw zza;

    zzdjh(zzdrw zzdrw) {
        this.zza = zzdrw;
    }

    public final void zza(View view, zzfbo zzfbo) {
        String str;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmK)).booleanValue() && view != null) {
            if (true != zzac.zza(view)) {
                str = "0";
            } else {
                str = "1";
            }
            zzdrv zza2 = this.zza.zza();
            zza2.zzb("action", "hcp");
            zza2.zzb("hcp", str);
            zza2.zzc(zzfbo);
            zza2.zzg();
        }
    }
}
