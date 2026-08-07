package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcln implements zzcla {
    zzcln() {
    }

    public final void zza(Map map) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkm)).booleanValue() && !map.isEmpty()) {
            String str = (String) map.get("is_topics_ad_personalization_allowed");
            if (!TextUtils.isEmpty(str)) {
                zzv.zzp().zzi().zzE(Boolean.parseBoolean(str));
            }
        }
    }
}
