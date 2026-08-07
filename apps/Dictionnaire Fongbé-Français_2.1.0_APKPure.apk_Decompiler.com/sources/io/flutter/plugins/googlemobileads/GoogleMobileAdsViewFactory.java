package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import io.flutter.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.Locale;

final class GoogleMobileAdsViewFactory extends PlatformViewFactory {
    private final AdInstanceManager manager;

    private static class ErrorTextView implements PlatformView {
        private final TextView textView;

        public void dispose() {
        }

        public /* synthetic */ void onFlutterViewAttached(View view) {
            PlatformView.CC.$default$onFlutterViewAttached(this, view);
        }

        public /* synthetic */ void onFlutterViewDetached() {
            PlatformView.CC.$default$onFlutterViewDetached(this);
        }

        public /* synthetic */ void onInputConnectionLocked() {
            PlatformView.CC.$default$onInputConnectionLocked(this);
        }

        public /* synthetic */ void onInputConnectionUnlocked() {
            PlatformView.CC.$default$onInputConnectionUnlocked(this);
        }

        private ErrorTextView(Context context, String str) {
            TextView textView2 = new TextView(context);
            this.textView = textView2;
            textView2.setText(str);
            textView2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
            textView2.setTextColor(InputDeviceCompat.SOURCE_ANY);
        }

        public View getView() {
            return this.textView;
        }
    }

    public GoogleMobileAdsViewFactory(AdInstanceManager adInstanceManager) {
        super(StandardMessageCodec.INSTANCE);
        this.manager = adInstanceManager;
    }

    public PlatformView create(Context context, int i, Object obj) {
        if (obj == null) {
            return getErrorView(context, 0);
        }
        Integer num = (Integer) obj;
        FlutterAd adForId = this.manager.adForId(num.intValue());
        if (adForId == null || adForId.getPlatformView() == null) {
            return getErrorView(context, num.intValue());
        }
        return adForId.getPlatformView();
    }

    private static PlatformView getErrorView(final Context context, int i) {
        Log.e("GoogleMobileAdsViewFactory", String.format(Locale.getDefault(), "This ad may have not been loaded or has been disposed. Ad with the following id could not be found: %d.", new Object[]{Integer.valueOf(i)}));
        return new PlatformView() {
            public void dispose() {
            }

            public /* synthetic */ void onFlutterViewAttached(View view) {
                PlatformView.CC.$default$onFlutterViewAttached(this, view);
            }

            public /* synthetic */ void onFlutterViewDetached() {
                PlatformView.CC.$default$onFlutterViewDetached(this);
            }

            public /* synthetic */ void onInputConnectionLocked() {
                PlatformView.CC.$default$onInputConnectionLocked(this);
            }

            public /* synthetic */ void onInputConnectionUnlocked() {
                PlatformView.CC.$default$onInputConnectionUnlocked(this);
            }

            public View getView() {
                return new View(context);
            }
        };
    }
}
