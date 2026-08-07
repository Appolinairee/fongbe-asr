package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgyk implements Iterator {
    private final Iterator zza;

    public zzgyk(Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        return entry.getValue() instanceof zzgym ? new zzgyj(entry, (zzgyl) null) : entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}
