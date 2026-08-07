package io.flutter.plugins.webviewflutter;

import android.webkit.ConsoleMessage;

public class ConsoleMessageProxyApi extends PigeonApiConsoleMessage {
    public ConsoleMessageProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public long lineNumber(ConsoleMessage consoleMessage) {
        return (long) consoleMessage.lineNumber();
    }

    public String message(ConsoleMessage consoleMessage) {
        return consoleMessage.message();
    }

    /* renamed from: io.flutter.plugins.webviewflutter.ConsoleMessageProxyApi$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.webkit.ConsoleMessage$MessageLevel[] r0 = android.webkit.ConsoleMessage.MessageLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = r0
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.TIP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$android$webkit$ConsoleMessage$MessageLevel     // Catch:{ NoSuchFieldError -> 0x001d }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.LOG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$android$webkit$ConsoleMessage$MessageLevel     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.WARNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$android$webkit$ConsoleMessage$MessageLevel     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$android$webkit$ConsoleMessage$MessageLevel     // Catch:{ NoSuchFieldError -> 0x003e }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.webviewflutter.ConsoleMessageProxyApi.AnonymousClass1.<clinit>():void");
        }
    }

    public ConsoleMessageLevel level(ConsoleMessage consoleMessage) {
        int i = AnonymousClass1.$SwitchMap$android$webkit$ConsoleMessage$MessageLevel[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            return ConsoleMessageLevel.TIP;
        }
        if (i == 2) {
            return ConsoleMessageLevel.LOG;
        }
        if (i == 3) {
            return ConsoleMessageLevel.WARNING;
        }
        if (i == 4) {
            return ConsoleMessageLevel.ERROR;
        }
        if (i != 5) {
            return ConsoleMessageLevel.UNKNOWN;
        }
        return ConsoleMessageLevel.DEBUG;
    }

    public String sourceId(ConsoleMessage consoleMessage) {
        return consoleMessage.sourceId();
    }
}
