package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzatt implements Callable {
    public final /* synthetic */ zzatv zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzatt(zzatv zzatv, Context context) {
        this.zza = zzatv;
        this.zzb = context;
    }

    public final Object call() {
        return this.zza.zzb(this.zzb);
    }
}
