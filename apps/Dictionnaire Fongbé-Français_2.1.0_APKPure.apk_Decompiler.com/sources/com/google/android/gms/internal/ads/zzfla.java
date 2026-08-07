package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfla {
    private final zzflc zza;
    private final WebView zzb;
    private zzfnb zzc;
    private final HashMap zzd;
    private final zzflo zze = new zzflo();

    private zzfla(zzflc zzflc, WebView webView, boolean z) {
        HashMap hashMap = new HashMap();
        this.zzd = hashMap;
        zzfmk.zza();
        this.zza = zzflc;
        this.zzb = webView;
        if (zza() != webView) {
            for (zzfkp zzd2 : hashMap.values()) {
                zzd2.zzd(webView);
            }
            this.zzc = new zzfnb(webView);
        }
        if (WebViewFeature.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            zzh();
            WebViewCompat.addWebMessageListener(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList(new String[]{ProxyConfig.MATCH_ALL_SCHEMES})), new zzfkz(this));
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public static zzfla zzb(zzflc zzflc, WebView webView, boolean z) {
        return new zzfla(zzflc, webView, true);
    }

    static /* bridge */ /* synthetic */ void zzc(zzfla zzfla, String str) {
        zzfkp zzfkp = (zzfkp) zzfla.zzd.get(str);
        if (zzfkp != null) {
            zzfkp.zzc();
            zzfla.zzd.remove(str);
        }
    }

    static /* bridge */ /* synthetic */ void zze(zzfla zzfla, String str) {
        zzfkt zzfkt = new zzfkt(zzfkq.zza(zzfku.DEFINED_BY_JAVASCRIPT, zzfkx.DEFINED_BY_JAVASCRIPT, zzflb.JAVASCRIPT, zzflb.JAVASCRIPT, false), zzfkr.zzb(zzfla.zza, zzfla.zzb, (String) null, (String) null), str);
        zzfla.zzd.put(str, zzfkt);
        zzfkt.zzd(zzfla.zza());
        for (zzfln zzfln : zzfla.zze.zza()) {
            zzfkt.zzb((View) zzfln.zzb().get(), zzfln.zza(), zzfln.zzc());
        }
        zzfkt.zze();
    }

    /* access modifiers changed from: private */
    public final void zzh() {
        WebViewCompat.removeWebMessageListener(this.zzb, "omidJsSessionService");
    }

    /* access modifiers changed from: package-private */
    public final View zza() {
        zzfnb zzfnb = this.zzc;
        if (zzfnb == null) {
            return null;
        }
        return (View) zzfnb.get();
    }

    public final void zzf(View view, zzfkw zzfkw, String str) {
        for (zzfkp zzb2 : this.zzd.values()) {
            zzb2.zzb(view, zzfkw, "Ad overlay");
        }
        this.zze.zzb(view, zzfkw, "Ad overlay");
    }

    public final void zzg(zzcfo zzcfo) {
        for (zzfkp zzc2 : this.zzd.values()) {
            zzc2.zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfky(this, zzcfo, timer), 1000);
    }
}
