package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfln {
    private final zzfnb zza;
    private final String zzb;
    private final zzfkw zzc;
    private final String zzd = "Ad overlay";

    public zzfln(View view, zzfkw zzfkw, String str) {
        this.zza = new zzfnb(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfkw;
    }

    public final zzfkw zza() {
        return this.zzc;
    }

    public final zzfnb zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
