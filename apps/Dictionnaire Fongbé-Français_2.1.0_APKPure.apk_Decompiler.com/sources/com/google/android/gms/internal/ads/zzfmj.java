package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfmj {
    /* access modifiers changed from: private */
    public static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfmi(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfmf.zza() != zzfkv.CTV) {
            return 2;
        }
        return zza;
    }
}
