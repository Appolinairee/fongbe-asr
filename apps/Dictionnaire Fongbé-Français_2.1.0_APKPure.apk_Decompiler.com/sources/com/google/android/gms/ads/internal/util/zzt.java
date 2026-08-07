package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzebv;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzt extends zzaa {
    public zzt() {
        super((zzz) null);
    }

    public final CookieManager zza(Context context) {
        zzv.zzq();
        if (zzs.zzG()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzo.zzh("Failed to obtain CookieManager.", th);
            zzv.zzp().zzv(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final WebResourceResponse zzb(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    public final zzcff zzc(zzcex zzcex, zzbbj zzbbj, boolean z, zzebv zzebv) {
        return new zzcgg(zzcex, zzbbj, z, zzebv);
    }
}
