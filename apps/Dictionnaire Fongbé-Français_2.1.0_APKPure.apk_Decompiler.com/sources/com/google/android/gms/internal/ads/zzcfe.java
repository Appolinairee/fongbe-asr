package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcfe implements zzr {
    private final zzcex zza;
    private final zzr zzb;

    public zzcfe(zzcex zzcex, zzr zzr) {
        this.zza = zzcex;
        this.zzb = zzr;
    }

    public final void zzdE() {
    }

    public final void zzdi() {
    }

    public final void zzdo() {
        zzr zzr = this.zzb;
        if (zzr != null) {
            zzr.zzdo();
        }
    }

    public final void zzdp() {
        zzr zzr = this.zzb;
        if (zzr != null) {
            zzr.zzdp();
        }
        this.zza.zzaa();
    }

    public final void zzdr() {
        zzr zzr = this.zzb;
        if (zzr != null) {
            zzr.zzdr();
        }
    }

    public final void zzds(int i) {
        zzr zzr = this.zzb;
        if (zzr != null) {
            zzr.zzds(i);
        }
        this.zza.zzY();
    }
}
