package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzfyy implements Comparator {
    protected zzfyy() {
    }

    public static zzfyy zzb(Comparator comparator) {
        return new zzfwy(comparator);
    }

    public static zzfyy zzc() {
        return zzfyw.zza;
    }

    public abstract int compare(Object obj, Object obj2);

    public zzfyy zza() {
        return new zzfzh(this);
    }
}
