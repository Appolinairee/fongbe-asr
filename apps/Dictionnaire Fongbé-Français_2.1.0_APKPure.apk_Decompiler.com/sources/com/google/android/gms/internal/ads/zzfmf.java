package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfmf {
    private static UiModeManager zza;

    public static zzfkv zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfkv.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType == 1) {
            return zzfkv.MOBILE;
        }
        if (currentModeType != 4) {
            return zzfkv.OTHER;
        }
        return zzfkv.CTV;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
