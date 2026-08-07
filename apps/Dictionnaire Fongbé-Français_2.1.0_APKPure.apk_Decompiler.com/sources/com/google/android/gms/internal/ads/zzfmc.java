package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfmc extends WebViewClient {
    final /* synthetic */ zzfme zza;

    zzfmc(zzfme zzfme) {
        this.zza = zzfme;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String obj = renderProcessGoneDetail.toString();
        String valueOf = String.valueOf(webView);
        Log.w("NativeBridge", "WebView renderer gone: " + obj + "for WebView: " + valueOf);
        if (this.zza.zza() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            this.zza.zzn((WebView) null);
        }
        webView.destroy();
        return true;
    }
}
