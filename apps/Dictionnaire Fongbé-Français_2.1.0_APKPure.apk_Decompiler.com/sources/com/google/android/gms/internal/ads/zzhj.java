package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzhj extends BroadcastReceiver implements Runnable {
    private final Handler zza;

    public zzhj(zzhl zzhl, Handler handler, zzhk zzhk) {
        this.zza = handler;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.post(this);
        }
    }

    public final void run() {
    }
}
