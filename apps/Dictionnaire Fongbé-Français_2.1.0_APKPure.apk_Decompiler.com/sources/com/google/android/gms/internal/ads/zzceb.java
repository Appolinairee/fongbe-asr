package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzceb implements Runnable {
    public final /* synthetic */ zzcbs zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzceb(zzcbs zzcbs, Map map) {
        this.zza = zzcbs;
        this.zzb = map;
    }

    public final void run() {
        int i = zzcef.zza;
        this.zza.zzd("onGcacheInfoEvent", this.zzb);
    }
}
