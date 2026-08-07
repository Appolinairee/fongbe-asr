package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzd {
    public static void zza(Context context) {
        int i = zzl.zza;
        if (((Boolean) zzbeh.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0 && !zzl.zzl()) {
                    ListenableFuture zzb = new zzc(context).zzb();
                    zzo.zzi("Updating ad debug logging enablement.");
                    zzbzz.zza(zzb, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e) {
                zzo.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}
