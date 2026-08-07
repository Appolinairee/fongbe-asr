package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeok implements Callable {
    public /* synthetic */ zzeok(zzeol zzeol) {
    }

    public final Object call() {
        long currentTimeMillis = zzv.zzC().currentTimeMillis() - zzv.zzp().zzi().zzg().zza();
        Long.valueOf(currentTimeMillis).getClass();
        return new zzeom(currentTimeMillis);
    }
}
