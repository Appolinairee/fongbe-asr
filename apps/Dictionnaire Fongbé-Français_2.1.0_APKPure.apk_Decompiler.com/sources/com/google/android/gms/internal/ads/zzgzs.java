package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgzs implements Iterator {
    private final ArrayDeque zza;
    private zzgwf zzb;

    /* synthetic */ zzgzs(zzgwj zzgwj, zzgzt zzgzt) {
        if (zzgwj instanceof zzgzu) {
            zzgzu zzgzu = (zzgzu) zzgwj;
            ArrayDeque arrayDeque = new ArrayDeque(zzgzu.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgzu);
            this.zzb = zzb(zzgzu.zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzgwf) zzgwj;
    }

    private final zzgwf zzb(zzgwj zzgwj) {
        while (zzgwj instanceof zzgzu) {
            zzgzu zzgzu = (zzgzu) zzgwj;
            this.zza.push(zzgzu);
            zzgwj = zzgzu.zzd;
        }
        return (zzgwf) zzgwj;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza */
    public final zzgwf next() {
        zzgwf zzgwf;
        zzgwf zzgwf2 = this.zzb;
        if (zzgwf2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgwf = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.zzb = zzgwf;
                } else {
                    zzgwf = zzb(((zzgzu) this.zza.pop()).zze);
                }
            } while (zzgwf.zzd() == 0);
            this.zzb = zzgwf;
            return zzgwf2;
        }
        throw new NoSuchElementException();
    }
}
