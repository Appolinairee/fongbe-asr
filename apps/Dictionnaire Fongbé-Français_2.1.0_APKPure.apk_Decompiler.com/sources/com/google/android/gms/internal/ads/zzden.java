package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzden extends zzdbj {
    private boolean zzb;

    protected zzden(Set set) {
        super(set);
    }

    public final void zza() {
        zzq(new zzdek());
    }

    public final void zzb() {
        zzq(new zzdej());
    }

    public final synchronized void zzc() {
        if (!this.zzb) {
            zzq(new zzdel());
            this.zzb = true;
        }
        zzq(new zzdem());
    }

    public final synchronized void zzd() {
        zzq(new zzdel());
        this.zzb = true;
    }
}
