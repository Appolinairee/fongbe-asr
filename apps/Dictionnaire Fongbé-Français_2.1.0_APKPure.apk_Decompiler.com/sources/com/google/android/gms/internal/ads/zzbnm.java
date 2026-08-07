package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbnm extends zzcai {
    private final Object zza = new Object();
    /* access modifiers changed from: private */
    public final zzbnr zzb;
    private boolean zzc;

    public zzbnm(zzbnr zzbnr) {
        this.zzb = zzbnr;
    }

    public final void zzb() {
        zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            zze.zza("release: Lock acquired");
            if (this.zzc) {
                zze.zza("release: Lock already released");
                return;
            }
            this.zzc = true;
            zzj(new zzbnj(this), new zzcae());
            zzj(new zzbnk(this), new zzbnl(this));
            zze.zza("release: Lock released");
        }
    }
}
