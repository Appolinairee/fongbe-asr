package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeb implements zzdg {
    private Message zza;

    private zzeb() {
        throw null;
    }

    /* synthetic */ zzeb(zzec zzec) {
    }

    public final zzeb zzb(Message message, zzed zzed) {
        this.zza = message;
        return this;
    }

    public final void zza() {
        Message message = this.zza;
        message.getClass();
        Message message2 = message;
        message.sendToTarget();
        this.zza = null;
        zzed.zzl(this);
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        Message message2 = message;
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzed.zzl(this);
        return sendMessageAtFrontOfQueue;
    }
}
