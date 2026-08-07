package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzrp extends Handler {
    final /* synthetic */ zzrr zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzrp(zzrr zzrr, Looper looper) {
        super(looper);
        this.zza = zzrr;
    }

    public final void handleMessage(Message message) {
        zzrr.zza(this.zza, message);
    }
}
