package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbjq implements zzbjp {
    private final zzduv zza;

    public zzbjq(zzduv zzduv) {
        Preconditions.checkNotNull(zzduv, "The Inspector Manager must not be null");
        this.zza = zzduv;
    }

    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("persistentData") && !TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            this.zza.zzj((String) map.get("persistentData"));
        }
    }
}
