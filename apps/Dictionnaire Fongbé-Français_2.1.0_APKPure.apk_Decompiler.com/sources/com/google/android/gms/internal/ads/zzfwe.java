package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfwe extends zzfwc implements ListIterator {
    final /* synthetic */ zzfwf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfwe(zzfwf zzfwf) {
        super(zzfwf);
        this.zzd = zzfwf;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfwg zzfwg = this.zzd.zzf;
        zzfwg.zzb = zzfwg.zzb + 1;
        if (isEmpty) {
            this.zzd.zza();
        }
    }

    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfwe(zzfwf zzfwf, int i) {
        super(zzfwf, ((List) zzfwf.zzb).listIterator(i));
        this.zzd = zzfwf;
    }
}
