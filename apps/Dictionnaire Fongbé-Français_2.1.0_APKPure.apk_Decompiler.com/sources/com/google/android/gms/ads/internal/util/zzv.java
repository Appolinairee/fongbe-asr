package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbcl;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzv extends zzu {
    public final Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    public final zzbbq.zzq zzg(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (zzs.zzB(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zzbbq.zzq.ENUM_TRUE : zzbbq.zzq.ENUM_FALSE;
        }
        return zzbbq.zzq.ENUM_FALSE;
    }

    public final void zzh(Context context, String str, String str2) {
        ProcessUtils$$ExternalSyntheticApiModelOutline0.m();
        NotificationChannel m = ComponentDialog$$ExternalSyntheticApiModelOutline0.m("offline_notification_channel", (CharSequence) "AdMob Offline Notifications", ((Integer) zzbe.zzc().zza(zzbcl.zzir)).intValue());
        m.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(m);
    }

    public final boolean zzi(Context context, String str) {
        NotificationChannel m = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        if (m != null && m.getImportance() == 0) {
            return true;
        }
        return false;
    }
}
