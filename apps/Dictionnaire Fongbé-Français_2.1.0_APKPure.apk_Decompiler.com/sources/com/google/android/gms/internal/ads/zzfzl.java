package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfzl extends zzfzk implements SortedSet {
    zzfzl(SortedSet sortedSet, zzfuo zzfuo) {
        super(sortedSet, zzfuo);
    }

    @CheckForNull
    public final Comparator comparator() {
        return ((SortedSet) this.zza).comparator();
    }

    public final Object first() {
        Iterator it = this.zza.iterator();
        it.getClass();
        zzfuo zzfuo = this.zzb;
        zzfuo.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (zzfuo.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public final SortedSet headSet(Object obj) {
        return new zzfzl(((SortedSet) this.zza).headSet(obj), this.zzb);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.zza;
        while (true) {
            zzfuo zzfuo = this.zzb;
            Object last = sortedSet.last();
            if (zzfuo.zza(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzfzl(((SortedSet) this.zza).subSet(obj, obj2), this.zzb);
    }

    public final SortedSet tailSet(Object obj) {
        return new zzfzl(((SortedSet) this.zza).tailSet(obj), this.zzb);
    }
}
