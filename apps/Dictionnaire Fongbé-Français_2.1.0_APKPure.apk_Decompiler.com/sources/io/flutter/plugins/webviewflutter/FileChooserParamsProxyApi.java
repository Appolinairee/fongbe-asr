package io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import java.util.Arrays;
import java.util.List;

public class FileChooserParamsProxyApi extends PigeonApiFileChooserParams {
    public FileChooserParamsProxyApi(ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    public boolean isCaptureEnabled(WebChromeClient.FileChooserParams fileChooserParams) {
        return fileChooserParams.isCaptureEnabled();
    }

    public List<String> acceptTypes(WebChromeClient.FileChooserParams fileChooserParams) {
        return Arrays.asList(fileChooserParams.getAcceptTypes());
    }

    public FileChooserMode mode(WebChromeClient.FileChooserParams fileChooserParams) {
        int mode = fileChooserParams.getMode();
        if (mode == 0) {
            return FileChooserMode.OPEN;
        }
        if (mode == 1) {
            return FileChooserMode.OPEN_MULTIPLE;
        }
        if (mode != 3) {
            return FileChooserMode.UNKNOWN;
        }
        return FileChooserMode.SAVE;
    }

    public String filenameHint(WebChromeClient.FileChooserParams fileChooserParams) {
        return fileChooserParams.getFilenameHint();
    }
}
