package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
class zzfwl extends AbstractCollection {
    final Collection zza;
    final zzfuo zzb;

    zzfwl(Collection collection, zzfuo zzfuo) {
        this.zza = collection;
        this.zzb = zzfuo;
    }

    public final boolean add(Object obj) {
        zzfun.zze(this.zzb.zza(obj));
        return this.zza.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object zza2 : collection) {
            zzfun.zze(this.zzb.zza(zza2));
        }
        return this.zza.addAll(collection);
    }

    public final void clear() {
        zzfxt.zzb(this.zza, this.zzb);
    }

    public final boolean contains(@CheckForNull Object obj) {
        if (zzfwm.zza(this.zza, obj)) {
            return this.zzb.zza(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        zzfuo zzfuo = this.zzb;
        zzfun.zzc(zzfuo, "predicate");
        int i = 0;
        for (Object zza2 : this.zza) {
            if (!zzfuo.zza(zza2)) {
                i++;
            } else if (i != -1) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        Iterator it = this.zza.iterator();
        it.getClass();
        zzfuo zzfuo = this.zzb;
        zzfuo.getClass();
        return new zzfxu(it, zzfuo);
    }

    public final boolean remove(@CheckForNull Object obj) {
        return contains(obj) && this.zza.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.zza.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.zzb.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object zza2 : this.zza) {
            if (this.zzb.zza(zza2)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfxx.zzc(arrayList, it);
        return arrayList.toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfxx.zzc(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
