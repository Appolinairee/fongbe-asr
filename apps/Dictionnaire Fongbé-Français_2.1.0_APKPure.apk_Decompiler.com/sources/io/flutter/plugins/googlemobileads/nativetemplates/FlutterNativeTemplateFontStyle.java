package io.flutter.plugins.googlemobileads.nativetemplates;

import android.graphics.Typeface;
import android.util.Log;

public enum FlutterNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    public static FlutterNativeTemplateFontStyle fromIntValue(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Log.w("NativeTemplateFontStyle", "Invalid index for NativeTemplateFontStyle: " + i);
        return NORMAL;
    }

    /* access modifiers changed from: package-private */
    public Typeface getTypeface() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return Typeface.DEFAULT;
        }
        if (ordinal == 1) {
            return Typeface.DEFAULT_BOLD;
        }
        if (ordinal == 2) {
            return Typeface.defaultFromStyle(2);
        }
        if (ordinal != 3) {
            return Typeface.DEFAULT;
        }
        return Typeface.MONOSPACE;
    }
}
