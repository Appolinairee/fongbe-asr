package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfya extends AbstractList implements RandomAccess, Serializable {
    final List zza;
    final zzfuc zzb;

    zzfya(List list, zzfuc zzfuc) {
        list.getClass();
        List list2 = list;
        this.zza = list;
        zzfuc zzfuc2 = zzfuc;
        this.zzb = zzfuc;
    }

    public final Object get(int i) {
        return this.zzb.apply(this.zza.get(i));
    }

    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new zzfxz(this, this.zza.listIterator(i));
    }

    public final Object remove(int i) {
        return this.zzb.apply(this.zza.remove(i));
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        this.zza.subList(i, i2).clear();
    }

    public final int size() {
        return this.zza.size();
    }
}
