package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcqo implements zzcxh, zzayk {
    private final zzfbo zza;
    private final zzcwl zzb;
    private final zzcxq zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcqo(zzfbo zzfbo, zzcwl zzcwl, zzcxq zzcxq) {
        this.zza = zzfbo;
        this.zzb = zzcwl;
        this.zzc = zzcxq;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    public final void zzdn(zzayj zzayj) {
        if (this.zza.zze == 1 && zzayj.zzj) {
            zza();
        }
        if (zzayj.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    public final synchronized void zzs() {
        if (this.zza.zze != 1) {
            zza();
        }
    }
}
