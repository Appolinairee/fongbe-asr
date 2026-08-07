package com.google.android.gms.internal.ads;

import java.util.Optional;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfkd implements Runnable {
    public final /* synthetic */ zzfkh zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ Optional zzc;

    public /* synthetic */ zzfkd(zzfkh zzfkh, long j, Optional optional) {
        this.zza = zzfkh;
        this.zzb = j;
        this.zzc = optional;
    }

    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}
