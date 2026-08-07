package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfte implements zzfvf {
    public final /* synthetic */ String zza = "OverlayDisplayService";

    public /* synthetic */ zzfte(String str) {
    }

    public final Object zza() {
        HandlerThread handlerThread = new HandlerThread(this.zza, 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
