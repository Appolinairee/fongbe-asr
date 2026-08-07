package com.google.android.gms.internal.ads;

import java.util.function.Consumer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfjl implements Consumer {
    public final /* synthetic */ zzdrv zza;

    public /* synthetic */ zzfjl(zzdrv zzdrv) {
        this.zza = zzdrv;
    }

    public final void accept(Object obj) {
        this.zza.zzb("plaay_ts", Long.toString(((Long) obj).longValue()));
    }
}
