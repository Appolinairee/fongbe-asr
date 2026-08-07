package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgzm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzm zzb = new zzgzm();
    private final zzgzw zzc = new zzgyu();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    private zzgzm() {
    }

    public static zzgzm zza() {
        return zzb;
    }

    public final zzgzv zzb(Class cls) {
        zzgye.zzc(cls, "messageType");
        zzgzv zzgzv = (zzgzv) this.zzd.get(cls);
        if (zzgzv == null) {
            zzgzv = this.zzc.zza(cls);
            zzgye.zzc(cls, "messageType");
            zzgzv zzgzv2 = (zzgzv) this.zzd.putIfAbsent(cls, zzgzv);
            return zzgzv2 == null ? zzgzv : zzgzv2;
        }
    }
}
