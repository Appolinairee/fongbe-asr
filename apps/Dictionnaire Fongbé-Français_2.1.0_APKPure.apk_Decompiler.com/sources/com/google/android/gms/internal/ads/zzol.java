package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzol extends BroadcastReceiver {
    final /* synthetic */ zzon zza;

    /* synthetic */ zzol(zzon zzon, zzom zzom) {
        this.zza = zzon;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            zzon zzon = this.zza;
            zzon.zzj(zzoi.zzd(context, intent, zzon.zzh, zzon.zzg));
        }
    }
}
