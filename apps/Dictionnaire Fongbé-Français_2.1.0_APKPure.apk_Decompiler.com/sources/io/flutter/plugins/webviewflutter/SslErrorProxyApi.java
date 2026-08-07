package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import android.net.http.SslError;

class SslErrorProxyApi extends PigeonApiSslError {
    SslErrorProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }

    public SslCertificate certificate(SslError sslError) {
        return sslError.getCertificate();
    }

    public String url(SslError sslError) {
        return sslError.getUrl();
    }

    public SslErrorType getPrimaryError(SslError sslError) {
        int primaryError = sslError.getPrimaryError();
        if (primaryError == 0) {
            return SslErrorType.NOT_YET_VALID;
        }
        if (primaryError == 1) {
            return SslErrorType.EXPIRED;
        }
        if (primaryError == 2) {
            return SslErrorType.ID_MISMATCH;
        }
        if (primaryError == 3) {
            return SslErrorType.UNTRUSTED;
        }
        if (primaryError == 4) {
            return SslErrorType.DATE_INVALID;
        }
        if (primaryError != 5) {
            return SslErrorType.UNKNOWN;
        }
        return SslErrorType.INVALID;
    }

    /* renamed from: io.flutter.plugins.webviewflutter.SslErrorProxyApi$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$webviewflutter$SslErrorType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.flutter.plugins.webviewflutter.SslErrorType[] r0 = io.flutter.plugins.webviewflutter.SslErrorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$flutter$plugins$webviewflutter$SslErrorType = r0
                io.flutter.plugins.webviewflutter.SslErrorType r1 = io.flutter.plugins.webviewflutter.SslErrorType.DATE_INVALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$SslErrorType     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.webviewflutter.SslErrorType r1 = io.flutter.plugins.webviewflutter.SslErrorType.EXPIRED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$SslErrorType     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.plugins.webviewflutter.SslErrorType r1 = io.flutter.plugins.webviewflutter.SslErrorType.ID_MISMATCH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$SslErrorType     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.flutter.plugins.webviewflutter.SslErrorType r1 = io.flutter.plugins.webviewflutter.SslErrorType.INVALID     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$SslErrorType     // Catch:{ NoSuchFieldError -> 0x003e }
                io.flutter.plugins.webviewflutter.SslErrorType r1 = io.flutter.plugins.webviewflutter.SslErrorType.NOT_YET_VALID     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$SslErrorType     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.flutter.plugins.webviewflutter.SslErrorType r1 = io.flutter.plugins.webviewflutter.SslErrorType.UNTRUSTED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$io$flutter$plugins$webviewflutter$SslErrorType     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.flutter.plugins.webviewflutter.SslErrorType r1 = io.flutter.plugins.webviewflutter.SslErrorType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.webviewflutter.SslErrorProxyApi.AnonymousClass1.<clinit>():void");
        }
    }

    public boolean hasError(SslError sslError, SslErrorType sslErrorType) {
        int i;
        switch (AnonymousClass1.$SwitchMap$io$flutter$plugins$webviewflutter$SslErrorType[sslErrorType.ordinal()]) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 0;
                break;
            case 6:
                i = 3;
                break;
            case 7:
                throw getPigeonRegistrar().createUnknownEnumException(sslErrorType);
            default:
                i = -1;
                break;
        }
        return sslError.hasError(i);
    }
}
