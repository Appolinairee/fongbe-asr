package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzge implements zzfx {
    private final Context zza;
    private final zzfx zzb;

    public zzge(Context context) {
        zzgg zzgg = new zzgg();
        this.zza = context.getApplicationContext();
        this.zzb = zzgg;
    }

    public final /* bridge */ /* synthetic */ zzfy zza() {
        return new zzgf(this.zza, this.zzb.zza());
    }
}
