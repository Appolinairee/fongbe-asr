package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfws extends AbstractSet {
    final /* synthetic */ zzfww zza;

    zzfws(zzfww zzfww) {
        this.zza = zzfww;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        zzfww zzfww = this.zza;
        Map zzl = zzfww.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new zzfwn(zzfww);
    }

    public final boolean remove(@CheckForNull Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        return this.zza.zzy(obj) != zzfww.zzd;
    }

    public final int size() {
        return this.zza.size();
    }
}
