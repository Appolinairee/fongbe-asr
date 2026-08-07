package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzcot {
    private final zzcqx zza;
    private final View zzb;
    private final zzfbp zzc;
    private final zzcex zzd;

    public zzcot(View view, zzcex zzcex, zzcqx zzcqx, zzfbp zzfbp) {
        this.zzb = view;
        this.zzd = zzcex;
        this.zza = zzcqx;
        this.zzc = zzfbp;
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcex zzb() {
        return this.zzd;
    }

    public final zzcqx zzc() {
        return this.zza;
    }

    public zzcxf zzd(Set set) {
        return new zzcxf(set);
    }

    public final zzfbp zze() {
        return this.zzc;
    }
}
