package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzflt extends BroadcastReceiver {
    final /* synthetic */ zzflu zza;

    zzflt(zzflu zzflu) {
        this.zza = zzflu;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzflu zzflu = this.zza;
            zzflu.zzd(true, zzflu.zzd);
            this.zza.zzc = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzflu zzflu2 = this.zza;
            zzflu2.zzd(false, zzflu2.zzd);
            this.zza.zzc = false;
        }
    }
}
