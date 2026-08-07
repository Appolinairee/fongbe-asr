package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfwt extends zzfwh {
    final /* synthetic */ zzfww zza;
    private final Object zzb;
    private int zzc;

    zzfwt(zzfww zzfww, int i) {
        this.zza = zzfww;
        this.zzb = zzfww.zzg(zzfww, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzfuk.zza(this.zzb, zzfww.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzw(this.zzb);
        }
    }

    public final Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzfww.zzj(this.zza, i);
    }

    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzfww zzfww = this.zza;
        Object zzj = zzfww.zzj(zzfww, i);
        zzfww.zzn(zzfww, this.zzc, obj);
        return zzj;
    }
}
