package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzfzp {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static zzfzn zzb(Set set, Set set2) {
        zzfun.zzc(set, "set1");
        zzfun.zzc(set2, "set2");
        return new zzfzj(set, set2);
    }

    public static Set zzc(Set set, zzfuo zzfuo) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfzk) {
                zzfzk zzfzk = (zzfzk) sortedSet;
                return new zzfzl((SortedSet) zzfzk.zza, zzfur.zza(zzfzk.zzb, zzfuo));
            }
            sortedSet.getClass();
            SortedSet sortedSet2 = sortedSet;
            zzfuo zzfuo2 = zzfuo;
            return new zzfzl(sortedSet, zzfuo);
        } else if (set instanceof zzfzk) {
            zzfzk zzfzk2 = (zzfzk) set;
            return new zzfzk((Set) zzfzk2.zza, zzfur.zza(zzfzk2.zzb, zzfuo));
        } else {
            set.getClass();
            Set set2 = set;
            zzfuo zzfuo3 = zzfuo;
            return new zzfzk(set, zzfuo);
        }
    }

    static boolean zzd(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    static boolean zzf(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfyv) {
            collection = ((zzfyv) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzf(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
