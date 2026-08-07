package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzapd {
    private final Executor zza;

    public zzapd(Handler handler) {
        this.zza = new zzapb(this, handler);
    }

    public final void zza(zzapm zzapm, zzapv zzapv) {
        zzapm.zzm("post-error");
        ((zzapb) this.zza).zza.post(new zzapc(zzapm, zzaps.zza(zzapv), (Runnable) null));
    }

    public final void zzb(zzapm zzapm, zzaps zzaps, Runnable runnable) {
        zzapm.zzq();
        zzapm.zzm("post-response");
        ((zzapb) this.zza).zza.post(new zzapc(zzapm, zzaps, runnable));
    }
}
