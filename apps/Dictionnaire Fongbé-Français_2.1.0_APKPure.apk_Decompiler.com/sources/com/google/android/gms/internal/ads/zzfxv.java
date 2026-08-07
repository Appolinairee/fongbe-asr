package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
enum zzfxv implements Iterator {
    INSTANCE;

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        zzfun.zzm(false, "no calls to next() since the last call to remove()");
    }
}
