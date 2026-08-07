package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfmx {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzfmw zzd = null;

    public zzfmx() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzfmw zzfmw = (zzfmw) this.zzc.poll();
        this.zzd = zzfmw;
        if (zzfmw != null) {
            zzfmw.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzfmw zzfmw) {
        this.zzd = null;
        zzc();
    }

    public final void zzb(zzfmw zzfmw) {
        zzfmw.zzb(this);
        this.zzc.add(zzfmw);
        if (this.zzd == null) {
            zzc();
        }
    }
}
