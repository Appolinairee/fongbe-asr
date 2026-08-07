package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcbn implements Runnable {
    zzcbn(zzcbp zzcbp) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
