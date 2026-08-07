package io.flutter.plugins.googlemobileads;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

final class AppStateNotifier implements LifecycleEventObserver, MethodChannel.MethodCallHandler, EventChannel.StreamHandler {
    private static final String EVENT_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/app_state_event";
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/app_state_method";
    private final EventChannel eventChannel;
    private EventChannel.EventSink events;
    private final MethodChannel methodChannel;

    AppStateNotifier(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        this.methodChannel = methodChannel2;
        methodChannel2.setMethodCallHandler(this);
        EventChannel eventChannel2 = new EventChannel(binaryMessenger, EVENT_CHANNEL_NAME);
        this.eventChannel = eventChannel2;
        eventChannel2.setStreamHandler(this);
    }

    /* access modifiers changed from: package-private */
    public void start() {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }

    /* access modifiers changed from: package-private */
    public void stop() {
        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        if (str.equals("stop")) {
            stop();
        } else if (!str.equals("start")) {
            result.notImplemented();
        } else {
            start();
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        EventChannel.EventSink eventSink;
        EventChannel.EventSink eventSink2;
        if (event == Lifecycle.Event.ON_START && (eventSink2 = this.events) != null) {
            eventSink2.success("foreground");
        } else if (event == Lifecycle.Event.ON_STOP && (eventSink = this.events) != null) {
            eventSink.success("background");
        }
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.events = eventSink;
    }

    public void onCancel(Object obj) {
        this.events = null;
    }
}
