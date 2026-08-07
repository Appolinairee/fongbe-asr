package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzq extends BroadcastReceiver {
    final /* synthetic */ zzs zza;

    /* synthetic */ zzq(zzs zzs, zzr zzr) {
        this.zza = zzs;
    }

    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.zza.zzf = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.zza.zzf = false;
        }
    }
}
