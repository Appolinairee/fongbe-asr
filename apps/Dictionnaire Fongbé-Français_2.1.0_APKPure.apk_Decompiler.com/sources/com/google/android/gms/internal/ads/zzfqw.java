package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public class zzfqw extends Handler {
    public zzfqw() {
        Looper.getMainLooper();
    }

    public final void dispatchMessage(Message message) {
        zza(message);
    }

    /* access modifiers changed from: protected */
    public void zza(Message message) {
        super.dispatchMessage(message);
    }

    public zzfqw(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
