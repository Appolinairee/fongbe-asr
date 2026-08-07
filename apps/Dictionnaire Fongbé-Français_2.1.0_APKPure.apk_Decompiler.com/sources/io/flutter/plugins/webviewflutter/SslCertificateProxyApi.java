package io.flutter.plugins.webviewflutter;

import android.net.http.SslCertificate;
import android.util.Log;
import java.security.cert.X509Certificate;
import java.util.Date;

class SslCertificateProxyApi extends PigeonApiSslCertificate {
    SslCertificateProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }

    public SslCertificate.DName getIssuedBy(SslCertificate sslCertificate) {
        return sslCertificate.getIssuedBy();
    }

    public SslCertificate.DName getIssuedTo(SslCertificate sslCertificate) {
        return sslCertificate.getIssuedTo();
    }

    public Long getValidNotAfterMsSinceEpoch(SslCertificate sslCertificate) {
        Date validNotAfterDate = sslCertificate.getValidNotAfterDate();
        if (validNotAfterDate != null) {
            return Long.valueOf(validNotAfterDate.getTime());
        }
        return null;
    }

    public Long getValidNotBeforeMsSinceEpoch(SslCertificate sslCertificate) {
        Date validNotBeforeDate = sslCertificate.getValidNotBeforeDate();
        if (validNotBeforeDate != null) {
            return Long.valueOf(validNotBeforeDate.getTime());
        }
        return null;
    }

    public X509Certificate getX509Certificate(SslCertificate sslCertificate) {
        if (getPigeonRegistrar().sdkIsAtLeast(29)) {
            return sslCertificate.getX509Certificate();
        }
        Log.d("SslCertificateProxyApi", getPigeonRegistrar().createUnsupportedVersionMessage("SslCertificate.getX509Certificate", "Build.VERSION_CODES.Q"));
        return null;
    }
}
