package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfky extends TimerTask {
    final /* synthetic */ Timer zza;
    final /* synthetic */ zzfla zzb;
    final /* synthetic */ zzcfo zzc;

    zzfky(zzfla zzfla, zzcfo zzcfo, Timer timer) {
        this.zzc = zzcfo;
        this.zza = timer;
        this.zzb = zzfla;
    }

    public final void run() {
        this.zzb.zzh();
        this.zzc.zza(true);
        this.zza.cancel();
    }
}
