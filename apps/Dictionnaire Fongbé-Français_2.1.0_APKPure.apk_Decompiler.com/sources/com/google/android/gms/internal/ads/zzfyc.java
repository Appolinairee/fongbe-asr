package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfyc extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzfuc zzb;

    zzfyc(List list, zzfuc zzfuc) {
        list.getClass();
        List list2 = list;
        this.zza = list;
        zzfuc zzfuc2 = zzfuc;
        this.zzb = zzfuc;
    }

    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public final ListIterator listIterator(int i) {
        return new zzfyb(this, this.zza.listIterator(i));
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        this.zza.subList(i, i2).clear();
    }

    public final int size() {
        return this.zza.size();
    }
}
