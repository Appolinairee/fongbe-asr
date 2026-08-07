package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdqy implements zzfgo {
    private final Map zza;
    private final zzbbj zzb;

    zzdqy(zzbbj zzbbj, Map map) {
        this.zza = map;
        this.zzb = zzbbj;
    }

    public final void zzd(zzfgh zzfgh, String str) {
        if (this.zza.containsKey(zzfgh)) {
            this.zzb.zzc(((zzdqx) this.zza.get(zzfgh)).zzb);
        }
    }

    public final void zzdA(zzfgh zzfgh, String str) {
    }

    public final void zzdB(zzfgh zzfgh, String str, Throwable th) {
        if (this.zza.containsKey(zzfgh)) {
            this.zzb.zzc(((zzdqx) this.zza.get(zzfgh)).zzc);
        }
    }

    public final void zzdC(zzfgh zzfgh, String str) {
        if (this.zza.containsKey(zzfgh)) {
            this.zzb.zzc(((zzdqx) this.zza.get(zzfgh)).zza);
        }
    }
}
