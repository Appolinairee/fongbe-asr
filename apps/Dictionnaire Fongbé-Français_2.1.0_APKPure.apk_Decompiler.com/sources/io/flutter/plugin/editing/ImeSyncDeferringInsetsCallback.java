package io.flutter.plugin.editing;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import androidx.core.util.HalfKt$$ExternalSyntheticApiModelOutline0;
import androidx.print.PrintHelper$$ExternalSyntheticApiModelOutline0;
import java.util.List;
import kotlin.io.path.FileVisitorImpl$$ExternalSyntheticApiModelOutline0;

class ImeSyncDeferringInsetsCallback {
    /* access modifiers changed from: private */
    public boolean animating = false;
    private AnimationCallback animationCallback;
    /* access modifiers changed from: private */
    public final int deferredInsetTypes = HalfKt$$ExternalSyntheticApiModelOutline0.m();
    private InsetsListener insetsListener;
    /* access modifiers changed from: private */
    public WindowInsets lastWindowInsets;
    /* access modifiers changed from: private */
    public boolean needsSave = false;
    /* access modifiers changed from: private */
    public View view;

    ImeSyncDeferringInsetsCallback(View view2) {
        this.view = view2;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new InsetsListener();
    }

    /* access modifiers changed from: package-private */
    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    /* access modifiers changed from: package-private */
    public void remove() {
        this.view.setWindowInsetsAnimationCallback((WindowInsetsAnimation.Callback) null);
        this.view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
    }

    /* access modifiers changed from: package-private */
    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    /* access modifiers changed from: package-private */
    public WindowInsetsAnimation.Callback getAnimationCallback() {
        return this.animationCallback;
    }

    private class AnimationCallback extends WindowInsetsAnimation.Callback {
        AnimationCallback() {
            super(1);
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            boolean unused = ImeSyncDeferringInsetsCallback.this.needsSave = true;
            if ((HalfKt$$ExternalSyntheticApiModelOutline0.m(windowInsetsAnimation) & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                boolean unused2 = ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                boolean z = false;
                for (WindowInsetsAnimation m : list) {
                    if ((HalfKt$$ExternalSyntheticApiModelOutline0.m(HalfKt$$ExternalSyntheticApiModelOutline0.m((Object) m)) & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z = true;
                    }
                }
                if (!z) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                int m$3 = ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) ? windowInsets.getInsets(PrintHelper$$ExternalSyntheticApiModelOutline0.m$1()).bottom : 0;
                FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m$1();
                WindowInsets.Builder m2 = HalfKt$$ExternalSyntheticApiModelOutline0.m(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                WindowInsets.Builder unused = m2.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, Insets.of(0, 0, 0, Math.max(windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes).bottom - m$3, 0)));
                ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(m2.build());
            }
            return windowInsets;
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            if (ImeSyncDeferringInsetsCallback.this.animating && (HalfKt$$ExternalSyntheticApiModelOutline0.m(windowInsetsAnimation) & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                boolean unused = ImeSyncDeferringInsetsCallback.this.animating = false;
                if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && ImeSyncDeferringInsetsCallback.this.view != null) {
                    ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                }
            }
        }
    }

    private class InsetsListener implements View.OnApplyWindowInsetsListener {
        private InsetsListener() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            View unused = ImeSyncDeferringInsetsCallback.this.view = view;
            if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                WindowInsets unused2 = ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                boolean unused3 = ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            if (ImeSyncDeferringInsetsCallback.this.animating) {
                return HalfKt$$ExternalSyntheticApiModelOutline0.m();
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }
}
