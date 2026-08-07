package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaww implements Callable {
    private final zzawd zza;
    private final zzasc zzb;

    public zzaww(zzawd zzawd, zzasc zzasc) {
        this.zza = zzawd;
        this.zzb = zzasc;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzasy zzc = this.zza.zzc();
        if (zzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                this.zzb.zzaY(zzc.zzaV(), zzgxb.zza());
            }
            return null;
        } catch (zzgyg | NullPointerException unused) {
            return null;
        }
    }
}
