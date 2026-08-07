package io.flutter.plugins.webviewflutter;

import android.webkit.WebSettings;

public class WebSettingsProxyApi extends PigeonApiWebSettings {
    public WebSettingsProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public void setDomStorageEnabled(WebSettings webSettings, boolean z) {
        webSettings.setDomStorageEnabled(z);
    }

    public void setJavaScriptCanOpenWindowsAutomatically(WebSettings webSettings, boolean z) {
        webSettings.setJavaScriptCanOpenWindowsAutomatically(z);
    }

    public void setSupportMultipleWindows(WebSettings webSettings, boolean z) {
        webSettings.setSupportMultipleWindows(z);
    }

    public void setJavaScriptEnabled(WebSettings webSettings, boolean z) {
        webSettings.setJavaScriptEnabled(z);
    }

    public void setUserAgentString(WebSettings webSettings, String str) {
        webSettings.setUserAgentString(str);
    }

    public void setMediaPlaybackRequiresUserGesture(WebSettings webSettings, boolean z) {
        webSettings.setMediaPlaybackRequiresUserGesture(z);
    }

    public void setSupportZoom(WebSettings webSettings, boolean z) {
        webSettings.setSupportZoom(z);
    }

    public void setLoadWithOverviewMode(WebSettings webSettings, boolean z) {
        webSettings.setLoadWithOverviewMode(z);
    }

    public void setUseWideViewPort(WebSettings webSettings, boolean z) {
        webSettings.setUseWideViewPort(z);
    }

    public void setDisplayZoomControls(WebSettings webSettings, boolean z) {
        webSettings.setDisplayZoomControls(z);
    }

    public void setBuiltInZoomControls(WebSettings webSettings, boolean z) {
        webSettings.setBuiltInZoomControls(z);
    }

    public void setAllowFileAccess(WebSettings webSettings, boolean z) {
        webSettings.setAllowFileAccess(z);
    }

    public void setAllowContentAccess(WebSettings webSettings, boolean z) {
        webSettings.setAllowContentAccess(z);
    }

    public void setGeolocationEnabled(WebSettings webSettings, boolean z) {
        webSettings.setGeolocationEnabled(z);
    }

    public void setTextZoom(WebSettings webSettings, long j) {
        webSettings.setTextZoom((int) j);
    }

    public String getUserAgentString(WebSettings webSettings) {
        return webSettings.getUserAgentString();
    }

    /* renamed from: io.flutter.plugins.webviewflutter.WebSettingsProxyApi$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                io.flutter.plugins.webviewflutter.MixedContentMode[] r0 = io.flutter.plugins.webviewflutter.MixedContentMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode = r0
                io.flutter.plugins.webviewflutter.MixedContentMode r1 = io.flutter.plugins.webviewflutter.MixedContentMode.ALWAYS_ALLOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.webviewflutter.MixedContentMode r1 = io.flutter.plugins.webviewflutter.MixedContentMode.COMPATIBILITY_MODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.plugins.webviewflutter.MixedContentMode r1 = io.flutter.plugins.webviewflutter.MixedContentMode.NEVER_ALLOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.webviewflutter.WebSettingsProxyApi.AnonymousClass1.<clinit>():void");
        }
    }

    public void setMixedContentMode(WebSettings webSettings, MixedContentMode mixedContentMode) {
        int i = AnonymousClass1.$SwitchMap$io$flutter$plugins$webviewflutter$MixedContentMode[mixedContentMode.ordinal()];
        if (i == 1) {
            webSettings.setMixedContentMode(0);
        } else if (i == 2) {
            webSettings.setMixedContentMode(2);
        } else if (i == 3) {
            webSettings.setMixedContentMode(1);
        }
    }
}
