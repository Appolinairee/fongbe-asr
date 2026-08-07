package io.flutter.plugins.webviewflutter;

import android.os.Message;

public class MessageProxyApi extends PigeonApiAndroidMessage {
    public MessageProxyApi(AndroidWebkitLibraryPigeonProxyApiRegistrar androidWebkitLibraryPigeonProxyApiRegistrar) {
        super(androidWebkitLibraryPigeonProxyApiRegistrar);
    }

    public void sendToTarget(Message message) {
        message.sendToTarget();
    }
}
