package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzcgf extends zzcff {
    public zzcgf(zzcex zzcex, zzbbj zzbbj, boolean z, zzebv zzebv) {
        super(zzcex, zzbbj, z, new zzbsh(zzcex, zzcex.zzE(), new zzbbt(zzcex.getContext())), (zzbsc) null, zzebv);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzW(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcex)) {
            zzo.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcex zzcex = (zzcex) webView;
        zzbxu zzbxu = this.zza;
        if (zzbxu != null) {
            zzbxu.zzd(str, map, 1);
        }
        zzfpu.zza();
        zzfqa zzfqa = zzfqa.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcex.zzN() != null) {
            zzcex.zzN().zzH();
        }
        if (zzcex.zzO().zzi()) {
            str2 = (String) zzbe.zzc().zza(zzbcl.zzaa);
        } else if (zzcex.zzaF()) {
            str2 = (String) zzbe.zzc().zza(zzbcl.zzZ);
        } else {
            str2 = (String) zzbe.zzc().zza(zzbcl.zzY);
        }
        zzv.zzq();
        return zzs.zzy(zzcex.getContext(), zzcex.zzn().afmaVersion, str2);
    }
}
