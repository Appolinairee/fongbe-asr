package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzclw implements zzcla {
    private final CookieManager zza;

    public zzclw(Context context) {
        this.zza = zzv.zzr().zza(context);
    }

    public final void zza(Map map) {
        String cookie;
        if (this.zza != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) zzbe.zzc().zza(zzbcl.zzaY);
                CookieManager cookieManager = this.zza;
                if (cookieManager != null && (cookie = cookieManager.getCookie(str)) != null) {
                    List zzf = zzfvc.zzb(zzfty.zzc(';')).zzf(cookie);
                    int i = 0;
                    while (i < zzf.size()) {
                        CookieManager cookieManager2 = this.zza;
                        Iterator it = zzfvc.zzb(zzfty.zzc('=')).zzd((String) zzf.get(i)).iterator();
                        it.getClass();
                        if (it.hasNext()) {
                            cookieManager2.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) zzbe.zzc().zza(zzbcl.zzaK))));
                            i++;
                        } else {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (" + 0 + ")");
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (!TextUtils.isEmpty(str2)) {
                this.zza.setCookie((String) zzbe.zzc().zza(zzbcl.zzaY), str2);
            }
        }
    }
}
