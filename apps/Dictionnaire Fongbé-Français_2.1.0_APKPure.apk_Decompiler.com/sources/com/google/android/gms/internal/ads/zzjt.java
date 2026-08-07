package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzjt implements zzfvf {
    public final /* synthetic */ AtomicBoolean zza;

    public /* synthetic */ zzjt(AtomicBoolean atomicBoolean) {
        this.zza = atomicBoolean;
    }

    public final Object zza() {
        return Boolean.valueOf(this.zza.get());
    }
}
