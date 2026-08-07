package io.flutter.plugins.webviewflutter;

import android.webkit.ClientCertRequest;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;

class ClientCertRequestProxyApi extends PigeonApiClientCertRequest {
    ClientCertRequestProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public void cancel(ClientCertRequest clientCertRequest) {
        clientCertRequest.cancel();
    }

    public void ignore(ClientCertRequest clientCertRequest) {
        clientCertRequest.ignore();
    }

    public void proceed(ClientCertRequest clientCertRequest, PrivateKey privateKey, List<? extends X509Certificate> list) {
        clientCertRequest.proceed(privateKey, (X509Certificate[]) list.toArray(new X509Certificate[0]));
    }
}
