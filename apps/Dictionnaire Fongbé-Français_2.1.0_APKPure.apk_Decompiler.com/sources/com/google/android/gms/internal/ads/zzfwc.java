package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
class zzfwc implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfwd zzc;

    zzfwc(zzfwd zzfwd) {
        Iterator it;
        this.zzc = zzfwd;
        this.zzb = zzfwd.zzb;
        Collection collection = zzfwd.zzb;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.zza = it;
    }

    zzfwc(zzfwd zzfwd, Iterator it) {
        this.zzc = zzfwd;
        this.zzb = zzfwd.zzb;
        this.zza = it;
    }

    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    public final Object next() {
        zza();
        return this.zza.next();
    }

    public final void remove() {
        this.zza.remove();
        zzfwg zzfwg = this.zzc.zze;
        zzfwg.zzb = zzfwg.zzb - 1;
        this.zzc.zzc();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }
}
