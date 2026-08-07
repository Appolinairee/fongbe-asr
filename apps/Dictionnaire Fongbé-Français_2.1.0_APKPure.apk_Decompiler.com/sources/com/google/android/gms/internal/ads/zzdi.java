package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdi implements Handler.Callback {
    public final /* synthetic */ zzdn zza;

    public /* synthetic */ zzdi(zzdn zzdn) {
        this.zza = zzdn;
    }

    public final boolean handleMessage(Message message) {
        zzdn.zzg(this.zza, message);
        return true;
    }
}
