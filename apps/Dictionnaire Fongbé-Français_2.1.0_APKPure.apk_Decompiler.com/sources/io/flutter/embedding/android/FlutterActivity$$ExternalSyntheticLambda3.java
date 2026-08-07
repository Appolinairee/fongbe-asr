package io.flutter.embedding.android;

import android.window.OnBackInvokedCallback;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class FlutterActivity$$ExternalSyntheticLambda3 implements OnBackInvokedCallback {
    public final /* synthetic */ FlutterActivity f$0;

    public /* synthetic */ FlutterActivity$$ExternalSyntheticLambda3(FlutterActivity flutterActivity) {
        this.f$0 = flutterActivity;
    }

    public final void onBackInvoked() {
        this.f$0.onBackPressed();
    }
}
