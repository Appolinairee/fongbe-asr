package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcfx implements Runnable {
    public final /* synthetic */ zzcfz zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcfx(zzcfz zzcfz, Map map) {
        this.zza = zzcfz;
        this.zzb = map;
    }

    public final void run() {
        this.zza.zzr(this.zzb);
    }
}
