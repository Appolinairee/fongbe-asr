package io.flutter.plugins.googlemobileads.usermessagingplatform;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import io.flutter.plugin.common.MethodChannel;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class UserMessagingPlatformManager$$ExternalSyntheticLambda0 implements ConsentForm.OnConsentFormDismissedListener {
    public final /* synthetic */ MethodChannel.Result f$0;

    public /* synthetic */ UserMessagingPlatformManager$$ExternalSyntheticLambda0(MethodChannel.Result result) {
        this.f$0 = result;
    }

    public final void onConsentFormDismissed(FormError formError) {
        this.f$0.success(formError);
    }
}
