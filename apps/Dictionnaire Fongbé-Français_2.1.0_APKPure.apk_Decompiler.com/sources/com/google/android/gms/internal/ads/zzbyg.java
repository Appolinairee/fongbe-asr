package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbyg implements Callable {
    public final /* synthetic */ zzbyi zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzbyg(zzbyi zzbyi, Context context) {
        this.zza = zzbyi;
        this.zzb = context;
    }

    public final Object call() {
        return this.zza.zze(this.zzb);
    }
}
