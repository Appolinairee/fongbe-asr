package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;

class SslCertificateDNameProxyApi extends PigeonApiSslCertificateDName {
    SslCertificateDNameProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public String getCName(SslCertificate.DName dName) {
        return dName.getCName();
    }

    public String getDName(SslCertificate.DName dName) {
        return dName.getDName();
    }

    public String getOName(SslCertificate.DName dName) {
        return dName.getOName();
    }

    public String getUName(SslCertificate.DName dName) {
        return dName.getUName();
    }
}
