package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcfu implements zzbjp {
    final /* synthetic */ zzcfw zza;

    zzcfu(zzcfw zzcfw) {
        this.zza = zzcfw;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        zzcfw zzcfw = this.zza;
                        if (zzcfw.zzI != parseInt) {
                            zzcfw.zzI = parseInt;
                            this.zza.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    zzo.zzk("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
