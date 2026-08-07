package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzddw {
    private final List zza;
    private final zzfja zzb;
    private final zzv zzc;
    private boolean zzd;

    public zzddw(zzfbo zzfbo, zzfja zzfja) {
        this.zza = zzfbo.zzp;
        this.zzb = zzfja;
        this.zzc = zzfbo.zzax;
    }

    public final void zza() {
        if (!this.zzd) {
            this.zzb.zze(this.zza, this.zzc);
            this.zzd = true;
        }
    }
}
