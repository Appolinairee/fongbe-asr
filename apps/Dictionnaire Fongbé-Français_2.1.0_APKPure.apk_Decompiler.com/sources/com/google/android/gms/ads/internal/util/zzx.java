package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.util.HalfKt$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzx extends zzv {
    static final /* synthetic */ WindowInsets zzl(Activity activity, View view, WindowInsets windowInsets) {
        if (zzv.zzp().zzi().zzj() == null) {
            DisplayCutout m = HalfKt$$ExternalSyntheticApiModelOutline0.m(windowInsets);
            String str = "";
            if (m != null) {
                zzg zzi = zzv.zzp().zzi();
                for (Rect rect : m.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                zzi.zzy(str);
            } else {
                zzv.zzp().zzi().zzy(str);
            }
        }
        zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int m = attributes.layoutInDisplayCutoutMode;
        int i = 1;
        if (true != z) {
            i = 2;
        }
        if (i != m) {
            attributes.layoutInDisplayCutoutMode = i;
            window.setAttributes(attributes);
        }
    }

    public final int zzj(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    public final void zzk(Activity activity) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbo)).booleanValue() && zzv.zzp().zzi().zzj() == null && !activity.isInMultiWindowMode()) {
            zzn(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new zzw(this, activity));
        }
    }
}
