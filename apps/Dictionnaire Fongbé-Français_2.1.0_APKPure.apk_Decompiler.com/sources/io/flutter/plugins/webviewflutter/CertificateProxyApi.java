package io.flutter.plugins.webviewflutter;

import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;

class CertificateProxyApi extends PigeonApiCertificate {
    CertificateProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public byte[] getEncoded(Certificate certificate) {
        try {
            return certificate.getEncoded();
        } catch (CertificateEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
