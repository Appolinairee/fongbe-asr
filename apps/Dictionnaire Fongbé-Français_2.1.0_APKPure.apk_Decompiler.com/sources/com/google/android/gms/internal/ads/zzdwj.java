package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdwj implements Callable {
    public final /* synthetic */ zzava zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzdwj(zzava zzava, Context context) {
        this.zza = zzava;
        this.zzb = context;
    }

    public final Object call() {
        return this.zza.zzc().zzf(this.zzb);
    }
}
