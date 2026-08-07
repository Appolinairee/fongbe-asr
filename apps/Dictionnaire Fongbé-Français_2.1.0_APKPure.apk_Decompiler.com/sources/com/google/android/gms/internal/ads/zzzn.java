package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzzn {
    public static boolean zza(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !zzoc$$ExternalSyntheticApiModelOutline2.m(display)) {
            return false;
        }
        for (int i : zzoc$$ExternalSyntheticApiModelOutline2.m(display).getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
