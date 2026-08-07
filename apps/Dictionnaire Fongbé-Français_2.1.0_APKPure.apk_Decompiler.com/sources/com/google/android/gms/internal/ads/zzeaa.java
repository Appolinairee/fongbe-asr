package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeaa implements Callable {
    public final /* synthetic */ zzdzy zza;

    public /* synthetic */ zzeaa(zzdzy zzdzy) {
        this.zza = zzdzy;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
