package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdjp implements zzbjp {
    public final /* synthetic */ zzdjt zza;

    public /* synthetic */ zzdjp(zzdjt zzdjt) {
        this.zza = zzdjt;
    }

    public final void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        zzcex.zzN().zzC(new zzdjs(this.zza, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzcex.loadData(str, "text/html", "UTF-8");
        } else {
            zzcex.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
