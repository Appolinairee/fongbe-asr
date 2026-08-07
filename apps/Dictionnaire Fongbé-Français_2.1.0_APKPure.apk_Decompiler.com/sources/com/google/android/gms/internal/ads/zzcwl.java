package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcwl extends zzdbj {
    private boolean zzb = false;

    public zzcwl(Set set) {
        super(set);
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzq(new zzcwk());
            this.zzb = true;
        }
    }
}
