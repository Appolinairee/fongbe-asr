package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbbb implements Runnable {
    public final /* synthetic */ zzcab zza;
    public final /* synthetic */ Future zzb;

    public /* synthetic */ zzbbb(zzcab zzcab, Future future) {
        this.zza = zzcab;
        this.zzb = future;
    }

    public final void run() {
        int i = zzbbd.zzd;
        if (this.zza.isCancelled()) {
            this.zzb.cancel(true);
        }
    }
}
