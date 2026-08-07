package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzheh implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhei zzb;

    zzheh(zzhei zzhei) {
        this.zzb = zzhei;
    }

    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            zzhei zzhei = this.zzb;
            int i = this.zza;
            this.zza = i + 1;
            return zzhei.zza.get(i);
        }
        zzhei zzhei2 = this.zzb;
        zzhei2.zza.add(zzhei2.zzb.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
