package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzg;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeio implements zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcvr zzb;
    private final zzcwl zzc;
    private final zzddu zzd;
    private final zzddm zze;
    private final zzcnh zzf;

    zzeio(zzcvr zzcvr, zzcwl zzcwl, zzddu zzddu, zzddm zzddm, zzcnh zzcnh) {
        this.zzb = zzcvr;
        this.zzc = zzcwl;
        this.zzd = zzddu;
        this.zze = zzddm;
        this.zzf = zzcnh;
    }

    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzr();
            this.zze.zza(view);
        }
    }

    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
