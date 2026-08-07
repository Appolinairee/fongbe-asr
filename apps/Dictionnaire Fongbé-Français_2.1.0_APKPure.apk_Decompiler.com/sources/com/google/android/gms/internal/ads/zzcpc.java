package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcpc implements zzher {
    private final zzcot zza;
    private final zzhfj zzb;

    public zzcpc(zzcot zzcot, zzhfj zzhfj) {
        this.zza = zzcot;
        this.zzb = zzhfj;
    }

    public static Set zza(zzcot zzcot, zzcqo zzcqo) {
        Set singleton = Collections.singleton(new zzddk(zzcqo, zzbzw.zzg));
        zzhez.zzb(singleton);
        Set set = singleton;
        return singleton;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzcqo) this.zzb.zzb());
    }
}
