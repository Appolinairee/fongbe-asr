package io.flutter.plugins.webviewflutter;

import android.view.View;

public class ViewProxyApi extends PigeonApiView {
    public ViewProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }

    public void scrollTo(View view, long j, long j2) {
        view.scrollTo((int) j, (int) j2);
    }

    public void scrollBy(View view, long j, long j2) {
        view.scrollBy((int) j, (int) j2);
    }

    public WebViewPoint getScrollPosition(View view) {
        return new WebViewPoint((long) view.getScrollX(), (long) view.getScrollY());
    }

    public void setVerticalScrollBarEnabled(View view, boolean z) {
        view.setVerticalScrollBarEnabled(z);
    }

    public void setHorizontalScrollBarEnabled(View view, boolean z) {
        view.setHorizontalScrollBarEnabled(z);
    }

    /* renamed from: io.flutter.plugins.webviewflutter.ViewProxyApi$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.flutter.plugins.webviewflutter.OverScrollMode[] r0 = io.flutter.plugins.webviewflutter.OverScrollMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode = r0
                io.flutter.plugins.webviewflutter.OverScrollMode r1 = io.flutter.plugins.webviewflutter.OverScrollMode.ALWAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.webviewflutter.OverScrollMode r1 = io.flutter.plugins.webviewflutter.OverScrollMode.IF_CONTENT_SCROLLS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.plugins.webviewflutter.OverScrollMode r1 = io.flutter.plugins.webviewflutter.OverScrollMode.NEVER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.flutter.plugins.webviewflutter.OverScrollMode r1 = io.flutter.plugins.webviewflutter.OverScrollMode.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.webviewflutter.ViewProxyApi.AnonymousClass1.<clinit>():void");
        }
    }

    public void setOverScrollMode(View view, OverScrollMode overScrollMode) {
        int i = AnonymousClass1.$SwitchMap$io$flutter$plugins$webviewflutter$OverScrollMode[overScrollMode.ordinal()];
        if (i == 1) {
            view.setOverScrollMode(0);
        } else if (i == 2) {
            view.setOverScrollMode(1);
        } else if (i == 3) {
            view.setOverScrollMode(2);
        } else if (i == 4) {
            throw getPigeonRegistrar().createUnknownEnumException(OverScrollMode.UNKNOWN);
        }
    }
}
