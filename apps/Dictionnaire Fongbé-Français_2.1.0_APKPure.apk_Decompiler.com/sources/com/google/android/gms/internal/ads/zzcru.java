package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcru implements zzr {
    private final zzcxa zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcru(zzcxa zzcxa) {
        this.zza = zzcxa;
    }

    private final void zzh() {
        if (!this.zzc.get()) {
            this.zzc.set(true);
            this.zza.zza();
        }
    }

    public final void zzdE() {
    }

    public final void zzdi() {
    }

    public final void zzdo() {
        zzh();
    }

    public final void zzdp() {
        this.zza.zzc();
    }

    public final void zzdr() {
    }

    public final void zzds(int i) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
