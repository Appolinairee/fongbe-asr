package io.flutter.plugin.platform;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import io.flutter.Log;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

abstract class SingleViewWindowManager implements WindowManager {
    private static final String TAG = "PlatformViewsController";
    final WindowManager delegate;
    SingleViewFakeWindowViewGroup fakeWindowRootView;

    SingleViewWindowManager(WindowManager windowManager, SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup) {
        this.delegate = windowManager;
        this.fakeWindowRootView = singleViewFakeWindowViewGroup;
    }

    @Deprecated
    public Display getDefaultDisplay() {
        return this.delegate.getDefaultDisplay();
    }

    public void removeViewImmediate(View view) {
        if (this.fakeWindowRootView == null) {
            Log.w(TAG, "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        this.fakeWindowRootView.removeView(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
        if (singleViewFakeWindowViewGroup == null) {
            Log.w(TAG, "Embedded view called addView while detached from presentation");
        } else {
            singleViewFakeWindowViewGroup.addView(view, layoutParams);
        }
    }

    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
        if (singleViewFakeWindowViewGroup == null) {
            Log.w(TAG, "Embedded view called updateViewLayout while detached from presentation");
        } else {
            singleViewFakeWindowViewGroup.updateViewLayout(view, layoutParams);
        }
    }

    public void removeView(View view) {
        SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
        if (singleViewFakeWindowViewGroup == null) {
            Log.w(TAG, "Embedded view called removeView while detached from presentation");
        } else {
            singleViewFakeWindowViewGroup.removeView(view);
        }
    }

    public WindowMetrics getCurrentWindowMetrics() {
        return this.delegate.getCurrentWindowMetrics();
    }

    public WindowMetrics getMaximumWindowMetrics() {
        return this.delegate.getMaximumWindowMetrics();
    }

    public boolean isCrossWindowBlurEnabled() {
        return this.delegate.isCrossWindowBlurEnabled();
    }

    public void addCrossWindowBlurEnabledListener(Consumer<Boolean> consumer) {
        this.delegate.addCrossWindowBlurEnabledListener(consumer);
    }

    public void addCrossWindowBlurEnabledListener(Executor executor, Consumer<Boolean> consumer) {
        this.delegate.addCrossWindowBlurEnabledListener(executor, consumer);
    }

    public void removeCrossWindowBlurEnabledListener(Consumer<Boolean> consumer) {
        this.delegate.removeCrossWindowBlurEnabledListener(consumer);
    }
}
