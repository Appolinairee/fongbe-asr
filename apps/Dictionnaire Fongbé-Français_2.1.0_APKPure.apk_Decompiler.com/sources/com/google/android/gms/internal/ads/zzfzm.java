package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
abstract class zzfzm extends AbstractSet {
    zzfzm() {
    }

    public boolean removeAll(Collection collection) {
        return zzfzp.zze(this, collection);
    }

    public boolean retainAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        return super.retainAll(collection);
    }
}
