package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzch extends BroadcastReceiver {
    final /* synthetic */ zzci zza;

    zzch(zzci zzci) {
        this.zza = zzci;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zza.zze(context, intent);
    }
}
