package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzftf implements IBinder.DeathRecipient {
    public final /* synthetic */ zzftn zza;

    public /* synthetic */ zzftf(zzftn zzftn) {
        this.zza = zzftn;
    }

    public final void binderDied() {
        this.zza.zzk();
    }
}
