package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbit implements zzbjp {
    zzbit() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        zzv.zzq();
        DisplayMetrics zzu = zzs.zzu((WindowManager) zzcex.getContext().getSystemService("window"));
        int i = zzu.widthPixels;
        int i2 = zzu.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcex).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzcex.zzd("locationReady", hashMap);
        zzo.zzj("GET LOCATION COMPILED");
    }
}
