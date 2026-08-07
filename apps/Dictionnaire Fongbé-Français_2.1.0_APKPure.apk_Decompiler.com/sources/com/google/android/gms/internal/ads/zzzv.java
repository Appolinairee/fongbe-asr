package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzzv implements Executor {
    public final /* synthetic */ zzdh zza;

    public /* synthetic */ zzzv(zzdh zzdh) {
        this.zza = zzdh;
    }

    public final void execute(Runnable runnable) {
        this.zza.zzh(runnable);
    }
}
