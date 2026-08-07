package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
class zzfvw extends zzfyh {
    final /* synthetic */ zzfwg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfvw(zzfwg zzfwg, Map map) {
        super(map);
        this.zza = zzfwg;
    }

    public final void clear() {
        zzfxx.zzb(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new zzfvv(this, this.zzd.entrySet().iterator());
    }

    public final boolean remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzfwg zzfwg = this.zza;
        zzfwg.zzb = zzfwg.zzb - size;
        return size > 0;
    }
}
