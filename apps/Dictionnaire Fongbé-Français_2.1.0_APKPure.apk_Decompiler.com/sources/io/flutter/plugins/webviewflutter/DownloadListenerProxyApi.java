package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import kotlin.Result;
import kotlin.Unit;

public class DownloadListenerProxyApi extends PigeonApiDownloadListener {

    public static class DownloadListenerImpl implements DownloadListener {
        private final DownloadListenerProxyApi api;

        static /* synthetic */ Unit lambda$onDownloadStart$0(Result result) {
            return null;
        }

        public DownloadListenerImpl(DownloadListenerProxyApi downloadListenerProxyApi) {
            this.api = downloadListenerProxyApi;
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            this.api.getPigeonRegistrar().runOnMainThread(new DownloadListenerProxyApi$DownloadListenerImpl$$ExternalSyntheticLambda1(this, str, str2, str3, str4, j));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$onDownloadStart$1$io-flutter-plugins-webviewflutter-DownloadListenerProxyApi$DownloadListenerImpl  reason: not valid java name */
        public /* synthetic */ void m413lambda$onDownloadStart$1$ioflutterpluginswebviewflutterDownloadListenerProxyApi$DownloadListenerImpl(String str, String str2, String str3, String str4, long j) {
            this.api.onDownloadStart(this, str, str2, str3, str4, j, new DownloadListenerProxyApi$DownloadListenerImpl$$ExternalSyntheticLambda0());
        }
    }

    public DownloadListenerProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public DownloadListener pigeon_defaultConstructor() {
        return new DownloadListenerImpl(this);
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
