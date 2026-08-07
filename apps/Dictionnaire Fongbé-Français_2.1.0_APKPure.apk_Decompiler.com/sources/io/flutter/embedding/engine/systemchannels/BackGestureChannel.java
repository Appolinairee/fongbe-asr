package io.flutter.embedding.engine.systemchannels;

import android.window.BackEvent;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.io.path.FileVisitorImpl$$ExternalSyntheticApiModelOutline0;

public class BackGestureChannel {
    private static final String TAG = "BackGestureChannel";
    public final MethodChannel channel;
    private final MethodChannel.MethodCallHandler defaultHandler;

    public BackGestureChannel(DartExecutor dartExecutor) {
        AnonymousClass1 r0 = new MethodChannel.MethodCallHandler() {
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                result.success((Object) null);
            }
        };
        this.defaultHandler = r0;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/backgesture", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r0);
    }

    public void startBackGesture(BackEvent backEvent) {
        Log.v(TAG, "Sending message to start back gesture");
        this.channel.invokeMethod("startBackGesture", backEventToJsonMap(backEvent));
    }

    public void updateBackGestureProgress(BackEvent backEvent) {
        Log.v(TAG, "Sending message to update back gesture progress");
        this.channel.invokeMethod("updateBackGestureProgress", backEventToJsonMap(backEvent));
    }

    public void commitBackGesture() {
        Log.v(TAG, "Sending message to commit back gesture");
        this.channel.invokeMethod("commitBackGesture", (Object) null);
    }

    public void cancelBackGesture() {
        Log.v(TAG, "Sending message to cancel back gesture");
        this.channel.invokeMethod("cancelBackGesture", (Object) null);
    }

    public void setMethodCallHandler(MethodChannel.MethodCallHandler methodCallHandler) {
        this.channel.setMethodCallHandler(methodCallHandler);
    }

    private Map<String, Object> backEventToJsonMap(BackEvent backEvent) {
        List list;
        HashMap hashMap = new HashMap(3);
        float m = FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(backEvent);
        float m$1 = backEvent.getTouchY();
        if (Float.isNaN(m) || Float.isNaN(m$1)) {
            list = null;
        } else {
            list = Arrays.asList(new Float[]{Float.valueOf(m), Float.valueOf(m$1)});
        }
        hashMap.put("touchOffset", list);
        hashMap.put("progress", Float.valueOf(backEvent.getProgress()));
        hashMap.put("swipeEdge", Integer.valueOf(FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(backEvent)));
        return hashMap;
    }
}
