package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfvs implements Iterator {
    final Iterator zza;
    @CheckForNull
    Collection zzb;
    final /* synthetic */ zzfvt zzc;

    zzfvs(zzfvt zzfvt) {
        this.zzc = zzfvt;
        this.zza = zzfvt.zza.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zza(entry);
    }

    public final void remove() {
        zzfun.zzm(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzfwg zzfwg = this.zzc.zzb;
        zzfwg.zzb = zzfwg.zzb - this.zzb.size();
        this.zzb.clear();
        this.zzb = null;
    }
}
