package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfix implements Callable {
    public final /* synthetic */ zzfja zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzfix(zzfja zzfja, String str) {
        this.zza = zzfja;
        this.zzb = str;
    }

    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}
