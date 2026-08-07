package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;
import androidx.work.Constraints$Builder$$ExternalSyntheticApiModelOutline0;

public class ApiHelperForM {
    private ApiHelperForM() {
    }

    public static void postMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void close(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static void setWebMessageCallback(WebMessagePort webMessagePort, final WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() {
            public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
                WebMessagePortCompat.WebMessageCallbackCompat.this.onMessage(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
            }
        });
    }

    public static void setWebMessageCallback(WebMessagePort webMessagePort, final WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat, Handler handler) {
        webMessagePort.setWebMessageCallback(new WebMessagePort.WebMessageCallback() {
            public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
                WebMessagePortCompat.WebMessageCallbackCompat.this.onMessage(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
            }
        }, handler);
    }

    public static WebMessage createWebMessage(WebMessageCompat webMessageCompat) {
        Constraints$Builder$$ExternalSyntheticApiModelOutline0.m();
        return Constraints$Builder$$ExternalSyntheticApiModelOutline0.m(webMessageCompat.getData(), WebMessagePortImpl.compatToPorts(webMessageCompat.getPorts()));
    }

    public static WebMessageCompat createWebMessageCompat(WebMessage webMessage) {
        return new WebMessageCompat(Constraints$Builder$$ExternalSyntheticApiModelOutline0.m(webMessage), WebMessagePortImpl.portsToCompat(Constraints$Builder$$ExternalSyntheticApiModelOutline0.m(webMessage)));
    }

    public static int getErrorCode(WebResourceError webResourceError) {
        return Constraints$Builder$$ExternalSyntheticApiModelOutline0.m(webResourceError);
    }

    public static CharSequence getDescription(WebResourceError webResourceError) {
        return Constraints$Builder$$ExternalSyntheticApiModelOutline0.m(webResourceError);
    }

    public static void setOffscreenPreRaster(WebSettings webSettings, boolean z) {
        webSettings.setOffscreenPreRaster(z);
    }

    public static boolean getOffscreenPreRaster(WebSettings webSettings) {
        return Constraints$Builder$$ExternalSyntheticApiModelOutline0.m(webSettings);
    }

    public static void postVisualStateCallback(WebView webView, long j, final WebViewCompat.VisualStateCallback visualStateCallback) {
        webView.postVisualStateCallback(j, new WebView.VisualStateCallback() {
            public void onComplete(long j) {
                WebViewCompat.VisualStateCallback.this.onComplete(j);
            }
        });
    }

    public static void postWebMessage(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static WebMessagePort[] createWebMessageChannel(WebView webView) {
        return Constraints$Builder$$ExternalSyntheticApiModelOutline0.m(webView);
    }
}
