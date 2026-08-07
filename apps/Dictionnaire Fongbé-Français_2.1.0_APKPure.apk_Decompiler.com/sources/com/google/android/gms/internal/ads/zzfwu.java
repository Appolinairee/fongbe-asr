package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfwu extends AbstractCollection {
    final /* synthetic */ zzfww zza;

    zzfwu(zzfww zzfww) {
        this.zza = zzfww;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzfww zzfww = this.zza;
        Map zzl = zzfww.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new zzfwp(zzfww);
    }

    public final int size() {
        return this.zza.size();
    }
}
