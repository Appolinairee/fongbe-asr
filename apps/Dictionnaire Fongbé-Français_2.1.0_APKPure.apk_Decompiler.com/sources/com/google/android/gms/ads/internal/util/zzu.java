package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzu extends zzt {
    static final boolean zze(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public final boolean zzd(Activity activity, Configuration configuration) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzeR)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeT)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzbc.zzb();
        int zzx = zzf.zzx(activity, configuration.screenHeightDp);
        int zzx2 = zzf.zzx(activity, configuration.screenWidthDp);
        zzv.zzq();
        DisplayMetrics zzu = zzs.zzu((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = zzu.heightPixels;
        int i2 = zzu.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzbe.zzc().zza(zzbcl.zzeP)).intValue();
        if (!zze(i, zzx + dimensionPixelSize, round) || !zze(i2, zzx2, round)) {
            return true;
        }
        return false;
    }
}
