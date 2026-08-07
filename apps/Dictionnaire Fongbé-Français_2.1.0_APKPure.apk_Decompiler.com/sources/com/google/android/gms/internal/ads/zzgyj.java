package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgyj implements Map.Entry {
    private final Map.Entry zza;

    /* synthetic */ zzgyj(Map.Entry entry, zzgyl zzgyl) {
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (((zzgym) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzgzc) {
            return ((zzgym) this.zza.getValue()).zzc((zzgzc) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzgym zza() {
        return (zzgym) this.zza.getValue();
    }
}
