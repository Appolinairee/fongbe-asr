package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcly implements zzcla {
    private final zzduv zza;

    zzcly(zzduv zzduv) {
        this.zza = zzduv;
    }

    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzo(str.equals("true"));
        }
    }
}
