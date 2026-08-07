package io.flutter.plugin.platform;

import android.view.WindowManager;

final class WindowManagerHandler extends SingleViewWindowManager {
    WindowManagerHandler(WindowManager windowManager, SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup) {
        super(windowManager, singleViewFakeWindowViewGroup);
    }
}
