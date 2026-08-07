package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.work.Constraints$Builder$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzgcs;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzj extends zzbkk {
    private final WebView zza;
    private final zzf zzb;
    private final Executor zzc;
    private WebViewClient zzd;

    public zzj(WebView webView, zzf zzf, zzgcs zzgcs) {
        this.zza = webView;
        this.zzb = zzf;
        this.zzc = zzgcs;
    }

    private final void zzc() {
        Locale locale = Locale.getDefault();
        zzbcc zzbcc = zzbcl.zzjF;
        this.zza.evaluateJavascript(String.format(locale, (String) zzbe.zzc().zza(zzbcc), new Object[]{this.zzb.zza()}), (ValueCallback) null);
    }

    /* access modifiers changed from: protected */
    public final WebViewClient getDelegate() {
        return this.zzd;
    }

    public final void onPageFinished(WebView webView, String str) {
        zzc();
        super.onPageFinished(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzc();
        super.onPageStarted(webView, str, bitmap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza() {
        WebViewClient webViewClient;
        try {
            zzv.zzq();
            WebView webView = this.zza;
            if (Build.VERSION.SDK_INT >= 26) {
                webViewClient = Constraints$Builder$$ExternalSyntheticApiModelOutline0.m(webView);
            } else {
                if (WebViewFeature.isFeatureSupported("GET_WEB_VIEW_CLIENT")) {
                    try {
                        webViewClient = WebViewCompat.getWebViewClient(webView);
                    } catch (RuntimeException e) {
                        zzv.zzp().zzw(e, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            if (webViewClient != this) {
                if (webViewClient != null) {
                    this.zzd = webViewClient;
                }
                this.zza.setWebViewClient(this);
                zzc();
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void zzb() {
        this.zzc.execute(new zzh(this));
    }
}
